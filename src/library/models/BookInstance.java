package library.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sergey on 05.04.17.
 */
public class BookInstance implements Serializable {
    private Book book;
    private UUID number;
    private static long serialVersionUID = 2L;

    private List<Booking> bookingHistory;

    public Book getBook() {
        return book;
    }

    public BookInstance(Book book, UUID number) {
        this.book = book;
        this.number = number;

        bookingHistory = new ArrayList<>(32);
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof BookInstance))
            return false;

        if (!(this.number.equals(((BookInstance) obj).number)))
            return false;

        return true;
    }

    public UUID getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BookInstance{" +
                "book=" + book +
                ", number=" + number +
                ", bookingHistory=" + bookingHistory +
                '}';
    }

    public List<Booking> getBookingHistory() {
        return bookingHistory;
    }
}
