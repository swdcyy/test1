package dfc.b0$a;
import ew6.c;
import dfc.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw6.c;
import sy6.a;
import xec.n;
import yw6.g;
import com.yxcorp.gifshow.reminder.news.data.d;
import efc.a;

public class b0$a extends c	// class@00219d
{
    public final b0 a;

    public void b0$a(b0 p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "1")) {
          return;
       }
       b0$a ta = this.a;
       b0 r = ta.r;
       int i = 0;
       if (r != null && r.getDataSource() instanceof n) {
          g g = this.a.r.getDataSource().g;
          if (g instanceof d) {
             i = g.s.e;
          }
       }
       ta.p = i;
       return;
    }
}
