package f4a.j0;
import f4a.j0$a;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import android.view.ViewPropertyAnimator;

public final class j0	// class@0022ac
{
    public final Map a;
    public final View b;
    public static final j0$a c;

    static {
       j0.c = new j0$a(null);
    }
    public void j0(View p0){
       a.p(p0, "plcRootView");
       super();
       this.b = p0;
       this.a = new LinkedHashMap();
    }
    public final float a(){
       Object obj = PatchProxy.apply(null, this, j0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          f = f + iterator.next().getValue().floatValue();
       }
       return f;
    }
    public final void b(int p0,float p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, oj0, "2")) {
          return;
       }
       this.c(p0, p1, false);
       return;
    }
    public final void c(int p0,float p1,boolean p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, j0.class, "1")) {
          return;
       }
       if (a.e(this.a.get(Integer.valueOf(p0)), p1)) {
          return;
       }
       this.a.put(Integer.valueOf(p0), Float.valueOf(p1));
       if (p2) {
          this.b.animate().translationY(this.a()).start();
       }else {
          this.b.setTranslationY(this.a());
       }
       return;
    }
}
