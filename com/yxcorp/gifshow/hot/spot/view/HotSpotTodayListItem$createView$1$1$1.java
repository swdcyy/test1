package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$1;
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

public final class HotSpotTodayListItem$createView$1$1$1 extends Lambda implements l	// class@001877
{
    public static final HotSpotTodayListItem$createView$1$1$1 INSTANCE;

    static {
       HotSpotTodayListItem$createView$1$1$1.INSTANCE = new HotSpotTodayListItem$createView$1$1$1();
    }
    public void HotSpotTodayListItem$createView$1$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItem$createView$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f110532);
       p0.setGravity(16);
       p0.setMaxLines(1);
       p0.setEllipsize(TextUtils$TruncateAt.END);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       return;
    }
}
