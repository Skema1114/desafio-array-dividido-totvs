Desafio do array dividido

Você receberá um array de inteiros. Sua tarefa é pegar esse array e encontrar um índice N onde a soma dos números inteiros à esquerda de N é igual à soma dos números inteiros à direita de N. Se não houver um índice que faça isso acontecer, retorne - 1

Por exemplo:
Digamos que você receba o array {1,2,3,4,3,2,1}}:
Sua função retornará o índice 3, porque na 3ª posição do array, a soma do lado esquerdo do índice ({1,2,3}) e a soma do lado direito do índice ({3,2, 1}) ambos iguais a 6.

Vamos dar uma olhada em outro.
Você recebe o array {1,100,50, -51,1,1}:
Sua função retornará o índice 1, porque na primeira posição da matriz, a soma do lado esquerdo do índice ({1}) e a soma do lado direito do índice ({50, -51,1,1 }) ambos iguais a 1.

Último:
Você recebe o array {20,10, -80,10,10,15,35}
No índice 0, o lado esquerdo é {}O lado direito é {10, -80,10,10,15,35}Ambos são iguais a 0 quando adicionados. (Arrays vazios são iguais a 0 neste problema)
O índice 0 é o local onde o lado esquerdo e o lado direito são iguais.

Nota:
Por favor, lembre-se que na maioria das linguagens de programação o índice de um array começa em 0.

Entrada: 
Um array inteiro de comprimento 0

Saída:
O menor índice N, onde o lado à esquerda de N é igual ao lado à direita de N. Se você não encontrar um índice que se encaixe nessas regras, retornará -1.

Nota:
Se você receber um array com várias respostas, retorne o menor índice correto.
