package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import lnc.a1;
import com.facebook.drawee.generic.RoundingParams;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class HotSpotInterestCardItem$createView$1$1 extends Lambda implements l	// class@00184e
{
    public static final HotSpotInterestCardItem$createView$1$1 INSTANCE;

    static {
       HotSpotInterestCardItem$createView$1$1.INSTANCE = new HotSpotInterestCardItem$createView$1$1();
    }
    public void HotSpotInterestCardItem$createView$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardItem$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setScaleType(ImageView$ScaleType.CENTER_CROP);
       a hierarchy = p0.getHierarchy();
       a.o(hierarchy, "hierarchy");
       hierarchy.L(RoundingParams.c((float)a1.d(R.dimen.arg_RES_7f070429)));
       p0.getHierarchy().F(new ColorDrawable(a1.a(R.color.arg_RES_7f060746)));
       return;
    }
}
