document.addEventListener("DOMContentLoaded", async () => {
  // Simular datos API
  const data = await fetchReportesData();

  crearGraficoIngresos(data.ingresosDiarios);
  crearGraficoOcupacion(data.ocupacionPromedio);
  crearGraficoUsuarios(data.usuariosFrecuentes);

  document.getElementById("btnFiltrar").addEventListener("click", () => {
    alert("Funcionalidad de filtro aún en desarrollo");
  });
});

async function fetchReportesData() {
  // Simulación temporal
  return {
    ingresosDiarios: {
      labels: ["Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"],
      data: [1800, 2200, 2000, 2500, 2700, 3200, 2900]
    },
    ocupacionPromedio: {
      labels: ["Est. Norte", "Est. Sur", "Est. Central"],
      data: [75, 68, 82]
    },
    usuariosFrecuentes: {
      labels: ["Carlos", "Sofía", "Diego", "Lucía", "Andrés"],
      data: [15, 12, 10, 9, 8]
    }
  };
}

// ===== Gráficos =====

function crearGraficoIngresos(dataset) {
  new Chart(document.getElementById("chartIngresos"), {
    type: "line",
    data: {
      labels: dataset.labels,
      datasets: [{
        label: "Soles",
        data: dataset.data,
        borderColor: "#2563eb",
        fill: false,
        tension: 0.3
      }]
    },
    options: {
      responsive: true,
      plugins: { legend: { display: false } }
    }
  });
}

function crearGraficoOcupacion(dataset) {
  new Chart(document.getElementById("chartOcupacion"), {
    type: "bar",
    data: {
      labels: dataset.labels,
      datasets: [{
        data: dataset.data,
        backgroundColor: ["#3b82f6", "#10b981", "#f59e0b"],
        borderRadius: 6
      }]
    },
    options: {
      plugins: { legend: { display: false } },
      scales: { y: { beginAtZero: true, max: 100 } }
    }
  });
}

function crearGraficoUsuarios(dataset) {
  new Chart(document.getElementById("chartUsuarios"), {
    type: "doughnut",
    data: {
      labels: dataset.labels,
      datasets: [{
        data: dataset.data,
        backgroundColor: ["#2563eb", "#f43f5e", "#10b981", "#f59e0b", "#8b5cf6"]
      }]
    },
    options: {
      plugins: { legend: { position: "bottom" } }
    }
  });
}
