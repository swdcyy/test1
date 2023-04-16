package com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.customview.widget.ViewDragHelper;
import a2.i0;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$d;

public class TopSheetBehavior$c implements Runnable	// class@0018fb
{
    public final View b;
    public final TopSheetBehavior c;

    public void TopSheetBehavior$c(TopSheetBehavior p0,View p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TopSheetBehavior$c.class, "1")) {
          return;
       }
       TopSheetBehavior b = this.c.b;
       if (b != null && b.continueSettling(true)) {
          i0.k0(this.b, this);
       }else {
          TopSheetBehavior$c tc = this.c;
          if (this.b.getTop() == (tc.c * -1)) {
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(objArray, tc, TopSheetBehavior.class, "4")) {
                b = tc.a;
                if (b != null) {
                   b.onStateChanged(2);
                }
             }
          }
       }
       return;
    }
}
