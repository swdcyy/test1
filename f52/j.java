package f52.j;
import erd.a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import f12.d;
import java.util.List;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;

public final class j implements a	// class@00288f
{
    public final f b;

    public void j(f p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       if (!q.f(tb.D)) {
          f r = tb.r;
          r.m((r.getCurrentPosition() + 1), tb.D, "insert feed");
       }
       k1.o(tb.E);
       tb.z = false;
       return;
    }
}
