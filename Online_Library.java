import java.util.Scanner;

class library {

    String [] books;
    int counter;

    library() {
       this.books = new String[100];
       this.counter = 0;
    }
        public void addbook(String book){
            this.books[this.counter] = book;
            this.counter++;
            System.out.println("Adding a new Book : " + book);
        }
        void showavailablebooks(){
            System.out.println("available books are:- ");
            for(int i=0; i<this.counter; i++) {
                if (this.books[i] != null)
                   System.out.print("* "+this.books[i]+"\n");
                }
            }
        void issuebooks(String book) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of books you want to issue: ");
            String bk = sc.nextLine();
            for(int  i=0; i < this.books.length ; i++){
                if(this.books[i].equalsIgnoreCase(bk)){
                    System.out.println("Book Issued Successfully!");
                    this.books[i]=null;
                    return;
                    }
                }
            }
        void returnbook(String book) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Return the Book:-Enter The Title of the Book You Want to Return:\t");
            String bk = sc.nextLine();
            boolean found = true;
            for(int j=0;j<this.counter;j++ ) {
                if(this.books[j]!=null && this.books[j].equalsIgnoreCase(bk)) {
                    found = false;
                    this.books[j] = book;
                    break;
                }
            }
            
            if(!found)
                System.out.println("\nThe Entered Book is Not Found in Our Records.\nPlease Check and Try Again.");
            addbook(bk);
            
        }

    }


public class Online_library_51 {
    public static void main(String[] args) {
        library lib = new library();
        lib.addbook("Introduction to Java Programming");
        lib.addbook("The Alchemist");
        lib.addbook("Harry Potter and the Philosopher's Stone");
        lib.addbook("To Kill a Mockingbird");

        lib.showavailablebooks();

        lib.issuebooks("The Alchemist");
        lib.showavailablebooks();

        lib.returnbook("The Alchemist");
        lib.showavailablebooks();

    }   
}
//                  finish.
