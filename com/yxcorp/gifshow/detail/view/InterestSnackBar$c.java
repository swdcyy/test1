package com.yxcorp.gifshow.detail.view.InterestSnackBar$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.detail.view.InterestSnackBar;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Float;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$b;

public final class InterestSnackBar$c extends GestureDetector$SimpleOnGestureListener	// class@001a44
{
    public final InterestSnackBar b;

    public void InterestSnackBar$c(InterestSnackBar p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestSnackBar$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return true;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(InterestSnackBar$c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, InterestSnackBar$c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "e1");
       a.p(p1, "e2");
       InterestSnackBar$c tb = this.b;
       if (tb.b == null && (- p3) - (float)tb.getTouchSlop() >= 0) {
          tb = this.b;
          tb.b = true;
          InterestSnackBar c = tb.c;
          if (c != null) {
             c.dismiss();
          }
       }
       return false;
    }
}
