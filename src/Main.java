public class Main {
public static void main(String[] args) {
        Author aleksanderPyshkin = new Author("Александр ", "Пушкин");
        Author mihailLermontov = new Author("Михаил ", "Лермонтов");
        Book ruslanILudmila = new Book("Руслан и Людмила", aleksanderPyshkin, 2010);
        Book mciri = new Book("Мцыри", mihailLermontov, 2005);
        ruslanILudmila.setEditionsYear(2022);
        mciri.setEditionsYear(2021);
        System.out.println(mciri);
        System.out.println(ruslanILudmila);
        }
        }