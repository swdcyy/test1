package com.yxcorp.gifshow.detail.slidev2.widget.MaxHeightWithFocusScrollView;
import android.widget.ScrollView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class MaxHeightWithFocusScrollView extends ScrollView	// class@001a02
{
    public int b;
    public static final int c;

    static {
       MaxHeightWithFocusScrollView.c = a1.e(150.00f);
    }
    public void MaxHeightWithFocusScrollView(Context p0){
       super(p0, null);
    }
    public void MaxHeightWithFocusScrollView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MaxHeightWithFocusScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (this.isInEditMode() || (!PatchProxy.applyVoidTwoRefs(p0, p1, this, MaxHeightWithFocusScrollView.class, "1") && p1 != null)) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i3);
          this.b = typedArray.getDimensionPixelSize(0, MaxHeightWithFocusScrollView.c);
          typedArray.recycle();
       }
    label_0028 :
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ViewParent obj = PatchProxy.applyOneRefs(p0, this, MaxHeightWithFocusScrollView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.getParent();
       View obj1 = PatchProxy.apply(null, this, MaxHeightWithFocusScrollView.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = 0;
          obj1 = this.getChildAt(b);
          if (obj1 != null && this.getHeight() < obj1.getHeight()) {
             b = true;
          }
       }
       obj.requestDisallowInterceptTouchEvent(b);
       return super.dispatchTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MaxHeightWithFocusScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MaxHeightWithFocusScrollView.class, "2")) {
          return;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE));
       return;
    }
}
