package productv5;

import productv5.Book;
import productv5.Software;

public class ProductDB {

      public static Product getProduct(String productCode) {
          // In a more realistic application, this code would get the data for the product from a file or database
          // For now, this code just uses if/else statements to return the correct product data

          //We need all the book and software objects, but what kind of object do we return?
          //}

          Product myprduct = null;
          if (productCode.equalsIgnoreCase("studios")) {
              Software mySoftware = new Software();
              mySoftware.setCode(productCode);
              mySoftware.setDescription("Visual Studios");
              mySoftware.setPrice(57.50);
              mySoftware.setVersion("Microsoft 1.1");
              myprduct = mySoftware;
          } else if (productCode.equalsIgnoreCase("eclipse")) {
              Software mySoftware = new Software();
              mySoftware.setCode(productCode);
              mySoftware.setDescription("Build Java apps");
              mySoftware.setPrice(57.50);
              mySoftware.setVersion("Eclipse Neon");
              myprduct = mySoftware;
          } else if (productCode.equalsIgnoreCase("oracle")) {
              Software mySoftware = new Software();
              mySoftware.setCode(productCode);
              mySoftware.setDescription("Latest MySQL");
              mySoftware.setPrice(54.50);
              mySoftware.setVersion("Oracle 3.0");
              myprduct = mySoftware;
          }


          if (productCode.equalsIgnoreCase("java")) {
              Book myBook = new Book();
              myBook.setCode(productCode);
              myBook.setDescription("ATU Java Programming");
              myBook.setPrice(57.50);
              myBook.setAuthor("Joe Brown");
              myprduct = myBook;
          } else if (productCode.equalsIgnoreCase("jsp")) {
              Book myBook = new Book();
              myBook.setCode(productCode);
              myBook.setDescription("Java Servlets and JSP");
              myBook.setPrice(57.50);
              myBook.setAuthor("Mike White");
              myprduct = myBook;
          } else if (productCode.equalsIgnoreCase("mysql")) {
              Book myBook = new Book();
              myBook.setCode(productCode);
              myBook.setDescription("Lennon's MySQL");
              myBook.setPrice(54.50);
              myBook.setAuthor("Jim Lennon");
              myprduct = myBook;
          }

          //music

          if (productCode.equalsIgnoreCase("sound")) {
              music mymusic = new music();
              mymusic.setCode(productCode);
              mymusic.setDescription("live music ");
              mymusic.setPrice(90.50);
              mymusic.setArtist("coldplay ");
              mymusic.setLabel("Excellent");
              myprduct = mymusic;
          } else if (productCode.equalsIgnoreCase("LIVE")) {
              music mymusic = new music();
              mymusic.setCode(productCode);
              mymusic.setDescription("MUSICC ");
              mymusic.setPrice(200.50);
              mymusic.setArtist("Drake ");
              mymusic.setLabel("good");
              myprduct = mymusic;

          }

          if (productCode.equalsIgnoreCase("TV")) {
              TV myTV = new TV();
              myTV.setCode(productCode);
              myTV.setDescription("Good TV ");
              myTV.setPrice(400.50);
              myTV.setScreenSize("80 inch ");
              myTV.setManufacture("Sony");
              myprduct = myTV;
          } else if (productCode.equalsIgnoreCase("TV2")) {
              TV myTV = new TV();
              myTV.setCode(productCode);
              myTV.setDescription("Smart TV ");
              myTV.setPrice(800.50);
              myTV.setScreenSize("100 inch ");
              myTV.setManufacture("Samsung");
              myprduct = myTV;

          }

          return myprduct;
      }
}




