package com.kwai.framework.krn.init.view.DebugOverlayController$c;
import java.lang.Runnable;
import com.kwai.framework.krn.init.view.DebugOverlayController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.SpannableStringBuilder;
import com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow;

public class DebugOverlayController$c implements Runnable	// class@001617
{
    public final DebugOverlayController b;

    public void DebugOverlayController$c(DebugOverlayController p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, DebugOverlayController$c.class, "1")) {
          return;
       }
       DebugOverlayController$c tb = this.b;
       DebugOverlayController mDebugViewCo = tb.mDebugViewContainer;
       if (mDebugViewCo != null) {
          mDebugViewCo.b(tb.mSpannableStringBuilder);
       }
       return;
    }
}
