package com.yxcorp.gifshow.hot.spot.view.HotSpotLoadingView$placeHolderView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotLoadingView;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import jva.f;
import android.view.ViewOutlineProvider;
import lnc.a1;

public final class HotSpotLoadingView$placeHolderView$1 extends Lambda implements l	// class@00186f
{
    public final int $corner;
    public final HotSpotLoadingView this$0;

    public void HotSpotLoadingView$placeHolderView$1(HotSpotLoadingView p0,int p1){
       this.this$0 = p0;
       this.$corner = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotLoadingView$placeHolderView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotLoadingView$placeHolderView$1 tthis$0 = this.this$0;
       HotSpotLoadingView$placeHolderView$1 t$corner = this.$corner;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.isSupport(HotSpotLoadingView.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(t$corner), tthis$0, HotSpotLoadingView.class, "5")) {
          p0.setClipToOutline(true);
          p0.setOutlineProvider(new f(t$corner));
       }
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f061709));
       return;
    }
}
