package mkocagoel.model.persistence;

import com.google.gson.Gson;
import mkocagoel.model.Wordtrainer;

import java.io.*;

public class JsonPersistence implements Persistence {

    private static final String filename = "worttrainer.json";

    /**
     * Speichert den Wordtrainer in der Datei
     * @param wt
     * @throws IOException
     */
    @Override
    public void save(Wordtrainer wt) throws IOException {
        try {
            Gson gson = new Gson();
            String jsonData = gson.toJson(wt);
            PrintWriter jsonOut = new PrintWriter(new FileWriter(filename));
            jsonOut.print(jsonData);
            jsonOut.close();
        }
        catch(Exception e) {
            System.out.println("Datei konnte nicht gespeichert werden!");
        }
    }


    /**
     * Lädt den Wordtrainer aus der Datei
     * @return
     * @throws IOException
     */
    @Override
    public Wordtrainer load() throws IOException {
        try {
            Gson gson = new Gson();
            BufferedReader jsonIn = new BufferedReader(new FileReader(filename));
            String jsonData = jsonIn.readLine();
            jsonIn.close();

            Wordtrainer wtFromJson = gson.fromJson(jsonData, Wordtrainer.class);
            return wtFromJson;
        } catch (Exception e) {
            System.out.println("Datei konnte nicht gelesen werden");
        }
        return null;
    }
}