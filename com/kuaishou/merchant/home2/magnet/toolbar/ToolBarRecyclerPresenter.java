package com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter$a;
import nsd.u;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter$b;
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
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter$onBind$1;
import sz3.b;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import androidx.fragment.app.FragmentActivity;
import b04.d;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarRecyclerPresenter$onUnbind$1;
import java.lang.Throwable;
import android.net.Uri;
import vz3.c;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.io.File;
import java.lang.Boolean;
import p74.a;
import o74.a;
import android.content.Context;
import android.widget.ImageView;
import tz3.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.bowl.core.component.a;
import g9c.a;
import java.lang.StringBuilder;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import qrd.l1;
import kotlin.jvm.internal.a;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.e;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;

public final class ToolBarRecyclerPresenter extends PresenterV2	// class@001801
{
    public List p;
    public BaseFragment q;
    public View r;
    public MerchantHomeSkin$ShowConfig s;
    public c t;
    public MerchantKwaiImageView u;
    public f v;
    public d w;
    public a x;
    public RecyclerView y;
    public final a z;
    public static final ToolBarRecyclerPresenter$a A;

    static {
       ToolBarRecyclerPresenter.A = new ToolBarRecyclerPresenter$a(null);
    }
    public void ToolBarRecyclerPresenter(){
       super();
       this.z = new ToolBarRecyclerPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ToolBarRecyclerPresenter.class, "5")) {
          return;
       }
       ToolBarRecyclerPresenter tp = this.p;
       d uod = (tp == null || tp.isEmpty())? 1: null;
       if (uod) {
          return;
       }else {
          Objects.requireNonNull(d.a);
          tp = this.v;
          if (tp != null) {
             f b = tp.b;
             if (b != null) {
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                b.observe(activity, new b(new ToolBarRecyclerPresenter$onBind$1(this)));
             }
          }
          this.R8(this.s);
          d.J0(this.getActivity()).S0(this.p);
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, ToolBarRecyclerPresenter.class, "8")) {
          return;
       }
       ToolBarRecyclerPresenter ty = this.y;
       if (ty != null) {
          ty.setAdapter(null);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ToolBarRecyclerPresenter.class, "7")) {
          return;
       }
       ToolBarRecyclerPresenter tv = this.v;
       if (tv != null) {
          f b = tv.b;
          if (b != null) {
             b.removeObserver(new b(new ToolBarRecyclerPresenter$onUnbind$1(this)));
          }
       }
       return;
    }
    public final void P8(Throwable p0){
       String path;
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolBarRecyclerPresenter.class, "1")) {
          return;
       }
       ToolBarRecyclerPresenter tt = this.t;
       String str = null;
       if (tt != null) {
          Uri uri = tt.a();
          if (uri != null) {
             path = uri.getPath();
          label_001c :
             MerchantHomeLogBiz toolBar = MerchantHomeLogBiz.ToolBar;
             ToolBarRecyclerPresenter tt1 = this.t;
             if (tt1 != null) {
                Uri uri1 = tt1.a();
                if (uri1 != null) {
                   str = uri1.toString();
                }
             }
             String str1 = str;
             Boolean uBoolean = (path != null)? Boolean.valueOf(new File(path).exists()): "false";
             a.n(toolBar, "ToolBarRecyclerPresenter", "background onFailure", p0, "uri", str1, "exists", uBoolean);
             return;
          }
       }
       path = str;
       goto label_001c ;
    }
    public final void R8(MerchantHomeSkin$ShowConfig p0){
       ToolBarRecyclerPresenter ty1;
       l1 a;
       ToolBarRecyclerPresenter toolBarRecyc = ToolBarRecyclerPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, toolBarRecyc, "6")) {
          return;
       }
       ToolBarRecyclerPresenter tu = this.u;
       if (tu != null) {
          Context context = tu.getContext();
          if (context != null) {
             this.t = new c(false, this.p, p0, context);
          }
       }
       ToolBarRecyclerPresenter ty = this.y;
       RecyclerView$Adapter adapter = (ty != null)? ty.getAdapter(): null;
       if (adapter == null) {
          adapter = new e(this.q, this.x);
          ty1 = this.y;
          if (ty1 != null) {
             ty1.setAdapter(adapter);
          }
       }
       ty1 = this.t;
       List list = (ty1 != null)? ty1.b(): null;
       if (!PatchProxy.applyVoidOneRefs(list, adapter, e.class, "1") && adapter.w != list) {
          adapter.w = list;
          adapter.W0(list);
          adapter.k0();
       }
       if (!PatchProxy.applyVoid(null, this, toolBarRecyc, "9")) {
          ty = this.t;
          if (ty != null) {
             Uri uri = ty.a();
             if (uri != null) {
                MerchantHomeLogBiz toolBar = MerchantHomeLogBiz.ToolBar;
                StringBuilder str = "initBackground ";
                ty1 = this.t;
                Uri uri1 = (ty1 != null)? ty1.a(): null;
                a.d(toolBar, "ToolBarRecyclerPresenter", str+uri1);
                ty1 = this.u;
                ImageRequest imageRequest = (ty1 != null)? ty1.D(uri, 0, 0, false, this.z, null): null;
                if (imageRequest == null) {
                label_00a8 :
                   ty = this.u;
                   if (ty != null) {
                      ty.setImageDrawable(null);
                      a = l1.a;
                   }
                }
             }else {
                goto label_00a8 ;
             }
          }else {
             goto label_00a8 ;
          }
       }
    label_00b1 :
       return;
    }
    public final void S8(MerchantHomeSkin$ShowConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolBarRecyclerPresenter.class, "4")) {
          return;
       }
       ToolBarRecyclerPresenter ts = this.s;
       this.s = p0;
       if (a.g(p0, ts) ^ 0x01) {
          this.R8(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolBarRecyclerPresenter.class, "3")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3fac);
       this.u = m1.f(p0, 0x7f0a3fa9);
       RecyclerView recyclerView = m1.f(p0, R.id.toolbar_recycler_view);
       this.y = recyclerView;
       if (recyclerView != null) {
          recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
       }
       ToolBarRecyclerPresenter ty = this.y;
       if (ty != null) {
          ty.addItemDecoration(new e(0, 0, n.c(p0.getContext(), 2.00f), 0));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ToolBarRecyclerPresenter.class, "2")) {
          return;
       }
       this.p = this.r8("MAGNET_MODEL");
       this.q = this.r8("FEED_FRAGMENT");
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.v = f.p0(activity);
       this.s = this.t8("MERCHANT_HOME_SKIN_SHOW_CONFIG");
       activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.w = d.J0(activity);
       this.x = this.t8("MERCHANT_HOME_WIDGET_COMPONENT");
       return;
    }
}
