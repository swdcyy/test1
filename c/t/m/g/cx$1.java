package c.t.m.g.cx$1;
import java.lang.Runnable;
import c.t.m.g.cx;
import java.lang.Object;
import c.t.m.g.cx$b;

public class cx$1 implements Runnable	// class@000c2c
{
    public final cx a;

    public void cx$1(cx p0){
       this.a = p0;
       super();
    }
    public void run(){
       cx.a(this.a, new cx$b(this.a));
    }
}
