package com.tachikoma.core.component.e$d;
import android.view.GestureDetector$OnGestureListener;
import com.tachikoma.core.component.e;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wo8.i;
import sp8.b$a;
import java.lang.Float;
import wo8.m;
import wo8.k;
import wo8.l;
import wo8.j;

public class e$d implements GestureDetector$OnGestureListener	// class@000d6b
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.dispatchEvent("down", new i(this, p0));
       return true;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(e$d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, e$d.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       m om = new m(this, p0, p1, p2, p3);
       this.b.dispatchEvent("swipe", v7);
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "4")) {
          return;
       }
       this.b.dispatchEvent("longPress", new k(this, p0));
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(e$d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, e$d.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b.dispatchEvent("pan", new l(this, p0, p1));
       return true;
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.dispatchEvent("tap", new j(this, p0));
       return false;
    }
}
