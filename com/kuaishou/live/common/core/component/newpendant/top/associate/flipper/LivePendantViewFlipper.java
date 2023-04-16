package com.kuaishou.live.common.core.component.newpendant.top.associate.flipper.LivePendantViewFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.List;
import av1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import android.widget.ViewFlipper;
import java.util.Iterator;
import ks5.b;
import android.view.View;
import ks5.e;
import android.view.ViewParent;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;

public class LivePendantViewFlipper extends LiveCustomViewFlipper	// class@0016c8
{
    public final ArrayList g;
    public b h;
    public boolean i;

    public void LivePendantViewFlipper(Context p0){
       super(p0);
       this.g = new ArrayList();
    }
    public void LivePendantViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new ArrayList();
    }
    public void d(ViewGroup p0,List p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LivePendantViewFlipper.class, "2")) {
          return;
       }
       this.h = p2;
       if (!q.f(p1)) {
          this.g.clear();
          this.g.addAll(p1);
          this.removeAllViews();
          this.f();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next().b(p0);
             if (view.getParent() != null) {
                view.getParent().removeView(view);
             }
             this.addView(view);
          }
          if (this.i != null) {
             this.e();
          }
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LivePendantViewFlipper.class, "7")) {
          return;
       }
       if (!this.isFlipping()) {
          this.startFlipping();
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, LivePendantViewFlipper.class, "8")) {
          return;
       }
       if (this.isFlipping()) {
          this.stopFlipping();
       }
       return;
    }
    public final b getCurrentPendantItem(){
       Object obj = PatchProxy.apply(null, this, LivePendantViewFlipper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.get(this.getDisplayedChild());
    }
    public void showNext(){
       if (PatchProxy.applyVoid(null, this, LivePendantViewFlipper.class, "1")) {
          return;
       }
       this.getCurrentPendantItem().D();
       super.showNext();
       this.getCurrentPendantItem().onShow();
       return;
    }
}
