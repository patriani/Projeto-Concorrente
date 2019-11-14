# Projeto-Concorrente
I/O Bound

.Primeira Parte (programação não concorrente):
  Os arquivos: Arquivo.java e Principal.java transferem um arquivo de diretório selecionado para outro destino inserido meio interação com a interface. Caso o arquivo corrompa o programa apaga a cópia, senão apaga o original.

 .Segunda Parte (programação concorrente): 
  Os arquivos com "[...]Concorrente" executam a mesma função dos classes da primeira parte do trabalho, com a diferença de que agora a classe Arquivo é abstrata e os métodos são implementados em TransferenciaConcorrente.java. As classes HashConcorrente.java e HashConcorrente2.java são chamadas como threads para verificar se o arquivo foi corrompido (caso o arquivo corrompa o programa apaga a cópia, senão apaga o original).
