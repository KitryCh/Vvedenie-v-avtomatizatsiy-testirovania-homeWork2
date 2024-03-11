package HomeWork2;

// Абстрактный класс, представляющий компонент файловой системы
public abstract class FileSystemComponent {
    protected String name;

    // Конструктор класса, принимает имя компонента
    public FileSystemComponent(String name) {
        this.name = name;
    }
    // Абстрактный метод для отображения информации о компоненте
    public abstract void display();
}
