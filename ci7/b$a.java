package ci7.b$a;
import java.util.TimerTask;
import ci7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;

public class b$a extends TimerTask	// class@00055d
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       b$a tb = this.b;
       long l1 = l - tb.l;
       if (l1 - tb.j >= 0) {
          tb.e(l1);
          this.b.l = l;
       }
       return;
    }
}
