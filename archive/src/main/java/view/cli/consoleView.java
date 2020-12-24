package view.cli;

import dao.consoleDAOImpl.ConsoleDAOImpl;
import model.Archive;
import model.ArchiveFile;
import service.ArchiveController;

import java.util.Date;

public class consoleView {

    private static ArchiveController controller = new ArchiveController(new ConsoleDAOImpl());

    public static void main(String[] args) {
//        view();
//        update();
//        delete();
        add();
    }

    private static void view() {
        controller.getArchives().forEach(System.out::println);
    }

    //add files to archive (also for delete)
    private static void update() {
        System.out.println("До изменения:");
        System.out.println(controller.getArchiveById(1));

        controller.addFile(1, new ArchiveFile("kek", 10, new Date()));
        System.out.println("После измненения");
        System.out.println(controller.getArchiveById(1));

    }

    private static void delete() {
        System.out.println("До изменения:");
        System.out.println("Сейчас архивов: " + controller.getArchives().size());

        controller.deleteArchive(3);
        System.out.println("После удаления");
        System.out.println("Сейчас архивов: " + controller.getArchives().size());
    }

    private static void add() {
        System.out.println("До изменения:");
        System.out.println("Сейчас архивов: " + controller.getArchives().size());

        controller.addArchive(new Archive("new Archive", new Date()));
        System.out.println("После добавления нового архива:");
        System.out.println("Сейчас архивов: " + controller.getArchives().size());
    }
}
