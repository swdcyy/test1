package com.kuaishou.live.lite.bottombar.c;
import ok.h;
import com.kuaishou.live.lite.bottombar.f;
import java.lang.Object;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Map;
import com.kuaishou.live.lite.util.viewupdater.LiteTouchEventConsumeAwareLayout;
import android.widget.FrameLayout;
import i93.b;
import z1.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public final class c implements h	// class@001eb7
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       Context uContext = tb.D2();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiteTouchEventConsumeAwareLayout liteTouchEve = PatchProxy.applyTwoRefs(uContext, p0, tb, f.class, "14");
       if (liteTouchEve != patchProxyRe) {
       }else {
          liteTouchEve = LiteTouchEventConsumeAwareLayout.a(tb.p, p0.a(uContext));
          liteTouchEve.setClipChildren(false);
          liteTouchEve.setTouchEventConsumedListener(new b(tb, p0));
          LinearLayout$LayoutParams layoutParams = PatchProxy.applyOneRefs(liteTouchEve, tb, f.class, "16");
          if (layoutParams != patchProxyRe) {
          }else {
             ViewGroup$LayoutParams layoutParams2 = liteTouchEve.getLayoutParams();
             layoutParams = (layoutParams2 != null)? new LinearLayout$LayoutParams(layoutParams2): new LinearLayout$LayoutParams(-2, -1);
          }
          if (p0.i()) {
             layoutParams.weight = 0x3f800000;
             if (!PatchProxy.applyVoidOneRefs(liteTouchEve, tb, f.class, "15")) {
                ViewGroup$LayoutParams layoutParams1 = liteTouchEve.getLayoutParams();
                if (layoutParams1 == null) {
                   layoutParams1 = new FrameLayout$LayoutParams(-1, -1);
                }
                layoutParams1.width = -1;
                layoutParams1.height = -1;
                liteTouchEve.setLayoutParams(layoutParams1);
             }
          }
          liteTouchEve.setLayoutParams(layoutParams);
          liteTouchEve.setTag(R.id.lite_bottombar_view_bind_item, p0);
       }
       return liteTouchEve;
    }
}
