# ExportacaoCPJ
Ferramenta de exportação para HTML dos processos, andamentos e documentos cadastrados no sistema CPJ.

A partir de uma tabela chave denominada "ficha" são realizadas consultas e um árvore de diretório é criada, onde cada diretório é nomeado com a respectiva ficha e contém um arquivo index.html com informações básicas do processo, andamentos e link para os arquivos anexados aos andamentos, os quais também estão contidos dentro da sua respectiva pasta.

Para navegar entre as pastas criei o arquivo indexBase.html

O programa de exportação extrai os andamentos e arquivos para a pasta C:\ExportacaoCPJ\pastas\

A tabela "ficha" deve ser criado conforme abaixo:

CREATE TABLE `ficha` (
  `arquivo` char(1) NOT NULL,
  `ficha` varchar(6) NOT NULL,
  `incidente` smallint(6) NOT NULL
);

O acesso aos arquivos digitalizados deve estar mapeado para w:\arq3c_docs