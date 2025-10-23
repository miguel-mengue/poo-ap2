public class FilmeCurto extends ConteudoBase {
    public FilmeCurto(String titulo, String criador, String uri) {
        super(titulo, criador, uri);
    }

    @Override
    public void tocar() {
        System.out.println("[Filme] streaming em 1080p…");
    }

    @Override
    public int duracaoSegundos() {
        return 3600;
        // 1 hora = 3600 segundos.
    }



}
