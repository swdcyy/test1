package fb2.a;
import fb2.i;
import fb2.a$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import java.lang.Object;
import fb2.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import pm8.a;
import java.lang.Long;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;

public class a implements i	// class@00291f
{
    public Map c;
    public String d;
    public String e;
    public static final Type f;

    static {
       a.f = new a$a().getType();
    }
    public void a(String p0,String p1){
       super();
       this.d = p1;
       this.e = p0;
    }
    public void a(){
       h.f(this);
    }
    public long b(){
       return h.a(this);
    }
    public void c(){
       h.g(this);
    }
    public boolean d(){
       return h.i(this);
    }
    public String e(){
       return this.d;
    }
    public boolean f(){
       Map obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.a(a.f);
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Long longx = obj.get(this.e);
       if (longx == null || !DateUtils.I(longx.longValue(), System.currentTimeMillis())) {
          b = true;
       }
       return b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Map map = a.a(a.f);
       if (map == null) {
          return;
       }
       map.put(this.e, Long.valueOf(System.currentTimeMillis()));
       a.H0(map);
       return;
    }
    public String h(){
       return h.d(this);
    }
    public long i(){
       return h.b(this);
    }
}
