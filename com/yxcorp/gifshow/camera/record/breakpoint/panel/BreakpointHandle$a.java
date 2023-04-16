package com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointHandle$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointHandle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

public class BreakpointHandle$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000db2
{
    public final BreakpointHandle b;

    public void BreakpointHandle$a(BreakpointHandle p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, BreakpointHandle$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.a();
       return;
    }
}
