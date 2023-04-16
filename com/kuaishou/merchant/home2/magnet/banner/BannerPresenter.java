package com.kuaishou.merchant.home2.magnet.banner.BannerPresenter;
import android.view.View$OnAttachStateChangeListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$d;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$c;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import android.view.View;
import pz3.a;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import nz3.b;
import nz3.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import y8c.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.kuaishou.merchant.home2.basic.widget.ViewPagerIndicatorView;
import zw3.d;
import com.kuaishou.merchant.home2.skin.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$onBind$1;
import mz3.a;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$onUnbind$1;
import java.lang.Integer;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import mz3.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import mz3.c;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import ekd.k1;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$b;
import java.lang.Runnable;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$e;
import ekd.m1;
import android.view.View$OnTouchListener;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.viewpager2.widget.c;
import androidx.viewpager2.widget.ViewPager2$j;
import androidx.fragment.app.FragmentActivity;

public final class BannerPresenter extends PresenterV2 implements View$OnAttachStateChangeListener	// class@0017ee
{
    public a A;
    public final Object B;
    public f C;
    public d D;
    public final View$OnTouchListener E;
    public final ViewPager2$h F;
    public List p;
    public BaseFragment q;
    public View r;
    public ViewPager2 s;
    public ViewPagerIndicatorView t;
    public MerchantHomeSkin$ShowConfig u;
    public int v;
    public int w;
    public float x;
    public final double y;
    public ValueAnimator z;
    public static final BannerPresenter$a G;

    static {
       BannerPresenter.G = new BannerPresenter$a(null);
    }
    public void BannerPresenter(){
       super();
       this.y = 3.76f;
       this.B = new Object();
       this.E = new BannerPresenter$d(this);
       this.F = new BannerPresenter$c(this);
    }
    public static final ViewPager2 P8(BannerPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mViewPager");
       }
       return p0;
    }
    public void E8(){
       f b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BannerPresenter.class, "3")) {
          return;
       }
       BannerPresenter tp = this.p;
       String str = 1;
       a uoa = null;
       tp = (tp == null || tp.isEmpty())? 1: null;
       String str1 = "mBannerContainer";
       if (tp) {
          tp = this.r;
          if (tp == null) {
             a.S(str1);
          }
          tp.setVisibility(8);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, BannerPresenter.class, "4")){
          tp = this.r;
          if (tp == null) {
             a.S(str1);
          }
          tp.setVisibility(uoa);
          this.S8(new a(this.v, this.u));
          tp = this.s;
          if (tp == null) {
             a.S("mViewPager");
          }
          if (!PatchProxy.applyVoidOneRefs(tp, this, BannerPresenter.class, "6") && tp != null) {
             BannerPresenter tp1 = this.p;
             if (tp1 != null && !tp1.isEmpty()) {
                str = null;
             }
             if (str == null) {
                b adapter = tp.getAdapter();
                tp1 = this.p;
                if (adapter == null) {
                   BannerPresenter tq = this.q;
                   if (tq == null) {
                      a.S("mFragment");
                   }
                   a uoa1 = new a(tq);
                   uoa1.r1(tp1);
                   this.A = uoa1;
                   b uob = new b(uoa1);
                   tp.setAdapter(uob);
                   adapter = uob;
                }else {
                   b e = adapter.e;
                   Objects.requireNonNull(e, "null cannot be cast to non-null type com.kuaishou.merchant.home2.magnet.banner.adapter.BannerPagerAdapter");
                   this.A = e;
                   e.r1(tp1);
                   adapter.k0();
                }
                String obj = PatchProxy.apply(objArray, adapter, b.class, "4");
                int i = (obj != PatchProxyResult.class)? obj.intValue(): 0x3fffffff - (0x3fffffff % adapter.e.getItemCount());
                this.w = i;
                tp.m(i, uoa);
                tp.j(this.F);
                tp = this.t;
                obj = "mIndicatorView";
                if (tp == null) {
                   a.S(obj);
                }
                BannerPresenter tA = this.A;
                int itemCount = (tA != null)? tA.getItemCount(): 0;
                tp.setIndicatorCount(itemCount);
                tp = this.t;
                if (tp == null) {
                   a.S(obj);
                }
                tp.b(uoa);
             }
          }
       label_00f5 :
          this.W8();
       }
       Objects.requireNonNull(d.a);
       tp = this.C;
       if (tp != null) {
          b = tp.b;
          if (b != null) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             b.observe(activity, new a(new BannerPresenter$onBind$1(this)));
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, BannerPresenter.class, "8")) {
          return;
       }
       BannerPresenter ts = this.s;
       if (ts == null) {
          a.S("mViewPager");
       }
       ts.setAdapter(null);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, BannerPresenter.class, "7")) {
          return;
       }
       BannerPresenter ts = this.s;
       if (ts == null) {
          a.S("mViewPager");
       }
       ts.r(this.F);
       this.X8();
       ts = this.C;
       if (ts != null) {
          f b = ts.b;
          if (b != null) {
             b.removeObserver(new a(new BannerPresenter$onUnbind$1(this)));
          }
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, BannerPresenter.class, "11")) {
          return;
       }
       BannerPresenter ts = this.s;
       String str = "mViewPager";
       if (ts == null) {
          a.S(str);
       }
       if (ts.getAdapter() == null) {
          return;
       }else {
          int i = 1;
          int i1 = this.w + i;
          this.w = i1;
          if (i1 < 0) {
             this.w = 0;
          }
          ts = this.w;
          if (!PatchProxy.isSupport(BannerPresenter.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ts), this, BannerPresenter.class, "13")) {
             BannerPresenter ts1 = this.s;
             if (ts1 == null) {
                a.S(str);
             }
             if (ts1.getAdapter() != null && this.z == null) {
                ts1 = this.s;
                if (ts1 == null) {
                   a.S(str);
                }
                int width = ts1.getWidth();
                BannerPresenter ts2 = this.s;
                if (ts2 == null) {
                   a.S(str);
                }
                this.x = 0;
                float[] uofloatArray = new float[]{0,(float)(width * (ts - ts2.getCurrentItem()))};
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                valueAnimato.addUpdateListener(new b(this));
                valueAnimato.addListener(new c(this));
                valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimato.setDuration(800);
                valueAnimato.start();
                this.z = valueAnimato;
             }
          }
       label_009d :
          k1.n(this.B);
          k1.s(new BannerPresenter$b(this), this.B, (long)3000);
          return;
       }
    }
    public final void S8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerPresenter.class, "9")) {
          return;
       }
       BannerPresenter tp = this.p;
       tp = (tp == null || tp.isEmpty())? 1: null;
       if (tp) {
          return;
       }else {
          tp = this.r;
          if (tp == null) {
             a.S("mBannerContainer");
          }
          tp.setPadding(a1.e((float)p0.b()), a1.e((float)p0.a), a1.e((float)p0.b()), a1.e((float)p0.b));
          ViewGroup$MarginLayoutParams layoutParams = tp.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.topMargin = a1.e((float)p0.d);
          }
          tp.setLayoutParams(layoutParams);
          if (p0.a() != null) {
             tp.setBackground(p0.a());
          }
          return;
       }
    }
    public final void V8(MerchantHomeSkin$ShowConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerPresenter.class, "5")) {
          return;
       }
       String str = "mBannerContainer";
       if (MerchantHomeSkin.isSuperSaleBannerValidate(p0)) {
          BannerPresenter tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.setVisibility(8);
          return;
       }else {
          BannerPresenter tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          tr1.setVisibility(0);
          tr1 = this.u;
          this.u = p0;
          if (a.g(tr1, p0) ^ 0x01) {
             this.S8(new a(this.v, p0));
          }
          return;
       }
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, BannerPresenter.class, "10")) {
          return;
       }
       BannerPresenter tA = this.A;
       if (tA != null && tA.getItemCount() > 1) {
          k1.n(this.B);
          k1.s(new BannerPresenter$e(this), this.B, (long)3000);
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, BannerPresenter.class, "12")) {
          return;
       }
       k1.n(this.B);
       BannerPresenter tz = this.z;
       if (tz != null) {
          tz.cancel();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerPresenter.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.banner_container);
       this.r = view;
       String str = "mBannerContainer";
       if (view == null) {
          a.S(str);
       }
       view.setOnTouchListener(this.E);
       ViewPager2 viewPager2 = m1.f(p0, R.id.banner_view_pager);
       this.s = viewPager2;
       if (viewPager2 == null) {
          a.S("mViewPager");
       }
       ViewGroup$LayoutParams layoutParams = viewPager2.getLayoutParams();
       int i = n.z(p0.getContext());
       BannerPresenter tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       i = i - tr.getPaddingLeft();
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       layoutParams.height = (int)((double)(i - tr.getPaddingRight()) / this.y);
       viewPager2.setPageTransformer(new c(a1.d(R.dimen.arg_RES_7f07031b)));
       this.t = m1.f(p0, 0x7f0a13e6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BannerPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("MAGNET_MODEL");
       this.q = this.r8("FEED_FRAGMENT");
       this.v = this.r8("MERCHANT_HOME_MAGNET_POSITION").intValue();
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = f.p0(activity);
       this.u = this.t8("MERCHANT_HOME_SKIN_SHOW_CONFIG");
       return;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerPresenter.class, "14")) {
          return;
       }
       this.W8();
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerPresenter.class, "15")) {
          return;
       }
       this.X8();
       return;
    }
}
