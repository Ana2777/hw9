public class Launching {
    public static void work() {
        Book oneBook = new Book("Название 1", "Автор 1", 1866);
        Author book1 = new Author("Фамилия 1","Имя 1");
        oneBook.setYearOfPublication(2018);
        System.out.print(book1);
        System.out.print(oneBook);
    }
}
