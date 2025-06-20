/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author 55519
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import services.ReservaService;

public class ReservaServiceTest {
    @Test
    public void testCalcularDiarias() {
        ReservaService service = new ReservaService(null); // Não precisamos do DAO para este teste

        int diarias = service.calcularDiarias("2025-05-01", "2025-05-06");
        assertEquals(5, diarias);

        int diariasZero = service.calcularDiarias("2025-05-01", "2025-05-01");
        assertEquals(0, diariasZero);

        int umaDiaria = service.calcularDiarias("2025-05-01", "2025-05-02");
        assertEquals(1, umaDiaria);
    }
}
