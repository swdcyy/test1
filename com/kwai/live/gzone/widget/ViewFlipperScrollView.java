package com.kwai.live.gzone.widget.ViewFlipperScrollView;
import com.kwai.live.gzone.widget.ViewAnimator2;
import android.content.Context;
import java.util.HashSet;
import com.kwai.live.gzone.widget.ViewFlipperScrollView$a;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import java.util.Set;
import java.util.Iterator;
import com.kwai.live.gzone.widget.ViewFlipperScrollView$b;
import android.view.View;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.widget.ViewFlipper;
import android.view.ViewGroup;
import java.lang.Integer;

public class ViewFlipperScrollView extends ViewAnimator2	// class@000e88
{
    public Set g;
    public boolean h;
    public Object i;
    public Object j;
    public Runnable k;

    public void ViewFlipperScrollView(Context p0){
       super(p0);
       this.g = new HashSet();
       this.h = false;
       this.k = new ViewFlipperScrollView$a(this);
    }
    public void ViewFlipperScrollView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new HashSet();
       this.h = false;
       this.k = new ViewFlipperScrollView$a(this);
       p0.obtainStyledAttributes(p1, c$b.Y5).recycle();
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewFlipperScrollView.class, "8")) {
          return;
       }
       int i = this.getDisplayedChild() + 1;
       if (i >= this.getChildCount()) {
          i = 0;
       }else if(i < 0){
          i = this.getChildCount() - 1;
       }
       if (!this.g.isEmpty()) {
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(this.getChildAt(i), i, p0);
          }
       }
       if (!PatchProxy.applyVoid(null, this, ViewAnimator2.class, "3")) {
          this.setDisplayedChild((this.b + 1));
       }
       if (!this.g.isEmpty()) {
          p0 = this.g.iterator();
          while (p0.hasNext()) {
             p0.next().a(this.getChildAt(i), i);
          }
       }
       return;
    }
    public final void e(boolean p0){
       if (PatchProxy.isSupport(ViewFlipperScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ViewFlipperScrollView.class, "6")) {
          return;
       }
       this.b(this.b, p0);
       return;
    }
    public CharSequence getAccessibilityClassName(){
       Object obj = PatchProxy.apply(null, this, ViewFlipperScrollView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewFlipper.class.getName();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ViewFlipperScrollView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.h = false;
       this.e(false);
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (PatchProxy.isSupport(ViewFlipperScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ViewFlipperScrollView.class, "2")) {
          return;
       }
       super.onWindowVisibilityChanged(p0);
       boolean b = (!p0)? true: false;
       this.h = b;
       this.e(false);
       return;
    }
}
