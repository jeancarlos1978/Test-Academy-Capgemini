# Test-Academy-Capgemini

Desafio_Java Academia Técnica Capgemini

Este projeto tem como objetivo a solução do Desafio da Academia Técnica Capgemini, composto por três questões.

Os desafios se Encontram na pasta src pacote testeCap com três classes as quais cada uma tem a resposta para uma das questões do desafio.

Este projeto foi criado com o Eclipse idea e pode ser rodado tanto no console da IDE como no Git Bash, usando os import e o código descrito nos desafios.

###Pré-requisitos
Para rodar o código no Git Bash, primeiro intale o Git na sua máquina.

baixar jdk 11 ou superior , idea eclipse

###Questão 01
               *
            **
          ***
        ****
      *****
    ******

###Observação da resposta
Desenvolvi uma resposta com uma ideia o qual o usuário entra com um número e a saída é uma escada com base e altura iguais. para isso usei arrays ou vetores para armazenar.

###Questão 02
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios: Possui no mínimo 6 caracteres. Contém no mínimo 1 digito. Contém no mínimo 1 letra em minúsculo. Contém no mínimo 1 letra em maiúsculo. Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura. Exemplo: Entrada: Ya3 Saída: 3 Explicação: Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

Observação da resposta
Nesse exercício desenvolvi duas respostas para a mesma questão, sendo o primeiro bem simples entregando apenas o resultado que o exercício pedia que era um alerta para Débora que sua senha era fraca e faltava no minímo n caracteres para que a sua senha tivesse pelo menos 6 caracteres, tendo em vista que o execício não pedia para informar na saída se tinha Letras, números, caracteres especiais, se tinha letra em minúsculo ou maiúsculo.

Mas na segunda resposta tomei o cuidado de desenvolver um algoritimo que informe Débora a quantidade de caracteres, quantos faltam para o minimo, se tem mais de 6 caracteres, se está faltando letras minúsculas ou maiúsculas, se falta caracteres especiais, também dando sugestões de caracteres para sua senha se tornar forte e outros.

Para testar a segunda resposta deve ser retirado os (//) do respostaDois e colocado no respostaUm.

public static void main(String[] args) {
//      Chama a Primeira resposta		
		respostaUm();

//      Chama a segunda resposta		
	//	respostaDois();
			
	}

###Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas. Exemplo: Exemplo 1) Entrada: ovo Saída: 3 Explicação: A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]] respectivamente. Exemplo 2) Entrada: ifailuhkqq Saída: 3 Explicação: A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].

###Observação da resposta
Essa questão foi um pouco mais complicado de resolver, fiz algumas tentativas também pesquisei muito, pois não tinha feito nada parecido com o exercício ainda e depois de pesquisas e tentativas acabei chegando nesse resultado, o qual pego a palavra lanço em uma lista e uso o for para percorre-la e fazendo as comparações.

###Foi desenvolvido com
Este projeto foi desenvolvido com a linguagem Java na IDE Eclipse, Jdk 11.















