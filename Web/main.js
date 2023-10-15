const regioes = document.querySelectorAll('.regiao');
const regiaoTitulo = document.getElementById('regiao-titulo');
const infos = document.querySelector('.infos');
const infosTitulo = infos.querySelector('h3');
const dados = document.querySelectorAll('#dados h4');
const avaliacaoDados = document.querySelectorAll('.avaliacao h4');

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
            console.log(await buscarDados(indice));
        }else if(regiao == regiaoAtivada){
            existeRegiaoAtivada = false;
            regiaoAtivada = null;
            infosTitulo.innerHTML = "INFORMAÇÕES";
            zerarDados();
        }else{
            regiaoAtivada.classList.toggle("active");
            regiaoAtivada = regiao;
            infosTitulo.innerHTML = `INFORMAÇÕES - ${definirRegiao(regiao)}`;
            console.log(await buscarDados(indice));
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
    for (dado in dados) {
        dado.innerHTML = '-';
    }

    for (dado in avaliacaoDados) {
        dado.innerHTML = '-';
    }
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