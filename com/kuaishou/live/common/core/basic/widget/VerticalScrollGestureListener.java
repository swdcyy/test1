package com.kuaishou.live.common.core.basic.widget.VerticalScrollGestureListener;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.content.Context;
import com.kuaishou.live.common.core.basic.widget.VerticalScrollGestureListener$ScrollingMode;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;

public abstract class VerticalScrollGestureListener extends GestureDetector$SimpleOnGestureListener	// class@000f37
{
    public final ViewConfiguration b;
    public VerticalScrollGestureListener$ScrollingMode c;

    public void VerticalScrollGestureListener(Context p0){
       super();
       this.c = VerticalScrollGestureListener$ScrollingMode.NONE;
       this.b = ViewConfiguration.get(p0);
    }
    public abstract void a(MotionEvent p0,MotionEvent p1,float p2,float p3,float p4,float p5);
    public abstract void b(MotionEvent p0,MotionEvent p1,float p2,float p3,float p4,float p5);
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VerticalScrollGestureListener.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c = VerticalScrollGestureListener$ScrollingMode.NONE;
       return super.onDown(p0);
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       Object[] objArray1;
       if (PatchProxy.isSupport(VerticalScrollGestureListener.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, VerticalScrollGestureListener.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 != null && p1 != null) {
          Object[] objArray = new Object[b];
          String str = "VerticalScrollGestureListener";
          a.C().s(str, "onScroll "+p2+" / "+p3, objArray);
          int scaledTouchS = this.b.getScaledTouchSlop();
          float f = p1.getX() - p0.getX();
          float f1 = p1.getY() - p0.getY();
          if (this.c == VerticalScrollGestureListener$ScrollingMode.NONE) {
             float f2 = (float)scaledTouchS;
             if (Math.abs(f) - f2 < 0 && Math.abs(f1) - f2 > 0) {
                this.c = VerticalScrollGestureListener$ScrollingMode.VERTICAL;
                objArray1 = new Object[b];
                a.C().s(str, "vertical scroll "+f1, objArray1);
             }else if(Math.abs(f) - f2 > 0 && Math.abs(f1) - f2 < 0){
                this.c = VerticalScrollGestureListener$ScrollingMode.HORIZONTAL;
                objArray1 = new Object[b];
                a.C().s(str, "horizontal scroll "+f1, objArray1);
             }
          }
          VerticalScrollGestureListener tc = this.c;
          if (tc == VerticalScrollGestureListener$ScrollingMode.VERTICAL) {
             this.b(p0, p1, p2, p3, f, f1);
             return true;
          }else if(tc == VerticalScrollGestureListener$ScrollingMode.HORIZONTAL){
             this.a(p0, p1, p2, p3, f, f1);
             return true;
          }
       }
    label_00ee :
       return b;
    }
}
