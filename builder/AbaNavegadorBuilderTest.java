package builder;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AbaNavegadorBuilderTest
{
    @Test
    void retornaSucesso()
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
    void retornaExcecaoURL()
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
    void retornaExcecaoSemNome()
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
