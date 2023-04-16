package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView$specialIconView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarShootView;
import android.content.Context;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import hn5.b0;
import com.yxcorp.gifshow.widget.CustomLayout;
import qsd.d;
import android.view.ViewGroup$LayoutParams;

public final class BottomBarShootView$specialIconView$2 extends Lambda implements a	// class@000f3c
{
    public final Context $context;
    public final BottomBarShootView this$0;

    public void BottomBarShootView$specialIconView$2(BottomBarShootView p0,Context p1){
       this.this$0 = p0;
       this.$context = p1;
       super(0);
    }
    public final CameraIconImageSwitcher invoke(){
       CameraIconImageSwitcher obj = PatchProxy.apply(null, this, BottomBarShootView$specialIconView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CameraIconImageSwitcher(this.$context);
       obj.setId(R.id.camera_magic_icon);
       b0 a = b0.a;
       obj.setLayoutParams(new CustomLayout$a(d.H0((a.a() * (float)this.this$0.f(43))), d.H0((a.a() * (float)this.this$0.f(43)))));
       obj.setClipChildren(false);
       obj.setClipToPadding(false);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
