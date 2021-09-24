package Parsers;

import com.google.gson.stream.JsonReader;
import models.CodeShovelMessage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * this class provides methods for parsing JSON Objects
 * @author Giovanni Galante
 */
public class JSONParser {

    private Reader r;

    public JSONParser(Reader r) {
        this.r = r;
    }

    public List<String> getChangeHistoryShort() {

        return null;
    }

}
