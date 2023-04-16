package f21.f$d;
import ht5.d;
import f21.f;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import l92.a;
import l92.a$a;
import brd.y;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.Runnable;
import ekd.k1;

public final class f$d implements d	// class@0022a8
{
    public final f a;
    public final Gift b;
    public final String c;

    public void f$d(f p0,Gift p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean onError(Throwable p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "error");
       obj = this.a.n;
       if (obj != null) {
          obj.onNext(new a(this.b, this.c, 1, a.e.a(p0)));
       }
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "1")) {
       }else {
          p0 = this.a.n;
          if (p0 != null) {
             p0.onNext(new a(this.b, this.c, 0, 0));
          }
          k1.m(this.a.b());
          k1.r(this.a.b(), 3000);
       }
       return;
    }
}
