package models;

/**
 * an instance of this class for source code changes
 * @author Giovanni Galante
 */
public class SourceCodeChange {

    public long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    private long identifier;
    private String commitHash;
    private double val;

    public SourceCodeChange(String commitHash, double val) {
        this.commitHash = commitHash;
        this.val = val;
    }



}
