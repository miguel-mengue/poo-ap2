import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        // Coleção
        ArrayList<Tocavel> carrossel = new ArrayList<>();

        // Objetos
        carrossel.add(new FilmeCurto("Vingadores", "DC", "disney.com.br"));
        carrossel.add(new EpisodioPodcast("Flow", "Monark", "youtube.com.br"));
        carrossel.add(new NoticiaNarrada("Globo", "Boninho", "globo.com.br"));

        // Ordenar pelo tempo
        carrossel.sort(Comparator.comparingInt(Tocavel::duracaoSegundos));

        // Executar ArrayList
        for (Tocavel streaming : carrossel) {
            System.out.println(streaming.toString());
            System.out.println("Duração: " + streaming.duracaoSegundos() + " segundos");
            streaming.tocar();
        }

    }
}