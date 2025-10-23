public class EpisodioPodcast extends ConteudoBase {
    public EpisodioPodcast(String titulo, String criador, String uri) {
        super(titulo, criador, uri);

    }

    @Override
    public void tocar() {
        System.out.println("[Podcast] preparando buffer de áudio…");
    }

    @Override
    public int duracaoSegundos() {
        return 7200;
        // 2 horas = 7200 segundos.
    }
}
