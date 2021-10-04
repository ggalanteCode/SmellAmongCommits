package models;

import com.google.gson.JsonObject;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * an instance of this class contains the content of the CodeShovel's JSON output file
 * @author Giovanni Galante
 */
public class SourceCodeHistory {

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryPath() {
        return repositoryPath;
    }

    public void setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    public String getStartCommitName() {
        return startCommitName;
    }

    public void setStartCommitName(String startCommitName) {
        this.startCommitName = startCommitName;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getSourceFilePath() {
        return sourceFilePath;
    }

    public void setSourceFilePath(String sourceFilePath) {
        this.sourceFilePath = sourceFilePath;
    }

    public int getFunctionStartLine() {
        return functionStartLine;
    }

    public void setFunctionStartLine(int functionStartLine) {
        this.functionStartLine = functionStartLine;
    }

    public int getFunctionEndLine() {
        return functionEndLine;
    }

    public void setFunctionEndLine(int functionEndLine) {
        this.functionEndLine = functionEndLine;
    }

    public int getNumCommitsSeen() {
        return numCommitsSeen;
    }

    public void setNumCommitsSeen(int numCommitsSeen) {
        this.numCommitsSeen = numCommitsSeen;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public List<String> getChangeHistory() {
        return changeHistory;
    }

    public void setChangeHistory(List<String> changeHistory) {
        this.changeHistory = changeHistory;
    }

    private String origin, repositoryName;
    private String repositoryPath;
    private String startCommitName;
    private String sourceFileName;
    private String functionName;
    private String functionId;
    private String sourceFilePath;
    private int functionStartLine;
    private int functionEndLine;
    private int numCommitsSeen;
    private int timeTaken;
    private List<String> changeHistory;
    private LinkedHashMap<String, String> changeHistoryShort;
    private LinkedHashMap<String, SourceCodeChange> changeHistoryDetails;

    public LinkedHashMap<String, String> getChangeHistoryShort() {
        return changeHistoryShort;
    }

    public void setChangeHistoryShort(LinkedHashMap changeHistoryShort) {
        this.changeHistoryShort = changeHistoryShort;
    }

    public LinkedHashMap<String, SourceCodeChange> getChangeHistoryDetails() {
        return changeHistoryDetails;
    }

    public void setChangeHistoryDetails(LinkedHashMap changeHistoryDetails) {
        this.changeHistoryDetails = changeHistoryDetails;
    }

    public SourceCodeHistory() {

    }

    @Override
    public String toString() {
        return "SourceCodeHistory{" +
                "origin='" + origin + '\'' +
                ", repositoryName='" + repositoryName + '\'' +
                ", repositoryPath='" + repositoryPath + '\'' +
                ", startCommitName='" + startCommitName + '\'' +
                ", sourceFileName='" + sourceFileName + '\'' +
                ", functionName='" + functionName + '\'' +
                ", functionId='" + functionId + '\'' +
                ", sourceFilePath='" + sourceFilePath + '\'' +
                ", functionStartLine=" + functionStartLine +
                ", functionEndLine=" + functionEndLine +
                ", numCommitsSeen=" + numCommitsSeen +
                ", timeTaken=" + timeTaken +
                ", changeHistory=" + changeHistory +
                ", changeHistoryShort=" + changeHistoryShort +
                ", changeHistoryDetails=" + changeHistoryDetails +
                '}';
    }
}
