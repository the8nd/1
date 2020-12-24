package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Archive {
    private int id = -1;
    private final List<ArchiveFile> files;
    private String name;
    private Date creationDate;

    public Archive(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
        this.files = new ArrayList<>();
    }

    public Archive(String name, Date creationDate, List<ArchiveFile> files) {
        this.name = name;
        this.creationDate = creationDate;
        this.files = files;
    }

    public List<ArchiveFile> getFiles() {
        return files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int id() {
        return id;
    }

    //only for CLI
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Archive{" +
            "id=" + id +
            ", files=" + files.toString() +
            ", name='" + name + '\'' +
            ", creationDate=" + creationDate +
            '}';
    }
}