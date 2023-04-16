package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView$bannerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import lnc.a1;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import kotlin.jvm.internal.a;
import xb.t$b;
import android.widget.ImageView$ScaleType;

public final class BottomBarShootView$bannerView$2 extends Lambda implements a	// class@000f3b
{
    public final Context $context;

    public void BottomBarShootView$bannerView$2(Context p0){
       this.$context = p0;
       super(0);
    }
    public final KwaiImageView invoke(){
       KwaiImageView obj = PatchProxy.apply(null, this, BottomBarShootView$bannerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiImageView(this.$context);
       obj.setId(R.id.camera_banner_btn);
       obj.setLayoutParams(new CustomLayout$a(a1.e(49.00f), a1.e(49.00f)));
       a hierarchy = obj.getHierarchy();
       a.o(hierarchy, "hierarchy");
       hierarchy.u(t$b.h);
       obj.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
