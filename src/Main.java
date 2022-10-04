public class Main {


    public static void main(String[] args) {

        Books cleanCode = new Books("Clean code", 2013);
        System.out.println(cleanCode.getTitle());
        System.out.println(cleanCode.getPublisherAge());
        cleanCode.setPublisherAge(2014);
        System.out.println(cleanCode.getPublisherAge());

        System.out.println(cleanCode.getTitle()+" "+cleanCode.getPublisherAge());

        Authors MartinRobert = new Authors("Мартин", "Роберт");
      //  System.out.println(MartinRobert.getAuthorName());
     //   System.out.println(MartinRobert.getAuthorSurname());

        System.out.println(MartinRobert.getAuthorName()+ " " +MartinRobert.getAuthorSurname());

        Books learnJava = new Books("Learn Java", 2003);
        System.out.println(learnJava.getTitle());
        System.out.println(learnJava.getPublisherAge());
        learnJava.setPublisherAge(2004);
        System.out.println(learnJava.getPublisherAge());

        System.out.println(learnJava.getTitle()+" "+learnJava.getPublisherAge());

        Authors BertBeits = new Authors("Берт", "Бейтс");
      //  System.out.println(BertBeits.getAuthorName());
      //  System.out.println(BertBeits.getAuthorSurname());

        System.out.println(BertBeits.getAuthorName()+ " " +BertBeits.getAuthorSurname());


    }
}