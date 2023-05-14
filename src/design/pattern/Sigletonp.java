package design.pattern;

public  final class Sigletonp {
static Sigletonp sp=new Sigletonp();
private Sigletonp() {
	
}
 static public Sigletonp getObj() {
	 return sp;
 }
}
