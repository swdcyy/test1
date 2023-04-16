package b1c.b;
import b1c.b$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class b	// class@00038c
{
    public boolean a;
    public FilterConfig b;
    public a0 c;
    public boolean d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
    }
    public void b(){
       super();
       this.c = a0.b.a();
    }
    public final FilterConfig a(){
       return this.b;
    }
    public final boolean b(){
       return this.a;
    }
    public final a0 c(){
       return this.c;
    }
    public final boolean d(){
       return this.d;
    }
    public final void e(FilterConfig p0){
       this.b = p0;
    }
    public final void f(boolean p0){
       this.d = p0;
    }
    public final void g(boolean p0){
       this.a = p0;
    }
    public final void h(a0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "FilterState\(config=";
       b tb = this.b;
       if (tb != null) {
          objArray = tb.toSimpleString();
       }
       return obj+objArray+", "+"needDisableMagicBuiltIn="+this.a+", "+"source="+this.c+')';
    }
}
