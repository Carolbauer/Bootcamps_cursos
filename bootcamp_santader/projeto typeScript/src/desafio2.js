"use strict";
var Trabalho;
(function (Trabalho) {
    Trabalho[Trabalho["Atriz"] = 0] = "Atriz";
    Trabalho[Trabalho["Padeiro"] = 1] = "Padeiro";
})(Trabalho || (Trabalho = {}));
let pessoa1 = {
    nome: 'maria',
    idade: 29,
    profissao: Trabalho.Atriz
};
let pessoa2 = {
    nome: 'Roberto',
    idade: 35,
    profissao: Trabalho.Padeiro
};
let pessoa3 = {
    nome: 'Gabriela',
    idade: 22,
    profissao: Trabalho.Atriz
};
let pessoa4 = {
    nome: 'Gabriel',
    idade: 48,
    profissao: Trabalho.Padeiro
};
