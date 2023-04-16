package ci7.d$a;
import java.util.TimerTask;
import ci7.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import ci7.f;

public class d$a extends TimerTask	// class@000560
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       d$a tb = this.b;
       tb.k = l;
       tb.c.b((l - tb.k));
       tb = this.b;
       long l1 = l - tb.l;
       if (l1 - tb.b >= 0) {
          tb.c(l1);
          tb = this.b;
          tb.l = l;
          tb.c.a();
       }
       return;
    }
}
