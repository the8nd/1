package dao;

import model.Archive;
import model.ArchiveFile;

import java.util.List;

public interface DAO {

    List<Archive> getArchives();

    List<ArchiveFile> getFiles(Archive archive);

    void insert(Archive archive);

    void update(Archive archive);

    Archive getArchiveById(int archiveId);

    void deleteArchive(int archiveId);
}
