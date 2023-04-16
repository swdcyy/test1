package k71.p;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.p$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.rx.RxBus;
import lj1.f;
import com.yxcorp.gifshow.model.response.WalletResponse;
import wkd.b;
import ad5.a;
import o63.m;
import o63.m$a;

public final class p extends AbstractLiveJsCommand	// class@002cc2
{

    public void p(){
       super();
    }
    public Class a(){
       return p$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, p.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof p$a) {
          p0 = null;
       }
       String str = "invalid params";
       if (p0 != null) {
          p0 = p0.walletResponse;
          if (p0 != null) {
             RxBus.f.b(new f(p0));
             b.a(0x4c90014d).b(p0);
             return m$a.g(m.g, null, false, 3, null);
          }else {
             return m.g.c(str);
          }
       }else {
          return m.g.c(str);
       }
    }
}
