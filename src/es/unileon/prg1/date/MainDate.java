package es.unileon.prg1.date;

/**
*
* Clase MainDate
*
*
*/

public class MainDate {
    public static void main(String[] args) {
        Date today;

        try {
          today= new Date (14,11,2020);
          Date otherDate= new Date (17,11,2020);
          System.out.println(today);
          System.out.println(otherDate);
        //Devuelve si es el mismo anio  
        System.out.println(today.isSameYear(otherDate));
        //Devuelve si es el mismo mes 
        System.out.println(today.isSameMonth(otherDate));
        //Devuelve si es el mismo dia 
        System.out.println(today.isSameDay(otherDate));
        //Devuelve si es la misma fecha
        System.out.println(today.isSame(otherDate));
        //Devuelve el nombre del mes
        System.out.println("El nombre del mes es "+today.getMonthName());
        //devuelve si el mes puede tener ese dia
        System.out.println("El mes es: "+today.getMonth()+"tiene los dias"+today.getDay()+" dia"+today.daysOfMonth());
        //Devuelve la estacion del mes
        System.out.println(today.getSeasonName());
        //Devuelve los meses restantes para acabar el anio
        System.out.println(today.getMonthsLeft());
        //Devuelve la version de la fecha
        System.out.println(today.versionDate());
        //devuelve todas las fechas hasta el final del mes
        System.out.println(today.getDaysLeftOfMonth());
        //Devuelve los meses con los mismos dias
        System.out.println(today.getMonthSameDay());
        //Devuelve los intentos
        System.out.println(otherDate.numRandomTriesEqualDate());

        } catch (DateException e) {
          System.out.println(e.getMessage());
        }
    }
}