package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper$onPendantClickListener$1;
import java.util.LinkedHashSet;
import android.view.GestureDetector;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper$b;
import android.view.GestureDetector$OnGestureListener;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopRightPendantFlipperConfig;
import msd.a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.util.Objects;
import android.view.View;

public final class TempPlayPendantViewFlipper extends LiveCustomViewFlipper	// class@0016dc
{
    public List g;
    public a h;
    public final Set i;
    public final GestureDetector j;
    public HashMap k;
    public static final TempPlayPendantViewFlipper$a l;

    static {
       TempPlayPendantViewFlipper.l = new TempPlayPendantViewFlipper$a(null);
    }
    public void TempPlayPendantViewFlipper(Context p0){
       super(p0, null, 2, null);
    }
    public void TempPlayPendantViewFlipper(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.g = CollectionsKt__CollectionsKt.E();
       this.h = TempPlayPendantViewFlipper$onPendantClickListener$1.INSTANCE;
       this.i = new LinkedHashSet();
       this.j = new GestureDetector(this.getContext(), new TempPlayPendantViewFlipper$b(this));
       this.setFlipInterval(LiveTopRightPendantFlipperConfig.getFlipperIntervalInMs());
       this.setInAnimation(this.getContext(), R.anim.arg_RES_7f0100a7);
       this.setOutAnimation(this.getContext(), R.anim.arg_RES_7f0100a8);
    }
    public void TempPlayPendantViewFlipper(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public final a getOnPendantClickListener(){
       return this.h;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TempPlayPendantViewFlipper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       return this.j.onTouchEvent(p0);
    }
    public final void setOnPendantClickListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TempPlayPendantViewFlipper.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.h = p0;
       return;
    }
    public void startFlipping(){
       if (PatchProxy.applyVoid(null, this, TempPlayPendantViewFlipper.class, "7")) {
          return;
       }
       super.startFlipping();
       if (this.getParent() instanceof ViewGroup) {
          ViewParent parent = this.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.setClipChildren(true);
       }
       return;
    }
    public void stopFlipping(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TempPlayPendantViewFlipper.class, "8")) {
          return;
       }
       super.stopFlipping();
       if (!PatchProxy.applyVoid(objArray, this, TempPlayPendantViewFlipper.class, "10")) {
          int childCount = this.getChildCount();
          for (int i = 0; i < childCount; i = i + 1) {
             this.getChildAt(i).clearAnimation();
          }
       }
       if (this.getParent() instanceof ViewGroup) {
          ViewParent parent = this.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.setClipChildren(false);
       }
       return;
    }
}
