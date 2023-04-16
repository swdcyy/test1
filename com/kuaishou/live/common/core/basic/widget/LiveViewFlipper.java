package com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.widget.ViewFlipper;
import android.content.Context;
import java.util.HashSet;
import android.util.AttributeSet;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Iterator;
import android.view.View;
import android.widget.ViewAnimator;

public class LiveViewFlipper extends ViewFlipper	// class@000f2a
{
    public Set b;
    public long c;

    public void LiveViewFlipper(Context p0){
       super(p0);
       this.b = new HashSet();
       this.c = 0;
    }
    public void LiveViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new HashSet();
       this.c = 0;
    }
    public void a(LiveViewFlipper$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewFlipper.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void b(LiveViewFlipper$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewFlipper.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveViewFlipper.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.c = this.c + 1;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveViewFlipper.class, "2")) {
          return;
       }
       this.c = this.c - 1;
       super.onDetachedFromWindow();
       return;
    }
    public void showNext(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, LiveViewFlipper.class, "3")) {
          return;
       }
       int i = this.getDisplayedChild() + 1;
       if (i >= this.getChildCount()) {
          i = 0;
       }else if(i < 0){
          i = this.getChildCount() - 1;
       }
       if (!this.b.isEmpty()) {
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(this.getChildAt(i), i);
          }
       }
       super.showNext();
       if (!this.b.isEmpty()) {
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.getChildAt(i), i);
          }
       }
       return;
    }
}
