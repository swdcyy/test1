package com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession$c;
import ekd.f$i;
import s19.a;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession;
import kotlin.jvm.internal.Ref$IntRef;
import msd.a;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;
import java.lang.StringBuilder;
import yx.j0;

public final class ScreenCleanSession$c extends f$i	// class@0016ed
{
    public final a b;
    public final ScreenCleanSession c;
    public final boolean d;
    public final Ref$IntRef e;
    public final a f;

    public void ScreenCleanSession$c(a p0,ScreenCleanSession p1,boolean p2,Ref$IntRef p3,a p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ScreenCleanSession$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       ScreenCleanSession$c te = this.e;
       te.element = te.element + 1;
       this.b.a().setVisibility(this.b.b());
       if (this.e.element == this.c.b.size()) {
          this.c.h(ScreenCleanSessionState.ResumeDone);
          this.c.b.clear();
          this.f.invoke();
       }
       Object[] objArray = new Object[0];
       j0.a("ScreenCleanManager", "resumeScreen:"+this.e.element+" _ "+this.c.f(), objArray);
       PatchProxy.onMethodExit(ScreenCleanSession$c.class, "1");
       return;
    }
}
