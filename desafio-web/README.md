# Web BDD - Cucumber + Selenium (Java)

Automação dos cenários **Login** e **Busca de produtos** usando Cucumber + Selenium (JUnit 5).

## Pré‑requisitos
- Java 17+
- Maven 3.8+
- Google Chrome instalado (ou setar `BROWSER=firefox`)

## Como executar
```bash
# Dentro do projeto
mvn -q test
```

### Variáveis úteis (podem ser passadas via linha de comando)
- `BASE_URL` (default: `https://automationexercise.com/`)
- `LOGIN_EMAIL` (default: `testeQA2025_005@teste.com.br`)
- `LOGIN_PASSWORD` (default: `124578Teste`)
- `HEADLESS` = `true|false` (default: `true`)
- `BROWSER` = `chrome|firefox` (default: `chrome`)

Exemplo:
```bash
mvn -q test -DHEADLESS=false -DLOGIN_EMAIL=meuemail@dominio.com -DLOGIN_PASSWORD=MinhaSenha!
```

## Relatórios
Ao final, confira `target/cucumber-report.html`.
