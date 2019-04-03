import java.util.Scanner;
import java.util.Calendar;
public class MonthScadule{
    public static void main (String[] args){
	Calendar cal=Calendar.getInstance();
	int m,d,i;
	Scanner sc =new Scanner(System.in);
	m=sc.nextInt();
	cal.set(2019,m-1,1);
	while(cal.get(Calendar.MONTH)==m-1){
		if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY||cal.get(Calendar.DAY_OF_WEEK)==Calendar.WEDNESDAY||cal.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY){
		System.out.print(cal.get(Calendar.MONTH)+1+"åé"+cal.get(Calendar.DAY_OF_MONTH)+"ì˙(");
		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
			case Calendar.SUNDAY: System.out.print("ì˙");break;
			case Calendar.WEDNESDAY: System.out.print("êÖ");break;
			case Calendar.FRIDAY: System.out.print("ã‡");break;	
		}
		System.out.println(") ó˚èK 14:00Å`18:00");
		}
	cal.add(Calendar.DAY_OF_MONTH,1);
	
	}
    }
}