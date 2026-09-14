import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wardrobe {

    public static final List<String> LAYER_ORDER =
            List.of("dodatki", "dol", "buty", "gora", "okrycie");

    private static final String WARDROBE_DIR = "assets/wardrobe";

    private final Map<String, List<String>> items = new HashMap<>();

    public Wardrobe() {
        reload();
    }

    private void reload() {
        for (String cat : LAYER_ORDER) {
            List<String> lista = new ArrayList<>();
            lista.add(null);

            File folder = new File(WARDROBE_DIR, cat);
            File[] pliki = folder.listFiles(
                    (dir, name) -> name.toLowerCase().endsWith(".png"));

            if (pliki != null) {
                Arrays.sort(pliki);
                for (File plik : pliki) {
                    lista.add(plik.getPath());
                }
            }

            items.put(cat, lista);
        }
    }

    public List<String> getItems(String category) {
        List<String> lista = items.get(category);
        if (lista == null) {
            List<String> puste = new ArrayList<>();
            puste.add(null);
            return puste;
        }
        return lista;
    }

    public int count(String category) {
        return Math.max(0, getItems(category).size() - 1);
    }
}
