
package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @BeforeEach
    void setUp() {

    }

    @Test
    public void realizartransacao() {
        xuxa = new Cliente("xuxa", "12345678900", "1234567");
        silvioSantos = new Cliente("silvioSantos", "119876543210", "09876543");

        contaXuxa = new Conta( "0025", "2254",  2500.00, xuxa);
        contaSilvio = new Conta("0026", "2251",  3500.00, silvioSantos);

        contaXuxa.realizarTransferencia( 1000.00, contaSilvio);

        assertEquals( 1500.00, contaXuxa.getSaldo());
        assertEquals( 4500.00, contaSilvio.getSaldo());
    }

    }
