package com.kwai.component.tti.monitor.a$a$a;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.component.tti.monitor.a$a;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tti.monitor.a;
import android.os.SystemClock;
import com.kwai.component.tti.monitor.TTIData;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a$a$a implements GestureDetector$OnGestureListener	// class@000bcd
{
    public final a$a b;

    public void a$a$a(a$a p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       return false;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "3")) {
          return;
       }
       this.b.b.j.addEvent(2, SystemClock.elapsedRealtime());
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(a$a$a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, a$a$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       this.b.b.j.addEvent(3, SystemClock.uptimeMillis());
       return false;
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a$a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.b.j.addEvent(1, SystemClock.uptimeMillis());
       return false;
    }
}
