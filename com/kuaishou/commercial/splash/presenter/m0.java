package com.kuaishou.commercial.splash.presenter.m0;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.commercial.splash.presenter.n0;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import com.kuaishou.commercial.splash.presenter.h$a;
import java.lang.Float;
import java.lang.Math;
import lnc.y4;

public class m0 extends GestureDetector$SimpleOnGestureListener	// class@0015f9
{
    public final int b;
    public final n0 c;

    public void m0(n0 p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m0.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.c.X8(1);
       return 1;
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c.D = (int)p0.getX();
       this.c.E = (int)p0.getY();
       if (this.c.G.get() != null) {
          this.c.G.get().a((int)p0.getX(), (int)p0.getY());
       }
       return super.onDown(p0);
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "3")) {
          return;
       }
       this.c.X8(0);
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(m0.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, m0.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = (int)Math.abs(p2);
       int i1 = (int)Math.abs(p3);
       if (p0 != null && p1 != null) {
          m0 tb = this.b;
          if (i <= tb && (i1 <= tb && (Math.abs((p1.getX() - (float)this.c.D)) - (float)this.b > 0 || Math.abs((p1.getY() - (float)this.c.E)) - (float)this.b > 0))) {
             i = (int)Math.abs((p1.getX() - (float)this.c.D));
             i1 = (int)Math.abs((p1.getY() - (float)this.c.E));
          }
       label_0085 :
          if (y4.b(p0, p1, i, i1, this.b)) {
             this.c.X8(4);
          }else if(y4.c(p0, p1, i, i1, this.b)){
             this.c.X8(5);
          }else if(y4.d(p0, p1, i, i1, this.b)){
             this.c.X8(2);
          }else if(y4.a(p0, p1, i, i1, this.b)){
             this.c.X8(3);
          }
          if (this.c.G.get() != null) {
             this.c.G.get().onMove((int)p1.getX(), (int)p1.getY());
          }
       }
    label_00e1 :
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, m0.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.c.X8(0);
       return true;
    }
}
