package library.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sergey on 05.04.17.
 */
public class Booking implements Serializable {
    private BookInstance bookInstance;
    private Reader reader;
    private Date startDate;
    private Date finishDate;
    private Date returnDate;
    private static long serialVersionUID = 2L;

    public Booking(BookInstance bookInstance, Reader reader, Date startDate, Date finishDate) {
        this.bookInstance = bookInstance;
        this.reader = reader;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Override
    public int hashCode() {
        return bookInstance.hashCode() + reader.hashCode() + startDate.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if(!(obj instanceof Booking))
            return false;

        if (!(bookInstance.equals(((Booking) obj).bookInstance)
                && reader.equals(((Booking) obj).reader)
                && startDate.equals(((Booking) obj).startDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookInstance=" + bookInstance +
                ", reader=" + reader +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", returnDate=" + returnDate +
                '}';
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public BookInstance getBookInstance() {
        return bookInstance;
    }

    public Reader getReader() {
        return reader;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }
}
