package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$a$a;
import java.lang.Runnable;
import kotlin.jvm.internal.Ref$IntRef;
import android.view.View;
import f14.g;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import java.util.Map;

public final class BottomBubbleMountDelegate$a$a implements Runnable	// class@00169e
{
    public final Ref$IntRef b;
    public final View c;
    public final Ref$IntRef d;
    public final g e;
    public final int f;
    public final PendantMountInfo g;
    public final String h;

    public void BottomBubbleMountDelegate$a$a(Ref$IntRef p0,View p1,Ref$IntRef p2,g p3,int p4,PendantMountInfo p5,String p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BottomBubbleMountDelegate$a$a.class, "1")) {
          return;
       }
       try{
          BottomBubbleMountDelegate$a$a tb = this.b;
          if (tb.element <= null) {
             tb.element = this.c.getMeasuredWidth();
          }
          tb = this.d;
          if (tb.element <= null) {
             tb.element = this.c.getMeasuredHeight();
          }
          this.e.t(this.b.element, (this.f + this.d.element), this.c.getMeasuredWidth(), this.c.getMeasuredHeight(), null);
       }catch(java.lang.Exception e0){
          f$a.s(f.a, this.g.getLiveId(), this.h, "Bubble onLayoutChange error", e0, null, 16, null);
       }
       return;
    }
}
