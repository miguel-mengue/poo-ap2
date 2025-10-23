public class NoticiaNarrada extends ConteudoBase {
    public NoticiaNarrada(String titulo, String criador, String uri) {
        super(titulo, criador, uri);
    }

    @Override
    public void tocar() {
        System.out.println("[Narrado] TTS carregado, iniciando locução…");
    }

    @Override
    public int duracaoSegundos() {
        return 1800;
        // 30 minutos = 1800 segundos.
    }
}
