//Algoritmo para calcular a média aritmética de notas escolares e forncecer se o aluno foi aprovado ou reprovado//
#include<stdio.h>
#include <stdlib.h>

int main (void){
    char nome [21];
    float nota1, nota2, nota3, nota4, media;
    printf("Digite o seu nome:\n");
    scanf("%s",nome);
    printf("Digite nota1\n");
    scanf("%f%*c",&nota1);
    printf("Digite nota2\n");
    scanf("%f%*c",&nota2);
    printf("Digite nota3\n");
    scanf("%f%*c",&nota3);
    printf("Digite nota4\n");
    scanf("%f%*c",&nota4);
    media=(nota1+nota2+nota3+nota4)/4;
    printf("A media é:%2.f\n",media);
    if (media>=7)
    //se//
    {
        printf("Parabéns!!Você foi aprovado.\n");
    }
    else
    //senão//
    {
        printf ("Infelizmente você foi reprovado.\n");
    }
    
    return 0;
}