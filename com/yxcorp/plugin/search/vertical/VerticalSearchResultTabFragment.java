package com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment;
import lcd.a;
import ecd.b;
import fbd.e;
import com.yxcorp.plugin.search.result.fragment.SearchTabHostFragment;
import java.util.ArrayList;
import java.util.HashMap;
import gbd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import cdd.k;
import java.util.List;
import ecd.a;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.SearchSource;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Integer;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import x6d.x;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import com.google.gson.JsonObject;
import com.yxcorp.plugin.search.result.b;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.b;
import com.kwai.robust.PatchProxyResult;
import x6d.c0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.feature.component.entry.SearchSceneSource;
import android.content.res.Configuration;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.os.Bundle;
import android.view.View;
import lnc.a1;
import android.content.Context;
import zf6.j;
import nfd.t0;
import android.view.ViewGroup$LayoutParams;
import android.widget.HorizontalScrollView;
import com.kwai.library.widget.viewpager.tabstrip.SearchPagerSlidingTabStrip;
import com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import java.lang.Enum;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.kwai.feature.component.entry.SearchVerticalParams;
import android.text.TextUtils;
import com.yxcorp.plugin.search.vertical.VerticalSearchResultTabFragment$b;
import com.yxcorp.plugin.search.result.fragment.VerticalSceneSearchResultFragment;

public class VerticalSearchResultTabFragment extends SearchTabHostFragment implements a, b, e	// class@0007bc
{
    public final List D;
    public b E;
    public final Map F;
    public int G;
    public SearchKeywordContext H;
    public final v I;

    public void VerticalSearchResultTabFragment(){
       super();
       this.D = new ArrayList();
       this.F = new HashMap();
       this.I = new v();
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, VerticalSearchResultTabFragment.class, "7")) {
          return;
       }
       super.Ch();
       TabHostFragment tv = this.v;
       tv.w = (float)this.D.size();
       tv.H(this.D);
       return;
    }
    public boolean Jg(){
       return a.f(this);
    }
    public void K6(SearchKeywordContext p0,SearchSource p1,String p2,SearchPage p3,boolean p4){
       int i = 0;
       if (PatchProxy.isSupport(VerticalSearchResultTabFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VerticalSearchResultTabFragment.class, "5")) {
             return;
          }
       }
       this.H = p0;
       this.F.clear();
       this.F.put(Integer.valueOf(this.G), Boolean.TRUE);
       List list = this.v.E();
       list.get(this.G).K6(p0, p1, p2, p3, p4);
       while (i < list.size()) {
          if (i != this.G) {
             SearchResultFragment searchResult = list.get(i);
             if (searchResult.q() != null) {
                searchResult.Ac().setVisibility(4);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void Rh(int p0,x p1){
       if (PatchProxy.isSupport(VerticalSearchResultTabFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VerticalSearchResultTabFragment.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TAB";
       a uoa = a.k();
       uoa.d("cond", a.k().d("tab", b.e(p1)).j());
       uElementPack.params = uoa.i();
       i.j(p0, this, uElementPack, null);
       return;
    }
    public boolean Xd(){
       return a.g(this);
    }
    public v Y3(){
       return this.I;
    }
    public BaseFragment Z8(){
       return a.b(this);
    }
    public b f3(){
       return this.E;
    }
    public String getBizType(){
       return a.a(this);
    }
    public int getLayoutResId(){
       return 0x7f0d13b7;
    }
    public String getPageParams(){
       c0 obj = PatchProxy.apply(null, this, VerticalSearchResultTabFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c0.f();
       obj.d(i.f(this.getActivity()));
       obj.e(this.E.s);
       obj.h(this.E.b.mQueryId);
       obj.i(this.E.b.getLoggerKeyWord());
       obj.k(this.E.r.mSourceName);
       obj.m(SearchSceneSource.MY_PROFILE.mLogName);
       return obj.c();
    }
    public String getQuery(){
       return a.c(this);
    }
    public String getUssid(){
       return a.e(this);
    }
    public String o(){
       return "SEARCH_RESULT_GENERAL";
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalSearchResultTabFragment.class, "10")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.t.q();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalSearchResultTabFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       SearchPage pROFILE_FEED = SearchPage.PROFILE_FEED;
       x ox = new x(pROFILE_FEED);
       ox.k(pROFILE_FEED.mTabId);
       ox.j(0);
       this.D.add(ox);
       pROFILE_FEED = SearchPage.PROFILE_LIKE;
       ox = new x(pROFILE_FEED);
       ox.k(pROFILE_FEED.mTabId);
       ox.j(1);
       this.D.add(ox);
       pROFILE_FEED = SearchPage.PROFILE_COLLECT;
       ox = new x(pROFILE_FEED);
       ox.k(pROFILE_FEED.mTabId);
       ox.j(2);
       this.D.add(ox);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VerticalSearchResultTabFragment.class, "3")) {
          return;
       }
       this.Mh(0);
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.result_bar).setVisibility(8);
       int i = 1;
       if (!PatchProxy.applyVoid(null, this, VerticalSearchResultTabFragment.class, "9")) {
          this.t.setScrollSelectedTabToCenter(i);
          this.t.z(0);
          this.t.setIndicatorPadding(0);
          int i3 = 0x7f070f70;
          this.t.setTabTextSize(a1.d(i3));
          this.t.setTextColor(R.drawable.arg_RES_7f081eff);
          this.t.setUnderlineColorInt(a1.a(R.color.arg_RES_7f061d77));
          this.t.setIndicatorColorInt(j.b(this.getContext(), R.color.arg_RES_7f06161f));
          this.t.y(t0.u);
          this.t.w(t0.c);
          ViewGroup$LayoutParams layoutParams = this.t.getLayoutParams();
          layoutParams.height = t0.K;
          this.t.setLayoutParams(layoutParams);
          this.t.A(0, i);
          if (this.t instanceof SearchPagerSlidingTabStrip) {
             i2 = a1.d(i3);
             TabHostFragment tt = this.t;
             tt.z1 = i2;
             tt.A1 = i2;
             tt.setEnableHideSoft(i);
          }
       }
       this.i(new VerticalSearchResultTabFragment$a(this));
       b i1 = this.E.I;
       if (i1 != SearchPage.PROFILE_LIKE.mTabId) {
          i = (i1 == SearchPage.PROFILE_COLLECT.mTabId)? 2: 0;
       }
    label_00be :
       this.t.q();
       this.Nh(2);
       this.G = i;
       this.I.d(this.D.get(i));
       this.u.setCurrentItem(i, 0);
       this.t.t(i, 0);
       for (i2 = 0; i2 < this.D.size(); i2++) {
          this.Rh(0, this.D.get(i2));
       }
       return;
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, VerticalSearchResultTabFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       for (int i = 0; i < this.D.size(); i = i + 1) {
          x ox = this.D.get(i);
          PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(String.valueOf(ox.c().mTabId), ox.a());
          Bundle uBundle = SearchResultFragment.Nh(ox.c());
          uBundle.putString("page_source", this.E.u.name());
          if (!TextUtils.isEmpty(this.E.c.mVerticalParams.mReportExtParams)) {
             uBundle.putString("ext_report_params", this.E.c.mVerticalParams.mReportExtParams);
          }
          obj.add(new VerticalSearchResultTabFragment$b(this, uod, VerticalSceneSearchResultFragment.class, uBundle));
       }
       return obj;
    }
}
