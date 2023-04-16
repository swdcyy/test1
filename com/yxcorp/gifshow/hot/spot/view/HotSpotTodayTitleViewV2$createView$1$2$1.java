package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.widget.TextView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.core.widget.b;
import lnc.a1;

public final class HotSpotTodayTitleViewV2$createView$1$2$1 extends Lambda implements l	// class@001891
{
    public static final HotSpotTodayTitleViewV2$createView$1$2$1 INSTANCE;

    static {
       HotSpotTodayTitleViewV2$createView$1$2$1.INSTANCE = new HotSpotTodayTitleViewV2$createView$1$2$1();
    }
    public void HotSpotTodayTitleViewV2$createView$1$2$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayTitleViewV2$createView$1$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f110530);
       p0.setGravity(16);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       return;
    }
}
