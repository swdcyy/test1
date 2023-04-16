package dra.c$a;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import wkd.b;
import yma.a;
import yma.b;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import dra.c$a$a;
import dra.c$a$b;
import erd.g;
import crd.b;

public final class c$a implements g	// class@002504
{
    public final String b;
    public final String c;
    public final String d;

    public void c$a(String p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       c$a tb = this.b;
       if (tb != null) {
          int i = 1;
          str = (!tb.length())? 1: null;
          if (str == i) {
             tb = this.b;
          label_0026 :
             Object obj = b.a(-1257347683);
             a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
             obj.b().p(str, this.c, this.d).observeOn(d.b).map(new e()).subscribeOn(d.a).subscribe(new c$a$a(this, str, p0), new c$a$b(p0));
             return;
          }
       }
       str = "BIG_V_PULL_A";
       goto label_0026 ;
    }
}
