package com.kwai.framework.krn.init.view.DebugOverlayController$d;
import java.lang.Runnable;
import com.kwai.framework.krn.init.view.DebugOverlayController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.SpannableStringBuilder;
import com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow;

public class DebugOverlayController$d implements Runnable	// class@001618
{
    public final DebugOverlayController b;

    public void DebugOverlayController$d(DebugOverlayController p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, DebugOverlayController$d.class, "1")) {
          return;
       }
       DebugOverlayController$d tb = this.b;
       DebugOverlayController mDebugViewCo = tb.mDebugViewContainer;
       if (mDebugViewCo != null) {
          mDebugViewCo.b(tb.mSpannableStringBuilder);
       }
       return;
    }
}
