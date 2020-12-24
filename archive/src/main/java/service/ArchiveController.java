package service;

import dao.DAO;
import model.Archive;
import model.ArchiveFile;

import java.util.ArrayList;
import java.util.List;

public class ArchiveController {
    private final DAO dao;

    public ArchiveController(DAO dao) {
        this.dao = dao;
    }

    public ArrayList<Archive> getArchives() {
        return (ArrayList<Archive>) dao.getArchives();
    }

    public void addFile(int archiveId, ArchiveFile file) {
        var archive = dao.getArchiveById(archiveId);
        archive.getFiles().add(file);
        dao.update(archive);
    }

    public void deleteFile(int archiveId, ArchiveFile file) {
        var archive = dao.getArchiveById(archiveId);
        archive.getFiles().remove(file);
        dao.update(archive);
    }

    public ArrayList<ArchiveFile> getAllFiles(int archiveId) {
        return (ArrayList<ArchiveFile>) dao.getArchiveById(archiveId).getFiles();
    }

    public Archive getArchiveById(int archiveId) {
        return dao.getArchiveById(archiveId);
    }

    public void addArchive(Archive archive) {
        dao.insert(archive);
    }

    public void update(Archive archive) {
        dao.update(archive);
    }

    public void deleteArchive(int archiveId) {
        dao.deleteArchive(archiveId);
    }

    public void addFiles(int archiveId, List<ArchiveFile> files) {
        var archive = dao.getArchiveById(archiveId);
        archive.getFiles().addAll(files);
        dao.update(archive);
    }

    public void deleteFiles(int archiveId, List<ArchiveFile> files) {
        var archive = dao.getArchiveById(archiveId);
        archive.getFiles().removeAll(files);
        dao.update(archive);
    }
}
