package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1$1$2$1;
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
import fva.q;
import java.util.Locale;
import java.lang.CharSequence;

public final class HotSpotTodayFoldView$createView$1$1$2$1 extends Lambda implements l	// class@001871
{
    public static final HotSpotTodayFoldView$createView$1$1$2$1 INSTANCE;

    static {
       HotSpotTodayFoldView$createView$1$1$2$1.INSTANCE = new HotSpotTodayFoldView$createView$1$1$2$1();
    }
    public void HotSpotTodayFoldView$createView$1$1$2$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayFoldView$createView$1$1$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       b.r(p0, R.style.arg_RES_7f11053e);
       p0.setGravity(16);
       p0.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       Locale cHINESE = Locale.CHINESE;
       a.o(cHINESE, "Locale.CHINESE");
       p0.setText(q.a.a(cHINESE, R.string.arg_RES_7f1004cc));
       return;
    }
}
