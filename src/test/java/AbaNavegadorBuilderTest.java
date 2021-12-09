import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AbaNavegadorBuilderTest
{
    @Test
    public void retornaSucesso()
    {
            AbaNavegadorBuilder abaNavegadorBuilder = new AbaNavegadorBuilder();
            AbaNavegador abaNavegador = abaNavegadorBuilder
                    .setUrl("google.com")
                    .setNome("Google")
                    .setConteudo("Serviço de Busca")
                    .setDataAcesso("30/11/2021")
                    .build();

            assertNotNull(abaNavegador);
    }

    @Test
    public void retornaExcecaoURL()
    {
        try
        {
            AbaNavegadorBuilder abaNavegadorBuilder = new AbaNavegadorBuilder();
            AbaNavegador abaNavegador = abaNavegadorBuilder
                    .setNome("Google")
                    .setConteudo("Serviço de Busca")
                    .build();
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            assertEquals("URL inválida.", ex.getMessage());
        }
    }

    @Test
    public void retornaExcecaoSemNome()
    {
        try
        {
            AbaNavegadorBuilder abaNavegadorBuilder = new AbaNavegadorBuilder();
            AbaNavegador abaNavegador = abaNavegadorBuilder
                    .setUrl("google.com")
                    .setConteudo("Serviço de Busca")
                    .build();
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            assertEquals("Nome inválido", ex.getMessage());
        }
    }
}