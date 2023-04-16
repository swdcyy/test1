package br.d;
import upd.b;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.persistent.a;
import tq.d;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import tq.h;

public final class d implements b	// class@000335
{
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public void d(Provider p0,Provider p1,Provider p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static d a(Provider p0,Provider p1,Provider p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, p2);
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.a.get(), this.b.get(), this.c.get());
    }
    public Object get(){
       return this.b();
    }
}
