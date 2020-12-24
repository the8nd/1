package model;

import java.util.Date;

public class ArchiveFile {
    private int id = -1;
    private String name;
    private final int size;
    private final Date creationDate;
//    private Date lastOpenedDate;

    public ArchiveFile(String name, int size, Date creationDate) {
        this.name = name;
        this.size = size;
        this.creationDate = creationDate;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int size() {
        return size;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "ArchiveFile{" +
            "name='" + name + '\'' +
            ", size=" + size +
            ", creationDate=" + creationDate +
            '}';
    }
}
