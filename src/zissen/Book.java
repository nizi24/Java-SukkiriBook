package zissen;
import java.util.*;

public class Book implements Comparable {
  private String title;
  private Date publishDate;
  private String comment;
  
  public boolean equals(Object o) {
    if (o == this) { return true; }
    if (o == null) { return false; }
    if (!(o instanceof Book)) { return false; }
    Book b = (Book) o;
    if (!(title.equals(b.title) && publishDate.equals(b.publishDate))) {
      return false; 
    }
    return true;
  }
  public int hashCode() {
    int result = 37;
    result = result * 31 + this.title.hashCode();
    result = result * 31 + this.publishDate.hashCode();
    return result;
  }
  public int compareTo(Object o) {
    Book b = (Book) o;
    return publishDate.compareTo(b.publishDate);
  }
  public Book clone() {
    Book b = new Book();
    b.title = this.title;
    b.publishDate = this.publishDate;
    b.comment = this.comment;
    return b;
  }
}