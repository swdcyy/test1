package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardPartView$createView$1$1;
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

public final class HotSpotInterestCardPartView$createView$1$1 extends Lambda implements l	// class@001855
{
    public static final HotSpotInterestCardPartView$createView$1$1 INSTANCE;

    static {
       HotSpotInterestCardPartView$createView$1$1.INSTANCE = new HotSpotInterestCardPartView$createView$1$1();
    }
    public void HotSpotInterestCardPartView$createView$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(HotSpotCustomTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardPartView$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f110530);
       p0.setGravity(16);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       p0.setPadding(a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f070295), 0, a1.d(R.dimen.arg_RES_7f070271));
       return;
    }
}
