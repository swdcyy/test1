package com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$b$a;
import android.view.View$OnClickListener;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter;
import java.util.Iterator;
import java.lang.Iterable;
import android.widget.TextView;
import com.kwai.component.photo.detail.slide.negative.operation.SpeedItemModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.d;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class FeedbackSpeedPanelPresenter$b$a implements View$OnClickListener	// class@000a70
{
    public final FeedbackSpeedPanelPresenter$b b;

    public void FeedbackSpeedPanelPresenter$b$a(FeedbackSpeedPanelPresenter$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackSpeedPanelPresenter$b$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       if (p0.isSelected()) {
          return;
       }
       Iterator iterator = this.b.q.w.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          iterator.next().setSelected(b);
       }
       FeedbackSpeedPanelPresenter u = this.b.q.u;
       if (u == null) {
          a.S("mSpeedList");
       }
       iterator = u.iterator();
       while (iterator.hasNext()) {
          iterator.next().setSelected$detail_slide_release(b);
       }
       FeedbackSpeedPanelPresenter$b p = this.b.p;
       a.m(p);
       RxBus.f.b(new d(p.getSpeed()));
       p0.setSelected(true);
       FeedbackSpeedPanelPresenter$b p1 = this.b.p;
       a.m(p1);
       p1.setSelected$detail_slide_release(true);
       FeedbackSpeedPanelPresenter$b$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, FeedbackSpeedPanelPresenter$b.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MUTI_SPEED_OPTION_BAR";
          i3 oi3 = i3.f();
          FeedbackSpeedPanelPresenter$b p2 = tb.p;
          a.m(p2);
          oi3.d("muti_speed_option", p2.getDisplayName());
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          u = tb.q.r;
          if (u == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(u.mEntity);
          FeedbackSpeedPanelPresenter q = tb.q.q;
          if (q == null) {
             a.S("mFragment");
          }
          u1.M("", q, 1, uElementPack, uContentPack, null);
       }
       return;
    }
}
