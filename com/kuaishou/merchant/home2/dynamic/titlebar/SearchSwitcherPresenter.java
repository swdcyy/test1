package com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$a;
import nsd.u;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$c;
import hy3.a;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$b;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$d;
import sfc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$onBind$2;
import gy3.c;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import b04.d;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$onBind$3;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$onUnbind$1;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$onUnbind$2;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$onUnbind$3;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import com.kuaishou.merchant.home2.dynamic.titlebar.model.SearchSwitcherSkin;
import lnc.a1;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import qy5.b;
import gy3.b;
import java.util.Collection;
import java.util.List;
import ekd.x0;
import com.kwai.feature.component.model.SearchPlaceHolderInfo;
import java.util.Collections;
import ey3.a;
import android.widget.ImageView;
import android.view.ViewGroup;
import zf6.k;
import ekd.m1;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.PointF;
import oy5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$doInject$1;

public final class SearchSwitcherPresenter extends PresenterV2 implements LifecycleObserver	// class@00176e
{
    public final b A;
    public final a B;
    public final a C;
    public BaseFragment p;
    public d q;
    public SearchSwitcherEntryView r;
    public View s;
    public MerchantKwaiImageView t;
    public HomePage u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public HomePage z;
    public static final SearchSwitcherPresenter$a D;

    static {
       SearchSwitcherPresenter.D = new SearchSwitcherPresenter$a(null);
    }
    public void SearchSwitcherPresenter(){
       super();
       this.x = true;
       this.A = new SearchSwitcherPresenter$c(this);
       this.B = new a();
       this.C = new SearchSwitcherPresenter$b(this);
    }
    public static final View P8(SearchSwitcherPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSearchContainer");
       }
       return p0;
    }
    public static final SearchSwitcherEntryView R8(SearchSwitcherPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mSearchSwitcher");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SearchSwitcherPresenter.class, "5")) {
          return;
       }
       SearchSwitcherPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       this.X7(tp.m().subscribe(new SearchSwitcherPresenter$d(this), new a()));
       tp = this.q;
       String str = "homePageViewModel";
       if (tp == null) {
          a.S(str);
       }
       GifshowActivity gifshowActiv = this.S8();
       String str1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity";
       Objects.requireNonNull(gifshowActiv, str1);
       tp.I0(gifshowActiv, new c(new SearchSwitcherPresenter$onBind$2(this)));
       tp = this.q;
       if (tp == null) {
          a.S(str);
       }
       GifshowActivity gifshowActiv1 = this.S8();
       Objects.requireNonNull(gifshowActiv1, str1);
       c uoc = new c(new SearchSwitcherPresenter$onBind$3(this));
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidTwoRefs(gifshowActiv1, uoc, tp, d.class, "12")) {
          tp.o.observe(gifshowActiv1, uoc);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SearchSwitcherPresenter.class, "17")) {
          return;
       }
       SearchSwitcherPresenter tr = this.r;
       if (tr == null) {
          a.S("mSearchSwitcher");
       }
       tr.e();
       tr = this.q;
       String str = "homePageViewModel";
       if (tr == null) {
          a.S(str);
       }
       tr.Q0(new c(new SearchSwitcherPresenter$onUnbind$1(this)));
       tr = this.q;
       if (tr == null) {
          a.S(str);
       }
       c uoc = new c(new SearchSwitcherPresenter$onUnbind$2(this));
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(uoc, tr, d.class, "13")) {
          tr.o.removeObserver(uoc);
       }
       tr = this.q;
       if (tr == null) {
          a.S(str);
       }
       tr.w0().removeObserver(new c(new SearchSwitcherPresenter$onUnbind$3(this)));
       return;
    }
    public GifshowActivity S8(){
       Activity obj = PatchProxy.apply(null, this, SearchSwitcherPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getActivity();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       return obj;
    }
    public final boolean V8(){
       Object obj = PatchProxy.apply(null, this, SearchSwitcherPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.B.g) && this.B.h == 2)? true: false;
       return b;
    }
    public final void W8(HomePage p0){
       SearchSwitcherPresenter tr;
       SearchSwitcherPresenter tr1;
       HomePage mDarkModeSea;
       SearchSwitcherPresenter searchSwitch = SearchSwitcherPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "18")) {
          return;
       }
       if (p0 != null && !a.g(this.z, p0)) {
          this.z = p0;
          if (!PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "19")) {
             String str = "2";
             if (!PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "21")) {
                if (this.Z8(p0)) {
                   mDarkModeSea = p0.mDarkModeSearchSwitcherSkin;
                   if (mDarkModeSea != null) {
                      this.B.c(mDarkModeSea);
                   }
                }else {
                   mDarkModeSea = p0.mSearchSwitcherSkin;
                   if (mDarkModeSea == null) {
                      tr = this.B;
                      Objects.requireNonNull(tr);
                      if (!PatchProxy.applyVoid(null, tr, a.class, str)) {
                         tr.a = a1.a(0x7f0604ba);
                         int i1 = 0x7f0620c7;
                         tr.b = a1.a(i1);
                         tr.c = a1.a(0x7f061d96);
                         tr.d = a1.a(0x7f0604ba);
                         tr.e = a1.a(i1);
                         tr.f = a1.a(i1);
                         tr.g = "";
                         tr.h = 1;
                      }
                   }else {
                      this.B.c(mDarkModeSea);
                      if (!PatchProxy.applyVoidOneRefs(mDarkModeSea, this, searchSwitch, "20")) {
                         SearchSwitcherSkin skinResource = mDarkModeSea.skinResource;
                         if (skinResource != null) {
                            SearchSwitcherPresenter tt = this.t;
                            if (tt == null) {
                               a.S("mSearchContainerImageBg");
                            }
                            tt.D(Uri.parse(skinResource), 0, 0, false, this.C, null);
                         }
                      }
                   }
                }
             }
             tr = this.r;
             if (tr == null) {
                a.S("mSearchSwitcher");
             }
             tr.setRightBtnEnable(Boolean.TRUE);
             tr = this.r;
             if (tr == null) {
                a.S("mSearchSwitcher");
             }
             b uob = new b();
             uob.g(KwaiRadiusStyles.FULL);
             uob.y((float)n.c(this.m8().getContext(), 0x3f99999a));
             uob.w(this.B.a);
             uob.v(this.B.b);
             tr.setBackground(uob.a());
             tr = this.r;
             if (tr == null) {
                a.S("mSearchSwitcher");
             }
             b uob1 = PatchProxy.apply(null, this, searchSwitch, str);
             if (uob1 != PatchProxyResult.class) {
             }else {
                uob1 = new b(this);
             }
             tr.setSearchEntryLayoutConfig(uob1);
             HomePage mSearchHints = p0.mSearchHints;
             SearchPlaceHolderInfo searchPlaceH = null;
             str = (mSearchHints == null || mSearchHints.isEmpty())? 1: null;
             if (!str) {
                tr1 = this.r;
                if (tr1 == null) {
                   a.S("mSearchSwitcher");
                }
                tr1.c(mSearchHints);
             }else {
                mSearchHints = p0.mSearchJumpUrl;
                String str1 = (mSearchHints == null || !mSearchHints.length())? 1: null;
                if (!str1) {
                   Uri uri = x0.f(p0.mSearchJumpUrl);
                   str1 = x0.a(uri, "placeholder");
                   String str2 = x0.a(uri, "placeholderSearchKeyword");
                   int i = (str1 == null || !str1.length())? 1: 0;
                   if (!i) {
                      if (str2 == null || !str2.length()) {
                         searchPlaceH = 1;
                      }
                      if (!searchPlaceH) {
                         searchPlaceH = new SearchPlaceHolderInfo(str1, str2);
                         tr1 = this.r;
                         if (tr1 == null) {
                            a.S("mSearchSwitcher");
                         }
                         tr1.c(Collections.singletonList(searchPlaceH));
                      }
                   }
                   tr1 = this.r;
                   if (tr1 == null) {
                      a.S("mSearchSwitcher");
                   }
                   tr1.c(null);
                }else {
                   tr1 = this.r;
                   if (tr1 == null) {
                      a.S("mSearchSwitcher");
                   }
                   tr1.c(null);
                }
             }
             if (this.v == null) {
                tr1 = this.r;
                if (tr1 == null) {
                   a.S("mSearchSwitcher");
                }
                tr1.g("");
                this.v = true;
             }
          }
       }
       return;
    }
    public final void X8(a p0){
       SearchSwitcherPresenter ts;
       SearchSwitcherPresenter ts1;
       SearchSwitcherPresenter searchSwitch = SearchSwitcherPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "7")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "12")) {
          int i = this.w + p0.c;
          this.w = i;
          int i1 = 1;
          String str = (i <= 0)? 1: null;
          if (this.x != str) {
             if (str != null) {
                if (!this.Z8(this.z)) {
                   ts1 = this.s;
                   if (ts1 == null) {
                      a.S("mSearchContainer");
                   }
                   ts1.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
                label_0071 :
                   this.x = i1;
                }
             }else if(this.Z8(this.z) || !this.V8()){
                ts1 = this.t;
                if (ts1 == null) {
                   a.S("mSearchContainerImageBg");
                }
                ts1.setVisibility(4);
                ts1 = this.s;
                if (ts1 == null) {
                   a.S("mSearchContainer");
                }
                ts1.setBackgroundColor(this.B.b());
             }
             i1 = false;
             goto label_0071 ;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "13")) {
          p0 = p0.a;
          if (p0 != null) {
             if (this.y == null) {
                this.y = p0.hashCode();
             }
             if (this.y != p0.hashCode() || (!p0.canScrollVertically(-1) && !PatchProxy.applyVoid(null, this, searchSwitch, "6"))) {
                this.w = 0;
                if (!this.Z8(this.z)) {
                   ts = this.s;
                   if (ts == null) {
                      a.S("mSearchContainer");
                   }
                   ts.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
                }
                ts = this.t;
                if (ts == null) {
                   a.S("mSearchContainerImageBg");
                }
                ts.setVisibility(4);
             }
          }
       }
    label_00c5 :
       return;
    }
    public final void Y8(a p0){
       SearchSwitcherPresenter searchSwitch = SearchSwitcherPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, searchSwitch, "11") && (p0.d == 1 && this.V8())) {
          SearchSwitcherPresenter tt = this.t;
          String str = "mSearchContainerImageBg";
          if (tt == null) {
             a.S(str);
          }
          if (tt.getVisibility()) {
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             tt.setVisibility(0);
          }
       }
    label_0039 :
       return;
    }
    public final boolean Z8(HomePage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchSwitcherPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = (p0 != null)? p0.mDarkModeSearchSwitcherSkin: null;
       boolean b = (p0 != null && k.d())? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherPresenter.class, "3")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a37cb);
       this.s = m1.f(p0, 0x7f0a3f81);
       MerchantKwaiImageView merchantKwai = m1.f(p0, R.id.image_bg);
       this.t = merchantKwai;
       if (merchantKwai == null) {
          a.S("mSearchContainerImageBg");
       }
       a hierarchy = merchantKwai.getHierarchy();
       if (hierarchy != null) {
          hierarchy.t(new PointF(0x3f000000, 0));
       }
       SearchSwitcherPresenter tr = this.r;
       if (tr == null) {
          a.S("mSearchSwitcher");
       }
       tr.setSearchActionCallback(this.A);
       return;
    }
    public Activity getActivity(){
       return this.S8();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SearchSwitcherPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       d uod = d.J0(this.S8());
       this.q = uod;
       if (uod == null) {
          a.S("homePageViewModel");
       }
       uod.w0().observe(this.S8(), new c(new SearchSwitcherPresenter$doInject$1(this)));
       return;
    }
}
