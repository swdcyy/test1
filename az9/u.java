package az9.u;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import az6.a;
import uh5.e;
import com.kwai.component.photo.reduce.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import az9.a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class u implements g	// class@00033b
{
    public final i0 b;

    public void u(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b1;
       u tb = this.b;
       Objects.requireNonNull(tb);
       p0 = i0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "16")) {
       }else {
          tb.o0();
          String str = null;
          if (tb.w.getEntranceFeed() != null && (tb.u.getPhotoId()).equals(tb.w.getEntranceFeed().getId())) {
             i0 w = tb.W;
             if (!w.q(w.j())) {
                a mSource = tb.w.mSource;
                boolean b = (mSource != 9 && (mSource == 8 || mSource == 16))? true: false;
                if (b && !e.f()) {
                   tb.I.c(tb.w.mSource, objArray, "COVER", 3);
                label_009e :
                   p0 = tb.u;
                   i0 x = tb.x;
                   if (!PatchProxy.applyVoidTwoRefs(p0, x, objArray, a.class, "11")) {
                      a.p(p0, "photo");
                      a.p(x, "fragment");
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.type = 18;
                      uElementPack.action2 = "NO_INTEREST_BTN_IN_LONG_PRESS_MASK";
                      i3 oi3 = i3.f();
                      oi3.d("source", "COVER");
                      uElementPack.params = oi3.e();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(p0.mEntity);
                      u1.M("", x, 1, uElementPack, uContentPack, null);
                   }
                }
             }
          }
       label_006c :
          p0 = PatchProxy.apply(objArray, tb, p0, "21");
          if (p0 != PatchProxyResult.class) {
             b1 = p0.booleanValue();
          }else if(tb.w.getBizType() == 5){
             str = 1;
          }
          p0 = str;
          if (b1 != null) {
             tb.I.c(tb.w.mSource, objArray, "COVER", 2);
             goto label_009e ;
          }else {
             tb.I.b(tb.w.mSource, objArray, "COVER");
             goto label_009e ;
          }
       }
       return;
    }
}
