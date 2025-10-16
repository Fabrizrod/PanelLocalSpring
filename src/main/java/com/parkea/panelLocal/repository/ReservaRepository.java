/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parkea.panelLocal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parkea.panelLocal.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
