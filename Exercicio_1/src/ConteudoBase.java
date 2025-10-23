public abstract class ConteudoBase implements Tocavel {
    protected String titulo;
    protected String criador;
    protected String uri;
    protected int seconds;

    public ConteudoBase(String titulo, String criador, String uri) {
        this.titulo = titulo;
        this.criador = criador;
        this.uri = uri;
    }

    @Override
    public void tocar() {
    }

    @Override
    public int duracaoSegundos() {
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return titulo + " - " + criador + " (" + uri + ")";
    }
}
