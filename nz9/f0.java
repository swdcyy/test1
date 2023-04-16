package nz9.f0;
import java.lang.Runnable;
import nz9.z0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import os7.a;
import java.lang.Boolean;
import p1a.a$a;
import nz9.u0;
import tl8.g;
import p1a.a;
import ekd.k1;

public final class f0 implements Runnable	// class@00321d
{
    public final z0 b;

    public void f0(z0 p0){
       this.b = p0;
    }
    public final void run(){
       f0 tb = this.b;
       z0 oz0 = z0.class;
       _monitor_enter(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oz0, "12")) {
          _monitor_exit(tb);
       }else if(tb.X0 != null && (tb.Z0 != null || tb.a1 != null)){
          tb.E().v(Boolean.TRUE);
          if (!PatchProxy.applyVoid(objArray, tb, oz0, "43")) {
             a$a uoa = a$a.t("SHOW_AUTHOR_AVATAR_POPUP", "");
             uoa.r(true);
             uoa.h(new u0(tb));
             tb.V.b(uoa);
          }
          k1.r(tb.k1, tb.Y0);
       }else {
          k1.o(tb.k1);
       }
       _monitor_exit(tb);
       return;
    }
}
