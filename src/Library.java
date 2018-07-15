public class Library {
    double 	  totalAssets;
    Librarian  librarianOnDuty;
    book[] books;
    int bookCount;
    Library(){
        books=new book[1000];   // maximum capacity
        bookCount = 0;
    }
    Library(int nums, String libr){
        books = new book[nums];
        bookCount = 0;
        librarianOnDuty = new Librarian(libr);
    }
    void addBook(book b){
        books[bookCount++]= b;  // crashes if array is full
    }
    book findBook(String bookTitle){
		book b=new book();
		//TODO
		return b;
    }
    void showLib(){
        System.out.println(librarianOnDuty.name);
        System.out.println(bookCount);
        for (int i=0;i<bookCount;i++){
            //TODO
        }
    }
}
