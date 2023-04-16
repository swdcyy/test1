package g19.r;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import im8.f;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class r implements View$OnClickListener	// class@0023db
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void r(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       tb.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.USER_DISABLE;
       tb.X8().set(Boolean.TRUE);
       tb.e9();
       tb.r.setEnabled(false);
       Boolean fALSE = Boolean.FALSE;
       tb.F.onNext(fALSE);
       if (PatchProxy.applyVoidOneRefs(tb.s.getText().toString(), tb, SlidePlayAutoPlayNextPresenter.class, "21")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTO_PLAY_TOAST";
          i3 oi3 = i3.f();
          oi3.d("click_type", "CLOSE");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tb.x.getEntity());
          u1.M("", tb.G, 0, uElementPack, uContentPack, null);
       }
       SlidePlayAutoPlayNextPresenter j = tb.J;
       if (j != null) {
          j.set(fALSE);
       }
       return;
    }
}
