const apiUrl = "/v1/ferramenta";

// 🔄 LISTAR
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
            <span>${f.nomeFerramenta} - Lote: ${f.lote} - Dificuldade: ${f.nivelDificuldade}</span>
            <span>
                <button onclick="editarFerramenta(${f.lote})">Editar</button>
                <button onclick="deletarFerramenta(${f.lote})">Deletar</button>
            </span>
        `;

        lista.appendChild(div);
    });
}

// ➕ ADICIONAR
document.getElementById("form-ferramenta").addEventListener("submit", async (e) => {
    e.preventDefault();

    const nome = document.getElementById("nome").value;
    const lote = parseInt(document.getElementById("lote").value);
    const dificuldade = document.getElementById("dificuldade").value;

    await fetch(apiUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
            nomeFerramenta: nome,
            lote: lote,
            nivelDificuldade: dificuldade
        })
    });

    e.target.reset();
    carregarFerramentas();
});

// ❌ DELETAR
async function deletarFerramenta(id) {
    if (!confirm("Deseja realmente deletar esta ferramenta?")) return;

    await fetch(`${apiUrl}/${id}`, {
        method: "DELETE"
    });

    carregarFerramentas();
}

// ✏️ EDITAR
async function editarFerramenta(id) {
    const nome = prompt("Novo nome:");
    if (!nome) return;

    const dificuldade = prompt("Nova dificuldade (FACIL, MEDIO, DIFICIL):");
    if (!dificuldade) return;

    await fetch(`${apiUrl}/${id}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
            nomeFerramenta: nome,
            nivelDificuldade: dificuldade
        })
    });

    carregarFerramentas();
}

// 🚀 INICIAR
carregarFerramentas();