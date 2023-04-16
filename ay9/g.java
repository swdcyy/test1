package ay9.g;
import java.lang.Runnable;
import ay9.q;
import java.util.Map;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p1a.a$a;
import p1a.a;

public final class g implements Runnable	// class@0002f7
{
    public final q b;
    public final Map c;
    public final List d;

    public void g(q p0,Map p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       a$a uoa = a$a.s(1022, "show_at_friend");
       uoa.p(this.c);
       uoa.o(this.d);
       uoa.r(true);
       this.b.z.b(uoa);
    }
}
