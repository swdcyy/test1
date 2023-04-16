package ee.d;
import java.lang.Runnable;
import ee.c;
import java.lang.Object;

public class d implements Runnable	// class@001f41
{
    public final int b;
    public final c c;

    public void d(c p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.b(this.b);
    }
}
