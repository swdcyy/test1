package com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.ArrayList;
import lnc.a1;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip$a;
import android.widget.HorizontalScrollView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import java.util.Collection;

public final class KSPagerSlidingTabStrip extends PagerSlidingTabStrip	// class@001ad4
{
    public int A1;
    public final int B1;
    public final int C1;
    public final Runnable D1;
    public final HashSet w1;
    public View x1;
    public e0 y1;
    public final ArrayList z1;

    public void KSPagerSlidingTabStrip(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void KSPagerSlidingTabStrip(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void KSPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.w1 = new HashSet();
       this.z1 = new ArrayList();
       this.B1 = a1.e(20.00f);
       this.C1 = a1.e(5.00f);
       this.D1 = new KSPagerSlidingTabStrip$a(this);
       this.setVisibility(4);
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KSPagerSlidingTabStrip.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KSPagerSlidingTabStrip.class, "5")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       this.A1 = p0;
       k1.m(this.D1);
       k1.r(this.D1, 10);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, KSPagerSlidingTabStrip.class, "4")) {
          return;
       }
       super.q();
       k1.r(this.D1, 100);
       return;
    }
    public final void setTabInfoList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPagerSlidingTabStrip.class, "2")) {
          return;
       }
       a.p(p0, "tabInfoList");
       this.z1.clear();
       this.z1.addAll(p0);
       return;
    }
    public void t(int p0,int p1){
       if (PatchProxy.isSupport(KSPagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KSPagerSlidingTabStrip.class, "6")) {
          return;
       }
       super.t(p0, p1);
       if (!p0) {
          this.scrollTo(0, 0);
       }
       return;
    }
}
