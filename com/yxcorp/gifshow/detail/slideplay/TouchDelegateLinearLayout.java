package com.yxcorp.gifshow.detail.slideplay.TouchDelegateLinearLayout;
import d6a.x;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import d6a.w;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.TouchDelegateLinearLayout$a;

public final class TouchDelegateLinearLayout extends LinearLayout implements x	// class@00171d
{
    public w b;
    public final int[] c;

    public void TouchDelegateLinearLayout(Context p0){
       super(p0);
       int[] ointArray = new int[2];
       this.c = ointArray;
    }
    public void TouchDelegateLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.c = ointArray;
    }
    public void TouchDelegateLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[2];
       this.c = ointArray;
    }
    public final boolean a(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TouchDelegateLinearLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return super.dispatchTouchEvent(p0);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       TouchDelegateLinearLayout obj = PatchProxy.applyOneRefs(p0, this, TouchDelegateLinearLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj == null) {
          return super.dispatchTouchEvent(p0);
       }
       a.m(obj);
       return obj.a(p0);
    }
    public void setDelegateView(View p0){
       TouchDelegateLinearLayout$a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, TouchDelegateLinearLayout.class, "2")) {
          return;
       }
       if (p0 != null) {
          Context context = this.getContext();
          a.o(context, "context");
          uoa = new TouchDelegateLinearLayout$a(this, p0, context, p0);
       }else {
          uoa = null;
       }
       this.b = uoa;
       return;
    }
}
