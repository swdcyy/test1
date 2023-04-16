package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Number;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.app.Activity;
import kotlin.jvm.internal.a;

public final class ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2 extends Lambda implements l	// class@001cbf
{
    public final GifshowActivity $activity$inlined;

    public void ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2(GifshowActivity p0){
       this.$activity$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
    public final String invoke(int p0){
       if (PatchProxy.isSupport2(ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2.class, "1")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = this.$activity$inlined.getResources().getString(p0);
       a.o(str, "activity.resources.getString\(resId\)");
       PatchProxy.onMethodExit(ForwardGridSectionFragment$Companion$newInstance$$inlined$apply$lambda$2.class, "1");
       return str;
    }
}
