package com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$2;
import android.widget.LinearLayout;
import com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate;
import android.content.Context;
import android.view.View;
import android.view.GestureDetector;
import com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$2$a;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class VisitorHomeRootDelegate$2 extends LinearLayout	// class@0015d9
{
    public boolean b;
    public float c;
    public float d;
    public final GestureDetector e;
    public final View f;
    public final VisitorHomeRootDelegate g;

    public void VisitorHomeRootDelegate$2(VisitorHomeRootDelegate p0,Context p1,View p2){
       this.g = p0;
       this.f = p2;
       super(p1);
       this.b = false;
       this.e = new GestureDetector(p2.getContext(), new VisitorHomeRootDelegate$2$a(this));
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VisitorHomeRootDelegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!p0.getAction()) {
          this.b = false;
          this.c = p0.getX();
          this.d = p0.getY();
       }else if(p0.getAction() == 2 && Math.abs((p0.getX() - this.c)) - Math.abs((p0.getY() - this.d)) > 0){
          return b;
       }
       if (!this.e.onTouchEvent(p0) && this.b == null) {
          b = false;
       }
       return b;
    }
}
