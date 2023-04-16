package com.yxcorp.gifshow.homepage.kcube.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.Rect;
import com.yxcorp.gifshow.homepage.kcube.presenter.e$a;
import dta.s0;
import dta.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.kcube.KCubeStripViewPager;
import android.content.Context;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import lnc.a1;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import java.lang.Runnable;
import ekd.k1;
import wq6.c;
import yq6.e;
import qn5.a;
import dta.r0;
import yq6.a;
import xq6.b;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.Boolean;
import nsa.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import k2b.u1;
import android.widget.LinearLayout;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View;
import wq6.g;
import wq6.h;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import java.util.Iterator;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import dta.q0;
import android.view.View$OnClickListener;
import yq6.d;
import do5.a;
import com.google.android.material.tabs.c;
import msd.l;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.graphics.Typeface;
import android.text.TextPaint;
import ekd.i;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import dta.p0;

public class e extends PresenterV2	// class@001758
{
    public View p;
    public TextView q;
    public PagerSlidingTabStrip r;
    public IContainerDecorator s;
    public f t;
    public KCubeStripViewPager u;
    public final Rect v;
    public final c w;
    public final PagerSlidingTabStrip$e x;
    public final Runnable y;
    public b z;

    public void e(){
       super();
       this.v = new Rect();
       this.w = new e$a(this);
       this.x = new s0(this);
       this.y = new t0(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          KCubeStripViewPager kCubeStripVi = new KCubeStripViewPager(this.getContext(), this.s.c());
          this.u = kCubeStripVi;
          this.r.setViewPager(kCubeStripVi);
          this.r.setTabGravity(17);
          this.r.w(a1.e(2.00f));
          this.r.y(a1.e(22.00f));
          this.r.setScrollListener(this.x);
          this.S8();
          k1.r(this.y, 100);
       }
       this.s.c().v(this.w);
       this.z = this.s.c().c0().a(a.b, new r0(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.s.c().w(this.w);
       this.r.s(this.x);
       k1.m(this.y);
       this.z.release();
       return;
    }
    public void P8(HotChannel p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "9")) {
          return;
       }
       String str = "HOT_CHANNEL_TAB";
       a uoa = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,str,Boolean.valueOf(p1),Boolean.FALSE,null};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
          label_005e :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = str;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.tagPackage = a.a(p0, a.b(0));
       if (!p1) {
          i = 5;
       }
       u1.u(i, uElementPack, uContentPack);
       goto label_005e ;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       LinearLayout tabsContaine = this.r.getTabsContainer();
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < tabsContaine.getChildCount()) {
          if (tabsContaine.getChildAt(i).getGlobalVisibleRect(this.v)) {
             int i1 = this.s.c().h() - 1;
             if (i > i1) {
                break ;
             }else {
                HotChannel hotChannel = this.s.c().U(i).q("KEY_TAB_HOT_CHANNEL");
                if (hotChannel.mShow == null) {
                   hotChannel.mShow = true;
                   uArrayList.add(hotChannel);
                }
             }
          }
          i = i + 1;
       }
       String str = "HOT_CHANNEL_TAB";
       if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidFourRefs(uArrayList, str, null, Boolean.FALSE, null, a.class, "3") && !q.f(uArrayList))) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = str;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
          ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[uArrayList.size()];
          Iterator iterator = uArrayList.iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             tagPackageAr[i2] = a.a(iterator.next(), a.b(false));
             i2 = i2 + 1;
          }
          tagShowPacka.tagPackage = tagPackageAr;
          uContentPack.tagShowPackage = tagShowPacka;
          u1.v0(3, uElementPack, uContentPack, null);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.r.q();
       for (int i = 0; i < this.s.c().h(); i = i + 1) {
          this.u.b(i).i(new q0(this, this.s.c().U(i)));
       }
       return;
    }
    public final void V8(h p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "8")) {
          return;
       }
       int i = 1;
       if (p0.equals(this.s.c().j()) ^ i) {
          this.P8(p0.q("KEY_TAB_HOT_CHANNEL"), i);
          return;
       }else if(!this.s.c().d().a(a.a, c.b, Boolean.FALSE).booleanValue()){
          this.P8(p0.q("KEY_TAB_HOT_CHANNEL"), false);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a3f7b);
       PagerSlidingTabStrip pagerSliding = p0.findViewById(R.id.tabs);
       this.r = pagerSliding;
       pagerSliding.setFillViewport(false);
       this.p = p0.findViewById(0x7f0a3b45);
       this.q.setTypeface(Typeface.defaultFromStyle(false));
       this.q.getPaint().setFakeBoldText(true);
       if (i.c() && n.A(this.getContext()) > 0) {
          ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.height = n.A(this.getContext());
          this.p.setLayoutParams(layoutParams);
          this.p.setVisibility(false);
       }
       this.q.setOnClickListener(new p0(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.s = this.q8(IContainerDecorator.class);
       this.t = this.q8(f.class);
       return;
    }
}
