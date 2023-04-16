package com.kuaishou.live.common.core.component.highfrequency.textdescription.f;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.f$a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler;
import java.lang.Math;
import android.widget.ProgressBar;
import an1.c;
import z1.a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.animation.ObjectAnimator;

public class f extends HighFluencyDescriptionBinder	// class@001349
{
    public ProgressBar b;
    public HighFluencyAnimHandler c;
    public ObjectAnimator d;
    public static final Property e;

    static {
       f.e = new f$a(Integer.class, "progress");
    }
    public void f(){
       super();
    }
    public void d(HighFrequencyActionGuide$TextDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       f tc = this.c;
       if (tc != null) {
          tc.c();
       }
       this.b.setMax(Math.max(p0.endCount, p0.startCount));
       this.b.setProgress(p0.startCount);
       HighFluencyAnimHandler highFluencyA = new HighFluencyAnimHandler(p0, new c(this));
       this.c = highFluencyA;
       highFluencyA.b();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       f tc = this.c;
       if (tc != null) {
          tc.c();
       }
       this.h();
       return;
    }
    public void g(Context p0,ViewGroup p1,HighFrequencyActionGuide$TextDescription p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "1")) {
          return;
       }
       this.b = a.a(p0, 0x7f0d0c10);
       p1.addView(this.b, new ViewGroup$LayoutParams(-1, a1.e(8.00f)));
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f td = this.d;
       if (td != null && td.isRunning()) {
          this.d.cancel();
       }
       return;
    }
}
