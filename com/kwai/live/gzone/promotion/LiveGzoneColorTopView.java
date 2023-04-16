package com.kwai.live.gzone.promotion.LiveGzoneColorTopView;
import android.widget.FrameLayout;
import android.content.Context;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView$c;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView$a;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

public class LiveGzoneColorTopView extends FrameLayout	// class@000dac
{
    public int b;
    public boolean c;
    public LiveGzoneColorTopView$c d;

    public void LiveGzoneColorTopView(Context p0){
       super(p0);
       this.d = new LiveGzoneColorTopView$c(this, null);
    }
    public void LiveGzoneColorTopView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new LiveGzoneColorTopView$c(this, null);
    }
    public void LiveGzoneColorTopView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LiveGzoneColorTopView$c uoc = new LiveGzoneColorTopView$c(this, null);
       this.d = uoc;
       uoc.mutate();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneColorTopView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneColorTopView.class, "3")) {
          return;
       }
       this.c = p0;
       this.b();
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(LiveGzoneColorTopView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveGzoneColorTopView.class, "5")) {
          return;
       }
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       super.addView(p0, p1, p2);
       if (this.getLayoutParams() != null && p2 != null) {
          p0.height = p2.height;
          p0.width = p2.width;
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneColorTopView.class, "4")) {
          return;
       }
       if (this.c != null) {
          this.d.setColor(this.b);
          this.d.invalidateSelf();
       }else {
          this.d.setColor(0);
       }
       LiveGzoneColorTopView td = this.d;
       if (this.getBackground() != td) {
          this.setBackground(td);
       }
       return;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneColorTopView.class, "1")) {
          return;
       }
       if (this.getParent() instanceof ViewPager) {
          super.removeView(p0);
          this.getParent().removeView(this);
       }else {
          super.removeView(p0);
       }
       return;
    }
    public void setTopColor(int p0){
       if (PatchProxy.isSupport(LiveGzoneColorTopView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGzoneColorTopView.class, "2")) {
          return;
       }
       this.b = p0;
       this.b();
       return;
    }
}
