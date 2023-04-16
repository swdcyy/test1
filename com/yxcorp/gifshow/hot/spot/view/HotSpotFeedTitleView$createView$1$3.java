package com.yxcorp.gifshow.hot.spot.view.HotSpotFeedTitleView$createView$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.hot.spot.view.HotSpotCustomTextView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import androidx.core.widget.b;
import lnc.a1;
import jva.a;
import android.view.View;

public final class HotSpotFeedTitleView$createView$1$3 extends Lambda implements l	// class@00184c
{
    public static final HotSpotFeedTitleView$createView$1$3 INSTANCE;

    static {
       HotSpotFeedTitleView$createView$1$3.INSTANCE = new HotSpotFeedTitleView$createView$1$3();
    }
    public void HotSpotFeedTitleView$createView$1$3(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(HotSpotCustomTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotFeedTitleView$createView$1$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f110530);
       p0.setGravity(16);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       p0.setPadding(a.a(19), a.a(16), p0.getPaddingRight(), a.a(12));
       return;
    }
}
