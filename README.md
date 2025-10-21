# Desafio QA (Web & API) — Java + Cucumber

Este pacote contém **dois projetos Maven**:
- `web-bdd-cucumber-selenium`: Cenários Web (Login e Busca) no site **automationexercise.com** usando **Selenium + Cucumber**.
- `api-bdd-cucumber-restassured`: Cenário de API com **Rest-Assured + Cucumber** validando o endpoint público do **Trello**.

## Requisitos
- Java 17+
- Maven 3.8+
- Chrome instalado (ou use `-DBROWSER=firefox` no projeto Web)

## Execução rápida
```bash
# WEB
cd desafio web
mvn -q test -DHEADLESS=true

# API
cd ../desafio api
mvn -q test
```

## Alternativas se URLs estiverem indisponíveis
- Para Web, você pode trocar `BASE_URL` por `http://automationpractice.pl/` ou outro e ajustar seletores (passando por linha de comando).
- Para API, a feature e os steps são fáceis de apontar para outro endpoint público (basta editar `URL` em `ApiSteps`).

## Relatórios
Cada projeto gera `target/cucumber-report.html`.

