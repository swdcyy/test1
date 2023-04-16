package com.kuaishou.live.core.show.perf.LivePlayRootViewRelativeLayout;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.perf.a;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.perf.LivePlayRootViewRelativeLayout$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import qrd.l1;
import android.view.ViewGroup;
import java.lang.Runnable;
import java.lang.Integer;
import dd2.a;
import msd.a;
import k51.b;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import a2.i0;

public class LivePlayRootViewRelativeLayout extends RelativeLayout	// class@000d4e
{
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Runnable g;
    public static final c h;

    static {
       LivePlayRootViewRelativeLayout.h = a.b;
    }
    public void LivePlayRootViewRelativeLayout(Context p0){
       super(p0, null);
    }
    public void LivePlayRootViewRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePlayRootViewRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = new LivePlayRootViewRelativeLayout$a(this);
       if (PatchProxy.applyVoid(null, this, LivePlayRootViewRelativeLayout.class, "1")) {
       }else {
          boolean b = a.t().u("SOURCE_LIVE").d("enableLivePlayRootViewMeasureOpt", false);
          this.f = b;
          b.c0(LivePlayRootViewRelativeLayout.h, "initMeasureOptConfig", "enableLivePlayRootViewMeasureOpt", Boolean.valueOf(b));
       }
       return;
    }
    public static l1 a(LivePlayRootViewRelativeLayout p0,int p1,int p2){
       super.onMeasure(p1, p2);
       p0.b = p1;
       p0.c = p2;
       return l1.a;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePlayRootViewRelativeLayout.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.d = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePlayRootViewRelativeLayout.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.d = false;
       this.removeCallbacks(this.g);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LivePlayRootViewRelativeLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LivePlayRootViewRelativeLayout.class, "2")) {
          return;
       }
       b.b("LivePlayRootViewRelativeLayout.onMeasure", new a(this, p0, p1));
       return;
    }
    public void onViewAdded(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayRootViewRelativeLayout.class, "6")) {
          return;
       }
       super.onViewAdded(p0);
       if (this.f != null) {
          super.requestLayout();
       }
       return;
    }
    public void onViewRemoved(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayRootViewRelativeLayout.class, "7")) {
          return;
       }
       super.onViewRemoved(p0);
       if (this.f != null) {
          super.requestLayout();
       }
       return;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, LivePlayRootViewRelativeLayout.class, "5")) {
          return;
       }
       if (this.f != null && (View$MeasureSpec.getSize(this.b) > 0 && (View$MeasureSpec.getSize(this.c) > 0 && (this.d != null && (this.getParent() != null && !this.getParent().isLayoutRequested()))))) {
          if (this.e == null) {
             this.e = true;
             i0.k0(this, this.g);
          }
       }else {
          super.requestLayout();
       }
       return;
    }
}
