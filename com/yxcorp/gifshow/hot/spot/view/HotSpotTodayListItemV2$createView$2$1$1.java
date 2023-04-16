package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;

public final class HotSpotTodayListItemV2$createView$2$1$1 extends Lambda implements l	// class@00187e
{
    public static final HotSpotTodayListItemV2$createView$2$1$1 INSTANCE;

    static {
       HotSpotTodayListItemV2$createView$2$1$1.INSTANCE = new HotSpotTodayListItemV2$createView$2$1$1();
    }
    public void HotSpotTodayListItemV2$createView$2$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItemV2$createView$2$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       a hierarchy = p0.getHierarchy();
       a.o(hierarchy, "hierarchy");
       hierarchy.u(t$b.a);
       p0.setBackground(a1.f(R.drawable.arg_RES_7f080c40));
       return;
    }
}
