import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-05-11");
		LocalDateTime d05 = LocalDateTime.parse("2024-05-11T05:00:00");
		Instant d06 = Instant.parse("2024-05-11T05:00:00Z");
		Instant d07 = Instant.parse("2024-05-11T05:00:00-03:00");
		
		LocalDate d08 = LocalDate.parse("11/05/1984", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("11/05/1984 05:00:00", fmt2);
		
		LocalDate d10 = LocalDate.of(1984, 5, 11);
		LocalDateTime d11 = LocalDateTime.of(1984, 5, 11, 05, 35, 45);
		
		Instant d12 = Instant.parse("1984-05-11T05:25:36Z");
		
		LocalDate localDate = LocalDate.parse("11/05/1984", fmt1);
		Instant d13 = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
		localDate = d13.atZone(ZoneId.systemDefault()).toLocalDate();
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		
		System.out.println("d08 = " + d08);
		System.out.println("d08 = " + d08.format(fmt1));
		System.out.println("d08 = " + fmt1.format(d08));
		
		System.out.println("d09 = " + d09);
		System.out.println("d09 = " + d09.format(fmt2));
		System.out.println("d09 = " + fmt2.format(d09));
		
		System.out.println("d10 = " + d10);
		System.out.println("d10 = " + d10.format(fmt1));
		System.out.println("d10 = " + fmt1.format(d10));
		
		System.out.println("d11 = " + d11);
		System.out.println("d11 = " + d11.format(fmt2));
		System.out.println("d11 = " + fmt2.format(d11));
		
		System.out.println("d12 = " + d12);
		
		System.out.println("d13 = " + d13);
		System.out.println("d13 = " + localDate.format(fmt1));
	}
}
