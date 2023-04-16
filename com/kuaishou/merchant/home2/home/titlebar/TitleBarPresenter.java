package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$a;
import nsd.u;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$b;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$f;
import java.lang.String;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$d;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$e;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import b04.d;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import jz3.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$g;
import sfc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.skin.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$onBind$2;
import lz3.b;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import android.content.Context;
import android.widget.ImageView;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import qy5.b;
import android.widget.LinearLayout;
import java.lang.Boolean;
import java.util.Collection;
import java.util.List;
import ekd.x0;
import java.util.Collections;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import iz3.a;
import xw3.c;
import lnc.a1;
import w4.q;
import android.graphics.ColorFilter;
import iz3.c;
import ekd.m1;
import android.view.View$OnClickListener;
import ekd.p1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import oy5.b;

public final class TitleBarPresenter extends PresenterV2 implements LifecycleObserver	// class@0017e6
{
    public View A;
    public ImageView B;
    public f C;
    public a D;
    public MerchantHomeSkin$NavigationStyle E;
    public final Observer F;
    public final Observer G;
    public boolean H;
    public final int I;
    public final int J;
    public final b K;
    public final b L;
    public final m M;
    public BaseFragment p;
    public d q;
    public HomePage r;
    public boolean s;
    public boolean t;
    public View u;
    public SearchSwitcherEntryView v;
    public MerchantKwaiImageView w;
    public KwaiImageView x;
    public TextView y;
    public ImageView z;
    public static final TitleBarPresenter$a N;

    static {
       TitleBarPresenter.N = new TitleBarPresenter$a(null);
    }
    public void TitleBarPresenter(){
       super();
       this.F = new TitleBarPresenter$b(this);
       this.G = new TitleBarPresenter$f(this);
       this.I = f.e("merchant_feed_stage");
       this.J = a.t().a("merchantHomeStayInterval", 3000);
       this.K = new TitleBarPresenter$d(this);
       this.L = new TitleBarPresenter$e(this);
       this.M = new TitleBarPresenter$c(this);
    }
    public static final BaseFragment P8(TitleBarPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final d R8(TitleBarPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mHomePageViewModel");
       }
       return p0;
    }
    public static final SearchSwitcherEntryView S8(TitleBarPresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mSearchSwitcher");
       }
       return p0;
    }
    public static final a V8(TitleBarPresenter p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("mUiModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, TitleBarPresenter.class, "5")) {
          return;
       }
       TitleBarPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       this.X7(tp.m().subscribe(new TitleBarPresenter$g(this), new a()));
       tp = this.q;
       String str = "mHomePageViewModel";
       if (tp == null) {
          a.S(str);
       }
       tp.F0(this.W8(), this.F);
       tp = this.C;
       if (tp == null) {
          a.S("mSkinViewModel");
       }
       tp.c.observe(this.W8(), this.G);
       tp = this.q;
       if (tp == null) {
          a.S(str);
       }
       tp.w0().observe(this.W8(), new b(new TitleBarPresenter$onBind$2(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, TitleBarPresenter.class, "7")) {
          return;
       }
       TitleBarPresenter tv = this.v;
       String str = "mSearchSwitcher";
       if (tv == null) {
          a.S(str);
       }
       if (tv != null) {
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          tv.e();
       }
       tv = this.q;
       if (tv == null) {
          a.S("mHomePageViewModel");
       }
       tv.P0(this.F);
       tv = this.C;
       if (tv == null) {
          a.S("mSkinViewModel");
       }
       tv.c.removeObserver(this.G);
       return;
    }
    public GifshowActivity W8(){
       Activity obj = PatchProxy.apply(null, this, TitleBarPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getActivity();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       return obj;
    }
    public final int X8(){
       TitleBarPresenter obj = PatchProxy.apply(null, this, TitleBarPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       int i = (obj instanceof MerchantDynamicHomeBuyerFragment)? 1: 2;
       return i;
    }
    public final void Y8(HomePage p0){
       TitleBarPresenter tx;
       String str1;
       a hierarchy;
       List list;
       Uri uri;
       String str3;
       TitleBarPresenter titleBarPres = TitleBarPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, titleBarPres, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.r = p0;
       TitleBarPresenter tw = this.w;
       String str = "mTitleView";
       if (tw == null) {
          a.S(str);
       }
       a uoa = new a(tw.getContext(), p0, this.E);
       if (!PatchProxy.applyVoidOneRefs(uoa, this, titleBarPres, "10")) {
          tw = this.B;
          if (tw == null) {
             a.S("mBackIconIv");
          }
          tw.setImageDrawable(uoa.a());
       }
       int i = 0;
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "11")) {
          uri = uoa.k();
          if (uri != null) {
             TitleBarPresenter tw1 = this.w;
             if (tw1 == null) {
                a.S(str);
             }
             tw1.A(uri, i, i);
          }else {
             str3 = uoa.l();
             tw = (str3 == null || !str3.length())? 1: null;
             if (!tw) {
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                tw.L(p0.mTitleImgUrl);
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                tw.getHierarchy().A(uoa.j());
             }else {
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                tw.setImageDrawable(uoa.j());
             }
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "12")) {
          str1 = "mSearchContainer";
          if (p0.mIsGuarantee == null) {
             HomePage mSearchJumpU = p0.mSearchJumpUrl;
             tw = (mSearchJumpU == null || !mSearchJumpU.length())? 1: null;
             if (!tw) {
                tw = this.u;
                if (tw == null) {
                   a.S(str1);
                }
                tw.setVisibility(i);
                this.D = uoa;
                tw = this.v;
                str1 = "mSearchSwitcher";
                if (tw == null) {
                   a.S(str1);
                }
                tw.setSearchEntryLayoutConfig(this.L);
                tw = this.v;
                if (tw == null) {
                   a.S(str1);
                }
                tw.setBackground(uoa.c());
                tw = this.v;
                if (tw == null) {
                   a.S(str1);
                }
                tw.setRightBtnEnable(Boolean.valueOf(this.s));
                mSearchJumpU = p0.mSearchHints;
                TitleBarPresenter titleBarPres1 = (mSearchJumpU == null || mSearchJumpU.isEmpty())? 1: null;
                if (!titleBarPres1) {
                   if (this.s == null) {
                      list = mSearchJumpU.subList(i, 1);
                   }
                   titleBarPres1 = this.v;
                   if (titleBarPres1 == null) {
                      a.S(str1);
                   }
                   titleBarPres1.c(list);
                }else {
                   mSearchJumpU = p0.mSearchJumpUrl;
                   mSearchJumpU = (mSearchJumpU == null || !mSearchJumpU.length())? 1: null;
                   if (!mSearchJumpU) {
                      uri = x0.f(p0.mSearchJumpUrl);
                      String str2 = x0.a(uri, "placeholder");
                      str3 = x0.a(uri, "placeholderSearchKeyword");
                      int i1 = (str2 == null || !str2.length())? 1: 0;
                      if (!i1) {
                         tw = (str3 == null || !str3.length())? 1: null;
                         if (!tw) {
                            tw = this.v;
                            if (tw == null) {
                               a.S(str1);
                            }
                            tw.b(Collections.singletonList(str2));
                         }
                      }
                   }
                }
             label_0166 :
                if (p0.mIsLocalCache == null && this.t == null) {
                   tw = this.v;
                   if (tw == null) {
                      a.S(str1);
                   }
                   tw.g(null);
                   this.t = true;
                }
             }
          }
          tw = this.u;
          if (tw == null) {
             a.S(str1);
          }
          tw.setVisibility(8);
       }
    label_0185 :
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "13")) {
          if (p0.mIsGuarantee != null) {
             tx = this.x;
             if (tx == null) {
                a.S("mOpenShopIconView");
             }
             tx.setVisibility(8);
          }else {
             titleBarPres = this.x;
             if (titleBarPres == null) {
                a.S("mOpenShopIconView");
             }
             titleBarPres.setVisibility(i);
             titleBarPres = this.y;
             if (titleBarPres == null) {
                a.S("mSellerSwitchTv");
             }
             titleBarPres.setTextColor(uoa.i());
             titleBarPres = this.z;
             str1 = "mSellerSwitchIv";
             if (titleBarPres == null) {
                a.S(str1);
             }
             titleBarPres.setImageDrawable(uoa.h());
             titleBarPres = this.z;
             if (titleBarPres == null) {
                a.S(str1);
             }
             titleBarPres.setColorFilter(uoa.i());
             HomePage mOpenShopUrl = p0.mOpenShopUrl;
             a uoa1 = (mOpenShopUrl == null || !mOpenShopUrl.length())? 1: null;
             if (uoa1) {
                tx = this.x;
                if (tx == null) {
                   a.S("mOpenShopIconView");
                }
                tx.setVisibility(8);
                tx = this.A;
                if (tx == null) {
                   a.S("mSellerSwitchContainer");
                }
                tx.setVisibility(i);
                e.q0(this.W8()).x0(new a(1));
             }else {
                titleBarPres = this.A;
                if (titleBarPres == null) {
                   a.S("mSellerSwitchContainer");
                }
                titleBarPres.setVisibility(8);
                titleBarPres = this.x;
                if (titleBarPres == null) {
                   a.S("mOpenShopIconView");
                }
                titleBarPres.setVisibility(i);
                mOpenShopUrl = p0.mOpenShopIconUrl;
                if (mOpenShopUrl == null || !mOpenShopUrl.length()) {
                   i = 1;
                }
                if (!i) {
                   titleBarPres = this.x;
                   if (titleBarPres == null) {
                      a.S("mOpenShopIconView");
                   }
                   titleBarPres.L(p0.mOpenShopIconUrl);
                }else {
                   tx = this.x;
                   if (tx == null) {
                      a.S("mOpenShopIconView");
                   }
                   tx.setImageDrawable(a1.f(R.drawable.arg_RES_7f081718));
                }
                if (uoa.b()) {
                   tx = this.x;
                   if (tx == null) {
                      a.S("mOpenShopIconView");
                   }
                   hierarchy = tx.getHierarchy();
                   if (hierarchy != null) {
                      hierarchy.s(new q(uoa.b()));
                   }
                }else {
                   tx = this.x;
                   if (tx == null) {
                      a.S("mOpenShopIconView");
                   }
                   hierarchy = tx.getHierarchy();
                   if (hierarchy != null) {
                      hierarchy.s(null);
                   }
                }
                e.q0(this.W8()).x0(new c("BUTTON_OPENSHOP"));
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       ViewGroup$LayoutParams layoutParams;
       TitleBarPresenter titleBarPres = TitleBarPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, titleBarPres, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a0399);
       this.u = m1.f(p0, 0x7f0a3775);
       this.v = m1.f(p0, 0x7f0a37cb);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.shop);
       this.x = kwaiImageVie;
       if (kwaiImageVie == null) {
          a.S("mOpenShopIconView");
       }
       kwaiImageVie.setOnClickListener(this.M);
       this.w = m1.f(p0, 0x7f0a3f73);
       m1.a(p0, this.M, R.id.title_back_icon);
       if (!PatchProxy.applyVoidOneRefs(p0, this, titleBarPres, "3")) {
          int i = p1.f(p0.getContext());
          View view = m1.f(p0, R.id.title_container);
          if (view != null) {
             layoutParams = view.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams.topMargin = i;
          }
          View view1 = m1.f(p0, R.id.refresh_layout);
          if (view1 != null && view != null) {
             layoutParams = view1.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams.topMargin = view.getLayoutParams().height + i;
          }
       }
    label_0098 :
       this.A = m1.f(p0, 0x7f0a386a);
       this.z = m1.f(p0, 0x7f0a386b);
       titleBarPres = this.A;
       if (titleBarPres == null) {
          a.S("mSellerSwitchContainer");
       }
       titleBarPres.setOnClickListener(this.M);
       this.y = m1.f(p0, 0x7f0a386c);
       TitleBarPresenter tv = this.v;
       if (tv == null) {
          a.S("mSearchSwitcher");
       }
       tv.setSearchActionCallback(this.K);
       return;
    }
    public Activity getActivity(){
       return this.W8();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TitleBarPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       this.q = d.J0(this.W8());
       this.C = f.p0(this.W8());
       this.s = a.t().d("merchantHomeSearchSwitchEnabled", true);
       return;
    }
}
