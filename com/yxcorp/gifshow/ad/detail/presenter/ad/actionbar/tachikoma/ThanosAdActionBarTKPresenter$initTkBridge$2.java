package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class ThanosAdActionBarTKPresenter$initTkBridge$2 extends Lambda implements l	// class@001574
{
    public final ThanosAdActionBarTKPresenter this$0;

    public void ThanosAdActionBarTKPresenter$initTkBridge$2(ThanosAdActionBarTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdActionBarTKPresenter$initTkBridge$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = p0.optInt("actionBarHeight");
       if (i > 0) {
          ViewGroup viewGroup = this.this$0.S8();
          if (viewGroup != null) {
             ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = a1.e((float)i);
             }
          }
          viewGroup = this.this$0.S8();
          if (viewGroup != null) {
             viewGroup.requestLayout();
          }
          this.this$0.M = a1.e((float)i) + a1.d(0x7f070283);
       }
       return;
    }
}
