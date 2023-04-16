package com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetViewPager;
import android.view.View;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import crd.b;
import ekd.k1;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bt5.b;
import java.lang.Math;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import android.view.ViewGroup;
import lp3.c;
import lp3.e;
import java.util.List;
import px1.a;
import java.util.Collection;
import lv1.f;
import h3.a;
import lx1.i;
import java.lang.Runnable;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import kx1.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import lx1.g;
import lx1.h;
import erd.g;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView$b;

public class SceneActivityWidgetBannerView extends LinearLayout	// class@00176a
{
    public boolean b;
    public boolean c;
    public int d;
    public float e;
    public int f;
    public List g;
    public SceneActivityWidgetViewPager h;
    public e i;
    public b j;
    public SceneActivityWidgetBannerView$b k;
    public final ViewPager$l l;
    public static final int m;

    public void SceneActivityWidgetBannerView(Context p0){
       super(p0, null);
    }
    public void SceneActivityWidgetBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SceneActivityWidgetBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.d = -1;
       this.f = a1.e(3.00f);
       this.g = new ArrayList();
       SceneActivityWidgetBannerView$a uoa = new SceneActivityWidgetBannerView$a(this);
       this.l = uoa;
       if (PatchProxy.applyVoid(null, this, SceneActivityWidgetBannerView.class, "1")) {
       }else {
          SceneActivityWidgetViewPager sceneActivit = new SceneActivityWidgetViewPager(this.getContext());
          this.h = sceneActivit;
          this.addView(sceneActivit);
       }
       this.h.b(uoa);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SceneActivityWidgetBannerView.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, SceneActivityWidgetBannerView.class, "5")) {
          SceneActivityWidgetBannerView tj = this.j;
          if (tj != null) {
             tj.dispose();
          }
       }
       k1.n(this);
       this.d = -1;
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       b obj = PatchProxy.applyOneRefs(p0, this, SceneActivityWidgetBannerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getLiveSlidService();
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action == 3) {
                }
             }else if(Math.abs((p0.getRawY() - this.e)) - (float)this.f > 0){
                obj.Q3(LiveSlidePlayService$DisableSlidePlayFunction.SCENE_ACTIVITY_WIDGET, false);
             }
          }else {
          }
       }else {
          this.e = p0.getRawY();
          this.b = b;
       }
    label_0053 :
       return super.dispatchTouchEvent(p0);
    }
    public final b getLiveSlidService(){
       Object obj = PatchProxy.apply(null, this, SceneActivityWidgetBannerView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.a(b.class);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SceneActivityWidgetBannerView.class, "9")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b = false;
       this.getLiveSlidService().Q3(LiveSlidePlayService$DisableSlidePlayFunction.SCENE_ACTIVITY_WIDGET, true);
       return;
    }
    public void setActivityWidgetBannerList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SceneActivityWidgetBannerView.class, "2")) {
          return;
       }
       if (!this.g.isEmpty() && this.d != -1) {
          SceneActivityWidgetBannerView td = this.d;
          if (this.g.size() > td) {
             this.g.get(td).d();
          }
       }
       this.g.clear();
       this.g.addAll(p0);
       this.a();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, SceneActivityWidgetBannerView.class, "3")) {
          f uof = new f(this.g);
          this.h.setAdapter(uof);
          k1.p(new i(this), this);
          uof.q();
       }
       if (this.g.size() > 1 && !PatchProxy.applyVoid(objArray, this, SceneActivityWidgetBannerView.class, "7")) {
          SceneActivityWidgetBannerView tj = this.j;
          if (tj == null || tj.isDisposed()) {
             LiveConfigStartupResponse$LiveInteractiveWidgetConfig liveInteract = a.a();
             LiveConfigStartupResponse$LiveInteractiveWidgetConfig mWidgetRolli = liveInteract.mWidgetRollingDurationMsMs;
             if (mWidgetRolli - null <= 0) {
                mWidgetRolli = 5000;
             }
             this.j = t.interval(mWidgetRolli, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new g(this), new h(liveInteract));
          }
       }
       return;
    }
    public void setILiveServiceManager(e p0){
       this.i = p0;
    }
    public void setIsLoopWidget(boolean p0){
       if (PatchProxy.isSupport(SceneActivityWidgetBannerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SceneActivityWidgetBannerView.class, "8")) {
          return;
       }
       this.c = p0;
       this.h.setIsLoopWidget(p0);
       return;
    }
    public void setPageChangeCallback(SceneActivityWidgetBannerView$b p0){
       this.k = p0;
    }
}
