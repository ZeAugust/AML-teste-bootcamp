# Teste de qualificação - AML

Repositório destinado á realização do teste de qualificação da AML.

## Questões

**A - Com suas palavras explique o que é lavagem de dinheiro.**

Já que as entidades de fiscalização, como a Receita Federal, detectariam qualquer tipo de movimentação oriunda de atividades ilegais, práticas e estratégias criminosas são empregadas com a finalidade de ludibriar os órgão de fiscalização governamentais, mascarando a origem ilíta de uma quantia anormal de dinheiro e dando a impressão de que aquela quantia tem origem lícita. 

**B - O que é Cartão de Pagamento do Governo Federal (CPGF), e qual a sua finalidade.**

Cartão de Pagamento do Governo Federal trata-se de um meio de pagamento utilizado para o pagamento de suprimentos de fundos, dando maior agilidade e permitindo o acompanhamento das despesas realizadas com os recursos do governo. 
Suprimentos de fundos são adiantamentos concedidos a servidor, a critério e sob a responsabilidade do Ordenador de Despesas, com prazo certo para aplicação e comprovação dos gastos, é uma autorização de execução orçamentária e financeira concedida por uma forma diferente da normal, tendo como meio de pagamento o Cartão de Pagamento do Governo Federal.
Os gastos enquadrados como suprimentos de custos devem observar os principios que regem a Administração publica, que são a legalidade, impessoalidade, moralidade, publicidade e eficiência, bem como o princípio da isonomia e da aquisição mais vantajosa para a Administração Pública.

As despesas com Suprimento de Fundos somente podem ser realizadas para atender a despesas de pequeno vulto,  atender a despesas eventuais, inclusive em viagens e com serviços especiais, que exijam pronto pagamento ou quando a despesa deva ser feita em caráter sigiloso, conforme se classificar em regulamento; ou seja, os órgãos e entidades que executarem despesas sigilosas deverão possuir regramento próprio para tal.

REFERENCIA: CONTROLADORIA GERAL DA UNIÃO (Brasília/DF). Controladoria Geral da União. SUPRIMENTO DE FUNDOS E CARTÃO DE PAGAMENTO: Perguntas & Respostas. Brasília/ DF: Ascom/ CGU, 200-. 47 p. Disponível em: https://www.gov.br/cgu/pt-br/centrais-de-conteudo/publicacoes/orientacoes-aos-gestores/arquivos/suprimento-de-fundos-e-cartao-de-pagamento.pdf. Acesso em: 18 jan. 2022.

**C - Quem pode utilizar o CPGF?**

Servidor público ou ocupante de cargo em comissão em efetivo exercício no órgão, e que preencha as seguintes condições:
a) não ser responsável por dois suprimentos de fundos em fase de aplicação e/ou de prestação de contas;

b) não tenha a seu cargo a guarda do material a adquirir, salvo quando não houver na repartição outro servidor que reúna condições de receber o Suprimento de Fundos;

c) não ser responsável por Suprimento de Fundos que, esgotado o prazo, esteja pendente de prestação de contas;

d) não ter sido declarado em alcance, assim entendido aquele que tenha cometido apropriação indevida, extravio, desvio ou falta verificada na prestação de contas, de dinheiro ou valores confiados à sua guarda;

e) não tenha tido prestação de contas da aplicação de suprimento fundos com despesas impugnadas pelo Ordenador de Despesas ou que esteja em processo de Tomada de Contas Especial;

f) não se confunda com a pessoa do Ordenador de Despesas; e

g) não seja o próprio demandante da aquisição/contratação de serviço, exceto em viagem a serviço.

**D - Qual a URL onde é possível fazer o download dos arquivos do CPGF?**

A URL referente a página exata onde podem ser feitos os downloads dos arquivos para consulta é: http://www.portaldatransparencia.gov.br/download-de-dados/cpgf

**E - Qual a URL da página com a descrição dos compos (ou dicionário de dados) da CPGF?**

A descrição dos compos pode ser encontrada em: https://www.portaldatransparencia.gov.br/pagina-interna/603393-dicionario-de-dados-cpgf

**F - É possível identificar o nome e o documento do portador CPGF, em todas as movimentações ou há movimentações onde não é possível identificar o portador?**

Existem movimentações onde não é possível a identificação do nome e nem do documento do portador. Nesses casos o campo do documento encontra-se vazio e o compo referente ao nome do portado apresenta a mensagem "SEM INFORMACAO".

![image](https://user-images.githubusercontent.com/93266575/150012927-85672825-06ea-4237-b792-f1ffb78f42c0.png)

**G - É possível identificar o Órgão do portador do CPGF?**

Sim. o Órgão do qual o portador é servidor está identificado com Órgão Subordinado.

**H - Qual o nome do cujo código é 20402?**

Trata-se da Agência Espacial Brasileira.

![image](https://user-images.githubusercontent.com/93266575/150012253-6b7ebda8-1e9e-42d8-82f6-33f1d0e38193.png)


**I - É possível identificar o Nome e Documento (CNPJ) dos favorecidos pela utilização do CPGF?**

Sim. A identificação do nome do CNPJ está constando na 11ª coluna enquanto que nome dos favorecidos estão na 12ª.

![image](https://user-images.githubusercontent.com/93266575/150013493-21fbf2f7-9cbf-4f5d-ad64-470094f31b84.png)

Porém, nos casos em que foi concedido o sigilo da transação, o campo destinado ao CNPJ apresenta a numeração -11 e o campo destinado para o nome do favorecido contem a frase "Sigiloso".

![image](https://user-images.githubusercontent.com/93266575/150015151-961280bb-49af-4661-9d30-3e2c1fa688d0.png)

**J - É possível identificar a data e o valor das movimentaçõe financeiras do CPGF, em todas as movimentações? Ou há movimentações onde não é possível identificar as datas e ou valores?**

O valores das movimentações estão identificados em todos os casos, porém, nos casos de sigilo, a data da transação está em branco.

![image](https://user-images.githubusercontent.com/93266575/150016957-ff203464-a192-427d-8427-ca396442056a.png)

## Código

**K - Qual a soma total das movimentações utilizando o CPGF?**

**O valor total de todas as movimentações foi de R$5619007.95.**

**L - Qual a soma das movimentações sigilosas?**

**Deste modo, a soma das movimentações sigilosas foi de R$3108731.15.**

**M - Qual o Órgão que mais realizou movimentações sigilosas no periodo e qual o valor (somado)?**

**O órgao que mais realizou movimentações sigilosas foi: (30108) Departamento de Polícia Federal com 1562 movimentações somando um total de R$1348380.04**

**N - Qual o nome do portador que mais realizou saque no periodo? Qual a soma dos saques realizados por ele? Qual o nome do Órgão desse portador?**

**O portador(a) que mais realizou saques foi Sigiloso com um total de R$3136309.72 em 2373 saques pertencente ao Órgao Presidência da República**

**(DESCONSIDERANDO: Sigiloso)O portador(a) que mais realizou saques foi CELSO BENEDITO MOREIRA com um total de R$4102.87 em 30 saques pertencente ao Órgao Indústria de Material Bélico do Brasil**

**O - Qual o nome do favorecido que mais recebeu compras realizadas utilizando o CPGF?**

**O nome do favorecido que mais teve compras realizadas é SEM INFORMACAO com 126 compras**

**(DESCONSIDERANDO: SEM INFORMACAO)O nome do favorecido que mais teve compras realizadas é MERCADOPAGO.COM REPRESENTACOES LTDA. com 123 compras**

**P - Descreva qual a abordagem utilizada para desenvolver o código para os itens de K a O.**

As questões de K a O foram realizadas utilizando a liguagem de programação Java.

Foram utilizados alguns princípios de Programação Orientada a Objetos, por conta da conveniência na resolução dos problemas.

Levando-se em conta a estrutura do documento baixado no portal da tranparência. Foi implantada uma classe com no nome de [**Transaction**](src/entities/Transaction.java) onde os seus atributos são os nomes, adaptados, dos dados expostos na tabela: "CÓDIGO ÓRGÃO SUPERIOR";"NOME ÓRGÃO SUPERIOR";"CÓDIGO ÓRGÃO";"NOME ÓRGÃO";"CÓDIGO UNIDADE GESTORA";"NOME UNIDADE GESTORA";"ANO EXTRATO";"MÊS EXTRATO";"CPF PORTADOR";"NOME PORTADOR";"CNPJ OU CPF FAVORECIDO";"NOME FAVORECIDO";"TRANSAÇÃO";"DATA TRANSAÇÃO";"VALOR TRANSAÇÃO".

![image](https://user-images.githubusercontent.com/93266575/150056733-e045eaf3-6795-45f6-89ff-d02e33a7e3b3.png)

Também foram implementados Getters para a recuperação dos valores no programa principal.

![image](https://user-images.githubusercontent.com/93266575/150056972-9e9150b9-9d3e-46ce-b20b-78ff220c2d08.png)

No [programa principal](src/application/Program.java), denominado como **Program**, foi implementada uma lista para armazenar os objetos criados a partir da leitura do arquivo, e uma lógica para a leitura do aquivo csv, baixado no portal da transparência.

![image](https://user-images.githubusercontent.com/93266575/150057533-1820692b-1c9a-4484-a384-7015c8fc63ac.png)

![image](https://user-images.githubusercontent.com/93266575/150057819-135a75ee-84d4-4fb5-b98f-179046b68204.png)

Por fim, para a finalização da questão K, realizando a soma de todos os valores das transações, foi implementado um for of, para percorrer a lista de objetos somando os valores do compo VALOR.

![image](https://user-images.githubusercontent.com/93266575/150058063-b1b3a8ee-20e4-413a-a66f-d754edfaffb8.png)

Para a realização da soma desses valores em específico, foi utilizado um for of para percorrer a lista e a soma dos valores está condicionada a verificação da frase "Informações protegidas por sigilo" no campo TRANSAÇÂO.

![image](https://user-images.githubusercontent.com/93266575/150059126-1598d6a1-ea94-42da-bafc-98c86f12f498.png)

Na questão M, foi implementado um Map para a realizar a iteração de todas as linhas lidas e retornar uma coleção sem repetições. O Map foi instanciado tendo como chave o valor do código do Órgão subordinado e como valor o nome do Órgão. Além disso foi feito uma estrutura condicional para que apenas apenas as informações sigilosas entrassem na colleção produzida pelo Map.

![image](https://user-images.githubusercontent.com/93266575/150234536-7ef5b41c-f494-457c-911c-dcef08bc3bce.png)

Deste modo, tendo o array do Map contendo apenas os códigos dos Órgão subordinados em movimentações sigilosas e sem repetição, foi realizada uma nova iteração nesse Array, de forma que para cada código de um Órgão subordinado, a partir de um outro for of que percorre a lista completa, fossem recuperadas a quantidade de todas as transões realizadas por aquele Órgão, atraves de um acumulador, o nome do Órgão e a soma de trodas as transações.

![image](https://user-images.githubusercontent.com/93266575/150235106-a5b4dfce-f1ee-441f-b24a-16fd65a8caaa.png)

Em seguida, a partir de uma estrutura condicional, foi construida uma lógica para guardar as informações correspondentes ao código do Órgão que mais realizou movimentações.

![image](https://user-images.githubusercontent.com/93266575/150235326-aef1e6ba-57a6-483c-8a05-5bdc5e443049.png)

Para a questão N, foi implemetado um Map novamente, porém agora, a chave seria o CPF do portador e o valor o nome do mesmo. A adição dos itens foi feita respeitando a informação de que se tratariam apenas de transações do tipo saque.

![image](https://user-images.githubusercontent.com/93266575/150235739-d639f8d6-6a17-48ac-929c-9338e79f5797.png)

A lógica para a recuperação dos valores pertinentes é basicamente a mesma utilizada no item anterior, porém, neste caso, como o primeiro resultado para o portador que realizou mais saques não podia ser acessado por conta do sigilo, fez-se necessária a implementação de algumas condições para que pudessemos ter o nome de alguma pessoa.

![image](https://user-images.githubusercontent.com/93266575/150236071-37c82e9b-b535-485a-9955-038c1cf34c08.png)

![image](https://user-images.githubusercontent.com/93266575/150236177-30c4d260-b8f0-4373-8db0-d206a8299f93.png)

Para a questão O, também foi implementado um Map, tendo como chaves o CPF/CNPJ do favorecido e como valores os nomes. Foi necessário implementar uma estrutura condicional para filtrarmos apenas as operações de compra.

![image](https://user-images.githubusercontent.com/93266575/150239145-52cbcc23-0173-4902-9e74-d25e19399ba6.png)

Para a recuperação dos dados a lógica seguiu a mesma dos exercicios anteriores, porém ocorreu, também, de retornar um valor protegido por sigilo, então, para contornar essa situação e obtermos um nome de um favorecido foi implementado um condicional adequado. Apesar disso, os dois valores foram expostos.

![image](https://user-images.githubusercontent.com/93266575/150239380-7890d90a-5529-4de6-9b67-b57ec91a8cae.png)






