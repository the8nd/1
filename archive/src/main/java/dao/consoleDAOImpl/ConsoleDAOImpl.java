package dao.consoleDAOImpl;

import dao.DAO;
import model.Archive;
import model.ArchiveFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ConsoleDAOImpl implements DAO {
    private final List<Archive> archives;

    public ConsoleDAOImpl() {
        this.archives = new ArrayList<>();
        fillTestData();
    }

    @Override
    public List<Archive> getArchives() {
        return archives;
    }

    @Override
    public List<ArchiveFile> getFiles(Archive archive) {
        return archive.getFiles();
    }

    @Override
    public void insert(Archive archive) {
        archives.add(archive);
    }

    @Override
    public void update(Archive archive) {
        archives.removeIf(x -> x.id() == archive.id());
        archives.add(archive);
    }

    @Override
    public Archive getArchiveById(int archiveId) {
        return archives.stream()
            .filter(x -> x.id() == archiveId)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Invalid id"));
    }

    @Override
    public void deleteArchive(int archiveId) {
        archives.removeIf(x -> x.id() == archiveId);
    }

    private void fillTestData() {
        for (int i = 0; i < 10; i++) {
            var archive = new Archive(String.valueOf(i), new Date(1000000));
            archive.setId(i);
            for (int j = 0; j < 5; j++) {
                archive.getFiles().add(new ArchiveFile(String.valueOf(i + j), new Random().nextInt(10), new Date()));
            }
            archives.add(archive);
        }
    }
}
