package es.unileon.prg1.date;
/**
* Clase date
*
*/

public class Date {
    private int day;
    private int month;
    private int year;

    //Constructor de la clase
public Date() throws DateException {
    this.day=13;
    this.month=11;
    this.year=2020;
    }

public Date (int day, int month, int year)
    throws DateException {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

public Date(Date today) {
    this.day=today.getDay();
    this.month=today.getMonth();
    this.year=today.getYear();
}
    public void setDay(int day) throws DateException {
        if (day<1 || day >this.daysOfMonth() ) {
            throw new DateException("Error en la fecha: Dia" +day+ "del mes" +this.month+ "no es valido");
        }
        this.day=day;
    }
    public int getDay() {
        return day;
    }


    public void setMonth(int month) throws DateException {
        if ((month<1) || (month>12)) {
            throw  new DateException("Error en la fecha: El mes " +month+ "no es valido");
        }
        this.month= month;
    }
    public int getMonth() {
        return month;
    }


    public void setYear(int year) throws DateException{
        if(year<1){
            throw new DateException("Error en el anio. El anio " +year+ "no es valido");
        }
        this.year=year;
    } 
    public int getYear(){
        return year;

    }

    //Muestra el nombre del mes

   public String getMonthName() {
       String name="";
       switch(this.month){
           case 1:
           name="Enero";
           break;

           case 2:
           name="Febrero";
           break;

           case 3:
           name="Marzo";
           break;

           case 4:
           name="Abril";
           break;

           case 5:
           name="Mayo";
           break;

           case 6:
           name="Junio";
           break;

           case 7:
           name="Julio";
           break;

           case 8:
           name="Agosto";
           break;
           case 9:

           name="Septiembre";
           break;

           case 10:
           name="Octube";
           break;

           case 11:
           name="Noviembre";
           break;

           case 12:
           name="Diciembre";
           break;
       }
       return name;
   }

   //Dias que tiene cada mes

   public int daysOfMonth() {
       int daysMonth=0;
       switch(this.month) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               daysMonth=31;
               break;
           case 2:
               daysMonth=28;
               break;
            case 4:
            case 6:
            case 9:
            case 11:
               daysMonth=30;
               break;    
        }
        return daysMonth;
   }
   //Muestra la estacion de los meses

   public String getSeasonName() {
       String estacion="";
       switch(this.month) {
           case 3:
           case 4:
           case 5:
               estacion="Primavera";
               break;
           case 6:
           case 7:
           case 8:
               estacion="Verano";
               break;
           case 9:
           case 10:
           case 11:
               estacion="Otonio";
               break;
           case 12:
           case 1:
           case 2:
               estacion="Invierno";
               break;          
       }
       return estacion;
   }



//Comprobar si es el mismo dia

    public boolean isSameDay(Date otherDate) {
        return this.day==otherDate.getDay();
    }
   //Comprobar si es el mismo mes 

   public boolean isSameMonth(Date otherDate) {
       return this.month==otherDate.getMonth();
   }
   //Comprobar si es el mismo anio

   public boolean isSameYear(Date otherDate) {
       return this.year==otherDate.getYear();
   }
   //Comprobar si es la misma fecha

   public boolean isSame(Date otherDate) {
       return ((this.year==otherDate.getYear()) && (this.month==otherDate.getMonth()) && (this.day==otherDate.getDay()));
   }

   //Devuelve los dias que quedan para terminar el mes
   public String getDaysLeftOfMonth() {
       StringBuffer dayLeft= new StringBuffer();
       int max=daysOfMonth();
       for (int i= this.day; i<max; i++) {
           this.day+=1;
           dayLeft.append(versionDate()+"");
       }
       return dayLeft.toString();
    
   }
   
   //Devuelve la version String de la fecha
   public String versionDate() {
       return this.day+"/"+this.month+"/"+this.year;
   }

   
   //Devuelve los meses hasta terminar el anio

   public String getMonthsLeft() throws DateException {
       StringBuffer monthLeft= new StringBuffer();

       for (int i=this.month; i<12; i++) {
           setMonth(i+1);
           monthLeft.append(getMonthName()+"");
       }
       return monthLeft.toString();

   }

   
   //Devuelve los meses que tienen los mismos dias
   public String getMonthSameDay() {
       StringBuffer sameDay= new StringBuffer();
       int max=daysOfMonth();
       for (int i=1; i<=12; i++) {
           this.month=i;
        if(max==this.daysOfMonth()) {
            sameDay.append(this.getMonthName()+"");
        }   
       } 
       return sameDay.toString();
   }

   public int daysPast() throws DateException{
       int past =0;
       int mes= this.month;

       for (int i=1; i<mes; i++) {
           this.setMonth(i);
           past= past + (this.getDay())-1;
       }
       past=past+(this.getDay())-1;
       return past;
   }

   public int numRandomTriesEqualDate() {
       int otherDay=0;
       int otherMonth=0;
       int intentos=0;

       while ((otherDay != this.day) || (otherMonth!=this.month)) {
           otherDay=(int)((Math.random()*this.daysOfMonth())+1);
           otherMonth=(int) ((Math.random()*12)+1);
           intentos= intentos+1;
       }
       return intentos;
   }

   public String dayOfWeek(int day) throws DateException {

       String valor_dia="";
       int diaSemana= this.daysPast() % 7;
       switch(diaSemana) {
           case 0:
               valor_dia="Lunes";
               break;
           case 1:
               valor_dia="Martes";
               break;               
           case 2:
               valor_dia="Miercoles";
               break;
           case 3:
               valor_dia="Jueves";
               break;    
           case 4:
               valor_dia="Viernes";
               break;
           case 5:
               valor_dia="Sabado";
               break;
           case 6:
               valor_dia="Domingo";
               break;        
       }
       return valor_dia;
   }

   public Date tomorrow() throws DateException {
       int day;
       int month;
       int year;

       day=this.day;
       month=this.month;
       year=this.year;
       day++;

       if (day> daysOfMonth()) {
           month++;
           day=1;
       }

       if (month>12){
           year ++;
           month=1;
       } 

       Date date= new Date(day,month,year);

       return date;
   }



}