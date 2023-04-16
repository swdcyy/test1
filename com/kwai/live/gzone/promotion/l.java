package com.kwai.live.gzone.promotion.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import s67.n0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kwai.live.gzone.promotion.k;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import android.content.Context;
import s67.e;
import java.util.List;
import s67.o0;
import erd.g;
import crd.b;
import brd.t;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import java.lang.Math;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import com.kwai.live.gzone.promotion.l$a;
import androidx.viewpager.widget.ViewPager$i;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.kwai.live.gzone.promotion.l$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import java.lang.ref.WeakReference;
import fq5.b;
import com.kwai.framework.model.feed.BaseFeed;
import s67.i1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.util.Map;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView$b;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.KwaiViewPager;
import s67.m0;
import android.view.View$OnClickListener;
import mrd.c;

public class l extends PresenterV2	// class@000dce
{
    public List A;
    public c B;
    public List p;
    public e q;
    public List r;
    public c s;
    public ConstraintLayout t;
    public TextView u;
    public GzonePagerSlidingTabStrip v;
    public KwaiViewPager w;
    public k x;
    public b y;
    public BaseFeed z;
    public static final int C;

    static {
       l.C = a1.e(300.00f);
    }
    public void l(){
       super();
       this.B = new n0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.P8();
       if (this.getActivity() == null) {
          return;
       }
       if (this.x == null) {
          k ok = new k(this.getActivity().getSupportFragmentManager(), this.getContext(), this.q, this.p);
          this.x = ok;
          ok.v = this.A;
       }
       this.X7(this.s.subscribe(new o0(this)));
       this.w.setAdapter(this.x);
       int i = 1;
       this.w.setOffscreenPageLimit(Math.min(5, (this.x.j() - i)));
       int i1 = 0;
       this.w.setCurrentItem(i1);
       this.v.setViewPager(this.w);
       this.v.setFadingEdgeLength(a1.e(20.00f));
       this.v.setHorizontalFadingEdgeEnabled(i);
       l tv = this.v;
       boolean b = (this.x.j() > i)? true: false;
       tv.N(b);
       this.v.q();
       this.v.setOnPageChangeListener(new l$a(this));
       View childAt = this.v.getTabsContainer().getChildAt(i1);
       if (childAt != null) {
          childAt.setSelected(i);
       }
       tv = this.w;
       if (tv != null) {
          tv.getViewTreeObserver().addOnGlobalLayoutListener(new l$b(this));
       }
       d.a(-1986139969).registerGlobalDownloadListener(String.valueOf(this.hashCode()), new WeakReference(this.B));
       String str = this.y.d();
       String liveStreamId = this.y.getLiveStreamId();
       String str1 = i1.c(this.z);
       ClientContent$LiveStreamPackage liveStreamPa = this.y.a();
       if (!PatchProxy.applyVoidFourRefs(str, liveStreamId, str1, liveStreamPa, null, i1.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MANAGER_CLICK";
          uElementPack.params = i1.b(str, liveStreamId, str1);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       d.a(-1986139969).unregisterGlobalDownloadListener(String.valueOf(this.hashCode()));
       l tw = this.w;
       if (tw != null) {
          tw.setAdapter(null);
       }
       tw = this.x;
       if (tw != null) {
          Objects.requireNonNull(tw);
          if (!PatchProxy.applyVoid(null, tw, k.class, "19")) {
             Iterator iterator = tw.q.iterator();
             while (iterator.hasNext()) {
                tw.j.beginTransaction().u(iterator.next()).m();
             }
             tw.t.clear();
             k r = tw.r;
             r.b = null;
             r.a = null;
             tw.q.clear();
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       List allGameCente = d.a(-1986139969).getAllGameCenterDownloadInfo();
       if (allGameCente == null) {
          return;
       }
       int i = allGameCente.size();
       if (i > 0) {
          this.u.setText(String.valueOf(i));
          this.u.setVisibility(0);
       }else {
          this.u.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1e41);
       this.v = m1.f(p0, 0x7f0a3cb6);
       this.w = m1.f(p0, 0x7f0a444e);
       this.u = m1.f(p0, 0x7f0a1e44);
       m1.a(p0, new m0(this), R.id.live_gzone_audience_game_promotion_download_icon_image_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.q = this.q8(e.class);
       this.z = this.r8("feed");
       this.p = this.r8("PROMOTION_GAME_LIST");
       this.r = this.r8("PROMOTION_ACTIVITY_LIST");
       this.s = this.r8("PROMOTION_GAME_LIST_UPDATE_SUBJECT");
       this.y = this.r8("LIVE_BASIC_CONTEXT");
       this.A = this.t8("GZONE_PROMOTION_RESOURCE");
       return;
    }
}
