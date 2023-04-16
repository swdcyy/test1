package com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$c;
import erd.g;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import y43.a;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import j47.d;
import lnc.a1;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$RankTab;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import android.os.Bundle;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.content.Context;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager$i;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.tab.rank.a;
import bp6.a;
import crd.b;
import h77.m;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class LiveGzoneAudienceRankTabPresenter$c implements g	// class@000e21
{
    public final LiveGzoneAudienceRankTabPresenter b;

    public void LiveGzoneAudienceRankTabPresenter$c(LiveGzoneAudienceRankTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray1;
       String str;
       PagerSlidingTabStrip$d uod2;
       b uob;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGzoneAudienceRankTabPresenter liveGzoneAud = LiveGzoneAudienceRankTabPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceRankTabPresenter$c.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b;
          Object[] objArray = null;
          if (p0.w == null) {
             ArrayList uArrayList = PatchProxy.apply(objArray, p0, liveGzoneAud, "14");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                a u = p0.t.u;
                if (u != null && (u.Ue() != null && p0.t.u.Ue().mEnableGameLiveWeekRank != null)) {
                   str = a1.p(R.string.arg_RES_7f10249f);
                   uod2 = new PagerSlidingTabStrip$d(LiveGzoneAudienceRankTabPresenter$RankTab.WEEKLY_RANK.mTabId, p0.S8(str));
                   uod2.i(p0.R8(uod2.c(), str));
                   uob = PatchProxy.applyOneRefs(uod2, p0, liveGzoneAud, "15");
                   if (uob != patchProxyRe) {
                   }else {
                      uob = new b(uod2, KwaiRnFragment.class, p0.P8("ContributionRankList"));
                   }
                   uArrayList.add(uob);
                }
             label_0083 :
                u = p0.t.u;
                if (u != null && (u.Ue() != null && p0.t.u.Ue().mEnableGameLiveFansGroupRank != null)) {
                   str = a1.p(R.string.arg_RES_7f10245a);
                   uod2 = new PagerSlidingTabStrip$d(LiveGzoneAudienceRankTabPresenter$RankTab.FANS_GROUP_RANK.mTabId, p0.S8(str));
                   uod2.i(p0.R8(uod2.c(), str));
                   uob = PatchProxy.applyOneRefs(uod2, p0, liveGzoneAud, "16");
                   if (uob != patchProxyRe) {
                   }else {
                      uob = new b(uod2, KwaiRnFragment.class, p0.P8("FansRankList"));
                   }
                   uArrayList.add(uob);
                }
             }
          label_00d5 :
             p0 = this.b;
             Objects.requireNonNull(p0);
             LiveGzoneAudienceRankTabPresenter$d uod = PatchProxy.applyOneRefs(uArrayList, p0, liveGzoneAud, "6");
             if (uod != patchProxyRe) {
             }else {
                uod = new LiveGzoneAudienceRankTabPresenter$d(p0, p0.getActivity(), p0.s.b().getChildFragmentManager(), uArrayList);
             }
             p0.w = uod;
             p0 = this.b;
             p0.v.setAdapter(p0.w);
             if (!uArrayList.isEmpty()) {
                this.b.w.D(uArrayList);
             }
             p0 = this.b;
             p0.u.setViewPager(p0.v);
             p0 = this.b;
             p0.v.addOnPageChangeListener(p0.D);
             if (uArrayList.size() < 2) {
                this.b.u.N(false);
             }else {
                this.b.u.N(true);
             }
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, liveGzoneAud, "8")) {
                BaseFragment uBaseFragmen = p0.s.b();
                t ot = uBaseFragmen.m();
                t ot1 = ot.compose(uBaseFragmen.Ug(FragmentEvent.DESTROY_VIEW));
                p0.X7(ot1.subscribe(new a(p0), new a()));
             }
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, liveGzoneAud, "9") && p0.t.s != null) {
                m om = new m(p0);
                p0.B = om;
                p0.t.K.P4(om);
             }
          }
       label_018e :
          p0 = this.b;
          if (p0.z != null && p0.v.getCurrentItem()) {
             p0.z = false;
          }else {
             p0 = this.b;
             if (p0.A == null) {
                p0.A = LiveGzoneTabSource.RANK;
             }
             if (p0.v.getCurrentItem()) {
                this.b.v.setCurrentItem(false);
             }else {
                p0 = this.b;
                Objects.requireNonNull(p0);
                if (PatchProxy.isSupport(liveGzoneAud)) {
                   objArray1 = PatchProxy.applyOneRefs(Integer.valueOf(false), p0, liveGzoneAud, "10");
                   if (objArray1 != patchProxyRe) {
                   label_01e0 :
                      if (objArray1 instanceof RecyclerFragment) {
                         objArray1.a();
                      }
                      int currentItem = this.b.v.getCurrentItem();
                      PagerSlidingTabStrip$d uod1 = this.b.w.b(currentItem);
                      if (uod1 != null) {
                         this.b.X8(uod1, currentItem);
                      }
                   }
                }
                p0 = p0.w;
                if (p0 != null) {
                   objArray = p0.a(false);
                }
                objArray1 = objArray;
                goto label_01e0 ;
             }
             this.b.Y8(this.b.w.getCurrentIndex());
          }
       }else {
          this.b.W8();
       }
       return;
    }
}
