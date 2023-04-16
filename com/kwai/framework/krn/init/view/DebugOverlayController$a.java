package com.kwai.framework.krn.init.view.DebugOverlayController$a;
import java.lang.Runnable;
import com.kwai.framework.krn.init.view.DebugOverlayController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import cb.a;
import com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow;
import android.view.WindowManager$LayoutParams;
import d96.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import a2.i0;

public class DebugOverlayController$a implements Runnable	// class@001615
{
    public final boolean b;
    public final DebugOverlayController c;

    public void DebugOverlayController$a(DebugOverlayController p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DebugOverlayController$a.class, "1")) {
          return;
       }
       DebugOverlayController$a tb = this.b;
       if (tb != null) {
          DebugOverlayController$a tc = this.c;
          if (tc.mDebugViewContainer == null) {
             if (!DebugOverlayController.permissionCheck(tc.mContext)) {
                a.a("ReactNative", "Wait for overlay permission to be set");
                DebugOverlayController.requestPermission(this.c.mContext);
                return;
             }else {
                this.c.mDebugViewContainer = new KRNNetworkOptimizerDebugWindow(this.c.mContext);
                WindowManager$LayoutParams layoutParams = new WindowManager$LayoutParams(-1, -1, a.b, 0x40020, -3);
                DebugOverlayController$a tc1 = this.c;
                tc1.mWindowManager.addView(tc1.mDebugViewContainer, tb);
                tb = this.c;
                DebugOverlayController mDebugViewCo = tb.mDebugViewContainer;
                if (mDebugViewCo != null) {
                   mDebugViewCo.b(tb.mSpannableStringBuilder);
                }
             }
          }else if(tb == null){
             DebugOverlayController mDebugViewCo1 = this.c.mDebugViewContainer;
             if (mDebugViewCo1 != null) {
                mDebugViewCo1.removeAllViews();
                if (i0.X(this.c.mDebugViewContainer)) {
                   tb = this.c;
                   tb.mWindowManager.removeView(tb.mDebugViewContainer);
                }
                this.c.mDebugViewContainer = objArray;
             }
          }
       }else {
          goto label_005d ;
       }
       return;
    }
}
