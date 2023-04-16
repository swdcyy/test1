package ar.d;
import upd.b;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ar.c;
import android.content.Context;
import tq.f;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import er.m;
import tq.d;

public final class d implements b	// class@000284
{
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public void d(Provider p0,Provider p1,Provider p2,Provider p3,Provider p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static d a(Provider p0,Provider p1,Provider p2,Provider p3,Provider p4){
       Object obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       d uod1 = new d(p0, p1, p2, p3, p4);
       return obj;
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
       return obj;
    }
    public Object get(){
       return this.b();
    }
}
