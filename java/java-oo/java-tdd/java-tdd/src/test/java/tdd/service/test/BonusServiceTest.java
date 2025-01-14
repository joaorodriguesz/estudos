package tdd.service.test;

import org.example.modelo.Funcionario;
import org.example.modelo.service.BonusService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
        //assertThrows(IllegalArgumentException.class, () -> service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
//        try {
//            service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
//            fail("Erro");
//        } catch (Exception ex) {
//             assetEquals("mensagem", ex);
//        }
    }

    @Test
    void bonus() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
