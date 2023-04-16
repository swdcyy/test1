package com.facebook.react.views.drawer.ReactDrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import df.g;
import java.lang.Integer;

public class ReactDrawerLayout extends DrawerLayout	// class@0013b4
{
    public int Q;
    public int R;

    public void ReactDrawerLayout(ReactContext p0){
       super(p0);
       this.Q = 0x800003;
       this.R = -1;
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, ReactDrawerLayout.class, "3")) {
          return;
       }
       this.d(this.Q);
       return;
    }
    public void W(){
       if (PatchProxy.applyVoid(null, this, ReactDrawerLayout.class, "2")) {
          return;
       }
       this.I(this.Q);
       return;
    }
    public void X(){
       if (PatchProxy.applyVoid(null, this, ReactDrawerLayout.class, "6")) {
          return;
       }
       if (this.getChildCount() == 2) {
          View childAt = this.getChildAt(1);
          DrawerLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          layoutParams.a = this.Q;
          layoutParams.width = this.R;
          childAt.setLayoutParams(layoutParams);
          childAt.setClickable(1);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactDrawerLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          if (!super.onInterceptTouchEvent(p0)) {
             return false;
          }
          g.a(this, p0);
          return true;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public void setDrawerPosition(int p0){
       if (PatchProxy.isSupport(ReactDrawerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactDrawerLayout.class, "4")) {
          return;
       }
       this.Q = p0;
       this.X();
       return;
    }
    public void setDrawerWidth(int p0){
       if (PatchProxy.isSupport(ReactDrawerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactDrawerLayout.class, "5")) {
          return;
       }
       this.R = p0;
       this.X();
       return;
    }
}
