public class SomeClass{
	private ArrayList<String> events = new ArrayList<String>();
	
publi void thoughtForTheDay(){
system.out.println("I could'nt repair your brakes, so I made your horn louder");

}
publi void upcomingEvents(){
system.out.println("Upcomin Events- Please join US");
for (String event : events)
	System.out.println(event);

}

public static void main (String[]args){
SomeClass sc = new SomeClass();
sc.thoughtForTheDay();
sc.createEvents();

sc.upcomingEvents();


}
}
