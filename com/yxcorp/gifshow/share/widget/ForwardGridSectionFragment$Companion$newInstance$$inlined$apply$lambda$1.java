package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.util.DisplayMetrics;
import cw9.c;

public final class ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1 extends Lambda implements l	// class@001cbe
{
    public final GifshowActivity $activity$inlined;

    public void ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1(GifshowActivity p0){
       this.$activity$inlined = p0;
       super(1);
    }
    public final int invoke(int p0){
       Resources obj;
       if (PatchProxy.isSupport2(ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1.class, "1")) {
          obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.$activity$inlined.getResources();
       a.o(obj, "activity.resources");
       PatchProxy.onMethodExit(ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$1.class, "1");
       return (int)((this.$activity$inlined.getResources().getDimension(p0) - 0x3f000000) / c.c(obj).scaledDensity);
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0.intValue()));
    }
}
