package c90.a$b;
import erd.o;
import java.lang.String;
import c90.a;
import java.util.HashMap;
import java.lang.Object;
import pr3.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Map;
import java.io.File;
import qkd.b;
import qrd.l1;

public final class a$b implements o	// class@000ce6
{
    public final String b;
    public final a c;
    public final HashMap d;

    public void a$b(String p0,a p1,HashMap p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
       }else {
          a.p(p0, "it");
          a$b tb = this.b;
          String str = "mediaUrl";
          a.o(tb, str);
          this.d.put(tb, Integer.valueOf(p0.a()));
          if (p0.a() == 100 && b.S(p0.c)) {
             tb = this.b;
             a.o(tb, str);
             p0 = p0.c;
             a.m(p0);
             a.o(p0, "it.mResult!!");
             p0 = p0.getAbsolutePath();
             a.o(p0, "it.mResult!!.absolutePath");
             this.c.c.put(tb, p0);
          }
          PatchProxy.onMethodExit(a$b.class, "1");
       }
       return l1.a;
    }
}
