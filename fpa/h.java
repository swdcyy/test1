package fpa.h;
import erd.g;
import fpa.d;
import java.lang.Object;
import kzc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import fpa.g;
import java.lang.Runnable;
import ekd.k1;
import fpa.f;

public final class h implements g	// class@0029b7
{
    public final d b;

    public void h(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          this.b.e = p0.b0();
          p0 = QCurrentUser.ME;
          a.o(p0, "QCurrentUser.ME");
          if (!p0.isLogined()) {
             p0 = this.b;
             if (p0.b == null && (p0.c != null || p0.d != null)) {
                k1.o(new f(this));
             }else {
                k1.o(new g(this));
             }
          }
       }
       return;
    }
}
