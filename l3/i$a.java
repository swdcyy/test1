package l3.i$a;
import java.lang.Runnable;
import l3.i;
import w3.a;
import v3.f;
import java.lang.Object;
import java.lang.Long;
import java.lang.Throwable;

public class i$a implements Runnable	// class@002506
{
    public final a b;
    public final f c;
    public final i d;

    public void i$a(i p0,a p1,f p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.b.J(Long.valueOf(this.c.a()));
       return;
    }
}
