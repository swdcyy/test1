package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1$1 extends Lambda implements l	// class@001586
{
    public final ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1 this$0;

    public void ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1$1(ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1$1.class, "1")) {
          return;
       }
       a.p(p0, "json");
       int i = p0.optInt("topTagHeight");
       if (i > 0) {
          ViewGroup$LayoutParams layoutParams = ThanosAdTopTagTKPresenter.P8(this.this$0.this$0).getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.e((float)i);
          }
          ThanosAdTopTagTKPresenter.P8(this.this$0.this$0).requestLayout();
       }
       return;
    }
}
