package com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$a;
import nsd.u;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import zw3.d;
import java.util.Objects;
import com.kuaishou.merchant.home2.skin.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$onBind$1;
import sz3.a;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import androidx.fragment.app.FragmentActivity;
import b04.d;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.viewpager2.widget.ViewPager2;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$onUnbind$1;
import java.lang.Throwable;
import android.net.Uri;
import vz3.c;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.io.File;
import java.lang.Boolean;
import p74.a;
import o74.a;
import android.content.Context;
import android.widget.LinearLayout;
import tz3.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.bowl.core.component.a;
import dx3.a;
import com.kwai.robust.PatchProxyResult;
import bx3.b;
import g9c.a;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import qrd.l1;
import kotlin.jvm.internal.a;
import ekd.m1;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$c;
import androidx.viewpager2.widget.ViewPager2$h;
import java.lang.Number;

public final class ToolBarPagerPresenter extends PresenterV2	// class@0017fc
{
    public f A;
    public d B;
    public a C;
    public final a D;
    public List p;
    public boolean q;
    public BaseFragment r;
    public int s;
    public HorizontalPageIndicator t;
    public View u;
    public ViewPager2 v;
    public MerchantHomeSkin$ShowConfig w;
    public c x;
    public MerchantKwaiImageView y;
    public boolean z;
    public static final ToolBarPagerPresenter$a E;

    static {
       ToolBarPagerPresenter.E = new ToolBarPagerPresenter$a(null);
    }
    public void ToolBarPagerPresenter(){
       super();
       this.z = true;
       this.D = new ToolBarPagerPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ToolBarPagerPresenter.class, "5")) {
          return;
       }
       ToolBarPagerPresenter tp = this.p;
       d uod = (tp == null || tp.isEmpty())? 1: null;
       if (uod) {
          return;
       }else {
          Objects.requireNonNull(d.a);
          tp = this.A;
          if (tp != null) {
             f b = tp.b;
             if (b != null) {
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                b.observe(activity, new a(new ToolBarPagerPresenter$onBind$1(this)));
             }
          }
          this.R8(this.w);
          d.J0(this.getActivity()).S0(this.p);
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, ToolBarPagerPresenter.class, "8")) {
          return;
       }
       ToolBarPagerPresenter tv = this.v;
       if (tv != null) {
          tv.setAdapter(null);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ToolBarPagerPresenter.class, "7")) {
          return;
       }
       ToolBarPagerPresenter tA = this.A;
       if (tA != null) {
          f b = tA.b;
          if (b != null) {
             b.removeObserver(new a(new ToolBarPagerPresenter$onUnbind$1(this)));
          }
       }
       return;
    }
    public final void P8(Throwable p0){
       String path;
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolBarPagerPresenter.class, "1")) {
          return;
       }
       ToolBarPagerPresenter tx = this.x;
       String str = null;
       if (tx != null) {
          Uri uri = tx.a();
          if (uri != null) {
             path = uri.getPath();
          label_001c :
             MerchantHomeLogBiz toolBar = MerchantHomeLogBiz.ToolBar;
             ToolBarPagerPresenter tx1 = this.x;
             if (tx1 != null) {
                Uri uri1 = tx1.a();
                if (uri1 != null) {
                   str = uri1.toString();
                }
             }
             String str1 = str;
             Boolean uBoolean = (path != null)? Boolean.valueOf(new File(path).exists()): "false";
             a.n(toolBar, "ToolBarPagerPresenter", "background onFailure", p0, "uri", str1, "exists", uBoolean);
             return;
          }
       }
       path = str;
       goto label_001c ;
    }
    public final void R8(MerchantHomeSkin$ShowConfig p0){
       ToolBarPagerPresenter tv1;
       l1 a;
       Object[] objArray;
       ToolBarPagerPresenter toolBarPager = ToolBarPagerPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, toolBarPager, "6")) {
          return;
       }
       ToolBarPagerPresenter tt = this.t;
       if (tt != null) {
          Context context = tt.getContext();
          if (context != null) {
             this.x = new c(this.q, this.p, p0, context);
          }
       }
       ToolBarPagerPresenter tv = this.v;
       RecyclerView$Adapter adapter = (tv != null)? tv.getAdapter(): null;
       if (adapter == null) {
          adapter = new d(this.r, this.C);
          tv1 = this.v;
          if (tv1 != null) {
             tv1.setAdapter(adapter);
          }
       }
       tv1 = this.x;
       List list = (tv1 != null)? tv1.b(): null;
       a uoa = a.class;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(list, adapter, uoa, "1") && adapter.x != list) {
          adapter.x = list;
          List list1 = PatchProxy.applyOneRefs(list, adapter, uoa, "2");
          if (list1 != PatchProxyResult.class) {
          }else {
             list1 = adapter.s1();
             for (int i2 = 0; i2 < list.size(); i2 = i2 + adapter.w) {
                b uob = adapter.r1();
                for (int i3 = 0; i3 < adapter.w; i3 = i3 + 1) {
                   int i4 = i2 + i3;
                   if (i4 >= list.size()) {
                      break ;
                   }
                   uob.b.add(list.get(i4));
                }
                list1.add(uob);
             }
          }
          adapter.W0(list1);
          adapter.k0();
       }
       tv = this.p;
       int i1 = (tv != null)? tv.size(): 0;
       tv1 = 5;
       if (i1 <= tv1) {
          tv = this.t;
          if (tv != null) {
             tv.setVisibility(4);
          }
       }else if(!(i1 % 5)){
          i1 = i1 / tv1;
       }else {
          i1 = (i1 / tv1) + 1;
       }
       tv1 = this.t;
       if (tv1 != null) {
          tv1.setVisibility(i);
          ToolBarPagerPresenter tx = this.x;
          c g = (tx != null)? tx.g: null;
          tv1.setSelectedDrawable(g);
          tx = this.x;
          g = (tx != null)? tx.f: null;
          tv1.setUnselectedDrawable(g);
          tv1.setItemCount(i1);
          if (this.z == null) {
             tv = this.v;
             if (tv != null) {
                i1 = tv.getCurrentItem();
             label_00ec :
                tv1.setPageIndex(i1);
             }
          }
          i1 = 0;
          goto label_00ec ;
       }
       if (this.z != null) {
          tv = this.v;
          if (tv != null) {
             tv.setCurrentItem(i);
          }
       }
       this.z = i;
       if (!PatchProxy.applyVoid(null, this, toolBarPager, "9")) {
          tv = this.u;
          if (tv != null) {
             ViewGroup$LayoutParams layoutParams = tv.getLayoutParams();
             if (layoutParams != null) {
                toolBarPager = this.u;
                Context context1 = (toolBarPager != null)? toolBarPager.getContext(): null;
                tv1 = this.x;
                float f = (tv1 != null)? (float)tv1.e: 0;
                layoutParams.height = n.c(context1, f);
             }
          }
          tv = this.x;
          if (tv != null) {
             Uri uri = tv.a();
             if (uri != null) {
                MerchantHomeLogBiz toolBar = MerchantHomeLogBiz.ToolBar;
                StringBuilder str = "initBackground ";
                tv1 = this.x;
                Uri uri1 = (tv1 != null)? tv1.a(): null;
                a.d(toolBar, "ToolBarPagerPresenter", str+uri1);
                tv1 = this.y;
                ImageRequest imageRequest = (tv1 != null)? tv1.D(uri, 0, 0, false, this.D, null): null;
                if (imageRequest == null) {
                label_0168 :
                   tv = this.y;
                   if (tv != null) {
                      tv.setImageDrawable(null);
                      a = l1.a;
                   }
                }
             }else {
                goto label_0168 ;
             }
          }else {
             goto label_0168 ;
          }
       }
    label_0171 :
       return;
    }
    public final void S8(MerchantHomeSkin$ShowConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolBarPagerPresenter.class, "4")) {
          return;
       }
       ToolBarPagerPresenter tw = this.w;
       this.w = p0;
       if (a.g(p0, tw) ^ 0x01) {
          this.R8(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolBarPagerPresenter.class, "3")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3fac);
       this.t = m1.f(p0, 0x7f0a3fb5);
       ViewPager2 viewPager2 = m1.f(p0, R.id.toolbar_view_pager);
       this.v = viewPager2;
       if (viewPager2 != null) {
          viewPager2.j(new ToolBarPagerPresenter$c(this));
       }
       this.y = m1.f(p0, 0x7f0a3fa9);
       this.z = true;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ToolBarPagerPresenter.class, "2")) {
          return;
       }
       this.p = this.r8("MAGNET_MODEL");
       this.q = this.r8("MAGNET_IS_GUARANTEE").booleanValue();
       this.r = this.r8("FEED_FRAGMENT");
       this.s = this.r8("MERCHANT_HOME_MAGNET_POSITION").intValue();
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.A = f.p0(activity);
       this.w = this.t8("MERCHANT_HOME_SKIN_SHOW_CONFIG");
       activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.B = d.J0(activity);
       this.C = this.t8("MERCHANT_HOME_WIDGET_COMPONENT");
       return;
    }
}
