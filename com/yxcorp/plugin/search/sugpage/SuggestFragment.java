package com.yxcorp.plugin.search.sugpage.SuggestFragment;
import e7d.i;
import ecd.b;
import e7d.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.concurrent.LinkedBlockingDeque;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.yxcorp.plugin.search.SearchMode;
import com.yxcorp.plugin.search.sugpage.SuggestFragment$a;
import java.lang.Object;
import wkd.b;
import kcd.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.t;
import s8d.a;
import com.yxcorp.plugin.search.entity.SearchSuggestResponse;
import qvb.i;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.sugpage.SuggestFragment$c;
import kcd.o;
import java.lang.Runnable;
import lyb.n;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import e7d.a;
import java.lang.Throwable;
import java.lang.Boolean;
import kcd.g;
import kcd.h;
import androidx.recyclerview.widget.RecyclerView;
import ecd.a;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import nfd.s1;
import com.kwai.sdk.switchconfig.a;
import red.g;
import java.util.Map;
import x6d.c0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import gbd.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.yxcorp.plugin.search.SearchSource;
import yr4.a$a;
import nfd.r3;
import nfd.n1;
import com.yxcorp.plugin.search.SearchPage;
import w7d.e;
import nfd.t;
import qvb.f;
import qvb.n0;
import qvb.a;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lyb.e;
import android.os.Bundle;
import j06.d;
import java.lang.StringBuilder;
import uy5.b;
import java.util.Queue;
import qvb.q;
import qvb.j;
import crd.b;
import lnc.b9;
import android.view.View;
import com.yxcorp.plugin.search.widget.HideInputPanRefreshLayout;
import java.util.Objects;
import java.util.Set;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.widget.SwipeLayout;
import joc.n;
import ofd.a;
import joc.c;
import brd.t;
import com.yxcorp.plugin.search.sugpage.a;
import erd.r;
import red.e;
import erd.g;
import red.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import com.yxcorp.plugin.search.entity.SuggestItem;
import com.kwai.framework.model.user.User;
import com.yxcorp.plugin.search.entity.SuggestKeywordItem;
import q2b.h$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import fbd.j;
import k2b.u1;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import red.f;
import red.d;
import com.yxcorp.plugin.search.sugpage.SuggestFragment$b;

public class SuggestFragment extends RecyclerFragment implements i, b, d	// class@000770
{
    public String F;
    public b G;
    public String H;
    public boolean I;
    public n J;
    public d K;
    public boolean L;
    public Queue M;
    public f N;
    public SearchSceneSource O;
    public SearchMode P;
    public b Q;
    public final a R;
    public static final int S;

    public void SuggestFragment(){
       super();
       this.H = "SEARCH_HOME_PAGE";
       this.M = new LinkedBlockingDeque();
       this.O = SearchSceneSource.UNKNOWN;
       this.P = SearchMode.COMMON_SUGGEST;
       this.R = new SuggestFragment$a(this, this);
       b.a(0x23142f78).f(this);
    }
    public static SuggestFragment Jh(SearchSceneSource p0,b p1,SearchMode p2){
       SuggestFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, SuggestFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SuggestFragment();
       if (p0 == null) {
          p0 = SearchSceneSource.UNKNOWN;
       }
       obj.O = p0;
       obj.Q = p1;
       obj.P = p2;
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SuggestFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public SearchSuggestResponse C5(){
       Object obj = PatchProxy.apply(null, this, SuggestFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q().L0();
    }
    public boolean Dh(){
       return false;
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, SuggestFragment.class, "19")) {
          return;
       }
       if (q.f(this.C5().getDelayItems())) {
          return;
       }
       b.a(0x4a5206af).c(new SuggestFragment$c(this));
       return;
    }
    public n Hh(){
       return this.J;
    }
    public SearchMode Ih(){
       return this.P;
    }
    public boolean Jg(){
       return false;
    }
    public void Kh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuggestFragment.class, "2")) {
          return;
       }
       this.R.t(SearchKeywordContext.simpleContext(p0));
       return;
    }
    public void Lh(String p0){
       this.H = p0;
    }
    public int M(){
       return 8;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(SuggestFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, SuggestFragment.class, "14")) {
          return;
       }
       super.M1(p0, p1);
       String str = "SEARCH_SUGGESTION_PAGE";
       if (str.equals(this.o())) {
          b.a(0x546f6ee8).a(str).h(0, true);
       }
       return;
    }
    public b M8(){
       return this.Q;
    }
    public RecyclerView Qf(){
       return this.t;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xd(){
       return a.g(this);
    }
    public boolean Xg(){
       return false;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SuggestFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SuggestFragment.class, "12")) {
          return;
       }
       super.Z1(p0, p1);
       if (("SEARCH_SUGGESTION_PAGE").equals(this.o())) {
          b.a(0x546f6ee8).a("SEARCH_SUGGESTION_PAGE").c(0);
          if (p0) {
             PageMonitor.INSTANCE.trackPageRequestStart(this);
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, SuggestFragment.class, "24") && this.L == null) {
          Object obj = PatchProxy.apply(objArray, objArray, s1.class, "2");
          obj = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableSearchSugOpt", 0);
          if (obj) {
             obj.D = true;
             this.L = true;
             b.a(0x4a5206af).c(new g(this));
          }
       }
    label_0094 :
       return;
    }
    public BaseFragment Z8(){
       return a.b(this);
    }
    public SuggestFragment b(){
       return this;
    }
    public b f3(){
       return a.d(this);
    }
    public String getBizType(){
       return "search_sug";
    }
    public int getLayoutResId(){
       return 0x7f0d1478;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SuggestFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SuggestFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       c0 obj = PatchProxy.apply(null, this, SuggestFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c0.f();
       obj.d(i.f(this.getActivity()));
       obj = obj.a(this.getActivity());
       obj.m(this.O.mLogName);
       obj.g(this.H);
       return obj.c();
    }
    public String getQuery(){
       return a.c(this);
    }
    public String getUssid(){
       Object obj = PatchProxy.apply(null, this, SuggestFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C5().mUssid;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, SuggestFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.R.f().mMajorKeyword) ^ 0x01);
    }
    public void kd(String p0,int p1,Map p2){
       if (PatchProxy.isSupport(SuggestFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, SuggestFragment.class, "20")) {
          return;
       }
       if (this.Q == null) {
          return;
       }
       SearchKeywordContext searchKeywor = SearchKeywordContext.simpleContext(p0);
       searchKeywor.mSugType = p1;
       SearchSource sUGGEST = SearchSource.SUGGEST;
       t.a(this, r3.y(searchKeywor, sUGGEST, this.C5().mUssid, null, n1.l(this.Q, this), r3.d(sUGGEST.mSearchFrom, this, p2), null));
       return;
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, SuggestFragment.class, "21")) {
          return;
       }
       this.R.c();
       f uof = this.q();
       if (uof != null) {
          uof.release();
          uof.clear();
          uof.T1(false);
       }
       if (this.g7() != null) {
          this.g7().k0();
       }
       return;
    }
    public boolean n5(){
       return true;
    }
    public String o(){
       SuggestFragment obj = PatchProxy.apply(null, this, SuggestFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       if (obj != null && !TextUtils.x(obj.o())) {
          return this.J.o();
       }
       if (this.O != SearchSceneSource.UNKNOWN) {
          return "SEARCH_SUGGESTION_GENERAL";
       }
       return "SEARCH_SUGGESTION_PAGE";
    }
    public a ob(){
       return this.R;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuggestFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.F = d.a("sug");
       b.m("sug onCreate:"+this.F);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SuggestFragment.class, "23")) {
          return;
       }
       super.onDestroy();
       this.M.clear();
       this.L = false;
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SuggestFragment.class, "3")) {
          return;
       }
       this.q().f(this.R);
       b9.a(this.G);
       if (this.getView() instanceof HideInputPanRefreshLayout) {
          HideInputPanRefreshLayout view = this.getView();
          Objects.requireNonNull(view);
          if (!PatchProxy.applyVoid(objArray, view, HideInputPanRefreshLayout.class, "3")) {
             view.h1.clear();
          }
       }
       super.onDestroyView();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, SuggestFragment.class, "4")) {
          return;
       }
       super.onResume();
       this.R.c();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SuggestFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.I != null) {
          a.a(this.getActivity(), p0, this).x(3.00f);
       }
       this.G = this.n1().filter(a.b).subscribe(new e(this));
       return;
    }
    public g t6(){
       Object obj = PatchProxy.apply(null, this, SuggestFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t6();
    }
    public String u6(){
       Object obj = PatchProxy.apply(null, this, SuggestFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R.g().mMajorKeyword;
    }
    public void v2(boolean p0,boolean p1){
       Object obj = this;
       if (PatchProxy.isSupport(SuggestFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, SuggestFragment.class, "13")) {
          return;
       }
       super.v2(p0, p1);
       String str = "SEARCH_SUGGESTION_PAGE";
       int i = 0;
       if (str.equals(this.o())) {
          b.a(0x546f6ee8).a(str).h(i, i);
          b.a(0x546f6ee8).a(str).e(i);
          b.a(0x546f6ee8).a(str).u(this.C5().mCostInfo);
       }
       SearchKeywordContext mMajorKeywor = obj.R.f().mMajorKeyword;
       List items = this.C5().getItems();
       String str1 = this.u6();
       if (!PatchProxy.applyVoidThreeRefs(this, items, str1, null, h.class, "1") && !q.f(items)) {
          ClientContent$SearchResultPackage[] searchResult = new ClientContent$SearchResultPackage[items.size()];
          int i1 = 3;
          while (i < items.size()) {
             ClientContent$SearchResultPackage searchResult1 = new ClientContent$SearchResultPackage();
             SuggestItem suggestItem = items.get(i);
             int i2 = i + 1;
             searchResult1.position = i2;
             SuggestItem mUser = suggestItem.mUser;
             if (mUser != null) {
                searchResult1.contentId = mUser.getId();
                searchResult1.secondaryType = "user";
                searchResult1.name = suggestItem.mUser.mName;
             }else {
                searchResult1.secondaryType = "word";
                searchResult1.name = suggestItem.mKeywordItem.mKeyWord;
             }
             searchResult1.type = i1;
             searchResult1.keyword = str1;
             searchResult[i] = searchResult1;
             i = i2;
          }
          h$a uoa = h$a.a();
          uoa.d(i1);
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 145;
          urlPackage.params = this.getPageParams();
          urlPackage.category = this.M();
          urlPackage.subPages = this.getUrl();
          uoa.b(SearchKeywordContext.getEncryptedMobile(str1));
          uoa.e(2);
          uoa.f(urlPackage);
          uoa.c(searchResult);
          if (!PatchProxy.applyVoidTwoRefs(null, uoa, null, j.class, "1")) {
             String searchResult2 = "";
             if (!PatchProxy.applyVoidThreeRefs(searchResult2, null, uoa, null, u1.class, "33")) {
                b.a(0x4b316083).e0(searchResult2, uoa, null);
             }
          }
       }
       if (mMajorKeywor != null && (this.getView() != null && !mMajorKeywor.equals(obj.R.g().mMajorKeyword))) {
          this.getView().post(new f(obj));
       }
    label_014d :
       return;
    }
    public g vh(){
       d obj = PatchProxy.apply(null, this, SuggestFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d(this);
       this.K = obj;
       return obj;
    }
    public i yh(){
       SuggestFragment$b obj = PatchProxy.apply(null, this, SuggestFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SuggestFragment$b(this);
       obj.h(this.R);
       return obj;
    }
}
