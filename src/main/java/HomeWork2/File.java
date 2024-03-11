package HomeWork2;

// Класс представляет файл в файловой системе
public class File extends FileSystemComponent {

    // Конструктор класса, принимает имя файла
    public File(String name) {
        super(name);
    }
    // Метод для отображения информации о файле
    @Override
    public void display() {
        System.out.println("File: " + name); // Выводим имя файла
    }
}
