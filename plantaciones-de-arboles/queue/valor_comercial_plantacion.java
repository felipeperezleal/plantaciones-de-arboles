import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.ParseException;


class Main {
  public static double calcular_valor(int cantidad,QueueArrayGeneric fechas, int ano, int mes, int dia, int metro_cubico_arbol ){
    double valor=0;
    Date fechaFinal= new GregorianCalendar(ano, mes, dia).getTime();
    for (int i=0; i<cantidad; i++){
      int ano_arbol=obtenerAnios((Date)fechas.dequeue(), fechaFinal);
      System.out.println(ano_arbol);
      double metro_cubico= Math.pow((ano_arbol/0.2)/2,2)*(ano_arbol*0.2);
      double valor_arbol=metro_cubico_arbol*metro_cubico;
      valor=valor+valor_arbol;
    }
    return valor;              

  }
   public static int obtenerAnios(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);        
        
        if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
            (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) &&   
            a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
            diff--;
        }
        return diff;
    }
    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }   
 
  public static void main(String[] args)throws ParseException {
    Scanner reader = new Scanner(System.in);
      QueueArrayGeneric<Date> fechas=new QueueArrayGeneric<Date>();
      System.out.println("ingresa el numero de arboles a registrar"); 
      int num_arboles=reader.nextInt(); 
      System.out.println("ingresa el año, mes, dia seguido por un guion ejemplo 2018-12-15"); 
           
      while(num_arboles>0){
        String fecha=reader.next();
        String [] parts =fecha.split("-");         
        int ano = Integer.parseInt(parts[0]);       
        int mes = Integer.parseInt(parts[1]);        
        int dia = Integer.parseInt(parts[2]);        
        Date fechaInicial = new GregorianCalendar(ano,mes,dia).getTime();
        fechas.enqueue(fechaInicial);
        num_arboles--;         
      }
      System.out.println("desea conocer el valor de alguna plantacio");
      char conocer=reader.next().charAt(0); 
      if(conocer=='S'||conocer=='s'){
        System.out.println("ingrese la cantidad de arboles a conocer su valor");
        int cantidad=reader.nextInt();
        System.out.println("ingrese el año, el mes, y el dia a conocer");
        String fecha1=reader.next();
        String [] parts1 =fecha1.split("-"); 
         int ano1 = Integer.parseInt(parts1[0]);       
        int mes1 = Integer.parseInt(parts1[1]);        
        int dia1 = Integer.parseInt(parts1[2]);
        System.out.println("el valor comercial del metro cubico de madera");
        int valor_metro=reader.nextInt();
        System.out.println(" el valor comercial de los arboles es "+calcular_valor(cantidad,fechas,ano1,mes1,dia1,valor_metro));        
      }                                
 
  }
}
class QueueArrayGeneric<T> {
    private static final int N = 50;
    private int front, rear, count;
    private ArrayList<T> qarray;
    //private T[] qarray;

    public QueueArrayGeneric() {
        this(N);
    }

    public QueueArrayGeneric(int n) {
        front = rear = count = 0;
         qarray= new ArrayList<T>();
        //qarray = (T[]) new Object[n];
    }

    public T dequeue() {
        T item = null;
        if (empty())
            System.out.println("Queue is empty: item not dequeued");
        else {
          item=qarray.get(front);
            //item = qarray[front];
            front = (front + 1) % N;
            count--;
        }
        return item;
    }

    public void enqueue(T item) {
        if (full())
            System.out.println("Queue is full: item not enqueued");
        else {
            //qarray[rear] = item;
            qarray.add(item);
            rear = (rear + 1) % N;
            count++;
        }
    }

    public boolean empty() {
        return count <= 0;
    }

    public boolean full() {
        return count >= N;
    }

    public int getCount() {
        return count;
    }
}