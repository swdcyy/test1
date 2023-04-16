package com.yxcorp.gifshow.detail.slideplay.NestedChildRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import com.yxcorp.gifshow.detail.slideplay.NestedChildRelativeLayout$a;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import a2.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.MotionEvent;
import java.lang.Boolean;

public class NestedChildRelativeLayout extends RelativeLayout	// class@001707
{
    public int b;
    public final int[] c;
    public boolean d;
    public GestureDetector e;

    public void NestedChildRelativeLayout(Context p0){
       super(p0, null, 0);
    }
    public void NestedChildRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedChildRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[2];
       this.c = ointArray;
       this.e = new GestureDetector(p0, new NestedChildRelativeLayout$a(this));
    }
    public final x a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedChildRelativeLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.getParent() == null) {
          return null;
       }
       if (p0.getParent() instanceof x) {
          return p0.getParent();
       }
       return this.a(p0.getParent());
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedChildRelativeLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return super.onTouchEvent(p0);
       }
       this.e.onTouchEvent(p0);
       int i = (int)p0.getRawY();
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked != 5) {
                   if (actionMasked == 6) {
                   label_0055 :
                      if (!p0.getPointerId(p0.getActionIndex())) {
                         this.d = false;
                         if (this.a(this) != null) {
                            this.a(this).onStopNestedScroll(this);
                         }
                      }
                   }
                }else if(!p0.getPointerId(p0.getActionIndex())){
                   this.d = true;
                   this.b = i;
                }
             }else if(this.d != null){
                int i1 = this.b - i;
                if (this.a(this) != null) {
                   this.a(this).onNestedPreScroll(this, false, i1, this.c);
                }
                this.b = i;
             }
          }else {
             goto label_0055 ;
          }
       }else {
          goto label_006f ;
       }
    label_007d :
       return true;
    }
}
