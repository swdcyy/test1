package fb2.f;
import fb2.i;
import fb2.f$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import fb2.d;
import ok.x;
import com.google.common.base.Suppliers;
import fb2.e;
import fb2.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.System;
import pm8.a;
import android.content.SharedPreferences;
import java.util.Set;
import java.lang.Integer;
import java.util.HashSet;

public class f implements i	// class@002925
{
    public final x c;
    public final x d;
    public final int e;
    public static final Type f;

    static {
       f.f = new f$a().getType();
    }
    public void f(int p0){
       super();
       this.c = Suppliers.a(d.b);
       this.d = Suppliers.a(e.b);
       this.e = p0;
    }
    public void a(){
       h.f(this);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.c.get().longValue();
    }
    public void c(){
       h.g(this);
    }
    public boolean d(){
       return h.i(this);
    }
    public String e(){
       return h.c(this);
    }
    public boolean f(){
       Set obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if ((System.currentTimeMillis() - a.a.getLong("liveSlideOnceGuideLastShownTimeMs", 0)) - 0x5265c00 < 0) {
          return b;
       }
       obj = a.b0(f.f);
       if (obj == null || !obj.contains(Integer.valueOf(this.e))) {
          b = true;
       }
       return b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       a.A1(System.currentTimeMillis());
       Set set = a.b0(f.f);
       if (set == null) {
          set = new HashSet();
       }
       set.add(Integer.valueOf(this.e));
       a.z1(set);
       return;
    }
    public String h(){
       return h.d(this);
    }
    public long i(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.d.get().longValue();
    }
}
