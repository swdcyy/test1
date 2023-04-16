package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LivePerfSafeViewPager;
import com.kuaishou.live.core.basic.widget.LiveSafeViewPager;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import android.content.Context;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LivePerfSafeViewPager$a;
import android.util.AttributeSet;
import qrd.l1;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Integer;
import nv1.h;
import msd.a;
import k51.b;
import android.view.View;
import java.lang.StringBuilder;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import a2.i0;

public class LivePerfSafeViewPager extends LiveSafeViewPager	// class@0016ed
{
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public Runnable h;
    public static final List i;

    static {
       LivePerfSafeViewPager.i = LiveLogTag.LIVE_MINI_WIDGET.appendTag("LivePerfSafeViewPager");
    }
    public void LivePerfSafeViewPager(Context p0){
       super(p0);
       this.h = new LivePerfSafeViewPager$a(this);
       this.j();
    }
    public void LivePerfSafeViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = new LivePerfSafeViewPager$a(this);
       this.j();
    }
    public static l1 i(LivePerfSafeViewPager p0,int p1,int p2){
       super.onMeasure(p1, p2);
       p0.d = p1;
       p0.e = p2;
       return l1.a;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, LivePerfSafeViewPager.class, "1")) {
          return;
       }
       boolean b = a.t().u("SOURCE_LIVE").d("enableLiveMiniWidgetMeasureOpt", false);
       this.g = b;
       b.S(LivePerfSafeViewPager.i, "initMeasureOptConfig", "enableLiveMiniWidgetMeasureOpt", Boolean.valueOf(b));
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePerfSafeViewPager.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       this.f = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePerfSafeViewPager.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.f = false;
       this.removeCallbacks(this.h);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LivePerfSafeViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LivePerfSafeViewPager.class, "3")) {
          return;
       }
       b.b("LivePerfSafeViewPager::onMeasure", new h(this, p0, p1));
       return;
    }
    public void onViewAdded(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerfSafeViewPager.class, "6")) {
          return;
       }
       super.onViewAdded(p0);
       if (this.g != null) {
          b.P(LivePerfSafeViewPager.i, "onViewAdded: "+p0);
          super.requestLayout();
       }
       return;
    }
    public void onViewRemoved(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerfSafeViewPager.class, "7")) {
          return;
       }
       super.onViewRemoved(p0);
       if (this.g != null) {
          b.P(LivePerfSafeViewPager.i, "onViewRemoved: "+p0);
          super.requestLayout();
       }
       return;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, LivePerfSafeViewPager.class, "5")) {
          return;
       }
       if (this.g != null && (View$MeasureSpec.getSize(this.d) > 0 && (View$MeasureSpec.getSize(this.e) > 0 && (this.f != null && (this.getParent() != null && !this.getParent().isLayoutRequested()))))) {
          if (this.c == null) {
             this.c = true;
             i0.k0(this, this.h);
          }
       }else {
          super.requestLayout();
       }
       return;
    }
}
