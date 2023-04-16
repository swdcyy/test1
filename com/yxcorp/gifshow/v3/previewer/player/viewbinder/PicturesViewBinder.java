package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import ei0.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import tyc.p3;
import x59.g;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import rwc.j;
import lwc.h;
import ooc.j0;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcorp.gifshow.widget.PicturesContainer;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import rwc.g;
import nsd.u;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$l;
import com.kwai.video.editorsdk2.PreviewTextureView;
import android.content.Context;
import java.util.Objects;
import android.view.ViewGroup;
import java.util.ArrayList;
import qwc.i;
import android.view.View$OnClickListener;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$o;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$q;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$n;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$mDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rwc.e;
import t36.f;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import di0.b;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$c;
import uwc.b;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$d;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$e;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$f;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$g;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$h;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$i;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView$b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.EditorActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import xf6.g;
import com.kwai.robust.PatchProxyResult;
import crd.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$j;
import erd.g;
import crd.b;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$10;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$a;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$p;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import swc.f;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$r;
import java.lang.Runnable;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Iterator;
import rwc.d;
import t36.f$a;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$k;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Boolean;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import android.widget.FrameLayout;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$enableAtlasMode$layoutManager$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$m;
import java.util.List;
import rwc.i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import qwc.h;
import g9c.a;
import java.io.File;
import qkd.b;
import pwc.a;
import android.util.Pair;
import mca.a;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Math;
import vba.d;
import sxb.a;
import java.util.concurrent.Semaphore;
import com.facebook.cache.common.CacheKey;
import jd.c;
import sxb.a$a;
import java.lang.Throwable;
import lnc.i1;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import rwc.h;
import ya.i;
import kb.e;
import java.util.concurrent.Executor;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$s;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.v3.f;
import java.lang.CharSequence;

public final class PicturesViewBinder extends a	// class@001601
{
    public PicturesViewBinder$o A;
    public PicturesViewBinder$q B;
    public PicturesViewBinder$n C;
    public final p D;
    public final BaseEditorFragment$e E;
    public final Fragment F;
    public final FragmentActivity G;
    public final p3 H;
    public final g I;
    public final PicturesViewModel J;
    public final j K;
    public final h L;
    public final j M;
    public final j N;
    public final j0 O;
    public final PreviewPlayer P;
    public final float c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final ViewPagerRecyclerView j;
    public final PicturesContainer k;
    public RecyclerViewCirclePagerIndicator l;
    public TextView m;
    public TextView n;
    public final LinearLayout o;
    public final KwaiImageView p;
    public final View q;
    public int r;
    public final g s;
    public PreviewTextureView t;
    public boolean u;
    public final PicturesViewBinder$l v;
    public i w;
    public boolean x;
    public String y;
    public Workspace$Source z;

    public void PicturesViewBinder(Fragment p0,FragmentActivity p1,View p2,p3 p3,g p4,Workspace$Type p5,PicturesViewModel p6,j p7,h p8,j p9,j p10,j0 p11,PreviewPlayer p12){
       boolean b;
       Object obj4;
       g a;
       Fragment uFragment = p0;
       View obj = p2;
       AtomicBoolean obj1 = p3;
       Object obj2 = p5;
       Object obj3 = p6;
       PreviewPlayer previewPlaye = p12;
       a.p(obj, "rootView");
       a.p(obj1, "picturesRecyclerViewConfig");
       a.p(obj2, "workspaceType");
       a.p(obj3, "picturesViewModel");
       super(obj);
       this.F = uFragment;
       this.G = p1;
       this.H = obj1;
       this.I = p4;
       this.J = obj3;
       this.K = p7;
       this.L = p8;
       this.M = p9;
       this.N = p10;
       this.O = p11;
       this.P = previewPlaye;
       this.c = 15.00f;
       this.d = a1.e(200.00f);
       this.e = a1.e(180.00f);
       this.f = a1.e(80.00f);
       this.g = a1.e(60.00f);
       this.h = a1.e(22.00f);
       this.i = a1.e(2.00f);
       View view = this.A().findViewById(R.id.picture_recycler_view);
       a.o(view, "mRootView.findViewById\(R.id.picture_recycler_view\)");
       View view1 = view;
       this.j = view1;
       view = this.A().findViewById(R.id.pictures_container);
       a.o(view, "mRootView.findViewById\(R.id.pictures_container\)");
       this.k = view;
       View view2 = this.A().findViewById(R.id.pager_indicator);
       a.o(view2, "mRootView.findViewById\(R.id.pager_indicator\)");
       this.l = view2;
       view2 = this.A().findViewById(R.id.total_progress_text);
       a.o(view2, "mRootView.findViewById\(R.id.total_progress_text\)");
       this.m = view2;
       view2 = this.A().findViewById(R.id.current_progress_text);
       a.o(view2, "mRootView.findViewById\(R.id.current_progress_text\)");
       this.n = view2;
       view2 = this.A().findViewById(R.id.pager_text_hint);
       a.o(view2, "mRootView.findViewById\(R.id.pager_text_hint\)");
       this.o = view2;
       this.p = this.A().findViewById(0x7f0a29a2);
       this.q = obj.findViewById(0x7f0a29a3);
       boolean i = 0;
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       u ou = null;
       g og = new g(i, 1, ou);
       this.s = og;
       this.v = new PicturesViewBinder$l(this);
       if (previewPlaye != null) {
          this.t = new PreviewTextureView(this.A().getContext());
          obj = this.A();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
          obj.addView(this.t, i);
          previewPlaye.mProjects = new ArrayList();
       }
       i oi = v11;
       View view3 = view1;
       i oi1 = v11;
       u ou1 = ou;
       PicturesViewBinder picturesView1 = picturesView;
       oi = new i(p3, p4, view.getInnerOnClickListener(), 0, og, p7, p10, p12, 8, 0);
       this.w = oi1;
       this.y = "";
       this.z = Workspace$Source.NONE;
       this.A = new PicturesViewBinder$o(this);
       this.B = new PicturesViewBinder$q(this);
       this.C = new PicturesViewBinder$n(this);
       p op = s.c(PicturesViewBinder$mDisposable$2.INSTANCE);
       this.D = op;
       obj1 = new AtomicBoolean(true);
       if (PatchProxy.applyVoid(ou1, og, g.class, "1")) {
          b = false;
       }else {
          a = og.a;
          g b1 = og.b;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(b1, a, e.class, "6")) {
             a.c.d(b1);
          }
          b = 0;
          Object[] objArray1 = new Object[b];
          a.D().w("EditorNewFilterBitmapCache", "attach cacheSize:"+og.c, objArray1);
       }
       this.F(obj2);
       i = (obj2 == Workspace$Type.ATLAS)? true: false;
       this.R(i);
       p6.v0().observe(this.K(), new PicturesViewBinder$b(this, obj1));
       p6.t0().observe(this.K(), new PicturesViewBinder$c(this));
       if (obj3 instanceof b) {
          obj4 = obj3;
          obj4.M0().observe(this.K(), new PicturesViewBinder$d(this));
          obj4.P0().observe(this.K(), new PicturesViewBinder$e(this));
          obj4.O0().observe(this.K(), new PicturesViewBinder$f(this));
          obj4.L0().observe(this.K(), new PicturesViewBinder$g(this));
          obj4.k.observe(this.K(), new PicturesViewBinder$h(this));
       }
       p6.s0().observe(this.K(), new PicturesViewBinder$i(this));
       PicturesViewBinder picturesView2 = picturesView1;
       if (!PatchProxy.applyVoid(ou1, this, picturesView2, "5")) {
          float f = 15.00f;
          this.n.setTextSize(f);
          this.m.setTextSize(f);
       }
       view2 = view3;
       view2.x(this.A);
       view2.addOnScrollListener(this.B);
       FragmentActivity activity = (uFragment != null)? p0.getActivity(): ou1;
       if (activity instanceof EditorActivity) {
          FragmentActivity activity1 = p0.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.EditorActivity");
          this.w.k = ViewModelProviders.of(activity1).get(j0.class).o0();
       }
       if (g.i0()) {
          obj4 = PatchProxy.apply(ou1, this, picturesView2, "3");
          if (obj4 != PatchProxyResult.class) {
          }else {
             obj4 = op.getValue();
          }
          obj4.c(t.interval(0, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new PicturesViewBinder$j(this)));
       }
       if (uFragment != null) {
          Lifecycle lifecycle = p0.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(new PicturesViewBinder$10(this, obj2));
          }
       }
       if (p12 != null) {
          p6.u0().observe(this.K(), new PicturesViewBinder$a(this));
       }
       obj1.set(b);
       Object[] objArray = new Object[b];
       a.D().w("PicturesViewBinder", "init workspaceType:"+obj2, objArray);
       this.E = new PicturesViewBinder$p(this);
       return;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PicturesViewBinder.class, "16")) {
          return;
       }
       PicturesViewBinder tF = this.F;
       if (tF instanceof BaseEditorFragment) {
          tF.eh(this.E);
       }
       tF = this.O;
       if (tF != null) {
          f uof = tF.o0();
          if (uof != null) {
             uof.d(this.v);
          }
       }
       tF = this.t;
       if (tF != null) {
          tF.setPreviewPlayer(this.P);
       }
       tF = this.J;
       Objects.requireNonNull(tF);
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, tF, PicturesViewModel.class, "3")) {
          tF.g.a();
          objArray = new Object[i];
          a.D().w("PicturesViewModel", "onAttach", objArray);
       }
       if (this.G()) {
          this.l.post(new PicturesViewBinder$r(this));
       }
       objArray = new Object[i];
       a.D().w("PicturesViewBinder", "onAttach", objArray);
       return;
    }
    public void C(){
       g a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PicturesViewBinder.class, "17")) {
          return;
       }
       PicturesViewBinder tF = this.F;
       if (tF instanceof BaseEditorFragment) {
          tF.th(this.E);
       }
       tF = this.O;
       if (tF != null) {
          f uof = tF.o0();
          if (uof != null) {
             uof.c(this.v);
          }
       }
       tF = this.t;
       if (tF != null) {
          tF.setPreviewPlayer(objArray);
       }
       this.J.z0();
       this.j.y(this.A);
       this.j.addOnScrollListener(this.B);
       tF = this.s;
       Objects.requireNonNull(tF);
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, tF, g.class, "8")) {
          a = tF.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, e.class, "3")) {
             Iterator iterator = a.b.keySet().iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = a.b.get(obj);
                if (obj1 != null) {
                   a.c.s0(new d(obj, obj1));
                }
             }
             a.b.clear();
          }
          tF.a.b(tF.b);
          objArray = new Object[i];
          a.D().w("EditorNewFilterBitmapCache", "detach", objArray);
       }
       objArray = new Object[i];
       a.D().w("PicturesViewBinder", "onDetach", objArray);
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturesViewBinder", "addBlankAreaBottom: ", objArray);
       PicturesViewBinder tp = this.p;
       if (tp == null) {
          return;
       }
       tp.setVisibility(0);
       if (this.p.getHeight() > 0) {
          ViewGroup$LayoutParams layoutParams = this.j.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.height = this.j.getHeight() - this.p.getHeight();
          layoutParams.gravity = 48;
          this.j.setLayoutParams(layoutParams);
          Object[] objArray1 = new Object[0];
          a.D().w("PicturesViewBinder", "mPictureRecyclerView height = "+layoutParams.height, objArray1);
       }else {
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(new PicturesViewBinder$k(this));
       }
       tp = this.q;
       if (tp != null) {
          tp.setVisibility(0);
       }
       return;
    }
    public final void E(boolean p0){
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, picturesView, "11")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.l.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       PicturesViewBinder ti = (p0)? this.i: this.e;
       layoutParams.bottomMargin = ti;
       layoutParams = this.o.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       PicturesViewBinder th = (p0)? this.h: this.d;
       layoutParams.bottomMargin = th;
       this.l.requestLayout();
       this.o.requestLayout();
       return;
    }
    public final void F(Workspace$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder.class, "6")) {
          return;
       }
       this.I(this.G(), -1);
       this.L(this.G(), this.r);
       this.J.n(this.r);
       this.r = this.J.q0();
       PicturesViewBinder tw = this.w;
       Objects.requireNonNull(tw);
       int i = 0;
       if (!PatchProxy.applyVoid(null, tw, i.class, "8")) {
          Object[] objArray1 = new Object[i];
          a.D().s("PicturesAdapter", "clear logMap, size:"+tw.n.size(), objArray1);
          tw.n.clear();
       }
       Object[] objArray = new Object[i];
       a.D().w("PicturesViewBinder", "changeWorkspace workspaceType:"+p0, objArray);
       return;
    }
    public final boolean G(){
       Object obj = PatchProxy.apply(null, this, PicturesViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.J.t0().getValue() == Workspace$Type.ATLAS)? true: false;
       return b;
    }
    public final boolean H(){
       Object obj = PatchProxy.apply(null, this, PicturesViewBinder.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.j.getHeight() == this.k.getHeight())? true: false;
       return b;
    }
    public final void I(boolean p0,int p1){
       Workspace$Type type;
       int i;
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, picturesView, "7")) {
          return;
       }
       PicturesViewBinder$enableAtlasMode$layoutManager$1 uoenableAtla = new PicturesViewBinder$enableAtlasMode$layoutManager$1(this, p0, this.j.getContext(), (p0 ^ 0x01), false);
       PicturesViewBinder tw = this.w;
       Workspace$Type sINGLE_PICTU = Workspace$Type.SINGLE_PICTURE;
       if (this.J.t0().getValue() == sINGLE_PICTU) {
          type = sINGLE_PICTU;
       }else if(p0){
          type = Workspace$Type.ATLAS;
       }else {
          type = Workspace$Type.LONG_PICTURE;
       }
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoidOneRefs(type, tw, i.class, "9")) {
          a.p(type, "<set-?>");
          tw.r = type;
       }
       this.j.setLayoutManager(picturesView);
       this.j.setEnableViewPager(p0);
       this.j.setAdapter(this.w);
       if (p1 >= 0) {
          this.j.z(p1);
       }
       ViewGroup$LayoutParams layoutParams = this.j.getLayoutParams();
       if (layoutParams != null) {
          i = (p0 || this.J.t0().getValue() == sINGLE_PICTU)? -1: -2;
          layoutParams.height = i;
          this.j.setLayoutParams(layoutParams);
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturesViewBinder", "enableAtlasMode enableAtlasMode:"+p0, objArray);
       return;
    }
    public final Fragment J(){
       return this.F;
    }
    public final LifecycleOwner K(){
       PicturesViewBinder obj = PatchProxy.apply(null, this, PicturesViewBinder.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj != null) {
          return obj;
       }
       obj = this.G;
       if (obj != null) {
          return obj;
       }
       throw new RuntimeException("getLifecycleOwner error");
    }
    public final void L(boolean p0,int p1){
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, picturesView, "8")) {
          return;
       }
       if (p0) {
          this.l.post(new PicturesViewBinder$m(this, p1));
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturesViewBinder", "initIndicator enableAtlasMode:"+p0+", position:"+p1, objArray);
       return;
    }
    public final boolean M(){
       PicturesViewBinder obj = PatchProxy.apply(null, this, PicturesViewBinder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.J;
       boolean b = false;
       if (obj instanceof b) {
          Integer value = obj.O0().getValue();
          if (value != null && !value.intValue()) {
             b = true;
          }
       }
       return b;
    }
    public final void N(List p0,int p1,Object p2){
       if (PatchProxy.isSupport(PicturesViewBinder.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PicturesViewBinder.class, "4")) {
          return;
       }
       i oi = p0.get(p1);
       h oh = this.j.findViewHolderForLayoutPosition(p1);
       String str = ", payload:";
       if (a.g(p2, Integer.valueOf(1)) || oh == null) {
          if (p1 != this.J.q0()) {
             oi.m(false);
          }
          Object[] objArray = new Object[false];
          a.D().w("PicturesViewBinder", "notifyItemChange set index:"+p1+str+p2, objArray);
          this.w.V0(p1, oi);
       }else {
          this.w.Q0().set(p1, oi);
          Object[] objArray1 = new Object[false];
          a.D().w("PicturesViewBinder", "notifyItemChange onbind index:"+p1+str+p2, objArray1);
          oh.j(oi, p1);
       }
       return;
    }
    public final void P(int p0){
       Pair pair;
       Pair second;
       ImageRequestBuilder imageRequest;
       Object[] objArray2;
       Object obj = this;
       int i = p0;
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, picturesView, "15")) {
          return;
       }
       if (obj.P != null) {
          return;
       }
       i oi = obj.J.v0().u(i);
       if (oi != null) {
          File uFile = new File(oi.g());
          if (b.S(uFile)) {
             PicturesViewBinder h = obj.H;
             PicturesViewBinder i1 = obj.I;
             PicturesViewBinder s = obj.s;
             ImageRequestBuilder value = obj.J.t0().getValue();
             a.m(value);
             a.o(value, "picturesViewModel.mCurrentWorkspaceType.value!!");
             a uoa = a.class;
             int i2 = 1;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{oi,uFile,h,i1,null,s,value};
                pair = PatchProxy.apply(objArray, null, uoa, "9");
                if (pair != PatchProxyResult.class) {
                label_0148 :
                   second = pair.second;
                   Pair first = pair.first;
                   a.o(first, "pair.first");
                   if (!first.booleanValue()) {
                      a.o(second, "requestBuilder");
                      if (second.f() == null) {
                      label_0164 :
                         a.o(second, "requestBuilder");
                         if (second.f() == null) {
                            second.r(a.k.a(oi.g(), oi.d()));
                         }
                         picturesView = obj.J;
                         if (!picturesView instanceof b || !a.g(picturesView.P0().getValue(), Boolean.TRUE)) {
                            picturesView = obj.s;
                            Objects.requireNonNull(picturesView);
                            g og = g.class;
                            if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(second, Integer.valueOf(p0), picturesView, og, "4")) {
                               a.p(second, "imageRequestBuilder");
                               if (second.f() == null) {
                                  i1.c(new RuntimeException("prefetch need postprocessor"));
                               }else {
                                  c uoc = second.f();
                                  Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.player.photos.NewFilterProcessor");
                                  Fresco.getImagePipeline().fetchDecodedImage(second.a(), null).f(new h(picturesView, uoc, i), i.d());
                               }
                            }
                         }
                      }
                   }else {
                      goto label_0164 ;
                   }
                   Object[] objArray1 = new Object[0];
                   a.D().w("PicturesViewBinder", "prefetchPicture position:"+i+", pair:"+pair, objArray1);
                }
             }
             a.p(oi, "editorPictureData");
             a.p(uFile, "imageFile");
             a.p(h, "picturesRecyclerViewConfig");
             a.p(s, "newFilterProcessorMap");
             a.p(value, "workspaceType");
             if (a.x()) {
                value = ImageRequestBuilder.k(w0.c(uFile));
                value.v(new d(8192, 8192, (float)8192));
                imageRequest = value;
             }else {
                ImageRequestBuilder imageRequest1 = ImageRequestBuilder.k(w0.c(uFile));
                imageRequest1.v(new d(h.b().b, h.b().c, (float)Math.max(a.a.g(value), h.a().c)));
                imageRequest = imageRequest1;
             }
             if (oi.f().m()) {
                a uoa1 = v10;
                a uoa2 = v10;
                uoa1 = new a(i1, null, oi.f(), uFile.getAbsolutePath(), uFile.getAbsolutePath());
                second = s.a(uoa2.a());
                String str = "EditorPictureUtils";
                if (second != null) {
                   a.o(imageRequest, "requestBuilder");
                   imageRequest.r(second.first);
                   objArray2 = new Object[0];
                   a.D().w(str, "generatePicturesImageRequestBuilder get cached processor", objArray2);
                }else {
                   a.o(imageRequest, "requestBuilder");
                   imageRequest.r(uoa2);
                   objArray2 = new Object[0];
                   a.D().w(str, "generatePicturesImageRequestBuilder new processor", objArray2);
                label_013f :
                   pair = new Pair(Boolean.valueOf(i2), imageRequest);
                   goto label_0148 ;
                }
             }
             i2 = false;
             goto label_013f ;
          }
       }
       return;
    }
    public final void Q(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder.class, "13")) {
          return;
       }
       this.j.getViewTreeObserver().addOnGlobalLayoutListener(new PicturesViewBinder$s(this));
       return;
    }
    public final void R(boolean p0){
       Intent intent;
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, picturesView, "9")) {
          return;
       }
       picturesView = this.F;
       if (picturesView != null) {
          FragmentActivity activity = picturesView.getActivity();
          if (activity != null) {
             intent = activity.getIntent();
          label_0025 :
             int i = 0;
             picturesView = (!f.C(intent) && p0)? 1: null;
             if (picturesView) {
                this.l.setVisibility(i);
                this.m.setVisibility(i);
                this.n.setVisibility(i);
             }else {
                int i1 = 8;
                this.l.setVisibility(i1);
                this.m.setVisibility(i1);
                this.n.setVisibility(i1);
             }
             Object[] objArray = new Object[i];
             a.D().w("PicturesViewBinder", "updateIndicatorVisible visible:"+p0, objArray);
             return;
          }
       }
       intent = null;
       goto label_0025 ;
    }
    public final void S(int p0){
       PicturesViewBinder picturesView = PicturesViewBinder.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, picturesView, "10")) {
          return;
       }
       if (this.G() || this.M()) {
          this.n.setText(String.valueOf((p0 + 1)));
          this.m.setText("/"+this.w.getItemCount());
          Object[] objArray = new Object[0];
          a.D().w("PicturesViewBinder", "updatePagerProgress currentPosition:"+p0, objArray);
       }
       return;
    }
}
