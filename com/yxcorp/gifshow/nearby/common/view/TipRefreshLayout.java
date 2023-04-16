package com.yxcorp.gifshow.nearby.common.view.TipRefreshLayout;
import com.kwai.library.widget.refresh.KwaiRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import i2b.a;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Math;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.view.ViewGroup$MarginLayoutParams;

public class TipRefreshLayout extends KwaiRefreshLayout	// class@002141
{
    public boolean h1;
    public boolean i1;
    public float j1;
    public float k1;

    public void TipRefreshLayout(Context p0){
       super(p0);
       this.i1 = true;
    }
    public void TipRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i1 = true;
    }
    public View B(AttributeSet p0){
       p0 = PatchProxy.applyOneRefs(p0, this, TipRefreshLayout.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.a(this.getContext(), 0x7f0d05e8);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TipRefreshLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getActionMasked() && this.h1 != null) {
          return false;
       }
       return super.dispatchTouchEvent(p0);
    }
    public boolean isEnabled(){
       Object obj = PatchProxy.apply(null, this, TipRefreshLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.isEnabled() && this.i1 != null)? true: false;
       return b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TipRefreshLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 0.00f && Math.abs((p0.getX() - this.j1)) - Math.abs((p0.getY() - this.k1)) > 0) {
             return false;
          }
       }else {
          this.j1 = p0.getX();
          this.k1 = p0.getY();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void setCanRefresh(boolean p0){
       this.i1 = p0;
    }
    public void setInterceptDispatch(boolean p0){
       this.h1 = p0;
    }
    public void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(TipRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TipRefreshLayout.class, "4")) {
          return;
       }
       if (p0 && !this.isEnabled()) {
          return;
       }
       super.setRefreshing(p0);
       return;
    }
    public RefreshLayout$LayoutParams z(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TipRefreshLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RefreshLayout$LayoutParams layoutParams = super.z(p0);
       layoutParams.width = -1;
       return layoutParams;
    }
}
