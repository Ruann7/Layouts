# Exemplo de Layouts Android

Este projeto demonstra o uso dos principais tipos de layout do Android e do RecyclerView. O objetivo é entender como cada layout organiza os elementos na tela e como navegar entre Activities.

## Estrutura do App

- **MainActivity**  
  Tela inicial com cinco botões, cada um abre uma Activity diferente para demonstrar um layout específico:
  - FrameLayout
  - LinearLayout
  - RelativeLayout
  - ConstraintLayout
  - RecyclerView

- **Activities**  
  Cada Activity exibe o layout correspondente, permitindo visualizar o comportamento de cada tipo de organização de elementos.

- **Layouts XML**  
  - `activity_main.xml` → contém os botões de navegação.  
  - `activity_frame.xml` → elementos empilhados (FrameLayout).  
  - `activity_linear.xml` → elementos em linha ou coluna (LinearLayout).  
  - `activity_relative.xml` → elementos posicionados em relação uns aos outros (RelativeLayout).  
  - `activity_constraint.xml` → elementos posicionados por restrições (ConstraintLayout).  
  - `activity_recycler.xml` → contém o RecyclerView.  
  - `item_lista.xml` → layout de cada item da lista do RecyclerView.

- **RecyclerView e Adapter**  
  O RecyclerView exibe listas grandes de forma eficiente. O Adapter cria e vincula cada item da lista dinamicamente.

- **Intents**  
  Cada botão no MainActivity dispara uma Intent para abrir a Activity correspondente, permitindo a navegação entre telas.

## Como usar

1. Abra o projeto no Android Studio.
2. Compile e execute no emulador ou dispositivo físico.
3. Na tela inicial, clique em qualquer botão para abrir o layout correspondente.

## Objetivo do Projeto

- Entender a diferença entre FrameLayout, LinearLayout, RelativeLayout, ConstraintLayout e RecyclerView.  
- Aprender a navegar entre Activities usando Intents.  
- Praticar a criação de layouts e listas de forma eficiente no Android.
