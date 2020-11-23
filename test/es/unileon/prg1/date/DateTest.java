paquete  es.unileon.prg1.date ;

importar  org.junit.Assert est�tico . * ;

import  org.junit.Before ;
import  org.junit.Test ;

 clase  p�blica DateTest {

	Fecha de hoy;

	@Antes de
	public  void  setUp () lanza  Exception {
		hoy =  nueva  fecha ( 1 , 1 , 2017 );
	}

	@Prueba
	public  void  testDate () lanza  DateException {
		hoy =  nueva  fecha ();
		asertEquals ( 1 , hoy . getDay ());
		asertEquals ( 1 , hoy . getMonth ());
		asertEquals ( 2017 , hoy . getYear ());
	}

	@Prueba
	public  void  testDateIntIntInt () lanza  DateException {
		asertEquals ( 1 , hoy . getDay ());
		asertEquals ( 1 , hoy . getMonth ());
		asertEquals ( 2017 , hoy . getYear ());
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testDateNegativeDay () lanza  DateException {
		nueva  fecha ( - 1 , 1 , 2017 );
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testDateNegativeMonth () lanza  DateException {
		nueva  fecha ( 1 , - 1 , 2017 );
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testDateMonthOutOfRange () lanza  DateException {
		nueva  fecha ( 1 , 13 , 2017 );
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testDateWrongDayMonth () lanza  DateException {
		nueva  fecha ( 31 , 2 , 2017 );
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testDateNegativeYear () lanza  DateException {
		nueva  fecha ( 1 , 1 , - 1 );
	}

	@Prueba
	public  void  testDateDate () {
		Date aDay;
		aDay =  nueva  fecha (hoy);
		asertEquals ( 1 , aDay . getDay ());
		asertEquals ( 1 , aD�a . getMonth ());
		asertEquals ( 2017 , aD�a . getYear ());
	}

	@Prueba
	public  void  testSetGetDay () lanza  DateException {
		asertEquals ( 1 , hoy . getDay ());
		hoy . setDay ( 2 );
		asertEquals ( 2 , hoy . getDay ());
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testSetDayNegativeDay () lanza  DateException {
		hoy . setDay ( 0 );
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testSetDayWrongDayMonth () lanza  DateException {
		hoy . setMonth ( 4 );
		hoy . setDay ( 31 );
	}

	@Prueba
	public  void  testSetGetMonth () lanza  DateException {
		asertEquals ( 1 , hoy . getMonth ());
		hoy . setMonth ( 2 );
		asertEquals ( 2 , hoy . getMonth ());
	}

	@Test (esperado =  DateException . Clase)
	public  void  testSetMonthWrongDay () lanza  DateException {
		hoy . setDay ( 31 );
		hoy . setMonth ( 2 );
	}
	
	@Test ( esperado  =  DateException . Clase)
	public  void  testSetMonthNegative () lanza  DateException {
		hoy . setMonth ( - 1 );
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testSetMonthOutOfRange () lanza  DateException {
		hoy . setMonth ( 13 );
	}

	@Prueba
	public  void  testSetGetYear () lanza  DateException {
		asertEquals ( 2017 , hoy . getYear ());
		hoy . setYear ( 2013 );
		asertEquals ( 2013 , hoy . getYear ());
	}

	@Test ( esperado  =  DateException . Clase)
	public  void  testSetYearNegative () lanza  DateException {
		hoy . setYear ( - 1 );
	}

	@Prueba
	public  void  testTomorrow () {
		asertEquals ( 1 , hoy . getDay ());
		asertEquals ( 1 , hoy . getMonth ());
		asertEquals ( 2017 , hoy . getYear ());
		Fecha ma�ana = hoy . ma�ana();
		asertEquals ( 2 , ma�ana . getDay ());
		asertEquals ( 1 , ma�ana . getMonth ());
		asertEquals ( 2017 , ma�ana . getYear ());
	}

	@Prueba
	public  void  testTomorrowLastDayOfMonth () lanza  DateException {
		Date aDay =  new  Date ( 28 , 2 , 2017 );
		asertEquals ( 28 , aDay . getDay ());
		asertEquals ( 2 , aD�a . getMonth ());
		asertEquals ( 2017 , aD�a . getYear ());
		Fecha ma�ana = un d�a . ma�ana();
		asertEquals ( 1 , ma�ana . getDay ());
		asertEquals ( 3 , ma�ana . getMonth ());
		asertEquals ( 2017 , ma�ana . getYear ());
	}

	@Prueba
	public  void  testTomorrowLastDayOfYear () lanza  DateException {
		Date aDay =  nueva  fecha ( 31 , 12 , 2017 );
		asertEquals ( 31 , aDay . getDay ());
		asertEquals ( 12 , aD�a . getMonth ());
		asertEquals ( 2017 , aD�a . getYear ());
		Fecha ma�ana = un d�a . ma�ana();
		asertEquals ( 1 , ma�ana . getDay ());
		asertEquals ( 1 , ma�ana . getMonth ());
		asertEquals ( 2018 , ma�ana . getYear ());
	}

	@Prueba
	public  void  testIsSameDayTrue () lanza  DateException {
		Date aDay =  nueva  fecha ( 1 , 4 , 2017 );
		asertEquals ( verdadero , hoy . isSameDay (aDay));
	}

	@Prueba
	public  void  testIsSameDayFalse () lanza  DateException {
		Fecha aDay =  nueva  fecha ( 7 , 4 , 2017 );
		asertEquals ( falso , hoy . isSameDay (aDay));
	}

	@Prueba
	public  void  testIsSameMonthTrue () lanza  DateException {
		Date aDay =  new  Date ( 8 , 1 , 2017 );
		asertEquals ( verdadero , hoy . es el mismo mes (un d�a));
	}

	@Prueba
	public  void  testIsSameMonthFalse () lanza  DateException {
		Fecha aDay =  nueva  fecha ( 8 , 9 , 2017 );
		asertEquals ( falso , hoy . es el mismo mes (un d�a));
	}

	@Prueba
	public  void  testIsSameYearTrue () lanza  DateException {
		Fecha aDay =  nueva  fecha ( 8 , 9 , 2017 );
		asertEquals ( verdadero , hoy . es el mismo a�o (un d�a));
	}

	@Prueba
	public  void  testIsSameYearFalse () lanza  DateException {
		Date aDay =  nueva  fecha ( 8 , 9 , 2010 );
		asertEquals ( falso , hoy . isSameYear (aDay));
	}

	@Prueba
	public  void  testIsSame () lanza  DateException {
		Date aDay =  nueva  fecha ( 1 , 1 , 2017 );
		asertEquals ( verdadero , hoy . es el mismo (un d�a));
	}

	@Prueba
	public  void  testIsSameNotDay () lanza  DateException {
		Fecha aDay =  nueva  fecha ( 10 , 1 , 2017 );
		asertEquals ( falso , hoy . es el mismo (un d�a));
	}

	@Prueba
	public  void  testIsSameNotMonth () lanza  DateException {
		Date aDay =  nueva  fecha ( 1 , 10 , 2017 );
		asertEquals ( falso , hoy . es el mismo (un d�a));
	}

	@Prueba
	public  void  testIsSameNotYear () lanza  DateException {
		Date aDay =  nueva  fecha ( 1 , 1 , 2010 );
		asertEquals ( falso , hoy . es el mismo (un d�a));
	}

	@Prueba
	public  void  testIsSameNotDayNotMonthNotYear () lanza  DateException {
		Date aDay =  nueva  fecha ( 3 , 3 , 2013 );
		asertEquals ( falso , hoy . es el mismo (un d�a));
	}

	@Prueba
	public  void  testGetMonthName () lanza  DateException {
		asertEquals ( " enero " , hoy . getMonthName ());
		hoy . setMonth ( 2 );
		asertEquals ( " febrero " , hoy . getMonthName ());
		hoy . setMonth ( 3 );
		asertEquals ( " marzo " , hoy . getMonthName ());
		hoy . setMonth ( 4 );
		assertEquals ( " Abril " , hoy . getMonthName ());
		hoy . setMonth ( 5 );
		asertEquals ( " Mayo " , hoy . getMonthName ());
		hoy . setMonth ( 6 );
		asertEquals ( " junio " , hoy . getMonthName ());
		hoy . setMonth ( 7 );
		asertEquals ( " julio " , hoy . getMonthName ());
		hoy . setMonth ( 8 );
		asertEquals ( " agosto " , hoy . getMonthName ());
		hoy . setMonth ( 9 );
		asertEquals ( " septiembre " , hoy . getMonthName ());
		hoy . setMonth ( 10 );
		asertEquals ( " Octubre " , hoy . getMonthName ());
		hoy . setMonth ( 11 );
		asertEquals ( " noviembre " , hoy . getMonthName ());
		hoy . setMonth ( 12 );
		asertEquals ( " diciembre " , hoy . getMonthName ());
	}

	@Prueba
	public  void  testDaysOfMonth () lanza  DateException {
		asertEquals ( 31 , hoy . daysOfMonth ());
		hoy . setMonth ( 4 );
		asertEquals ( 30 , hoy . daysOfMonth ());
		hoy . setMonth ( 2 );
		asertEquals ( 28 , hoy . daysOfMonth ());
	}

	@Prueba
	public  void  testGetSeasonName () lanza  DateException {
		assertEquals ( " Invierno " , hoy . getSeasonName ());
		hoy . setMonth ( 5 );
		assertEquals ( " Primavera " , hoy . getSeasonName ());
		hoy . setMonth ( 7 );
		assertEquals ( " Verano " , hoy . getSeasonName ());
		hoy . setMonth ( 10 );
		assertEquals ( " Oto�o " , hoy . getSeasonName ());
	}

	@Prueba
	public  void  testGetMonthsLeft () lanza  DateException {
		asertEquals ( " febrero marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre " ,
				hoy . getMonthsLeft ());
		hoy . setMonth ( 10 );
		assertEquals ( " noviembre diciembre " , hoy . getMonthsLeft ());
	}

	@Prueba
	public  void  testGetDaysLeftOfMonth () lanza  DateException {
		hoy . setDay ( 28 );
		aseverarEquals ( " 29/1/2017 30/1/2017 31/1/2017 " , hoy . getDaysLeftOfMonth ());
	}

	@Prueba
	public  void  testGetMonthsSameDays () lanza  DateException {
		assertEquals ( " enero marzo mayo julio agosto octubre diciembre " , hoy . getMonthsSameDays ());
		hoy . setMonth ( 2 );
		assertEquals ( " febrero " , hoy . getMonthsSameDays ());
		hoy . setMonth ( 4 );
		assertEquals ( " abril junio septiembre noviembre " , hoy . getMonthsSameDays ());
	}

	@Prueba
	public  void  testDaysPast () lanza  DateException {
		asertEquals ( 0 , hoy . daysPast ());
		hoy . setDay ( 2 );
		asertEquals ( 1 , hoy . daysPast ());
		hoy . setDay ( 1 );
		hoy . setMonth ( 2 );
		asertEquals ( 31 , hoy . daysPast ());
		hoy . setMonth ( 12 );
		hoy . setDay ( 31 );
		asertEquals ( 364 , hoy . daysPast ());
	}

	@Prueba
	public  void  testNumRandomTriesEqualDate () {
		assertFalse ( 0  == hoy . numRandomTriesEqualDate ());
	}

	@Prueba
	public  void  testDayOfWeek () lanza  DateException {
		asertEquals ( " Lunes " , hoy . dayOfWeek ( 1 ));
		hoy . setDay ( 2 );
		asertEquals ( " martes " , hoy . d�a de la semana ( 1 ));
		hoy . setDay ( 1 );
		hoy . setMonth ( 2 );
		asertEquals ( " jueves " , hoy . dayOfWeek ( 1 ));
	}

	@Prueba
	public  void  testToString () lanza  DateException {
		asertEquals ( " 1/1/2017 " , hoy . toString ());
		hoy . setDay ( 25 );
		hoy . setMonth ( 8 );
		hoy . setYear ( 2017 );
		assertEquals ( " 25/8/2017 " , hoy . toString ());
	}

}