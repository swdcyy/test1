package com.kuaishou.live.preview.item.bottomcard.view.LivePreviewMerchantBottomCommonCardView$a;
import ub.a;
import com.kuaishou.live.preview.item.bottomcard.view.LivePreviewMerchantBottomCommonCardView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public final class LivePreviewMerchantBottomCommonCardView$a extends a	// class@000da2
{
    public final LivePreviewMerchantBottomCommonCardView b;

    public void LivePreviewMerchantBottomCommonCardView$a(LivePreviewMerchantBottomCommonCardView p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LivePreviewMerchantBottomCommonCardView$a.class, "1")) {
       }else {
          a.p(p0, "id");
          if (p1 != null && (p1.getHeight() > 0 && p1.getWidth() > 0)) {
             LivePreviewMerchantBottomCommonCardView h = this.b.h;
             a.m(h);
             ViewGroup$LayoutParams layoutParams = h.getLayoutParams();
             layoutParams.width = (int)((float)layoutParams.height * ((float)p1.getWidth() / (float)p1.getHeight()));
             p1 = this.b.h;
             a.m(p1);
             p1.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
