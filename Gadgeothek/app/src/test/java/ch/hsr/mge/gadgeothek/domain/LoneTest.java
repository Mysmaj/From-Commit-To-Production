package ch.hsr.mge.gadgeothek.domain;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Mysmaj on 28.10.17.
 */

public class LoneTest {

    public Loan loan;

    @Test
    public void overDueDateShouldBeOneWeekLater() {
        loan = new Loan("someId", new Gadget("testGadget"), createDate(2017,10,21,0,0), null);

        Date actualOverDueDate = loan.overDueDate();

        org.junit.Assert.assertThat(actualOverDueDate, Is.is(createDate(2017,10,28,0,0)));
    }



    private Date createDate(int year, int month, int date, int hrs, int min) {
        Date d = new Date(year,month,date,hrs,min);

        return d;
    }
}