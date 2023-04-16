package com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.example.commercial.diversead.banner.AdTKBannerView;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import lnc.a1;

public final class AdTKBannerView$renderBanner$1 extends Lambda implements l	// class@001027
{
    public final AdTKBannerView this$0;

    public void AdTKBannerView$renderBanner$1(AdTKBannerView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       a.p(p0, "it");
       int i = p0.optInt("containerHeight");
       int i1 = p0.optInt("containerWidth");
       if (i > 0 && i1 > 0) {
          ViewGroup$LayoutParams layoutParams = this.this$0.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.e((float)i);
          }
          ViewGroup$LayoutParams layoutParams1 = this.this$0.getLayoutParams();
          if (layoutParams1 != null) {
             layoutParams1.width = a1.e((float)i1);
          }
          this.this$0.requestLayout();
       }
       return;
    }
}
