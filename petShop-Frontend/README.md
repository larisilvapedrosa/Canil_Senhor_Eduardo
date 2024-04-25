# Frontend

Desenvolvido em TypeScript e react, o frontend é responsavel por capturar os valores dos inputs enviar para back e devolver a resposta.

### Foi utilizada as seguintes bibliotecas:
* Swal (SweetAlert2): Usada para criar um modal interativo onde é exibida uma mensagem de sucesso com o nome do melhor PetShop e o preço dos banho;
* Chakra UI Components: Componentes de UI como Input, Button, Text, etc. Usada para otimizar e facilitar a estilização da aplicação
* Axios: Usada para realizar a requisição GET a api.

  ## Como rodar
  1. **Clonar o repositório:** clonar o repositorio do GIT para seu ambiente local
     
     > git clone https://github.com/larisilvapedrosa/Canil_Senhor_Eduardo.git

  2. **Navegar para o diretorio do projeto:** Ja com a IDE ou o terminal aberto, navegue ate o diretorio do projeto:

     > cd petShop-Frontend

  3. **Instalar dependencias:** Antes de executar a aplicação é necessário instalar as dependencia contidas no arquivo "package.json"

     > npm install

  4. **Iniciar Servidor:** Agora com todas as dependencias voce poderá iniciar o servidor

     > npm run dev

     Com este comando irá aparecer a seguinte mensagem no terminal: <br />
       VITE v5.2.10  ready in 1881 ms <br />

       ➜  Local:   http://localhost:5173/<br />
       ➜  Network: use --host to expose<br />
       ➜  press h + enter to show help <br />
       
     E com isso basta voce clicar no link " http://localhost:5173/" + ctrl, que abrirá a aplicação em seu navegador padrão.

  ## Como usar a aplicação
  1. Para usar a aplicação preencha os campos necessários para realizar a busca do melhor preço em petshops para banho dos seus cãezinhos:
  *Data: Selecione a data desejada para o banho dos cães.
  *Cães Pequenos: Informe a quantidade de cães pequenos que irão tomar banho.
  *Cães Grandes: Informe a quantidade de cães grandes que irão tomar banho.

  2. Buscar melhor preço: Após preencher os campos, clique no botão "Encontrar melhor PetShop".

  3. Após receber a resposta, um modal interativo será exibido contendo as informações do melhor PetShop encontrado e o preço total do banho. Você poderá ver o nome do PetShop e o valor total a ser pago.
  
