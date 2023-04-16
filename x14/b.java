package x14.b;
import x14.b$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.merchant.api.live.service.pendant.model.PendantArea;
import java.util.List;
import ms3.b;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import java.lang.StringBuilder;
import java.lang.Enum;
import p74.a;
import o74.a;
import java.lang.Runnable;
import x14.a;
import ms3.c;

public abstract class b	// class@0044eb
{
    public final List a;
    public static final b$a b;

    static {
       b.b = new b$a(null);
    }
    public void b(){
       super();
       this.a = new ArrayList();
    }
    public abstract PendantArea a();
    public final List b(){
       return this.a;
    }
    public abstract void c();
    public abstract void d(List p0);
    public abstract void e(b p0,int p1);
    public final void f(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       a.x(LiveBasicLogBiz.PENDANT_NEW, "LiveMerchantPendantArea", "<Area-"+this.a().name()+">: "+p0, p1);
       return;
    }
    public abstract void g();
    public abstract void h();
    public abstract void i(b p0);
    public abstract void j(String p0,Runnable p1);
    public abstract void k(b p0,Runnable p1);
    public void l(a p0){
    }
    public abstract void m(c p0);
    public abstract void n();
}
