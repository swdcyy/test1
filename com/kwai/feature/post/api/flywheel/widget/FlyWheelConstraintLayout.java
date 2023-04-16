package com.kwai.feature.post.api.flywheel.widget.FlyWheelConstraintLayout;
import r36.b;
import androidx.constraintlayout.widget.ConstraintLayout;
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

public class FlyWheelConstraintLayout extends ConstraintLayout implements b	// class@0013ee
{
    public final b B;

    public void FlyWheelConstraintLayout(Context p0){
       super(p0);
       b uob = new b(this, c$b.O0, 1, 2, 0);
       this.B = p0;
    }
    public void FlyWheelConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       b uob = new b(this, c$b.O0, 1, 2, 0);
       this.B = v6;
       v6.a(p0, p1, 0);
    }
    public void FlyWheelConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       b uob = new b(this, c$b.O0, 1, 2, 0);
       this.B = v6;
       v6.a(p0, p1, p2);
    }
    public View getClickView(){
       Object obj = PatchProxy.apply(null, this, FlyWheelConstraintLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getClickView();
    }
    public TextView getFlyWheelTextView(){
       Object obj = PatchProxy.apply(null, this, FlyWheelConstraintLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getFlyWheelTextView();
    }
    public View getShowBubbleView(){
       Object obj = PatchProxy.apply(null, this, FlyWheelConstraintLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getShowBubbleView();
    }
    public ViewGroup getTKViewContainer(){
       Object obj = PatchProxy.apply(null, this, FlyWheelConstraintLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getTKViewContainer();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FlyWheelConstraintLayout.class, "10")) {
          return;
       }
       super.onDetachedFromWindow();
       this.B.b();
       return;
    }
    public void s(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FlyWheelConstraintLayout.class, "5")) {
          return;
       }
       this.B.s(p0);
       return;
    }
    public void setClickViewId(int p0){
       if (PatchProxy.isSupport(FlyWheelConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FlyWheelConstraintLayout.class, "9")) {
          return;
       }
       this.B.c(p0);
       return;
    }
    public void setTKContainerId(int p0){
       if (PatchProxy.isSupport(FlyWheelConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FlyWheelConstraintLayout.class, "7")) {
          return;
       }
       this.B.d(p0);
       return;
    }
    public void setTextViewId(int p0){
       if (PatchProxy.isSupport(FlyWheelConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FlyWheelConstraintLayout.class, "8")) {
          return;
       }
       this.B.e(p0);
       return;
    }
    public void z(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FlyWheelConstraintLayout.class, "6")) {
          return;
       }
       this.B.z(p0);
       return;
    }
}
