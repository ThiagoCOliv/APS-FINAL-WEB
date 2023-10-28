const regioes = document.querySelectorAll('.regiao');
const regiaoTitulo = document.getElementById('regiao-titulo');
const infos = document.querySelector('.infos');
const infosTitulo = infos.querySelector('h3');
const dados = document.querySelectorAll('#dados h4');
const avaliacaoDados = document.querySelectorAll('.avaliacao h4');
const avaliacaoGeral = document.querySelector('.avaliacao.geral h4');

let existeRegiaoAtivada = false;
let regiaoAtivada;

regioes.forEach((regiao) => {
    regiao.addEventListener("mouseover", () => {
        regiaoTitulo.innerHTML = definirRegiao(regiao);
    });

    regiao.addEventListener("click", async () => {
        let indice = definirIndice(regiao);

        if(!existeRegiaoAtivada){
            existeRegiaoAtivada = true;
            regiaoAtivada = regiao;
            infosTitulo.innerHTML = `INFORMAÇÕES - ${definirRegiao(regiao)}`;
            tratarDados(await buscarDados(indice));
        }else if(regiao == regiaoAtivada){
            existeRegiaoAtivada = false;
            regiaoAtivada = null;
            infosTitulo.innerHTML = "INFORMAÇÕES";
            zerarDados();
        }else{
            regiaoAtivada.classList.toggle("active");
            regiaoAtivada = regiao;
            infosTitulo.innerHTML = `INFORMAÇÕES - ${definirRegiao(regiao)}`;
            tratarDados(await buscarDados(indice));
        }

        regiao.classList.toggle("active");
    });
});

infos.addEventListener("mouseover", () => {
    if(!existeRegiaoAtivada){
        regiaoTitulo.innerHTML = "Escolha uma região";
    }
});

function definirRegiao(regiao){
    if(regiao.classList.contains('centro')){
        return "Região Central";
    }
    else if(regiao.classList.contains('cidade')){
        return "Cidade Inteira";
    }
    else
    {
        return `Região ${regiao.classList[2]}`;
    }
}

function definirIndice(regiao){
    for(let i = 0; i < regioes.length; i++){
        if(regiao == regioes[i]){
            return i;
        }
    }
}

function zerarDados(){
    dados[0].innerHTML = "-";
    dados[1].innerHTML = "-";
    dados[2].innerHTML = "-";
    dados[3].innerHTML = "-";
    dados[4].innerHTML = "-";

    avaliacaoDados[0].innerHTML = "-";
    avaliacaoDados[1].innerHTML = "-";
    avaliacaoDados[2].innerHTML = "-";
    avaliacaoDados[3].innerHTML = "-";
    avaliacaoDados[4].innerHTML = "-";

    avaliacaoGeral.innerHTML = "-";
}

async function buscarDados(indice){
    try {
        const headers = new Headers();
        headers.append('Content-Type', 'application/json');

        const response = await fetch(`https://localhost:7101/Cidade?regiao=${indice}`, {
            method: 'GET',
            headers: headers,
            mode: 'cors'
        });
        
        if (!response.ok) {
          throw new Error('A requisição falhou com status ' + response.status);
        }
    
        const dados = await response.json();
        return dados;
    } catch (error) {
        console.error('Ocorreu um erro:', error);
    }
}

function tratarDados(jsonDados){
    dados[0].innerHTML = `${jsonDados.qtdDistribuicaoAreasVerdes}%`;
    dados[1].innerHTML = `${jsonDados.estadoConservacaoManutencao}%`;
    dados[2].innerHTML = `${jsonDados.acessibilidade}%`;
    dados[3].innerHTML = `${jsonDados.biodiversidadeSustentabilidade}%`;
    dados[4].innerHTML = `${jsonDados.usoSatisfacaoPublico}%`;

    avaliacaoDados[0].innerHTML = jsonDados.qtdDistribuicaoAreasVerdesAvaliacao;
    avaliacaoDados[1].innerHTML = jsonDados.estadoConservacaoManutencaoAvaliacao;
    avaliacaoDados[2].innerHTML = jsonDados.acessibilidadeAvaliacao;
    avaliacaoDados[3].innerHTML = jsonDados.biodiversidadeSustentabilidadeAvaliacao;
    avaliacaoDados[4].innerHTML = jsonDados.usoSatisfacaoPublicoAvaliacao;

    avaliacaoGeral.innerHTML = jsonDados.avaliacaoGeral;
}