var apiKey = '3f301be7381a03ad8d352314dcc3ec1d';
let token: any;
let nome: any;
let password: any;
let criarSessao: any;
let listaId = '7101979';

let loginButton = document.getElementById('login-button')! as HTMLInputElement;
let searchButton = document.getElementById('search-button');
let searchContainer = document.getElementById('search-container');

loginButton.addEventListener('click', async () => {
  await token();
  await nome();
  await password();
  await criarSessao();
})
