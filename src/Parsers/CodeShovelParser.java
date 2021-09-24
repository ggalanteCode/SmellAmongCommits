package Parsers;

import java.io.BufferedReader;

/**
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

    public CodeShovelParser(String commitId, String URLProject) {
        this.commitId = commitId;
        this.urlProject = URLProject;
    }

    /**
     * reads the output file using a buffered reader
     * @param bufferedReader the buffered reader
     */
    public void execute(BufferedReader bufferedReader) {
        //try {

        //}
    }

}
