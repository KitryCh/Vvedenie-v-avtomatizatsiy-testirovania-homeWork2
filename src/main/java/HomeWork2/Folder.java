package HomeWork2;

import java.util.ArrayList;
import java.util.List;

// Класс, представляющий папку в файловой системе

public class Folder extends FileSystemComponent {
    private List<FileSystemComponent> children;

    // Конструктор класса, принимает имя папки
    public Folder(String name) {
        super(name);
        children = new ArrayList<>();
    }

    // Метод для добавления дочернего компонента в папку
    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    // Метод для удаления дочернего компонента из папки
    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    // Метод для отображения информации о папке и ее дочерних компонентах
    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : children) {
            component.display();
        }
    }
}
