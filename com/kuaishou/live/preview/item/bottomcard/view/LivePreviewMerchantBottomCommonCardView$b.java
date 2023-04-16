package com.kuaishou.live.preview.item.bottomcard.view.LivePreviewMerchantBottomCommonCardView$b;
import com.yxcorp.gifshow.widget.m;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LivePreviewMerchantBottomCommonCardView$b extends m	// class@000da3
{
    public final View$OnClickListener c;

    public void LivePreviewMerchantBottomCommonCardView$b(View$OnClickListener p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewMerchantBottomCommonCardView$b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       LivePreviewMerchantBottomCommonCardView$b tc = this.c;
       if (tc != null) {
          tc.onClick(p0);
       }
       return;
    }
}
