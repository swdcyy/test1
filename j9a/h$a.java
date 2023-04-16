package j9a.h$a;
import java.lang.Runnable;
import j9a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import j9a.h$a$a;
import bf5.v;
import ekd.k1;

public class h$a implements Runnable	// class@002991
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w(this.b.p, "mTimeOutCheckRunnable", objArray);
       h$a tb = this.b;
       if (tb.t != null) {
          h$a$a uoa$a = new h$a$a(this);
          String str = (this.b.u != null)? "featured api time out": "detail api time out";
          tb.P8(null, uoa$a, str);
       }
       k1.m(this.b.w);
       return;
    }
}
