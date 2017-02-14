package chapter10;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateNTimeAPI {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.plusYears(14));
		System.out.println(ldt.plusMonths(2));
		System.out.println(ldt.plusDays(10));
		System.out.println(ldt.plusYears(14).plusMonths(2).plusDays(10));
		
		System.out.println("***********************");
		
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.parse("12:00"));
		System.out.println(LocalTime.of(12, 0));
		System.out.println(LocalTime.of(12, 0, 1));
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.of(12, 0, 0, 1));
		System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));
		System.out.println(LocalTime.parse("12:00", DateTimeFormatter.ISO_TIME));
		
		System.out.println("**************************");
		
		
		System.out.println(LocalDate.parse("2015-01-01"));
		System.out.println(LocalDate.of(2015, 1,1));
		System.out.println(LocalDate.of(2015, Month.JANUARY, 1));
		System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));
		System.out.println(LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_DATE));
		
		Calendar calendar = Calendar.getInstance();
		Instant instance = calendar.toInstant();
		Date date = Date.from(instance);
		System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
		
		System.out.println("******************");
		System.out.println(Period.ofYears(1));
		
		System.out.println(Period.parse("P1Y13M"));
		System.out.println(Period.parse("P1Y13M").normalized());
		
		System.out.println(Duration.parse("P2DT2H5M"));
		
		System.out.println("Self Test");
		
		Period p = Period.parse("P1Y");
		System.out.println("1: " + p.getMonths());
		
	    System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
	    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
	    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
	    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	    //System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));//Exception
	    
	    LocalDate ld = LocalDate.of(1940, Month.JANUARY, 3);
	    System.out.println(ld);
	    System.out.println(ld.minusYears(3));
	    System.out.println(ld.plusMonths(10));
	    System.out.println(ld.plusDays(15));
	    System.out.println(ld.minusYears(3).plusMonths(10).plusDays(15));
	    ld = ld.minusYears(3).plusMonths(10).plusDays(15);
	    System.out.println(ld.minusYears(10));
	    System.out.println(ld.getMonth() + " " + ld.getYear());
	    
	    
	    
		
	    
	}
	
	

}
