


public class Main {
    public static void main() {
        String titleOfTheBook1 = "Название 1";
        var author1 = new Author("фамилия 1", "имя 1");
        String surnameAuthor1 = "Фамилия 1";
        String nameAuthor1 = "Имя 1";
        int yearOfPublication1 = 1866;

        String titleOfTheBook2 = "Название 2";
        var author2 = new Author("фамилия 2", "имя 2");
        String surnameAuthor2 = "Фамилия 2";
        String nameAuthor2 = "Имя 2";
        int yearOfPublication2 = 1825;

        var oneBook = new Book("Название 1",author1,1866);
        System.out.println("Название книги - " + oneBook.getTitleOfTheBook());
        System.out.println("Автор - " + oneBook.getAuthor());
        System.out.println("Год публикации - " + oneBook.getYearOfPublication());
        oneBook.setYearOfPublication(2018);
        System.out.println("Новый год публикации - " + oneBook.getYearOfPublication());

        Author bookOne = new Author("Фамилия 1", "Имя 1");
        System.out.println("Фамилия автора - " + bookOne.getSurnameAuthor());
        System.out.println("Имя автора - " + bookOne.getNameAuthor());

        Book twoBook = new Book("Название 2", author2, 1825);
        System.out.println("Название книги - " + twoBook.getTitleOfTheBook());
        System.out.println("Автор - " + twoBook.getAuthor());
        System.out.println("Новый год публикации - " + twoBook.getYearOfPublication());

        Author bookTwo = new Author("Фамилия 2", "Имя 2");
        System.out.println("Фамилия автора - " + bookTwo.getSurnameAuthor());
        System.out.println("Имя автора - " + bookTwo.getNameAuthor());
    }
}