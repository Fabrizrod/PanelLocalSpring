package com.parkea.panelLocal.controller;

import com.parkea.panelLocal.model.Reserva;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Map;

@Controller
public class ReservaController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/reservas")
    public String reservas(Model model) {
        // Simular reservas pendientes
        List<Reserva> reservasPendientes = List.of(
                new Reserva(1L, "Carlos Ramírez", "Estacionamiento Central", "2024-03-15 10:00", "2024-03-15 12:00", "Pendiente"),
                new Reserva(2L, "Sofía Mendoza", "Estacionamiento Norte", "2024-03-16 14:00", "2024-03-16 16:00", "Pendiente"),
                new Reserva(3L, "Diego López", "Estacionamiento Sur", "2024-03-17 09:00", "2024-03-17 11:00", "Pendiente")
        );

        // Simular pagos
        List<Map<String, String>> pagos = List.of(
                Map.of("id", "#P12345", "usuario", "Carlos Ramírez", "monto", "$15.00", "fecha", "2024-03-10", "estado", "Completado"),
                Map.of("id", "#P12346", "usuario", "Sofía Mendoza", "monto", "$20.00", "fecha", "2024-03-11", "estado", "Completado"),
                Map.of("id", "#P12347", "usuario", "Diego López", "monto", "$10.00", "fecha", "2024-03-12", "estado", "Completado")
        );

        model.addAttribute("reservasPendientes", reservasPendientes);
        model.addAttribute("pagos", pagos);

        return "reservas";
    }

    @GetMapping("/pagos")
    public String pagos() {
        return "pagos";
    }

    @GetMapping("/reportes")
    public String reportes() {
        return "reportes";
    }

    @GetMapping("/incidencias")
    public String incidencias() {
        return "incidencias";
    }

    @GetMapping("/usuarios")
    public String usuarios() {
        return "usuarios";
    }

    @GetMapping("/configuracion")
    public String configuracion() {
        return "configuracion";
    }

    @GetMapping("/espacios")
    public String espacios() {
        return "espacios";
    }
}
