package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$a;
import nsd.u;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarCartSkinPresenter;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$c;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$h;
import java.lang.String;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$e;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$g;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$f;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$d;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import b04.d;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import jz3.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$i;
import sfc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.skin.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import android.view.View;
import android.content.Context;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import android.widget.ImageView;
import qy5.b;
import android.widget.LinearLayout;
import java.lang.Boolean;
import java.util.Collection;
import java.util.List;
import ekd.x0;
import com.kwai.feature.component.model.SearchPlaceHolderInfo;
import java.util.Collections;
import android.widget.TextView;
import java.lang.CharSequence;
import hy3.c;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import iz3.b;
import xw3.c;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import iz3.a;
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

public final class TitleBarPresenterV2 extends PresenterV2 implements LifecycleObserver	// class@001779
{
    public KwaiImageView A;
    public KwaiImageView B;
    public TextView C;
    public TextView D;
    public ImageView E;
    public View F;
    public ImageView G;
    public f H;
    public a I;
    public MerchantHomeSkin$NavigationStyle J;
    public final Observer K;
    public final Observer L;
    public boolean M;
    public final int N;
    public final int O;
    public final b P;
    public final b Q;
    public final b R;
    public final m S;
    public final a T;
    public BaseFragment p;
    public d q;
    public HomePage r;
    public boolean s;
    public boolean t;
    public MerchantKwaiImageView u;
    public View v;
    public SearchSwitcherEntryView w;
    public View x;
    public SearchIconEntryView y;
    public View z;
    public static final TitleBarPresenterV2$a U;

    static {
       TitleBarPresenterV2.U = new TitleBarPresenterV2$a(null);
    }
    public void TitleBarPresenterV2(){
       super();
       this.U7(new TitleBarCartSkinPresenter());
       this.K = new TitleBarPresenterV2$c(this);
       this.L = new TitleBarPresenterV2$h(this);
       this.N = f.e("merchant_feed_stage");
       this.O = a.t().a("merchantHomeStayInterval", 3000);
       this.P = new TitleBarPresenterV2$e(this);
       this.Q = new TitleBarPresenterV2$g(this);
       this.R = new TitleBarPresenterV2$f(this);
       this.S = new TitleBarPresenterV2$d(this);
       this.T = new TitleBarPresenterV2$b(this);
    }
    public static final BaseFragment P8(TitleBarPresenterV2 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final d R8(TitleBarPresenterV2 p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mHomePageViewModel");
       }
       return p0;
    }
    public static final SearchSwitcherEntryView S8(TitleBarPresenterV2 p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mSearchSwitcher");
       }
       return p0;
    }
    public static final MerchantKwaiImageView V8(TitleBarPresenterV2 p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mTitleView");
       }
       return p0;
    }
    public static final a W8(TitleBarPresenterV2 p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("mUiModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, TitleBarPresenterV2.class, "5")) {
          return;
       }
       TitleBarPresenterV2 tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       this.X7(tp.m().subscribe(new TitleBarPresenterV2$i(this), new a()));
       tp = this.q;
       if (tp == null) {
          a.S("mHomePageViewModel");
       }
       tp.F0(this.Y8(), this.K);
       tp = this.H;
       if (tp == null) {
          a.S("mSkinViewModel");
       }
       tp.c.observe(this.Y8(), this.L);
       tp = this.q;
       if (tp == null) {
          a.S("mHomePageViewModel");
       }
       this.a9(tp.w0().getValue());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, TitleBarPresenterV2.class, "7")) {
          return;
       }
       TitleBarPresenterV2 tw = this.w;
       String str = "mSearchSwitcher";
       if (tw == null) {
          a.S(str);
       }
       if (tw != null) {
          tw = this.w;
          if (tw == null) {
             a.S(str);
          }
          tw.e();
       }
       tw = this.q;
       if (tw == null) {
          a.S("mHomePageViewModel");
       }
       tw.P0(this.K);
       tw = this.H;
       if (tw == null) {
          a.S("mSkinViewModel");
       }
       tw.c.removeObserver(this.L);
       return;
    }
    public final void X8(HomePage p0,a p1){
       TitleBarPresenterV2 tu;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TitleBarPresenterV2.class, "12")) {
          return;
       }
       if (p0.mShouldHideSearchBox == null && p0.mShowSearchIcon == null) {
          return;
       }
       Uri uri = p1.k();
       if (uri != null) {
          tu = this.u;
          if (tu == null) {
             a.S("mTitleView");
          }
          tu.B(uri, 0, 0, this.T);
       }else {
          String str = p1.l();
          TitleBarPresenterV2 titleBarPres = (str == null || !str.length())? 1: null;
          if (!titleBarPres) {
             titleBarPres = this.u;
             if (titleBarPres == null) {
                a.S("mTitleView");
             }
             titleBarPres.B(Uri.parse(p0.mTitleImgUrl), 0, 0, this.T);
             tu = this.u;
             if (tu == null) {
                a.S("mTitleView");
             }
             tu.getHierarchy().A(p1.j());
          }else {
             tu = this.u;
             if (tu == null) {
                a.S("mTitleView");
             }
             tu.setImageDrawable(p1.j());
          }
       }
       return;
    }
    public GifshowActivity Y8(){
       Activity obj = PatchProxy.apply(null, this, TitleBarPresenterV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getActivity();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       return obj;
    }
    public final int Z8(){
       TitleBarPresenterV2 obj = PatchProxy.apply(null, this, TitleBarPresenterV2.class, "20");
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
    public final void a9(HomePage p0){
       TitleBarPresenterV2 tv;
       String str2;
       HomePage mShowShoppin;
       HomePage mSearchJumpU;
       TitleBarPresenterV2 tx;
       String str6;
       a hierarchy;
       List list;
       TitleBarPresenterV2 titleBarPres = TitleBarPresenterV2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, titleBarPres, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.r = p0;
       a uoa = new a(this.m8().getContext(), p0, this.J);
       if (!PatchProxy.applyVoidOneRefs(uoa, this, titleBarPres, "11")) {
          tv = this.G;
          if (tv == null) {
             a.S("mBackIconIv");
          }
          tv.setImageDrawable(uoa.a());
       }
       String str = null;
       int i = 4;
       String str1 = "mSearchContainer";
       int i1 = 0;
       int i2 = 1;
       if (p0.mShouldHideSearchBox == i2) {
          this.X8(p0, uoa);
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setVisibility(i);
       }else if(p0.mShowSearchIcon != null){
          this.X8(p0, uoa);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "13")) {
          if (p0.mIsGuarantee == null) {
             mShowShoppin = p0.mSearchJumpUrl;
             tv = (mShowShoppin == null || !mShowShoppin.length())? 1: null;
             if (!tv) {
                if (p0.mShowSearchIcon != null) {
                   tv = this.v;
                   if (tv == null) {
                      a.S(str1);
                   }
                   tv.setVisibility(i);
                }else {
                   tv = this.v;
                   if (tv == null) {
                      a.S(str1);
                   }
                   tv.setVisibility(i1);
                   this.I = uoa;
                   tv = this.w;
                   str2 = "mSearchSwitcher";
                   if (tv == null) {
                      a.S(str2);
                   }
                   tv.setSearchEntryLayoutConfig(this.R);
                   tv = this.w;
                   if (tv == null) {
                      a.S(str2);
                   }
                   tv.setBackground(uoa.c());
                   tv = this.w;
                   if (tv == null) {
                      a.S(str2);
                   }
                   tv.setRightBtnEnable(Boolean.valueOf(this.s));
                   mShowShoppin = p0.mSearchHints;
                   TitleBarPresenterV2 titleBarPres1 = (mShowShoppin == null || mShowShoppin.isEmpty())? 1: null;
                   if (!titleBarPres1) {
                      if (this.s == null) {
                         list = mShowShoppin.subList(i1, i2);
                      }
                      titleBarPres1 = this.w;
                      if (titleBarPres1 == null) {
                         a.S(str2);
                      }
                      titleBarPres1.c(list);
                   }else {
                      mShowShoppin = p0.mSearchJumpUrl;
                      mShowShoppin = (mShowShoppin == null || !mShowShoppin.length())? 1: null;
                      if (!mShowShoppin) {
                         Uri uri = x0.f(p0.mSearchJumpUrl);
                         str1 = x0.a(uri, "placeholder");
                         str6 = x0.a(uri, "placeholderSearchKeyword");
                         int i3 = (str1 == null || !str1.length())? 1: 0;
                         if (!i3) {
                            SearchPlaceHolderInfo searchPlaceH = (str6 == null || !str6.length())? 1: null;
                            if (!searchPlaceH) {
                               searchPlaceH = new SearchPlaceHolderInfo(str1, str6);
                               tv = this.w;
                               if (tv == null) {
                                  a.S(str2);
                               }
                               tv.c(Collections.singletonList(searchPlaceH));
                            }
                         }
                         tv = this.w;
                         if (tv == null) {
                            a.S(str2);
                         }
                         tv.c(str);
                      }else {
                         tv = this.w;
                         if (tv == null) {
                            a.S(str2);
                         }
                         tv.c(str);
                      }
                   }
                   if (p0.mIsLocalCache == null && this.t == null) {
                      tv = this.w;
                      if (tv == null) {
                         a.S(str2);
                      }
                      tv.g(str);
                      this.t = i2;
                   }
                }
             }
          }
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setVisibility(8);
       }
    label_016c :
       tv = this.z;
       str2 = "mShoppingCartContainer";
       if (tv == null) {
          a.S(str2);
       }
       tv.setVisibility(8);
       tv = this.B;
       str1 = "mShoppingCartIconView";
       if (tv == null) {
          a.S(str1);
       }
       tv.setVisibility(8);
       tv = this.C;
       String str3 = "mTipView";
       if (tv == null) {
          a.S(str3);
       }
       tv.setVisibility(8);
       tv = this.A;
       String str4 = "mOpenShopIconView";
       if (tv == null) {
          a.S(str4);
       }
       tv.setVisibility(8);
       tv = this.F;
       String str5 = "mSellerSwitchContainer";
       if (tv == null) {
          a.S(str5);
       }
       tv.setVisibility(8);
       tv = this.x;
       if (tv == null) {
          a.S("mSearchIconContainer");
       }
       tv.setVisibility(8);
       mShowShoppin = p0.mShowShoppingCart;
       if (mShowShoppin != null && mShowShoppin.booleanValue()) {
          if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "16")) {
             if (p0.mIsGuarantee != null) {
                tv = this.z;
                if (tv == null) {
                   a.S(str2);
                }
                tv.setVisibility(8);
                tv = this.B;
                if (tv == null) {
                   a.S(str1);
                }
                tv.setVisibility(8);
                tv = this.C;
                if (tv == null) {
                   a.S(str3);
                }
                tv.setVisibility(8);
             }else {
                tv = this.z;
                if (tv == null) {
                   a.S(str2);
                }
                tv.setVisibility(i1);
                tv = this.B;
                if (tv == null) {
                   a.S(str1);
                }
                tv.setVisibility(i1);
                tv = this.C;
                if (tv == null) {
                   a.S(str3);
                }
                tv.setVisibility(i1);
                tv = this.B;
                if (tv == null) {
                   a.S(str1);
                }
                if (!PatchProxy.applyVoidTwoRefs(tv, p0, this, titleBarPres, "17")) {
                   HomePage mShoppingCar = p0.mShoppingCartIconUrl;
                   mShoppingCar = (mShoppingCar == null || !mShoppingCar.length())? 1: null;
                   if (mShoppingCar) {
                      tv = this.B;
                      if (tv == null) {
                         a.S(str1);
                      }
                      tv.setVisibility(8);
                   }else {
                      tv.A(Uri.parse(p0.mShoppingCartIconUrl), i1, i1);
                   }
                }
                TitleBarPresenterV2 tC = this.C;
                if (tC == null) {
                   a.S(str3);
                }
                if (!PatchProxy.applyVoidThreeRefs(tC, p0, uoa, this, TitleBarPresenterV2.class, "18")) {
                   mShowShoppin = p0.mRedDotContext;
                   mShowShoppin = (mShowShoppin == null || !mShowShoppin.length())? 1: null;
                   if (!mShowShoppin) {
                      mShowShoppin = p0.mShoppingCartIconUrl;
                      GifshowActivity gifshowActiv = (mShowShoppin == null || !mShowShoppin.length())? 1: null;
                      if (!gifshowActiv) {
                         if (tC != null) {
                            tC.setVisibility(i1);
                         }
                         if (tC != null) {
                            tC.setText(p0.mRedDotContext);
                         }
                         if (tC != null) {
                            c.c.a(tC);
                         }
                      }
                   }
                   if (tC != null) {
                      tC.setVisibility(8);
                   }
                }
             label_028e :
                e.q0(this.Y8()).x0(new b("SHOPPING_CART", p0.mRedDotContext));
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "14") && p0.mShowSearchIcon != null) {
             mSearchJumpU = p0.mSearchJumpUrl;
             if (mSearchJumpU != null && mSearchJumpU.length()) {
                i2 = 0;
             }
             if (!i2 && p0.mShouldHideSearchBox == null) {
                tx = this.x;
                if (tx == null) {
                   a.S("mSearchIconContainer");
                }
                tx.setVisibility(i1);
                tx = this.y;
                if (tx == null) {
                   a.S("mSearchIconView");
                }
                tx.setResource(R.drawable.arg_RES_7f08062e);
             }
          }
       }else if(PatchProxy.applyVoidTwoRefs(p0, uoa, this, titleBarPres, "15")){
          if (p0.mIsGuarantee != null) {
             tx = this.A;
             if (tx == null) {
                a.S(str4);
             }
             tx.setVisibility(8);
          }else {
             titleBarPres = this.A;
             if (titleBarPres == null) {
                a.S(str4);
             }
             titleBarPres.setVisibility(i1);
             titleBarPres = this.D;
             if (titleBarPres == null) {
                a.S("mSellerSwitchTv");
             }
             titleBarPres.setTextColor(uoa.i());
             titleBarPres = this.E;
             str6 = "mSellerSwitchIv";
             if (titleBarPres == null) {
                a.S(str6);
             }
             titleBarPres.setImageDrawable(uoa.h());
             titleBarPres = this.E;
             if (titleBarPres == null) {
                a.S(str6);
             }
             titleBarPres.setColorFilter(uoa.i());
             mSearchJumpU = p0.mOpenShopUrl;
             a uoa1 = (mSearchJumpU == null || !mSearchJumpU.length())? 1: null;
             if (uoa1) {
                tx = this.A;
                if (tx == null) {
                   a.S(str4);
                }
                tx.setVisibility(8);
                tx = this.F;
                if (tx == null) {
                   a.S(str5);
                }
                tx.setVisibility(i1);
                e.q0(this.Y8()).x0(new a(i2));
             }else {
                titleBarPres = this.F;
                if (titleBarPres == null) {
                   a.S(str5);
                }
                titleBarPres.setVisibility(8);
                titleBarPres = this.A;
                if (titleBarPres == null) {
                   a.S(str4);
                }
                titleBarPres.setVisibility(i1);
                mSearchJumpU = p0.mOpenShopIconUrl;
                if (mSearchJumpU == null || !mSearchJumpU.length()) {
                   i1 = 1;
                }
                if (!i1) {
                   titleBarPres = this.A;
                   if (titleBarPres == null) {
                      a.S(str4);
                   }
                   titleBarPres.L(p0.mOpenShopIconUrl);
                }else {
                   tx = this.A;
                   if (tx == null) {
                      a.S(str4);
                   }
                   tx.setImageDrawable(a1.f(R.drawable.arg_RES_7f081718));
                }
                if (uoa.b()) {
                   tx = this.A;
                   if (tx == null) {
                      a.S(str4);
                   }
                   hierarchy = tx.getHierarchy();
                   if (hierarchy != null) {
                      hierarchy.s(new q(uoa.b()));
                   }
                }else {
                   tx = this.A;
                   if (tx == null) {
                      a.S(str4);
                   }
                   hierarchy = tx.getHierarchy();
                   if (hierarchy != null) {
                      hierarchy.s(str);
                   }
                }
                e.q0(this.Y8()).x0(new c("BUTTON_OPENSHOP"));
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       ViewGroup$LayoutParams layoutParams;
       TitleBarPresenterV2 titleBarPres = TitleBarPresenterV2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, titleBarPres, "2")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a0399);
       this.u = m1.f(p0, 0x7f0a3f74);
       this.v = m1.f(p0, 0x7f0a3775);
       this.w = m1.f(p0, 0x7f0a37cb);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.shop);
       this.A = kwaiImageVie;
       if (kwaiImageVie == null) {
          a.S("mOpenShopIconView");
       }
       kwaiImageVie.setOnClickListener(this.S);
       this.x = m1.f(p0, 0x7f0a379f);
       this.y = m1.f(p0, 0x7f0a379e);
       this.z = m1.f(p0, 0x7f0a394c);
       kwaiImageVie = m1.f(p0, R.id.shoppingCart);
       this.B = kwaiImageVie;
       if (kwaiImageVie == null) {
          a.S("mShoppingCartIconView");
       }
       kwaiImageVie.setOnClickListener(this.S);
       this.C = m1.f(p0, 0x7f0a3f04);
       m1.a(p0, this.S, R.id.title_back_icon);
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
    label_00d7 :
       this.F = m1.f(p0, 0x7f0a386a);
       this.E = m1.f(p0, 0x7f0a386b);
       titleBarPres = this.F;
       if (titleBarPres == null) {
          a.S("mSellerSwitchContainer");
       }
       titleBarPres.setOnClickListener(this.S);
       this.D = m1.f(p0, 0x7f0a386c);
       TitleBarPresenterV2 tw = this.w;
       if (tw == null) {
          a.S("mSearchSwitcher");
       }
       tw.setSearchActionCallback(this.P);
       tw = this.y;
       if (tw == null) {
          a.S("mSearchIconView");
       }
       tw.setSearchActionCallback(this.Q);
       return;
    }
    public Activity getActivity(){
       return this.Y8();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TitleBarPresenterV2.class, "1")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       this.q = d.J0(this.Y8());
       this.H = f.p0(this.Y8());
       this.s = a.t().d("merchantHomeSearchSwitchEnabled", true);
       return;
    }
}
