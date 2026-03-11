const apiUrl = "/ferramentas"; // rota do backend

// Função para carregar e mostrar ferramentas
async function carregarFerramentas() {
    const res = await fetch(apiUrl);
    const ferramentas = await res.json();

    const lista = document.getElementById("ferramentas-lista");
    lista.innerHTML = "";

    if (ferramentas.length === 0) {
        lista.textContent = "Nenhuma ferramenta cadastrada.";
        return;
    }

    ferramentas.forEach(f => {
        const div = document.createElement("div");
        div.className = "ferramenta-item";

        div.innerHTML = `
            <span>${f.nome} - Lote: ${f.lote} - Dificuldade: ${f.dificuldade}</span>
            <span>
                <button onclick="editarFerramenta('${f.id}')">Editar</button>
                <button onclick="deletarFerramenta('${f.id}')">Deletar</button>
            </span>
        `;

        lista.appendChild(div);
    });
}

// Adicionar nova ferramenta
document.getElementById("form-ferramenta").addEventListener("submit", async (e) => {
    e.preventDefault();

    const nome = document.getElementById("nome").value;
    const lote = parseInt(document.getElementById("lote").value);
    const dificuldade = parseInt(document.getElementById("dificuldade").value);

    await fetch(apiUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ nome, lote, dificuldade })
    });

    e.target.reset();
    carregarFerramentas();
});

// Deletar ferramenta
async function deletarFerramenta(id) {
    if (!confirm("Deseja realmente deletar esta ferramenta?")) return;

    await fetch(`${apiUrl}/${id}`, { method: "DELETE" });
    carregarFerramentas();
}

// Editar ferramenta
async function editarFerramenta(id) {
    const nome = prompt("Novo nome:");
    if (!nome) return;
    const lote = parseInt(prompt("Novo lote:"));
    if (!lote) return;
    const dificuldade = parseInt(prompt("Nova dificuldade (1-5):"));
    if (!dificuldade) return;

    await fetch(`${apiUrl}/${id}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ nome, lote, dificuldade })
    });

    carregarFerramentas();
}

// Inicializar lista ao carregar página
carregarFerramentas();