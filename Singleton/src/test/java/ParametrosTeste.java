import org.example.Parametros;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParametrosTeste {
    @Test
    public void deveRetornarTema() {
        Parametros.getInstance().setTema("Escuro");
        assertEquals("Escuro", Parametros.getInstance().getTema());
    }

    @Test
    public void deveRetornarIdioma() {
        Parametros.getInstance().setIdioma("Português");
        assertEquals("Português", Parametros.getInstance().getIdioma());
    }
}
