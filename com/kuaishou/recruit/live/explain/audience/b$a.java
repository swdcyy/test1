package com.kuaishou.recruit.live.explain.audience.b$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.recruit.live.explain.audience.b;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Runnable;
import ekd.k1;
import lq5.a;
import kt4.d;
import android.view.View;
import android.view.View$OnClickListener;
import tyc.q0;

public class b$a extends GestureDetector$SimpleOnGestureListener	// class@000ec1
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       b$a obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.e != null) {
          obj.l = false;
          k1.m(obj.n);
          k1.r(this.b.n, 1000);
          this.b.e.A(p0);
       }
       return super.onDoubleTap(p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       b$a obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.l != null) {
          obj.q.a(null, new d(this));
       }
       return super.onSingleTapConfirmed(p0);
    }
}
