package com.yxcorp.plugin.setting.widget.SlideSelector$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.plugin.setting.widget.SlideSelector;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.plugin.setting.widget.SlideSelector$e;
import java.lang.Float;
import java.lang.Math;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.view.ViewParent;
import com.yxcorp.plugin.setting.widget.SlideSelector$c;

public class SlideSelector$a extends GestureDetector$SimpleOnGestureListener	// class@00093c
{
    public final SlideSelector b;

    public void SlideSelector$a(SlideSelector p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       SlideSelector$a obj = PatchProxy.applyOneRefs(p0, this, SlideSelector$a.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       SlideSelector q = obj.Q;
       float x = p0.getX();
       float y = p0.getY();
       Objects.requireNonNull(q);
       if (PatchProxy.isSupport(SlideSelector$e.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(Float.valueOf(x), Float.valueOf(y), q, SlideSelector$e.class, str);
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(Math.sqrt((double)(((q.a - x) * (q.a - x)) + ((q.b - y) * (q.b - y)))) - (double)(q.c + q.e.getContext().getResources().getDimension(0x7f0702b8)) < 0){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_0040 ;
       }
       obj.R = b;
       this.b.getParent().requestDisallowInterceptTouchEvent(true);
       return super.onDown(p0);
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       SlideSelector$a obj;
       if (PatchProxy.isSupport(SlideSelector$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, SlideSelector$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b.getParent().requestDisallowInterceptTouchEvent(true);
       obj = this.b;
       if (obj.R != null) {
          this.b.b((obj.Q.b() - p2), false);
          this.b.postInvalidate();
          return true;
       }else {
          return super.onScroll(p0, p1, p2, p3);
       }
    }
    public boolean onSingleTapUp(MotionEvent p0){
       SlideSelector obj = PatchProxy.applyOneRefs(p0, this, SlideSelector$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.O;
       float x = p0.getX();
       SlideSelector$c c = obj.c;
       if (x - c <= 0) {
          c = obj.a;
          if (x - c >= 0) {
          label_002a :
             this.b.a((x - obj.a), true);
             return true;
          }
       }
       x = c;
       goto label_002a ;
    }
}
