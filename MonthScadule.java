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
		System.out.print(cal.get(Calendar.MONTH)+1+"��"+cal.get(Calendar.DAY_OF_MONTH)+"��(");
		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
			case Calendar.SUNDAY: System.out.print("��");break;
			case Calendar.WEDNESDAY: System.out.print("��");break;
			case Calendar.FRIDAY: System.out.print("��");break;	
		}
		System.out.println(") ���K 14:00�`18:00");
		}
	cal.add(Calendar.DAY_OF_MONTH,1);
	
	}
    }
}