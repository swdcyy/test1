package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.SearchViewElement;
import qsa.i;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.SearchViewElement$mSearchView$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import o56.a;
import java.lang.CharSequence;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xsa.t;
import wq6.f;
import mr6.b;
import gr6.c;
import qsa.c;
import pr6.d;
import xsa.r;
import gsa.e0;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.image.KwaiImageView;
import sb5.e;
import zq6.b;
import bo5.a;
import zq6.p;

public final class SearchViewElement extends i	// class@001701
{
    public final p n;

    public void SearchViewElement(){
       super();
       this.n = s.c(new SearchViewElement$mSearchView$2(this));
    }
    public View c(ViewGroup p0){
       SearchIconEntryView searchIconEn = PatchProxy.applyOneRefs(p0, this, SearchViewElement.class, "2");
       if (searchIconEn != PatchProxyResult.class) {
       }else {
          a.p(p0, "container");
          searchIconEn = new SearchIconEntryView(p0.getContext());
          searchIconEn.setId(R.id.search_btn);
          searchIconEn.setLayoutParams(new ViewGroup$LayoutParams(a1.d(R.dimen.arg_RES_7f070105), a1.d(R.dimen.arg_RES_7f070105)));
          searchIconEn.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
          a hierarchy = searchIconEn.getHierarchy();
          a.o(hierarchy, "hierarchy");
          hierarchy.u(t$b.h);
          searchIconEn.setPlaceHolderImage(HomeTabBarIconExperimentUtils.e());
          if (a.d()) {
             searchIconEn.setContentDescription(a1.p(R.string.arg_RES_7f100f55));
          }
       }
       return searchIconEn;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SearchViewElement.class, "5")) {
          return;
       }
       a.p(p0, "rootPresenter");
       p0.U7(new t(this.f(), this.e().d()));
       p0.U7(new r(this.f(), this.w()));
       PatchProxy.onMethodExit(SearchViewElement.class, "5");
       return;
    }
    public void v(e0 p0){
       Object obj;
       int i;
       SearchViewElement searchViewEl = SearchViewElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, searchViewEl, "3")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       SearchIconEntryView searchIconEn = this.w();
       e0 v = p0.V;
       e0 e = p0.E;
       if (PatchProxy.isSupport(searchViewEl)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(e), this, searchViewEl, "4");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(e != 1){
             if (e != 2) {
                i = HomeTabBarIconExperimentUtils.e();
             }else {
                obj = PatchProxy.apply(null, null, HomeTabBarIconExperimentUtils.class, "7");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else if(HomeTabBarIconExperimentUtils.a()){
                   i = 0x7f0819f7;
                }else {
                   i = 0x7f0819f6;
                }
             }
          }else {
             obj = PatchProxy.apply(null, null, HomeTabBarIconExperimentUtils.class, "5");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(HomeTabBarIconExperimentUtils.a()){
                i = 0x7f0819f5;
             }else {
                i = 0x7f0819f4;
             }
          }
       }else {
          goto label_0035 ;
       }
       e.b(searchIconEn, v, i, t$b.h);
       p j = a.j;
       a.o(j, "HomeTopStateId.RIGHT_BTN_ALPHA");
       obj = this.f().y().d(j);
       a.m(obj);
       this.w().setAlpha((p0.H * obj.floatValue()));
       return;
    }
    public final SearchIconEntryView w(){
       Object obj = PatchProxy.apply(null, this, SearchViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
}
