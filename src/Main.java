public class Main {


    public static void main(String[] args) {

        Authors MartinRobert = new Authors("Мартин", "Роберт");
        System.out.println(MartinRobert.getAuthorName());
        System.out.println(MartinRobert.getAuthorSurname());

       // Authors authors = new Authors("name", "surname");
        Authors authorName = new Authors("name", "surname");
        Authors authorSurname = new Authors("name", "surname");
        Books cleanCode = new Books("Clean code", 2013, authorName, authorSurname);
        System.out.println(cleanCode.getTitle());
        System.out.println(cleanCode.getPublisherAge());
        cleanCode.setPublisherAge(2014);
        System.out.println(cleanCode.getPublisherAge());

        System.out.println(cleanCode.getTitle()+" "+cleanCode.getPublisherAge()+" "+MartinRobert.getAuthorName()+" "+MartinRobert.getAuthorSurname());

        Authors BertBeits = new Authors("Берт", "Бейтс");
        System.out.println(BertBeits.getAuthorName());
        System.out.println(BertBeits.getAuthorSurname());

        Books learnJava = new Books("Learn Java", 2003, authorName, authorSurname);
        System.out.println(learnJava.getTitle());
        System.out.println(learnJava.getPublisherAge());
        learnJava.setPublisherAge(2004);
        System.out.println(learnJava.getPublisherAge());

        System.out.println(learnJava.getTitle()+" "+learnJava.getPublisherAge()+" "+BertBeits.getAuthorName()+" "+BertBeits.getAuthorSurname());

    }
}