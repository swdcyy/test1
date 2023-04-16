package c03.i;
import erd.g;
import java.lang.String;
import sz2.a;
import java.lang.Object;
import crd.b;
import java.util.List;
import xz2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import xz2.a$a;
import kotlin.jvm.internal.a;
import lnc.i3;
import k2b.k2;
import k2b.u1;
import java.lang.Number;

public final class i implements g	// class@00048f
{
    public final String b;
    public final a c;
    public final int d;

    public void i(String p0,a p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       a$a a;
       String str;
       i tb = this.b;
       i td = this.d;
       p0 = this.c.c();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(tb, p0, Integer.valueOf(td), null, a.class, "3")) {
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(a$a.class) || !PatchProxy.applyVoidThreeRefs(tb, p0, Integer.valueOf(td), a, a$a.class, "3")) {
             a.p(tb, "dependKey");
             a.p(p0, "resourceIdList");
             i3 oi3 = i3.f();
             oi3.d("status", "START");
             if (u1.j() == null) {
                str = "";
             }else {
                str = u1.j().d;
                a.o(str, "Logger.getCurrentPage\(\).mPage2");
             }
             oi3.d("current_page", str);
             oi3.d("depend_key", tb);
             oi3.d("resource_list", p0.toString());
             oi3.c("from", Integer.valueOf(td));
             u1.R("LIVE_EFFECT_DEPEND_RES_DOWNLOAD", oi3.toString(), 3);
          }
       }
       return;
    }
}
