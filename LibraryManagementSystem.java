import java.util.ArrayList;
import java.util.Scanner;

class book{
    int id;
    String title;
    boolean issued;

    book(int id,String title) {
        this.id=id;
        this.title=title;
        this.issued=false;
        }    
    void display()
    {
        System.out.println("ID:"+id+"|title:"+title+"|status:"+(issued?"issued":"available"));
        
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<book> books=new ArrayList<>();
    
        while(true) {
            System.out.println("\n ==========library management system=====");
            System.out.println("1.add book");
            System.out.println("2.view books");
            System.out.println("3.issue books");
            System.out.println("4.return book");
            System.out.println("5.exit");
            System.out.println("enter choices:");
        
            int choices=sc.nextInt();

            switch(choices) {
                case 1:
                System.out.println("enter book ID:");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.println("enter book title");
                String title=sc.nextLine();

                books.add(new book(id,title));
                System.out.println("book added succesfully");
                break;

                case 2:
                    if(books.isEmpty()) {
                        System.out.println("no books available");
                    }
                    else
                    {
                        for(book b:books) {
                            b.display();
                        }
                    }
                    break;
                        case 3:
                            System.out.println("enter book ID to isse:" );
                            int issueId=sc.nextInt();

                            boolean foundIssue=false;
                            for(book b:books) {
                                if(b.id==issueId) {
                                    foundIssue=true;
                                    if(!b.issued) {
                                        b.issued=true;
                                        System.out.println("book issued succesfully");
                                        }
                                        else 
                                        {
                                            System.out.println("book already issued.");
                                        }
                                }
                            }
                            if(!foundIssue) {
                                System.out.println("book not found.");
                                break;}
                                
                       case 4:
                                System.out.println("enter book ID to return:");
                                int returnId=sc.nextInt();

                                boolean foundReturn=false;
                                for(book b:books) {
                                    if(b.id==returnId) {
                                        foundReturn=true;
                                        if(b.issued) {
                                            b.issued=false;
                                            System.out.println("book returned succesfully");
                                        }
                                        else
                                        {
                                            System.out.println("book was not issued.");
                                        }
                                    }

                                }                          
                                if(!foundReturn) {
                                    System.out.println("book not found.");
                                }
                                    break;

                            case 5:
                                System.out.println("Thank you");
                                sc.close();

                                System.exit(0);

                                default:
                                    System.out.println("invalid choice");
                                }
                            }
                        }

                        }
        
                    