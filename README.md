# Sistema Gerenciador de Folha de Pagamentos

Projeto acadêmico desenvolvido para a disciplina **Programação de Soluções Computacionais**. Trata-se de uma aplicação de console em **Java** que aplica conceitos de Programação Orientada a Objetos (herança, encapsulamento e polimorfismo) para gerenciar o cadastro de colaboradores e calcular a folha de pagamentos em memória.

## Funcionalidades

- **Cadastro de Colaboradores** com validação de entrada e confirmação antes de salvar:
  - **Colaborador Padrão**: recebe apenas o salário base fixo (`R$ 2.000,00`).
  - **Colaborador Comissionado**: salário base + comissão calculada a partir do valor das vendas e percentual de comissão.
  - **Colaborador Produção**: salário base + produtividade calculada pela quantidade de peças e valor por peça.
- **Gerar Folha de Pagamento**: exibe os dados detalhados de cada colaborador cadastrado (nome, matrícula, tipo, salário base, benefício e salário final).
- **Exibir Resumo da Folha**: exibe a quantidade total de colaboradores, o valor total da folha e a média salarial.

## Estrutura do Projeto

```text
├── project/src/
│   ├── Principal.java               # Ponto de entrada e loop do menu principal
│   ├── Menus.java                   # Exibição de menus, resumos e créditos
│   ├── Cadastros.java               # Fluxos de cadastro e validação de entradas
│   ├── Operacao.java                # Relatórios da folha e utilitários de console
│   ├── Colaborador.java             # Classe base dos colaboradores
│   ├── ColaboradorPadrao.java       # Subclasse para colaborador padrão
│   ├── ColaboradorComissionado.java # Subclasse para colaborador comissionado
│   ├── ColaboradorProducao.java     # Subclasse para colaborador de produção
│   └── META-INF/MANIFEST.MF         # Manifesto definindo Principal como Main-Class
└── out/artifacts/A3_Programa_o_de_solu_es_computacionais_jar/
    ├── A3-Programa-o-de-solu-es-computacionais.jar
    └── iniciarApp.bat               # Script Windows para iniciar o .jar
```

## Dependências e Pré-requisitos

O projeto **não possui dependências ou bibliotecas externas** — utiliza apenas a biblioteca padrão do Java (`java.util`).

Para executá-lo na sua máquina, você precisa de:

1. **Java (JRE ou JDK) 26 ou superior** instalado e configurado na variável de ambiente `PATH`:
   - O arquivo `.jar` pré-compilado (`A3-Programa-o-de-solu-es-computacionais.jar`) foi compilado visando **Java 26** (bytecode versão 70).
   - Caso queira **recompilar** o código-fonte diretamente a partir de `project/src/`, é necessário um **JDK 16 ou superior** (devido ao uso de `switch` expressions e *pattern matching* com `instanceof`).
2. **Windows** (Prompt de Comando / PowerShell / Windows Terminal) para executar o arquivo `iniciarApp.bat`.

Para verificar se o Java está instalado e acessível no terminal, execute:

```bash
java -version
```

## Como Executar

### 1. Executando pelo arquivo `.bat` (Windows)

O script `iniciarApp.bat` executa `java -jar A3-Programa-o-de-solu-es-computacionais.jar` utilizando caminho relativo, portanto ele **deve ser executado a partir da pasta onde está localizado**:

1. Abra a pasta do artefato no repositório:
   ```text
   out\artifacts\A3_Programa_o_de_solu_es_computacionais_jar\
   ```
2. **Pelo Explorador de Arquivos**: dê um duplo clique em `iniciarApp.bat`.
3. **Ou pelo terminal** (CMD ou PowerShell), navegue até a pasta e execute o script:
   ```powershell
   cd out\artifacts\A3_Programa_o_de_solu_es_computacionais_jar
   .\iniciarApp.bat
   ```

> **Observação:** Em sistemas Windows antigos sem suporte nativo a sequências ANSI no CMD padrão, recomenda-se executar pelo **Windows Terminal** ou **PowerShell** para que a limpeza de tela funcione corretamente.

### 2. Compilando e executando manualmente (opcional)

Caso queira compilar os arquivos `.java` diretamente (útil também se estiver utilizando uma versão do JDK entre 16 e 25, ou em Linux/macOS):

```bash
javac -encoding UTF-8 -d out/production/project project/src/*.java
java -cp out/production/project Principal
```

## Integrantes do Grupo

- Rodrigo Chamusca Gomes (`12725167470`)
- Rafael Ahmad Fonseca Marques Santos (`12725138443`)
- Camila Maria de Sá Longa (`12725154062`)
- Cauã Leão Mendes (`12725145528`)
- Tiago Eziquiel de Souza Santos Assis: (`12725153056`)

## Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
