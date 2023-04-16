package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.detail.view.RecoReasonTextView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import androidx.core.widget.b;
import android.text.TextUtils$TruncateAt;
import lnc.a1;

public final class HotSpotTodayListItemV2$createView$2$2$1 extends Lambda implements l	// class@001881
{
    public static final HotSpotTodayListItemV2$createView$2$2$1 INSTANCE;

    static {
       HotSpotTodayListItemV2$createView$2$2$1.INSTANCE = new HotSpotTodayListItemV2$createView$2$2$1();
    }
    public void HotSpotTodayListItemV2$createView$2$2$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(RecoReasonTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItemV2$createView$2$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f110532);
       p0.setMaxLines(1);
       p0.setEllipsize(TextUtils$TruncateAt.END);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       return;
    }
}
