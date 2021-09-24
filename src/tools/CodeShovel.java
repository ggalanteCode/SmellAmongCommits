package tools;

import models.Project;

import java.io.File;

/**
 * class for method-level source code histories tool (CodeShovel)
 * @author Giovanni Galante
 */
public class CodeShovel implements Tool {

    private static final String RUNWIN = "src/tools/toolsfolder/codeshovel";
    private static final String RUNLIN = "src/tools/toolsfolder/codeshovel";
    private final String toolName = "codeshovel-1.1.jar";
    private int exitcode;

    public String getDefaultParam() {
        return defaultParam;
    }

    private String defaultParam;

    public void setDefaultParam(String defaultParam) {
        this.defaultParam = defaultParam;
    }

    public String getToolPath() {
        return toolPath;
    }

    private final String toolPath;

    public String getProjectPath() {
        return projectPath;
    }

    private final String projectPath;


    public CodeShovel(Project project) {
        this.projectPath = project.getPath();
        this.toolPath = new File(RUNWIN).getAbsolutePath();
        this.defaultParam = toolPath + " && java -jar " + toolName + " " + projectPath;
    }


    /**
     * run for windows
     */
    @Override
    public void runWin() {
        System.out.println("CodeShovel started");
        String[] param = {"cmd.exe", "/c", "cd " + defaultParam};
        this.exitcode = Tool.run("java", param);
    }

    @Override
    public void runLin() {

    }

    @Override
    public int getExitCode() {
        return exitcode;
    }
}
