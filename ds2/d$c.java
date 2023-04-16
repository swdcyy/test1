package ds2.d$c;
import erd.g;
import ds2.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import ekd.k1;

public final class d$c implements g	// class@00258c
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          a.o(p0, "poll");
          if (p0.booleanValue()) {
             p0 = this.b;
             k1.r(p0.e, p0.c);
          }else {
             k1.m(this.b.e);
          }
       }
       return;
    }
}
