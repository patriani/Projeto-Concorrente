# Projeto-Concorrente
I/O Bound

.Primeira Parte (programação não concorrente):
  Os arquivos: Arquivo.java e Principal.java transferem um arquivo de diretório selecionado para outro destino inserido meio interação com a interface. Caso o arquivo corrompa o programa apaga a cópia, senão apaga o original.

 .Segunda Parte (programação concorrente): 
  Os arquivos com "[...]Concorrente" executam a mesma função dos classes da primeira parte do trabalho, com a diferença de que agora a classe Arquivo é abstrata e os métodos são implementados em TransferenciaConcorrente.java. As classes HashConcorrente.java e HashConcorrente2.java são chamadas como threads para verificar se o arquivo foi corrompido (caso o arquivo corrompa o programa apaga a cópia, senão apaga o original).

Análise: Com esse projeto foi possível notar, medindo o tempo de execução das tarefas utilizando System.currentTimeMillis(), que a tarefa executada pelo algoritmo é mais eficiente em sua forma sequencial. Isso ocorre porque a tarefa não é muito complexa para um número reduzido de requisições, logo o tempo de espera para resposta entre classes ou evitando deadlock acaba sendo uma desvantagem.

-obs: O relatório disponível é referente ao projeto da disciplina Programação Concorrente. A análise feita compara os resultados entre o desempenho de um problema I/O Bound e CPU Bound em suas formas concorrente e sequencial.
