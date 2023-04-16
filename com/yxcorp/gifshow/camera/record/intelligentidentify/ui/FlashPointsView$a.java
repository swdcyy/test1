package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;

public class FlashPointsView$a implements Runnable	// class@000e03
{
    public final FlashPointsView b;

    public void FlashPointsView$a(FlashPointsView p0){
       this.b = p0;
       super();
    }
    public void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FlashPointsView$a.class, "1")) {
          return;
       }
       this.b.invalidate();
       FlashPointsView$a tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, FlashPointsView.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.g - null > 0 && (System.currentTimeMillis() - tb.g) - (long)FlashPointsView.j > 0){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          this.b.postDelayed(this, 20);
       }
       return;
    }
}
