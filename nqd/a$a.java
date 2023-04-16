package nqd.a$a;
import java.lang.Runnable;
import nqd.a;
import java.lang.Object;
import io.netty.channel.a;
import lqd.i;

public class a$a implements Runnable	// class@001ea9
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.h.flush();
    }
}
