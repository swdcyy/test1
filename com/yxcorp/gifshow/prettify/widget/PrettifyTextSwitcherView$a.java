package com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;

public class PrettifyTextSwitcherView$a implements Runnable	// class@0011dc
{
    public final PrettifyTextSwitcherView b;

    public void PrettifyTextSwitcherView$a(PrettifyTextSwitcherView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, PrettifyTextSwitcherView$a.class, "1")) {
          return;
       }
       if (this.b.h.isRunning()) {
          this.b.h.cancel();
       }
       if (!this.b.i.isRunning()) {
          this.b.i.start();
       }
       return;
    }
}
