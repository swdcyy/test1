package ar8.a;
import java.lang.Object;

public class a	// class@000311
{
    public float a;
    public float b;
    public float c;
    public float d;

    public void a(float p0,float p1,float p2,float p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean a(a p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (this.a - p0.a || (this.b - p0.b || (this.c - p0.c || this.d - p0.d))) {
          b = false;
       }
       return b;
    }
}
