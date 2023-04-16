package com.yxcorp.plugin.search.sugpage.SuggestFragment$b;
import qvb.f;
import com.yxcorp.plugin.search.sugpage.SuggestFragment;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import e7d.a;
import lyb.n;
import z6d.g;
import z6d.f;
import cjd.e;
import erd.o;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.plugin.search.b;
import sy5.a;
import nfd.n1;
import java.lang.StringBuilder;
import uy5.b;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.yxcorp.plugin.search.SearchMode;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import x6d.f;
import java.util.List;
import com.yxcorp.plugin.search.entity.SearchSuggestResponse;
import la6.b;
import wkd.b;
import kcd.g;
import kcd.h;
import java.util.Collection;

public class SuggestFragment$b extends f	// class@00076e
{
    public final SuggestFragment p;

    public void SuggestFragment$b(SuggestFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       String str;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SuggestFragment obj = PatchProxy.apply(objArray, this, SuggestFragment$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       SearchKeywordContext mMajorKeywor = this.p.R.f().mMajorKeyword;
       obj = this.p.J;
       if (obj != null && obj.getBizType() == 1) {
          return f.a().e(mMajorKeywor).map(new e());
       }
       a uoa = n1.d(this.p.getActivity(), this.p.Q);
       uoa.e("sug_cross_session_id", this.p.F);
       b.m("sug onRequest:"+this.p.F);
       SuggestFragment$b tp = this.p;
       SearchSceneSource mPageSource = tp.O.mPageSource;
       if (tp.Ih() != SearchMode.COMMON_SUGGEST) {
          SuggestFragment q = this.p.Q;
          if (q != null) {
             b u = q.u;
             if (u != null) {
                mPageSource = u.mPageSource;
             }
          }
       }
       g og = f.a();
       SuggestFragment$b tp1 = this.p;
       Objects.requireNonNull(tp1);
       StringBuilder obj1 = PatchProxy.apply(objArray, tp1, SuggestFragment.class, "11");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else {
          String str1 = "";
          if (TextUtils.n(tp1.H, "USER_TAG_SEARCH") && tp1.Q != null) {
             obj1 = "";
             SuggestFragment q1 = tp1.Q;
             Objects.requireNonNull(q1);
             Object obj2 = PatchProxy.apply(objArray, q1, b.class, "3");
             if (obj2 != patchProxyRe) {
                i = obj2.intValue();
             }else {
                b g = q1.g;
                i = (g != null)? g.getTabId(): -1;
             }
             str = obj1+i+str1;
          }else {
             str = str1;
          }
       }
       return og.d(mMajorKeywor, mPageSource, str, uoa.i(), 0).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(SearchSuggestResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SuggestFragment$b.class, "2")) {
          return;
       }
       if (b.a(0x546f6ee8).a("SEARCH_SUGGESTION_PAGE").D == null) {
          p0.getItems().addAll(p0.getDelayItems());
          p0.getDelayItems().clear();
       }
       super.d2(p0, p1);
       return;
    }
}
