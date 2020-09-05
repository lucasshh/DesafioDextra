# language: pt
# charset: UTF-8
  Funcionalidade: Novo Cadastro
    Eu como usuário gostaria de poder me cadastrar como cliente

    Contexto:
      Dado que eu acesso a pagina de cadastro


@CT001
    Esquema do Cenario: Cadastro de cliente com e-mail existente
      Dado que eu queira realizar o cadastro com email "<email>"
      E com a senha "<senha>"
      Quando eu confirmar o cadastro
      Entao deverei ver a mensagem "<mensagem>"
      Exemplos:
      | email                   | senha              | mensagem             |
      | teste@hotmail.com       | Se                 | E-mail já cadastrado |

@CT002
      Esquema do Cenario: Cadastro de cliente com senha fraca
        Dado que eu queira realizar o cadastro com email "<email>"
        Quando com a senha "<senha>"
        Entao  deverei ver a mensagem "<mensagem>"
        Exemplos:
        |email              |senha          |mensagem             |
        |teste@hotmail.com  |Ab             |Fraca                |

@CT003
        Esquema do Cenario: Cadastro de cliente com cpf inválido
          Dado que eu queira realizar o cadastro com email "<email>"
          E com a senha "<senha>"
          E com o cpf "<cpf>"
          Entao devo ver a mensagem "<mensagem>"
          Exemplos:
          |email                    |senha          |cpf              |mensagem         |
          |novoemailxt@hotmail.com |Senha123       |4434565453       |Campo inválido   |

@CT004
          Esquema do Cenario: Cadastro de cliente com sucesso
            Dado que eu tenha o email "<email>" e a senha "<senha>"
            E com preencha com o cpf "<cpf>" e o nome "<nome>"
            Quando eu confirmar o cadastro
            Entao deverei estar logado no sistema com meu novo usuario
            Exemplos:
              | email                          | senha           |cpf           |nome           |
              | desafiodextra01@hotmail.com    | Senha123        |56508580043   |Cleide Fernanda|