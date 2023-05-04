document.getElementById('botao').addEventListener('click', () => {
	const lista = document.getElementById('lista');
	
	const nome = document.getElementById('nome').value;
	
	const item = document.getElementById('li');
	
	item.innerText = nome;
	
	lista.appendChild(item);
})