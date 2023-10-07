const regioes = document.querySelectorAll('.regiao');
const regiaoTitulo = document.getElementById('regiao-titulo');
const infos = document.querySelector('.infos');
const infosTitulo = infos.querySelector('h3');

let existeRegiaoAtivada = false;
let regiaoAtivada;

regioes.forEach((regiao) => {
    regiao.addEventListener("mouseover", () => {
        regiaoTitulo.innerHTML = definirRegiao(regiao);
    });

    regiao.addEventListener("click", () => {
        if(!existeRegiaoAtivada){
            existeRegiaoAtivada = true;
            regiaoAtivada = regiao;
            infosTitulo.innerHTML = `INFORMAÇÕES - ${definirRegiao(regiao)}`;
        }else if(regiao == regiaoAtivada){
                existeRegiaoAtivada = false;
                regiaoAtivada = null;
                infosTitulo.innerHTML = "INFORMAÇÕES";
        }else{
            regiaoAtivada.classList.toggle("active");
            regiaoAtivada = regiao;
            infosTitulo.innerHTML = `INFORMAÇÕES - ${definirRegiao(regiao)}`;
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