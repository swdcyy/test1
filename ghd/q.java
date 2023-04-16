package ghd.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sgd.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import o07.o;

public class q implements PopupInterface$h	// class@000f38
{
    public final int b;
    public final GifshowActivity c;

    public void q(int p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       q tb = this.b;
       q tc = this.c;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tb), tc, null, uoa, "7")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RELATIONSHIP_LIST_LIMIT_POPUP";
          i3 oi3 = i3.f();
          oi3.d("origin_type", a.c(tb));
          uElementPack.params = oi3.e();
          showEvent.elementPackage = uElementPack;
          b.a(0x4b316083).W0("3305593", showEvent, tc);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
