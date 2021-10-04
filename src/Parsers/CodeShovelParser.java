package Parsers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import models.SourceCodeHistory;

import java.util.Set;

/**
 *
 * this class parses the results in the output file produced by the tool for method-level source code histories
 * (CodeShovel) and writes the parsed results on the 'sbac' database
 * @author Giovanni Galante
 */
public class CodeShovelParser {

    public String getAnalyzableFile() {
        return analyzableFile;
    }

    private String analyzableFile = "results.json";
    private String urlProject;
    private String commitId;

    public JSONReader getJsonReader() {
        return jsonReader;
    }

    public void setJsonReader(JSONReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    private JSONReader jsonReader;

    public CodeShovelParser(String urlProject, String commitId, JSONReader jsonReader) {
        setJsonReader(jsonReader);
        this.urlProject = urlProject;
        this.commitId = commitId;
    }

    /**
     * reads the output file
     */
    public void execute() {
        JsonObject object = jsonReader.readFromJSON(this.getAnalyzableFile());
        Set<String> keySet = object.keySet();
        SourceCodeHistory history = new SourceCodeHistory();
        for (String s: keySet) {
            switch (s) {
                case "origin":
                    history.setOrigin(object.get(s).getAsString());
                    break;
                case "repositoryName":
                    history.setRepositoryName(object.get(s).getAsString());
                    break;
                case "repositoryPath":
                    history.setRepositoryPath(object.get(s).getAsString());
                    break;
                case "":
                default:

            }
        }
    }

    /**
     * analyze and write the output file's results in the database
     */
    public void analyzeWrite() {
        jsonReader.writeInDB();

    }
}
