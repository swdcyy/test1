package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2$1;
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
import android.text.TextUtils$TruncateAt;
import lnc.a1;

public final class HotSpotInterestCardItem$createView$1$2$1 extends Lambda implements l	// class@00184f
{
    public static final HotSpotInterestCardItem$createView$1$2$1 INSTANCE;

    static {
       HotSpotInterestCardItem$createView$1$2$1.INSTANCE = new HotSpotInterestCardItem$createView$1$2$1();
    }
    public void HotSpotInterestCardItem$createView$1$2$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardItem$createView$1$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f110532);
       p0.setMaxLines(2);
       p0.setMinLines(2);
       p0.setEllipsize(TextUtils$TruncateAt.END);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       return;
    }
}
