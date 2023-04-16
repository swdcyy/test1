package com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper$a;
import java.lang.Runnable;
import android.widget.TextView;
import java.util.List;
import android.widget.ViewFlipper;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.Iterator;
import wn1.f;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper$updateFlipperContainer$task$1;
import wn1.c;
import msd.a;
import k51.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import n51.a;
import k51.b;
import java.util.Set;
import android.view.animation.Animation;
import wn1.d;
import android.view.animation.Animation$AnimationListener;
import android.widget.ViewAnimator;
import wn1.e;
import java.lang.Integer;

public final class LiveMarqueeTextFlipper extends LiveCustomViewFlipper	// class@001427
{
    public e g;
    public long h;
    public int i;
    public ShootMarqueeView j;
    public long k;
    public a l;
    public final Set m;
    public final int n;
    public HashMap o;

    public void LiveMarqueeTextFlipper(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.h = 500;
       this.i = 1;
       this.k = 500;
       this.m = new LinkedHashSet();
       this.n = 30;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveMarqueeTextFlipper.class, "3")) {
          return;
       }
       LiveMarqueeTextFlipper tj = this.j;
       if (tj != null) {
          tj.postDelayed(new LiveMarqueeTextFlipper$a(this), this.k);
       }
       return;
    }
    public final void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMarqueeTextFlipper.class, "1")) {
          return;
       }
       a.p(p0, "dataList");
       this.removeAllViews();
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMarqueeTextFlipper.class, "10")) {
          Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
          uBooleanRef.element = true;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             c uoc = new c(new LiveMarqueeTextFlipper$updateFlipperContainer$task$1(this, iterator.next(), uBooleanRef));
             Object obj = PatchProxy.apply(null, null, a.class, "11");
             boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiveHotSpotJankOpt", false);
             Object obj1 = b.c("LiveMarqueeTextFlipper::updateMarqueeView", uoc, b, this.l, null);
             if (obj1 != null) {
                this.m.add(obj1);
             }
          }
          this.getInAnimation().setAnimationListener(new d(this));
       }
       return;
    }
    public void setInAnimation(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMarqueeTextFlipper.class, "8")) {
          return;
       }
       super.setInAnimation(p0);
       return;
    }
    public final void setLivePlayMainThreadTasksService(a p0){
       this.l = p0;
    }
    public final void setMarqueeNum(int p0){
       this.i = p0;
    }
    public final void setMarqueeTextClickListener(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMarqueeTextFlipper.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.g = p0;
       return;
    }
    public void setOutAnimation(Context p0,int p1){
       if (PatchProxy.isSupport(LiveMarqueeTextFlipper.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveMarqueeTextFlipper.class, "9")) {
          return;
       }
       super.setOutAnimation(p0, p1);
       return;
    }
    public final void setStartScrollTimeMills(long p0){
       this.k = p0;
    }
    public final void setWaitScrollTimeMills(long p0){
       this.h = p0;
    }
}
