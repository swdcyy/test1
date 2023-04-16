package com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView$b;
import java.lang.Runnable;
import java.lang.Math;
import android.graphics.Point;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView$a;

public final class LocalLifeHalfContainerView extends FrameLayout	// class@00149a
{
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public LocalLifeHalfContainerView$a f;
    public HashMap g;

    public void LocalLifeHalfContainerView(Context p0){
       super(p0, null);
    }
    public void LocalLifeHalfContainerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       ViewConfiguration viewConfigur;
       Integer obj = PatchProxy.applyOneRefs(p0, this, LocalLifeHalfContainerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null) {
          return super.dispatchTouchEvent(p0);
       }
       obj = (p0 != null)? Integer.valueOf(p0.getAction()): null;
       if (obj != null && !obj.intValue()) {
          this.d = p0.getY();
          this.e = p0.getX();
       }else {
          LocalLifeHalfContainerView localLifeHal = 2;
          String str = "ViewConfiguration.get\(context\)";
          float f = Float.MIN_VALUE;
          if (obj != null && obj.intValue() == localLifeHal) {
             if (this.c != null) {
                viewConfigur = ViewConfiguration.get(this.getContext());
                a.o(viewConfigur, str);
                if ((p0.getY() - this.d) - (float)viewConfigur.getScaledTouchSlop() > 0) {
                   int childCount = this.getChildCount();
                   int i = 0;
                   View view = -1;
                   int i1 = 0;
                   int i2 = -1;
                   while (i1 < childCount) {
                      View childAt = this.getChildAt(i1);
                      a.o(childAt, "getChildAt\(i\)");
                      if (childAt.getId() == 0x7f0a0fe6) {
                         i2 = i1;
                      }
                      i1 = i1 + 1;
                   }
                   if (i2 > view) {
                      childCount = this.getChildCount();
                      while (i < childCount) {
                         if (i != i2) {
                            this.getChildAt(i).animate().translationY((float)this.getHeight()).setDuration(20).withEndAction(new LocalLifeHalfContainerView$b(this, i)).start();
                         }
                         i = i + 1;
                      }
                      this.b = f;
                   }
                }
             }
          }else if(obj != null && obj.intValue() == f){
             viewConfigur = ViewConfiguration.get(this.getContext());
             a.o(viewConfigur, str);
             if (Math.abs((p0.getY() - this.d)) - (float)viewConfigur.getScaledTouchSlop() < 0) {
                viewConfigur = ViewConfiguration.get(this.getContext());
                a.o(viewConfigur, str);
                if (Math.abs((p0.getX() - this.e)) - (float)viewConfigur.getScaledTouchSlop() < 0) {
                   LocalLifeHalfContainerView tf = this.f;
                   if (tf != null) {
                      tf.a(this, new Point((int)p0.getX(), (int)p0.getY()));
                   }
                }
             }
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public final void setOnCustomClickListener(LocalLifeHalfContainerView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeHalfContainerView.class, "1")) {
          return;
       }
       a.p(p0, "onCustomClickListener");
       this.f = p0;
       return;
    }
    public final void setRnViewReady(boolean p0){
       this.c = p0;
    }
}
