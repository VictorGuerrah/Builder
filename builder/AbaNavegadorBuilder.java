package builder;
import java.util.Date;

public class AbaNavegadorBuilder
{
    private AbaNavegador abaNavegador;

    public AbaNavegadorBuilder()
    {
        abaNavegador = new AbaNavegador();
    }

    public AbaNavegador build()
    {
        if (abaNavegador.getUrl() == "")
        {
            throw new IllegalArgumentException("URL inválida.");
        }
        if (abaNavegador.getNome().equals(""))
        {
            throw new IllegalArgumentException("Nome inválido");
        }
        if(abaNavegador.getConteudo() == "" )
        {
            throw new IllegalArgumentException("Conteúdo inválido.");
        }
        return abaNavegador;
    }

    public AbaNavegadorBuilder setUrl(String url) {
        abaNavegador.setUrl(url);
        return this;
    }

    public AbaNavegadorBuilder setNome(String nome) {
        abaNavegador.setNome(nome);
        return this;
    }

    public AbaNavegadorBuilder setConteudo(String conteudo) {
        abaNavegador.setConteudo(conteudo);
        return this;
    }
    public AbaNavegadorBuilder setDataAcesso(String dataAcesso) {
        abaNavegador.setDataAcesso(dataAcesso);
        return this;
    }

}
