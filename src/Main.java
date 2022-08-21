import java.util.Locale;
public class Main {

    public static void main(String[] args) {

        Author levTolstoy = new Author("Лев", "Толстой");
        Author viktorPelevin = new Author("Виктор", "Пелевин");
        Book warAndPeace = new Book("Война и мир", 1965, levTolstoy);
        Book generationP = new Book("Дженерейшн Пи", 1999, viktorPelevin);

        warAndPeace.setPublishDate(1867);

        System.out.println (warAndPeace.getTitle() + " " + warAndPeace.getPublishDate() + " " + warAndPeace.getAuthor());
        System.out.println (generationP.getTitle() + " " + generationP.getPublishDate() + " " + generationP.getAuthor());


    }



}