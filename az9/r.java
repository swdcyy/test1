package az9.r;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import az9.a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class r implements g	// class@000338
{
    public final i0 b;

    public void r(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "26")) {
       }else if(tb.v == null){
          boolean b = tb.p0();
          i0 u = tb.u;
          i0 x = tb.x;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), u, x, null, a.class, "12")) {
             a.p(u, "photo");
             a.p(x, "fragment");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 18;
             uElementPack.action2 = "EXTRACT_TEXT_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("biz_type", "COVER");
             b = (b)? "CAN": "CANNOT";
             oi3.d("button_status", b);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(u.getEntity());
             u1.M("", x, 1, uElementPack, uContentPack, null);
          }
          if (!tb.p0()) {
             s.n(a1.p(R.string.arg_RES_7f104c65), 1);
          }else {
             tb.H().L1.onNext(Boolean.TRUE);
             tb.o0();
          }
       }
       return;
    }
}
