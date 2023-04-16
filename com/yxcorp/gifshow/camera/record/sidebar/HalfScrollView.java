package com.yxcorp.gifshow.camera.record.sidebar.HalfScrollView;
import android.widget.ScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.sidebar.HalfScrollView$a;

public class HalfScrollView extends ScrollView	// class@000f0c
{
    public int b;
    public boolean c;
    public boolean d;
    public HalfScrollView$a e;
    public boolean f;

    public void HalfScrollView(Context p0){
       super(p0);
       this.c = true;
    }
    public void HalfScrollView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = true;
    }
    public void HalfScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = true;
    }
    public void a(boolean p0){
       this.f = p0;
    }
    public void onMeasure(int p0,int p1){
       HalfScrollView obj;
       if (PatchProxy.isSupport(HalfScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HalfScrollView.class, "1")) {
          return;
       }
       if (this.c == null) {
          obj = this.b;
       }
       p1 = View$MeasureSpec.makeMeasureSpec(p1, Integer.MIN_VALUE);
       super.onMeasure(p0, p1);
       if (this.c != null) {
          p0 = this.getMeasuredWidth();
          obj = PatchProxy.apply(null, this, HalfScrollView.class, "2");
          if (obj != PatchProxyResult.class) {
             obj = obj.intValue();
          }else {
             obj = 0;
             ViewGroup childAt = this.getChildAt(obj);
             if (childAt != null && childAt.getChildAt(obj) != null) {
                if (childAt.getChildAt(obj) == null) {
                   Object[] objArray = new Object[obj];
                   a.D().w("HalfScrollView", "no_child", objArray);
                   PostUtils.x("HalfScrollView", "no_child");
                }else {
                   obj = childAt.getChildAt(obj).getMeasuredHeight() * 2;
                }
             }
          }
          this.setMeasuredDimension(p0, obj);
       }else {
          this.setMeasuredDimension(this.getMeasuredWidth(), p1);
       }
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(HalfScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HalfScrollView.class, "4")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       if (this.d == null) {
          this.d = true;
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfScrollView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.f == null) {
          return b;
       }
       if (p0.getAction() == b) {
          this.e.a(this.d);
          this.d = false;
       }
       return super.onTouchEvent(p0);
    }
    public void setHeight(int p0){
       this.c = false;
       this.b = p0;
    }
    public void setOnScrollCallback(HalfScrollView$a p0){
       this.e = p0;
    }
}
