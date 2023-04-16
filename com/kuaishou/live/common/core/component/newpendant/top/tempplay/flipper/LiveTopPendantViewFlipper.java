package com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.view.GestureDetector;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper$a;
import android.view.GestureDetector$OnGestureListener;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopRightPendantFlipperConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import ks5.m;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import android.view.ViewParent;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.Ordering;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.b;
import ok.h;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.a;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class LiveTopPendantViewFlipper extends LiveCustomViewFlipper	// class@0016cd
{
    public final ArrayList g;
    public boolean h;
    public ClientContent$LiveStreamPackage i;
    public final GestureDetector j;

    public void LiveTopPendantViewFlipper(Context p0){
       super(p0, null);
    }
    public void LiveTopPendantViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new ArrayList();
       this.h = false;
       this.j = new GestureDetector(this.getContext(), new LiveTopPendantViewFlipper$a(this));
       this.setFlipInterval(LiveTopRightPendantFlipperConfig.getFlipperIntervalInMs());
       this.setInAnimation(this.getContext(), R.anim.arg_RES_7f0100a7);
       this.setOutAnimation(this.getContext(), R.anim.arg_RES_7f0100a8);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveTopPendantViewFlipper.class, "3")) {
          return;
       }
       if (this.g.size() > 1) {
          this.startFlipping();
       }else {
          this.stopFlipping();
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveTopPendantViewFlipper.class, "8")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       this.removeAllViews();
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next().b(this);
          if (view == null) {
             continue ;
          }else if(view.getParent() instanceof ViewGroup){
             view.getParent().removeView(view);
          }
          int i = 0;
          b.e(view, i, i);
          view.setAlpha(0x3f800000);
          view.setScaleX(0x3f800000);
          view.setScaleY(0x3f800000);
          view.setVisibility(i);
          this.addView(view);
       }
       return;
    }
    public final m getCurrentPendantItem(){
       Object obj = PatchProxy.apply(null, this, LiveTopPendantViewFlipper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.get(this.getDisplayedChild());
    }
    public m getHighestPriorityItem(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveTopPendantViewFlipper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g.isEmpty()) {
          return objArray;
       }
       if (this.g.size() < 3) {
          return Ordering.natural().onResultOf(b.b).max(this.g);
       }
       return Ordering.natural().onResultOf(a.b).min(this.g);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTopPendantViewFlipper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.onTouchEvent(p0);
    }
    public void setLiveStreamPackage(ClientContent$LiveStreamPackage p0){
       this.i = p0;
    }
    public void startFlipping(){
       if (PatchProxy.applyVoid(null, this, LiveTopPendantViewFlipper.class, "13")) {
          return;
       }
       super.startFlipping();
       if (this.getParent() instanceof ViewGroup) {
          this.getParent().setClipChildren(true);
       }
       return;
    }
    public void stopFlipping(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveTopPendantViewFlipper.class, "14")) {
          return;
       }
       super.stopFlipping();
       if (!PatchProxy.applyVoid(objArray, this, LiveTopPendantViewFlipper.class, "10")) {
          for (int i = 0; i < this.getChildCount(); i = i + 1) {
             this.getChildAt(i).clearAnimation();
          }
       }
       if (this.getParent() instanceof ViewGroup) {
          this.getParent().setClipChildren(false);
       }
       return;
    }
}
