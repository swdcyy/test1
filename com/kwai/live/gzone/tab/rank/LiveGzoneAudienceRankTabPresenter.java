package com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$a;
import h77.l;
import h63.i;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import mq5.h;
import mq5.b;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$c;
import erd.g;
import crd.b;
import brd.t;
import i63.b;
import h77.k;
import i63.b$a;
import g63.g;
import g63.h;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import g63.i;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import h77.j;
import android.widget.TextView;
import com.kwai.library.widget.textview.SimpleMediumStyleTextView;
import android.content.Context;
import java.lang.CharSequence;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Integer;
import android.view.View;
import m02.o;
import com.kuaishou.android.live.model.QLivePlayConfig;
import sr5.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import com.kwai.live.gzone.tab.page.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import xp5.a;
import dz1.a;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$d;
import java.util.List;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import ekd.m1;
import h77.i;
import io.reactivex.subjects.PublishSubject;

public class LiveGzoneAudienceRankTabPresenter extends PresenterV2	// class@000e23
{
    public LiveGzoneTabSource A;
    public c B;
    public i C;
    public ViewPager$i D;
    public final c p;
    public b q;
    public PublishSubject r;
    public b s;
    public a t;
    public GzonePagerSlidingTabStrip u;
    public ViewPager v;
    public a w;
    public KwaiDialogFragment x;
    public h y;
    public boolean z;

    public void LiveGzoneAudienceRankTabPresenter(){
       super();
       this.p = new LiveGzoneAudienceRankTabPresenter$a(this);
       this.y = new l(this);
       this.C = new i();
       this.D = new LiveGzoneAudienceRankTabPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceRankTabPresenter.class, "5")) {
          return;
       }
       this.t.z.Km(this.y);
       this.X7(this.r.subscribe(new LiveGzoneAudienceRankTabPresenter$c(this)));
       this.q.z(true);
       this.q.B(new k(this));
       a n = this.t.N;
       if (n != null) {
          i.b(this.u, n.a());
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAudienceRankTabPresenter.class, "20")) {
          return;
       }
       this.W8();
       this.t.z.le(this.y);
       this.V8();
       this.z = false;
       this.v.removeOnPageChangeListener(this.D);
       this.v.setAdapter(objArray);
       this.A = objArray;
       LiveGzoneAudienceRankTabPresenter tt = this.t;
       if (tt.s != null) {
          LiveGzoneAudienceRankTabPresenter tB = this.B;
          if (tB != null) {
             tt.K.d5(tB);
          }
       }
       return;
    }
    public final Bundle P8(String p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putString("ComponentName", p0);
       return obj;
    }
    public final View$OnClickListener R8(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGzoneAudienceRankTabPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this, p0, p1);
    }
    public final TextView S8(String p0){
       SimpleMediumStyleTextView obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SimpleMediumStyleTextView(this.getContext());
       obj.setText(p0);
       obj.setFocusable(true);
       obj.setGravity(17);
       obj.setSingleLine();
       obj.setId(R.id.tab_text);
       return obj;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceRankTabPresenter.class, "13")) {
          return;
       }
       LiveGzoneAudienceRankTabPresenter tx = this.x;
       if (tx != null) {
          tx.dismissAllowingStateLoss();
          this.x = null;
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceRankTabPresenter.class, "7")) {
          return;
       }
       this.C.a(this.s.a(), this.s.b(), this.q);
       return;
    }
    public void X8(PagerSlidingTabStrip$d p0,int p1){
       LiveGzoneAudienceRankTabPresenter liveGzoneAud = LiveGzoneAudienceRankTabPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveGzoneAud, "4")) {
          return;
       }
       if (this.A == null) {
          return;
       }
       String str = p0.b().getText().toString();
       this.W8();
       this.C.d(str, p0.c(), p1);
       if (this.t.E.v0()) {
          this.C.c();
       }
       this.t.J.C0();
       String str1 = p0.c();
       String str2 = this.q.t().d();
       String str3 = this.q.t().e();
       int i = this.q.n();
       ClientContent$LiveStreamPackage liveStreamPa = this.s.a();
       LiveGzoneAudienceRankTabPresenter tA = this.A;
       if (tA == null) {
          tA = LiveGzoneTabSource.UNKNOWN;
       }
       a.o(str, str1, p1, str2, str3, i, liveStreamPa, false, tA.mValues, LiveGzoneTab$TabType.RANK, "", a.e(this.t.y4()));
       this.A = null;
       return;
    }
    public void Y8(int p0){
       LiveGzoneAudienceRankTabPresenter liveGzoneAud = LiveGzoneAudienceRankTabPresenter.class;
       if (PatchProxy.isSupport(liveGzoneAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveGzoneAud, "3")) {
          return;
       }
       liveGzoneAud = this.w;
       if (liveGzoneAud instanceof LiveGzoneAudienceRankTabPresenter$d) {
          LiveGzoneAudienceRankTabPresenter$d m = liveGzoneAud.m;
          if (m != null) {
             int i = 0;
             while (i < m.size()) {
                KwaiRnFragment kwaiRnFragme = this.w.a(i);
                if (kwaiRnFragme != null) {
                   if (i == p0) {
                      kwaiRnFragme.lg();
                   }else {
                      kwaiRnFragme.df();
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1f7b);
       this.v = m1.f(p0, 0x7f0a1f7c);
       m1.a(p0, new i(this), R.id.live_gzone_rank_rule_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceRankTabPresenter.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_GZONE_RANK_TAB_PAGE");
       this.r = this.r8("LIVE_GZONE_RANK_PAGE_SELECTED_SUBJECT");
       this.t = this.q8(a.class);
       return;
    }
}
