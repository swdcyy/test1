package zq.h;
import upd.b;
import zq.f;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import tq.f;
import com.kuaishou.android.vader.persistent.a;
import ar.c;
import java.util.Map;
import upd.d;

public final class h implements b	// class@002963
{
    public final f a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public void h(f p0,Provider p1,Provider p2,Provider p3,Provider p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static h a(f p0,Provider p1,Provider p2,Provider p3,Provider p4){
       Object obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       h oh1 = new h(p0, p1, p2, p3, p4);
       return obj;
    }
    public static Map c(f p0,Context p1,f p2,a p3,c p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, oh, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Map map = p0.c(p1, p2, p3, p4);
       d.c(map, "Cannot return null from a non-@Nullable @Provides method");
       return map;
    }
    public Map b(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
    public Object get(){
       return this.b();
    }
}
