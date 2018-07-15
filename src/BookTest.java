public class BookTest {
    public static void main(String[] args){
        Library l = new Library(1000,"Zvika");
        book b1 = new book("It","King",80);
        book b2 = new book("1984","Orwel",60);
        book b3 = new book("Harry Potter","Rolling", 90);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);

        int i = l.bookCount;
        System.out.println(i);
        //TODO
    }
}
