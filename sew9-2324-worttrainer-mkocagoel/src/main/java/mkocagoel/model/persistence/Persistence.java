package mkocagoel.model.persistence;

import mkocagoel.model.Wordtrainer;

import java.io.IOException;

/**
 * Interface für die Persistenz
 */
public interface Persistence {
    void save(Wordtrainer wt) throws IOException;
    Wordtrainer load() throws IOException;

}

