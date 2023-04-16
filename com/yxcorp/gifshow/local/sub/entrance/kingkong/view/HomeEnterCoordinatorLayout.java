package com.yxcorp.gifshow.local.sub.entrance.kingkong.view.HomeEnterCoordinatorLayout;
import o17.c;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.CustomCoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.LinearLayout;
import android.view.MotionEvent;
import java.lang.Math;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.viewpager.HomeViewPager;
import java.util.Objects;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout;
import d2b.c;
import androidx.slidingpanelayout.widget.KwaiSlidingPaneLayout;
import android.view.View;

public class HomeEnterCoordinatorLayout extends CustomCoordinatorLayout implements c	// class@001abf
{
    public ClipLayout C;
    public RefreshLayout D;
    public KwaiSlidingPaneLayout E;
    public HomeViewPager F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;

    public void HomeEnterCoordinatorLayout(Context p0){
       super(p0, null);
    }
    public void HomeEnterCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HomeEnterCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = true;
       this.H = true;
       this.L = false;
       this.M = false;
       this.N = ViewConfiguration.get(p0).getScaledTouchSlop();
    }
    public final boolean Z(float p0,float p1){
       HomeEnterCoordinatorLayout obj;
       if (PatchProxy.isSupport(HomeEnterCoordinatorLayout.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, HomeEnterCoordinatorLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.C;
       boolean b = false;
       if (obj == null || (obj.getVisibility() != 8 && (p1 - (float)this.C.getTop() > 0 && (p1 - (float)this.C.getBottom() < 0 && (p0 - (float)this.C.getLeft() > 0 && p0 - (float)this.C.getRight() < 0))))) {
          b = true;
       }
    label_005e :
       return b;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       HomeEnterCoordinatorLayout obj = PatchProxy.applyOneRefs(p0, this, HomeEnterCoordinatorLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2 || (this.L == null && this.M == null)) {
                float f = (float)(int)p0.getX();
                int i = (int)Math.abs((f - this.J));
                float f1 = (float)(int)p0.getY();
                int i1 = (int)Math.abs((f1 - this.I));
                if (i1 > i && i1 > this.N) {
                   this.M = true;
                }else if(i > this.N && this.Z(this.J, this.I)){
                   this.L = true;
                }
                this.J = f;
                this.I = f1;
             }
          }else {
             obj = this.D;
             if (obj != null && this.L != null) {
                this.L = false;
                obj.onTouchEvent(p0);
             }
             this.I = 0;
             this.K = false;
             this.L = false;
             this.M = false;
          }
       }else {
          this.J = p0.getX();
          this.I = p0.getY();
          this.K = true;
          this.L = false;
          this.M = false;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, HomeEnterCoordinatorLayout.class, "4") && this.E != null) {
          actionMasked = p0.getActionMasked();
          if (actionMasked) {
             if (actionMasked != 1) {
                if (actionMasked == 7) {
                }
             }else {
                this.E.requestDisallowInterceptTouchEvent(false);
             }
          }else {
          }
       }
    label_00c2 :
       if (!PatchProxy.applyVoidOneRefs(p0, this, HomeEnterCoordinatorLayout.class, "5") && this.F != null) {
          if (!p0.getAction() && this.Z(p0.getX(), p0.getY())) {
             this.F.C = true;
          }else if(p0.getAction() == 1){
             this.F.C = false;
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public boolean r(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomeEnterCoordinatorLayout obj = PatchProxy.apply(objArray, this, HomeEnterCoordinatorLayout.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.H == null) {
          return b;
       }
       obj = this.C;
       if (obj == null || obj.getVisibility()) {
          return this.G;
       }
       if (this.K != null && this.L != null) {
          return b;
       }
       obj = this.C;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, ClipLayout.class, "4");
       boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c.l();
       return b1;
    }
    public void setCanPullToRefresh(boolean p0){
       this.G = p0;
    }
    public void setClipLayout(ClipLayout p0){
       this.C = p0;
    }
    public void setParentAppbarLayoutExpand(boolean p0){
       this.H = p0;
    }
    public void setRefreshLayout(RefreshLayout p0){
       this.D = p0;
    }
    public void setSlidingPaneLayout(KwaiSlidingPaneLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeEnterCoordinatorLayout.class, "1")) {
          return;
       }
       this.E = p0;
       this.F = p0.findViewById(0x7f0a444e);
       return;
    }
}
