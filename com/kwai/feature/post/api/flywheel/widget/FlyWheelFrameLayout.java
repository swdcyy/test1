package com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;
import r36.b;
import android.widget.FrameLayout;
import android.content.Context;
import q36.b;
import ll8.c$b;
import android.view.View;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.view.ViewGroup;
import java.lang.Runnable;
import java.lang.Integer;

public class FlyWheelFrameLayout extends FrameLayout implements b	// class@0013ef
{
    public final b b;

    public void FlyWheelFrameLayout(Context p0){
       super(p0);
       b uob = new b(this, c$b.P0, 1, 2, 0);
       this.b = p0;
    }
    public void FlyWheelFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       b uob = new b(this, c$b.P0, 1, 2, 0);
       this.b = v6;
       v6.a(p0, p1, 0);
    }
    public void FlyWheelFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       b uob = new b(this, c$b.P0, 1, 2, 0);
       this.b = v6;
       v6.a(p0, p1, p2);
    }
    public View getClickView(){
       Object obj = PatchProxy.apply(null, this, FlyWheelFrameLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getClickView();
    }
    public TextView getFlyWheelTextView(){
       Object obj = PatchProxy.apply(null, this, FlyWheelFrameLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getFlyWheelTextView();
    }
    public View getShowBubbleView(){
       Object obj = PatchProxy.apply(null, this, FlyWheelFrameLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getShowBubbleView();
    }
    public ViewGroup getTKViewContainer(){
       Object obj = PatchProxy.apply(null, this, FlyWheelFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getTKViewContainer();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FlyWheelFrameLayout.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b.b();
       return;
    }
    public void s(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FlyWheelFrameLayout.class, "5")) {
          return;
       }
       this.b.s(p0);
       return;
    }
    public void setClickViewId(int p0){
       if (PatchProxy.isSupport(FlyWheelFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FlyWheelFrameLayout.class, "10")) {
          return;
       }
       this.b.c(p0);
       return;
    }
    public void setTKContainerId(int p0){
       if (PatchProxy.isSupport(FlyWheelFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FlyWheelFrameLayout.class, "8")) {
          return;
       }
       this.b.d(p0);
       return;
    }
    public void setTextViewId(int p0){
       if (PatchProxy.isSupport(FlyWheelFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FlyWheelFrameLayout.class, "9")) {
          return;
       }
       this.b.e(p0);
       return;
    }
    public void z(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FlyWheelFrameLayout.class, "6")) {
          return;
       }
       this.b.z(p0);
       return;
    }
}
