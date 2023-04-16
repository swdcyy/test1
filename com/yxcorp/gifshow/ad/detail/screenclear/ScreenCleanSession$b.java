package com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession$b;
import ekd.f$i;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession;
import kotlin.jvm.internal.Ref$IntRef;
import msd.a;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;
import java.lang.StringBuilder;
import yx.j0;

public final class ScreenCleanSession$b extends f$i	// class@0016ec
{
    public final View b;
    public final ScreenCleanSession c;
    public final boolean d;
    public final Ref$IntRef e;
    public final int f;
    public final a g;

    public void ScreenCleanSession$b(View p0,ScreenCleanSession p1,boolean p2,Ref$IntRef p3,int p4,a p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ScreenCleanSession$b.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       ScreenCleanSession$b te = this.e;
       te.element = te.element + 1;
       this.b.setVisibility(this.f);
       if (this.e.element == this.c.a.size()) {
          this.c.h(ScreenCleanSessionState.CleanDone);
          this.g.invoke();
       }
       Object[] objArray = new Object[0];
       j0.a("ScreenCleanManager", "clearScreen:"+this.e.element+" _ "+this.c.f(), objArray);
       PatchProxy.onMethodExit(ScreenCleanSession$b.class, "1");
       return;
    }
}
