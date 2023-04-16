package com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import t46.a0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.viewpager.widget.ViewPager;
import java.lang.Integer;
import java.lang.Float;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabGroupWithIndicator;
import java.util.List;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$c;
import android.widget.HorizontalScrollView;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import kpb.b;
import android.view.View$OnClickListener;
import kpb.a;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$b;
import th0.e;
import android.view.animation.Interpolator;
import ukd.a;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$a;
import androidx.viewpager.widget.ViewPager$i;
import java.util.Collection;

public abstract class BaseMusicSmoothPagerSlidingTabStrip extends SmoothSlidingTabStrip	// class@002047
{
    public ViewPager s;
    public BaseTabGroupWithIndicator t;
    public final List u;

    public void BaseMusicSmoothPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
       this.u = new ArrayList();
    }
    public void BaseMusicSmoothPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.u = new ArrayList();
    }
    public abstract a0 a(Context p0);
    public View d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseMusicSmoothPagerSlidingTabStrip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a3ca1);
    }
    public View e(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseMusicSmoothPagerSlidingTabStrip.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a3cb4);
    }
    public int getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, BaseMusicSmoothPagerSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.getCurrentItem();
    }
    public void i(int p0,int p1,float p2){
       if (PatchProxy.isSupport(BaseMusicSmoothPagerSlidingTabStrip.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, BaseMusicSmoothPagerSlidingTabStrip.class, "7")) {
          return;
       }
       View childAt = this.getTabsContainer().getChildAt(p0);
       View childAt1 = this.getTabsContainer().getChildAt(p1);
       if (childAt != null && childAt1 != null) {
          this.t.h(childAt, childAt1, p2);
       }
       return;
    }
    public void j(){
       FrameLayout uFrameLayout;
       if (PatchProxy.applyVoid(null, this, BaseMusicSmoothPagerSlidingTabStrip.class, "2")) {
          return;
       }
       int i = this.u.size();
       this.y();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          BaseMusicSmoothPagerSlidingTabStrip$c uoc = this.u.get(i1);
          Context context = this.getContext();
          BaseMusicSmoothPagerSlidingTabStrip ts = this.s;
          Objects.requireNonNull(uoc);
          if (PatchProxy.isSupport(BaseMusicSmoothPagerSlidingTabStrip$c.class)) {
             uFrameLayout = PatchProxy.applyFourRefs(context, Integer.valueOf(i1), ts, this, uoc, BaseMusicSmoothPagerSlidingTabStrip$c.class, "1");
             if (uFrameLayout != PatchProxyResult.class) {
             label_009d :
                this.getTabsContainer().addView(uFrameLayout, i1);
             }
          }
          View view = uoc.a(context, i1, ts);
          FrameLayout uFrameLayout1 = new FrameLayout(context);
          uFrameLayout1.setLayoutParams(new ViewGroup$MarginLayoutParams(uoc.m, -1));
          view.setId(R.id.tab_view);
          uoc.j.setFocusable(true);
          uoc.j.setVisibility(4);
          uoc.j.setId(R.id.tab_replace_view);
          uoc.j.setOnClickListener(new b(view));
          uoc.i(new a(i1, ts, this));
          uFrameLayout1.addView(uoc.j);
          uFrameLayout1.addView(view);
          uFrameLayout1.setTag(R.id.tab_color, Integer.valueOf(uoc.l));
          uFrameLayout = uFrameLayout1;
          goto label_009d ;
       }
       return;
    }
    public void r(View p0){
    }
    public void setViewPager(ViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseMusicSmoothPagerSlidingTabStrip.class, "6")) {
          return;
       }
       a.o(p0, "mScroller", new BaseMusicSmoothPagerSlidingTabStrip$b(this.getContext(), new e()));
       this.s = p0;
       p0.addOnPageChangeListener(new BaseMusicSmoothPagerSlidingTabStrip$a(this));
       this.g();
       return;
    }
    public void w(View p0){
    }
    public void x(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseMusicSmoothPagerSlidingTabStrip.class, "5")) {
          return;
       }
       this.u.clear();
       this.u.addAll(p0);
       return;
    }
    public void y(){
    }
}
