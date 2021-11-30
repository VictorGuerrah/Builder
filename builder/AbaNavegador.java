package builder;

import java.util.Date;

public class AbaNavegador{
    private String url;
    private String nome;
    private String dataAcesso;
    private String conteudo;

    public AbaNavegador() {
        this.url = "";
        this.nome = "";
    }


        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDataAcesso() {
            return dataAcesso;
        }

        public void setDataAcesso(String dataAcesso) {
            this.dataAcesso = dataAcesso;
        }

        public String getConteudo() {
            return conteudo;
        }

        public void setConteudo(String conteudo) {
            this.conteudo = conteudo;
        }
}