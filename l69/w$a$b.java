package l69.w$a$b;
import java.lang.Runnable;
import l69.w$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import i69.j;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import i69.a;
import brd.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class w$a$b implements Runnable	// class@002cb2
{
    public final w$a b;
    public final long c;
    public final long d;

    public void w$a$b(w$a p0,long p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w$a$b.class, "1")) {
          return;
       }
       w$a$b tb = this.b;
       w$a e = tb.e;
       w$a d = tb.d;
       int i = (int)this.c;
       int i1 = (int)this.d;
       Objects.requireNonNull(e);
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(d, Integer.valueOf(i), Integer.valueOf(i1), e, j.class, "1")) {
          a.p(d, "info");
          if (e.c != null) {
             e.b.d(((i * 100) / i1));
             j c = e.c;
             if (c != null) {
                c.onNext(e.b);
             }
             Log.l(e.a, "onProgress: percent="+e.b.b()+' '+e.b.a());
          }
       }
       return;
    }
}
