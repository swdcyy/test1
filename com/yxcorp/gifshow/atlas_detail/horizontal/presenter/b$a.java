package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b$a;
import vd5.c;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import e1a.e;
import android.os.SystemClock;
import vd5.b;
import android.view.ViewConfiguration;
import java.lang.Float;

public class b$a implements c	// class@001bbf
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       b obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          int i = 0;
          if (p0 != null) {
             obj1 = obj.F;
             Objects.requireNonNull(obj1);
             if (obj1.a(i)) {
                obj1 = obj.F;
                Objects.requireNonNull(obj1);
                obj1.c(i, true);
                obj.G = i;
                i = p0.getActionIndex();
                obj.z = SystemClock.elapsedRealtime();
                obj.o0(p0.getX(i), p0.getY(i));
                obj.A = true;
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
    public void onLongPress(MotionEvent p0){
       b.a(this, p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       return b.b(this, p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       boolean b2;
       b$a obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       b uob = b.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uob, "7");
       b = false;
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          boolean b1 = true;
          if (p0.getAction() == b1) {
             obj1 = PatchProxy.applyOneRefs(p0, obj, uob, "9");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                int actionIndex = p0.getActionIndex();
                Object obj2 = PatchProxy.apply(null, obj, uob, "8");
                if (obj2 != PatchProxyResult.class) {
                   b1 = obj2.booleanValue();
                }else if((SystemClock.elapsedRealtime() - obj.z) - (long)ViewConfiguration.getJumpTapTimeout() < 0){
                   b1 = false;
                }
                if (b1 && obj.A == null) {
                   float x = p0.getX(actionIndex);
                   float y = p0.getY(actionIndex);
                   if (PatchProxy.isSupport(uob)) {
                      Object obj3 = PatchProxy.applyTwoRefs(Float.valueOf(x), Float.valueOf(y), obj, uob, "10");
                      if (obj3 != PatchProxyResult.class) {
                         b2 = obj3.booleanValue();
                      label_009e :
                         b = b2;
                      }
                   }
                   obj.z = SystemClock.elapsedRealtime();
                   b2 = obj.o0(x, y);
                   goto label_009e ;
                }else {
                   obj.A = b;
                }
             }
          }
       }
       return b;
    }
}
