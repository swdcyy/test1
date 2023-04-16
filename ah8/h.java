package ah8.h;
import java.lang.Runnable;
import com.mini.plcmanager.live.a;
import java.lang.Object;
import hh8.i;
import om.f;
import om.p;

public final class h implements Runnable	// class@00009c
{
    public final a b;
    public final boolean c;

    public void h(a p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.c.destroy();
       int i = (this.c != null)? 0x7f103591: 0x7f10353f;
       p.a(i);
       return;
    }
}
