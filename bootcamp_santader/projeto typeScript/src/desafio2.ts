enum Trabalho{
    Atriz,
    Padeiro
}

type Humano = {
    nome: string,
    idade: number;
    profissao: Trabalho
}

let pessoa1: Humano = {
    nome:'maria',
    idade: 29,
    profissao: Trabalho.Atriz
};


let pessoa2: Humano = {
    nome: 'Roberto',
    idade: 35,
    profissao: Trabalho.Padeiro
};

let pessoa3: Humano = {
    nome:'Gabriela',
    idade:22,
    profissao: Trabalho.Atriz
};

let pessoa4 = {
    nome: 'Gabriel',
    idade: 48,
    profissao: Trabalho.Padeiro
}
