package HomeWork2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileSystemTest {

    // Позитивный тест для проверки функциональности FileSystem
    @Test
    public void testFileSystem() {
        // Здесь тестируется корректная функциональность класса FileSystem
        // Создаем объекты файловой системы
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");
        FileSystemComponent folder1 = new Folder("folder1");
        FileSystemComponent folder2 = new Folder("folder2");

        // Добавляем компоненты в папки
        ((Folder) folder1).addComponent(file1);
        ((Folder) folder1).addComponent(file2);
        ((Folder) folder2).addComponent(file3);

        // Добавляем вложенные папки
        ((Folder) folder1).addComponent(folder2);

        // Отображаем содержимое файловой системы
        file1.display();
        file2.display();
        file3.display();
        folder1.display();
    }

    // Негативный тест для проверки создания объекта с пустым именем
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "\t", "\n"})
    public void testEmptyName(String name) {
        // Ожидаем IllegalArgumentException при попытке создания файла или папки с пустым именем
        assertThrows(IllegalArgumentException.class, () -> new File(name));
        assertThrows(IllegalArgumentException.class, () -> new Folder(name));
    }

    // Негативный тест для проверки создания объекта с недопустимым именем
    @ParameterizedTest
    @ValueSource(strings = {"name with space", "name/with/slash"})
    public void testInvalidName(String name) {
        // Ожидаем IllegalArgumentException при попытке создания файла или папки с недопустимым именем
        //а почему такие имена считаются не валидными?
        assertThrows(IllegalArgumentException.class, () -> new File(name));
        assertThrows(IllegalArgumentException.class, () -> new Folder(name));
    }
}
