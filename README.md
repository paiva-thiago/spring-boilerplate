# spring-boilerplate

Projeto simples que acompanha toda a estrutura básica para um projeto utilizando o framework spring.

## Para clonar

```bash
git clone https://github.com/paiva-thiago/spring-boilerplate.git
```

## Sobre

Este projeto usa o `spring-boot`, que inclui um server no seu processo de inicialização e através do comando no maven, é iniciado via linha de comando. Inclusive neste projeto temos dois arquivos **.bat** para servir como atalhos:

1. *rs.bat* - para limpar o projeto, dando um 'reset'. Ideal caso tenha sido realizada alguma alteração no arquivo de dependências (**pom.xml**),
2. *st.bat* - para iniciar a aplicação. Ela estará disponível para acesso no browser em `localhost:8080`, exceto em casos em que esta porta esteja ocupada.

Em `src/java/com/thiagopaiva/sistema` estão os arquivos Java e os templates em `src/main/resources`.

A classe `WebApplication` será o host que comandará a inicialização e o `HomeController` controlará as rotas. Verifique as anotações em `@RequestParam` que possuem as rotas como **/home** e **/**.

O `ModelAndView` cuida de ligar a aplicação ao template. Verifique, por exemplo, em `new ModelAndView("home");`: O parâmetro procurará o arquivo **home.html** que está em resources.

Podemos passar valores através do método addObject, que possui como parâmetros o nome da variável utilizada pelo template e seu respectivo valor. Em `modelAndView.addObject("message","Usuário ou senha inválidos!");` será relacionada em `${message}` no index a mensagem do segundo parâmetro.

## moreinfo

paiva.thiago@gmail.com