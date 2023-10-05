/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package recruitment.task.softwaremind;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class AppTest {
  private final InvoiceApp sut = new InvoiceApp();

  @Test
  void should_calculate_simple_invoices() {
    var input = new String[] {"1, 2, 3"};

    Set<Long> actual = sut.invoices(input);

    assertEquals(new TreeSet<>(List.of(1L, 2L, 3L)), actual);
  }

  @Test
  void should_calculate_invoices_with_ranges() {
    var input = new String[] {"1, 2, 5-7, 9"};

    Set<Long> actual = sut.invoices(input);

    assertEquals(new TreeSet<>(List.of(1L, 2L, 5L, 6L, 7L, 9L)), actual);
  }

  @Test
  void should_calculate_invoices_with_ranges_advance_case() {
    var input = new String[] {"1, 3-5, 4, 9"};

    Set<Long> actual = sut.invoices(input);

    assertEquals(new TreeSet<>(List.of(1L, 3L, 4L, 5L, 9L)), actual);
  }


}