package h92.k0;
import ht5.d;
import h92.i0;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import l92.a;
import java.lang.Number;
import l92.a$a;
import brd.y;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.Runnable;
import ekd.k1;

public class k0 implements d	// class@002d15
{
    public final Gift a;
    public final String b;
    public final i0 c;

    public void k0(i0 p0,Gift p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public boolean onError(Throwable p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i0 obj = PatchProxy.applyOneRefs(p0, this, k0.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c.H;
       k0 ta = this.a;
       k0 tb = this.b;
       Object obj1 = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): a.e.a(p0);
       obj.onNext(new a(ta, tb, 1, i));
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
       }else {
          this.c.H.onNext(new a(this.a, this.b, 0, 0));
          k1.m(this.c.Q);
          k1.r(this.c.Q, 3000);
       }
       return;
    }
}
