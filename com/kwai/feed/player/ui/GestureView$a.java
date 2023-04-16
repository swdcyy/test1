package com.kwai.feed.player.ui.GestureView$a;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.feed.player.ui.GestureView;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.View;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import com.kwai.feed.player.ui.GestureView$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;

public class GestureView$a implements GestureDetector$OnGestureListener	// class@0014a7
{
    public final GestureView b;

    public void GestureView$a(GestureView p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView$a.class, "2")) {
          return;
       }
       this.b.e("onLongPress");
       this.b.getParent().requestDisallowInterceptTouchEvent(true);
       GestureView$a tb = this.b;
       tb.e = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, GestureView.class, "17")) {
          tb.e("dispatchLongPress");
          GestureView l = tb.l;
          if (l != null) {
             Iterator iterator = l.iterator();
             while (iterator.hasNext()) {
                iterator.next().onLongPress(p0);
             }
          }
       }
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GestureView$a obj = PatchProxy.applyOneRefs(p0, this, GestureView$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.b.e("onSingleTapUp");
       obj = this.b;
       Objects.requireNonNull(obj);
       GestureView$a obj1 = PatchProxy.apply(null, obj, GestureView.class, "14");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          GestureView k = obj.k;
          b = (k != null && !k.isEmpty())? true: false;
       }
       if (!b) {
          GestureView$a tb = this.b;
          tb.c = 0;
          tb.d(p0, 0);
       }else if(this.b.m != null){
          obj1 = this.b;
          if ((SystemClock.elapsedRealtime() - obj1.n) - (long)GestureView.s <= 0) {
             obj1.o = true;
             b = obj1.c + true;
             obj1.c = b;
             obj1.b(p0, true, b);
          }else {
             obj1.o = false;
          }
       }
       return true;
    }
}
