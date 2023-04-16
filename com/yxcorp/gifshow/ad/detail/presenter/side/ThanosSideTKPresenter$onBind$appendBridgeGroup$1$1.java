package com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$onBind$appendBridgeGroup$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$onBind$appendBridgeGroup$1;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class ThanosSideTKPresenter$onBind$appendBridgeGroup$1$1 extends Lambda implements l	// class@0016a0
{
    public final ThanosSideTKPresenter$onBind$appendBridgeGroup$1 this$0;

    public void ThanosSideTKPresenter$onBind$appendBridgeGroup$1$1(ThanosSideTKPresenter$onBind$appendBridgeGroup$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosSideTKPresenter$onBind$appendBridgeGroup$1$1.class, "1")) {
          return;
       }
       a.p(p0, "json");
       int i = p0.optInt("smallScreenMetaHeight");
       if (i > 0) {
          ViewGroup$LayoutParams layoutParams = ThanosSideTKPresenter.P8(this.this$0.this$0).getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.e((float)i);
          }
          ThanosSideTKPresenter.P8(this.this$0.this$0).requestLayout();
       }
       return;
    }
}
