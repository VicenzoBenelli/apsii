# Exercício 01 — Agenda de aniversários

## Diagrama de classes

```mermaid
classDiagram
    class AgendaDeAniversarios {
        <<interface>>
        +adicionarAniversariante(nome: String, dia: int, mes: int) void
        +obterAniversariantesDoDia(dia: int, mes: int) ArrayList~String~
        +removerAniversariante(nomeAniversariante: String) void
    }

    class MinhaAgendaDeAniversarios {
        -aniversariantes: ArrayList~Aniversariante~
        +adicionarAniversariante(nome: String, dia: int, mes: int) void
        +obterAniversariantesDoDia(dia: int, mes: int) ArrayList~String~
        +removerAniversariante(nomeAniversariante: String) void
    }

    class Aniversariante {
        -nome: String
        -dataAniversario: DataAniversario
        +Aniversariante(nome: String, dia: int, mes: int)
        +Aniversariante(nome: String, dataAniversario: DataAniversario)
        +equals(outroObjeto: Object) boolean
    }

    class DataAniversario {
        -dia: int
        -mes: int
        +DataAniversario(dia: int, mes: int)
        +equals(outraData: Object) boolean
    }

    AgendaDeAniversarios <|.. MinhaAgendaDeAniversarios : implementa
    MinhaAgendaDeAniversarios "1" *-- "0..*" Aniversariante : guarda
    Aniversariante "1" *-- "1" DataAniversario : possui
```

Os nomes são comparados exatamente como informados, inclusive quanto a letras maiúsculas e
minúsculas. A interface original não define validação de faixa para dia e mês; portanto, esta
solução não acrescenta uma regra que não consta no enunciado.
