package id.j$a;
import java.lang.Runnable;
import id.j;
import id.i;
import id.c0;
import java.lang.Object;
import id.b0;

public class j$a implements Runnable	// class@0021b1
{
    public final i b;
    public final c0 c;
    public final j d;

    public void j$a(j p0,i p1,c0 p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.d.a.produceResults(this.b, this.c);
    }
}
