public class book {
    String  title;
    String  author;
    double  price;

    book(String t, String a, double p) {
        title = t;	  // or: setTitle(title)
        author = a;
        price = p;
    }
    book () {
        //this("", "", 0 );
        price =0;
        title = "";
        author = "";
    }

    void printMe(){
        System.out.println(title + " by:" + author );
    }
    double priceWithVAT(double VAT, boolean isVatFree) {
        if (isVatFree)
            return price;
        return  (1+VAT) * price;
    }

    double priceWithVAT(double VAT) {
        return (1+VAT)*price;
        // or:  return priceWithVAT( VAT , true));
    }


}
