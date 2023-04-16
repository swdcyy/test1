package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$a;
import nsd.u;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$mContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import dx2.h;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$e;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$mTabSelectedStatisticsListener$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$g;
import android.view.View;
import java.util.List;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Integer;
import gka.j;
import java.lang.Math;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel;
import com.google.android.material.tabs.TabLayout$f;
import com.google.android.material.tabs.TabLayout;
import java.lang.CharSequence;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$f;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterTab;
import android.os.Bundle;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$onCreate$1;
import java.util.Objects;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannelResponse;
import msd.p;
import java.util.HashMap;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout$c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.ScrollAwareTabLayout;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.ScrollAwareTabLayout$a;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import fx2.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.text.SpannableString;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import android.widget.FrameLayout;
import fx2.d;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$f;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1;
import android.view.View$OnClickListener;
import java.lang.Number;
import dx2.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import mw2.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import k2b.u1;
import android.text.style.StyleSpan;

public final class VoicePartyTheaterTubeListTabFragment extends TabHostFragmentV2	// class@001a2a
{
    public final VoicePartyTheaterTubeListTabFragment$e A;
    public final VoicePartyTheaterTubeListTabFragment$g B;
    public View C;
    public HashMap D;
    public final p q;
    public LiveVoicePartyTheaterCommonConfig$TheaterTab r;
    public List s;
    public int t;
    public Integer u;
    public StyleSpan v;
    public h w;
    public VoicePartyTheaterTubeSearchFragment x;
    public final VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener y;
    public final VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper z;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final VoicePartyTheaterTubeListTabFragment$a H;

    static {
       VoicePartyTheaterTubeListTabFragment.H = new VoicePartyTheaterTubeListTabFragment$a(null);
       String str = m0.d(VoicePartyTheaterTubeListTabFragment.class).o();
       VoicePartyTheaterTubeListTabFragment.E = str;
       VoicePartyTheaterTubeListTabFragment.F = a.C(str, "_tab_conf");
       VoicePartyTheaterTubeListTabFragment.G = a.C(str, "_tube_channel");
    }
    public void VoicePartyTheaterTubeListTabFragment(){
       super();
       this.q = s.c(new VoicePartyTheaterTubeListTabFragment$mContext$2(this));
       this.t = Integer.MAX_VALUE;
       this.w = h.a;
       this.y = new VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener(this);
       this.z = new VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper(this);
       this.A = new VoicePartyTheaterTubeListTabFragment$e(new VoicePartyTheaterTubeListTabFragment$mTabSelectedStatisticsListener$1(this));
       this.B = new VoicePartyTheaterTubeListTabFragment$g(this);
    }
    public static final View mh(VoicePartyTheaterTubeListTabFragment p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mTabLayoutContainer");
       }
       return p0;
    }
    public static final List nh(VoicePartyTheaterTubeListTabFragment p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mTubeChannels");
       }
       return p0;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeListTabFragment.class, "9")) {
          return;
       }
       BaseFragment uBaseFragmen = this.ph();
       if (uBaseFragmen != null) {
          uBaseFragmen.bh(false);
       }
       return;
    }
    public List fh(){
       ArrayList obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       VoicePartyTheaterTubeListTabFragment ts = this.s;
       String str = "mTubeChannels";
       if (ts == null) {
          a.S(str);
       }
       if (ts.isEmpty()) {
          ts = this.u;
          if (ts != null) {
             a.m(ts);
             obj.add(this.oh(ts.intValue(), ""));
          }
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          int i = Math.min(ts.size(), this.t);
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             VoicePartyTheaterTubeListTabFragment ts1 = this.s;
             if (ts1 == null) {
                a.S(str);
             }
             VoicePartyTheaterTubeChannel voicePartyTh = ts1.get(i1);
             voicePartyTh = voicePartyTh.mName;
             a.o(voicePartyTh, "channel.mName");
             obj.add(this.oh(voicePartyTh.mChannelId, voicePartyTh));
          }
       }
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d16ea;
    }
    public final j oh(int p0,String p1){
       VoicePartyTheaterTubeListTabFragment obj1;
       Bundle uBundle;
       TabHostFragmentV2 tabHostFragm = this;
       Object obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment.class)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), obj, this, VoicePartyTheaterTubeListTabFragment.class, "15");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       TabLayout$f uof = tabHostFragm.j.w();
       uof.n(Integer.valueOf(p0));
       uof.o(obj);
       a.o(uof, "mTabLayout.newTab\(\).appl¡­d\n      text = name\n    }");
       obj1 = tabHostFragm.r;
       String str = "mTabConfig";
       if (obj1 == null) {
          a.S(str);
       }
       LiveVoicePartyTheaterCommonConfig$TheaterTab mTabId = obj1.mTabId;
       obj1 = tabHostFragm.r;
       if (obj1 == null) {
          a.S(str);
       }
       LiveVoicePartyTheaterCommonConfig$TheaterTab mTabName = obj1.mTabName;
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListFragment.class)) {
          uBundle = PatchProxy.applyFourRefs(mTabId, mTabName, Integer.valueOf(p0), p1, null, VoicePartyTheaterTubeListFragment.class, "1");
          if (uBundle != patchProxyRe) {
             int i = p0;
          label_0088 :
             VoicePartyTheaterTubeListTabFragment$f uof1 = new VoicePartyTheaterTubeListTabFragment$f(this, uof, p0, p1, uof, VoicePartyTheaterTubeListFragment.class, uBundle);
             return v11;
          }
       }
       uBundle = new Bundle();
       uBundle.putString(VoicePartyTheaterTubeListFragment.N, mTabId);
       uBundle.putString(VoicePartyTheaterTubeListFragment.O, mTabName);
       uBundle.putInt(VoicePartyTheaterTubeListFragment.P, p0);
       uBundle.putString(VoicePartyTheaterTubeListFragment.Q, obj);
       goto label_0088 ;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, VoicePartyTheaterTubeListTabFragment.class, "5")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       int i = 0;
       TabHostFragmentV2 tk = this.k;
       a.o(tk, "mViewPager");
       int childCount = tk.getChildCount();
       if (childCount >= 0) {
          Fragment uFragment = this.eh(i);
          while (uFragment != null) {
             uFragment.onActivityResult(p0, p1, p2);
             break ;
             i = i + 1;
          }
          if (i != childCount) {
             goto label_0039 ;
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       VoicePartyTheaterTubeListTabFragment$a h = VoicePartyTheaterTubeListTabFragment.H;
       Bundle uBundle = this.requireArguments();
       a.o(uBundle, "requireArguments\(\)");
       VoicePartyTheaterTubeListTabFragment$onCreate$1 oonCreate$1 = new VoicePartyTheaterTubeListTabFragment$onCreate$1(this);
       Objects.requireNonNull(h);
       if (!PatchProxy.applyVoidTwoRefs(uBundle, oonCreate$1, h, VoicePartyTheaterTubeListTabFragment$a.class, str)) {
          Serializable serializable = SerializableHook.getSerializable(uBundle, VoicePartyTheaterTubeListTabFragment.F);
          a.m(serializable);
          Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig.TheaterTab");
          VoicePartyTheaterTubeChannelResponse voicePartyTh = b.a(uBundle.getParcelable(VoicePartyTheaterTubeListTabFragment.G));
          a.o(voicePartyTh, "rsp");
          oonCreate$1.invoke(serializable, voicePartyTh);
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeListTabFragment.class, "21")) {
       }else {
          VoicePartyTheaterTubeListTabFragment tD = this.D;
          if (tD != null) {
             tD.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str1;
       VoicePartyTheaterTubeListTabFragment ts;
       View view;
       TabHostFragmentV2 tj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListTabFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       String str = "mTubeChannels";
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment.class, "11")) {
          tj = this.k;
          str1 = "mViewPager";
          a.o(tj, str1);
          tj.setOffscreenPageLimit(2);
          this.j.a(this.A);
          if (this.u != null) {
             ts = this.s;
             if (ts == null) {
                a.S(str);
             }
             Iterator iterator = ts.iterator();
             int i = 0;
             int i1 = 0;
             while (iterator.hasNext()) {
                VoicePartyTheaterTubeChannel obj = iterator.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                obj = obj.mChannelId;
                VoicePartyTheaterTubeListTabFragment tu = this.u;
                if (tu != null && obj == tu.intValue()) {
                   i = i1;
                }
                i1 = i2;
             }
             tj = this.k;
             a.o(tj, str1);
             if (tj.getCurrentItem() != i) {
                tj = this.k;
                a.o(tj, str1);
                tj.setCurrentItem(i);
             }
          }
          BaseFragment uBaseFragmen = this.ph();
          if (uBaseFragmen != null) {
             uBaseFragmen.bh(this.K0());
          }
       }
       str1 = 8;
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment.class, "12")) {
          view = p0.findViewById(R.id.tab_layout_container);
          a.o(view, "view.findViewById<View>\(R.id.tab_layout_container\)");
          this.C = view;
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          String str2 = "mTabLayout";
          if (ts.isEmpty()) {
             ts = this.C;
             if (ts == null) {
                a.S("mTabLayoutContainer");
             }
             ts.setVisibility(str1);
          }else {
             tj = this.j;
             Objects.requireNonNull(tj, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.theater.tube.widget.ScrollAwareTabLayout");
             tj.setOnScrollListener(this.y);
             if (!PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeListTabFragment.class, "18")) {
                tj = this.j;
                a.o(tj, str2);
                tj.getViewTreeObserver().addOnGlobalLayoutListener(new g(this));
             }
          }
          tj = this.j;
          a.o(tj, str2);
          TabLayout$f uof = tj.v(tj.getSelectedTabPosition());
          if (uof != null) {
             a.o(uof, "this");
             if (uof.e() != null) {
                CharSequence uCharSequenc = uof.e();
                a.m(uCharSequenc);
                a.o(uCharSequenc, "this.text!!");
                uof.o(this.th(uCharSequenc, 1));
             }
          }
          this.j.a(this.B);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment.class, "13")) {
          SearchView searchView = p0.findViewById(R.id.voice_party_theater_tube_search_view);
          a.o(searchView, "searchView");
          VoicePartyTheaterTubeListTabFragment tr = this.r;
          if (tr == null) {
             a.S("mTabConfig");
          }
          if (tr.mSearchable != null) {
             str1 = 0;
          }
          searchView.setVisibility(str1);
          searchView.setSearchCallback(new d(this));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment.class, "14")) {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          if (ts.size() > this.t) {
             view = p0.findViewById(R.id.tab_layout_more_btn);
             a.o(view, "moreButton");
             view.setVisibility(0);
             view.setOnClickListener(new VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1(this, p0));
          }
       }
       return;
    }
    public BaseFragment ph(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.t();
    }
    public final int qh(int p0){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VoicePartyTheaterTubeListTabFragment.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = -1;
       VoicePartyTheaterTubeListTabFragment ts = this.s;
       if (ts == null) {
          a.S("mTubeChannels");
       }
       int i1 = 0;
       Iterator iterator = ts.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i2 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (obj1.mChannelId == p0) {
             i = i1;
          }
          i1 = i2;
       }
       return i;
    }
    public final p rh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final void sh(int p0){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTheaterTubeListTabFragment.class, "19")) {
          return;
       }
       VoicePartyTheaterTubeListTabFragment ts = this.s;
       String str = "mTubeChannels";
       if (ts == null) {
          a.S(str);
       }
       if (p0 >= ts.size()) {
          return;
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          VoicePartyTheaterTubeChannel voicePartyTh = ts.get(p0);
          ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
          tagPackage.identity = String.valueOf(voicePartyTh.mChannelId);
          tagPackage.name = voicePartyTh.mName;
          tagPackage.index = (long)(p0 + 1);
          ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
          ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[]{tagPackage};
          tagShowPacka.tagPackage = tagPackageAr;
          p op = this.rh();
          a.o(op, "mContext");
          ClientContent$LiveStreamPackage liveStreamPa = op.d().a();
          p op1 = this.rh();
          a.o(op1, "mContext");
          f2 uof2 = op1.g();
          if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uof2, tagShowPacka, null, e.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_SERIES_TAB";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.liveVoicePartyTheaterPackage = e.b(uof2);
             uContentPack.tagShowPackage = tagShowPacka;
             ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
             uContentWrap.liveVoicePartyPackage = n.g(uof2);
             u1.v0(9, uElementPack, uContentPack, uContentWrap);
          }
          return;
       }
    }
    public Fragment t(){
       return this.ph();
    }
    public final SpannableString th(CharSequence p0,int p1){
       SpannableString obj;
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, VoicePartyTheaterTubeListTabFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SpannableString(p0);
       StyleSpan styleSpan = new StyleSpan(p1);
       if (!p1) {
          obj.removeSpan(this.v);
       }else {
          this.v = styleSpan;
          obj.setSpan(styleSpan, 0, p0.length(), 34);
       }
       return obj;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeListTabFragment.class, "8")) {
          return;
       }
       BaseFragment uBaseFragmen = this.ph();
       if (uBaseFragmen != null) {
          uBaseFragmen.bh(true);
       }
       this.z.c();
       return;
    }
}
