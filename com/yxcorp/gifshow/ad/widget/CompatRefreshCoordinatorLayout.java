package com.yxcorp.gifshow.ad.widget.CompatRefreshCoordinatorLayout;
import o17.c;
import com.yxcorp.gifshow.widget.NestedCoordinatorLayout;
import android.content.Context;
import w59.h;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$c;

public class CompatRefreshCoordinatorLayout extends NestedCoordinatorLayout implements c	// class@00191e
{
    public AppBarLayout B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final AppBarLayout$c F;

    public void CompatRefreshCoordinatorLayout(Context p0){
       super(p0);
       this.C = true;
       this.D = true;
       this.E = true;
       this.F = new h(this);
    }
    public void CompatRefreshCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.C = true;
       this.D = true;
       this.E = true;
       this.F = new h(this);
    }
    public void CompatRefreshCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.C = true;
       this.D = true;
       this.E = true;
       this.F = new h(this);
    }
    public static void Z(CompatRefreshCoordinatorLayout p0,AppBarLayout p1,int p2){
       boolean b = (!p2 && p0.E != null)? true: false;
       p0.C = b;
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, CompatRefreshCoordinatorLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.setAppBarLayout(this.findViewById(R.id.app_bar_layout));
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CompatRefreshCoordinatorLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.D == null) {
          this.D = true;
          this.C = false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean r(){
       CompatRefreshCoordinatorLayout obj = PatchProxy.apply(null, this, CompatRefreshCoordinatorLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          obj.c(this.F);
       }
       return this.C;
    }
    public void setAppBarLayout(AppBarLayout p0){
       this.B = p0;
    }
    public void setAppBarLayoutExpand(boolean p0){
       this.D = p0;
    }
    public void setCanPullToRefresh(boolean p0){
       this.C = p0;
    }
    public void setParentAppBarLayoutExpand(boolean p0){
       this.E = p0;
    }
}
