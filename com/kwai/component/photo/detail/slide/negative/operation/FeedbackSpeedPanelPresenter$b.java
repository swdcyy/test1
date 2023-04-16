package com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.negative.operation.SpeedItemModel;
import java.lang.CharSequence;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$b$a;
import android.view.View$OnClickListener;

public final class FeedbackSpeedPanelPresenter$b extends PresenterV2	// class@000a71
{
    public SpeedItemModel p;
    public final FeedbackSpeedPanelPresenter q;

    public void FeedbackSpeedPanelPresenter$b(FeedbackSpeedPanelPresenter p0){
       this.q = p0;
       super();
    }
    public void E8(){
       int i;
       if (PatchProxy.applyVoid(null, this, FeedbackSpeedPanelPresenter$b.class, "2")) {
          return;
       }
       View view = this.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
       FeedbackSpeedPanelPresenter$b tq = this.q;
       FeedbackSpeedPanelPresenter x = tq.x;
       Objects.requireNonNull(tq);
       FeedbackSpeedPanelPresenter uFeedbackSpe = FeedbackSpeedPanelPresenter.class;
       if (PatchProxy.isSupport(uFeedbackSpe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(x), tq, uFeedbackSpe, "6");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(x == null){
             i = 0;
          }else {
             i = (n.z(a.b()) - (a1.e(35.00f) * 2)) / x;
          }
       }else {
          goto label_003d ;
       }
       view.setLayoutParams(new LinearLayout$LayoutParams(i, a1.e(48.00f)));
       FeedbackSpeedPanelPresenter$b tp = this.p;
       a.m(tp);
       view.setText(tp.getDisplayName());
       tp = this.p;
       a.m(tp);
       view.setSelected(tp.getSelected$detail_slide_release());
       view.setOnClickListener(new FeedbackSpeedPanelPresenter$b$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeedbackSpeedPanelPresenter$b.class, "1")) {
          return;
       }
       this.p = this.q8(SpeedItemModel.class);
       return;
    }
}
