package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import l79.m$c;
import s79.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$a;
import nsd.u;
import o79.i;
import j79.l0;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$mPickRecyclerView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$mNextStep$2;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$mCustomTitleArea$2;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$mBottomControlContainer$2;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$container$2;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$b;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$e;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$d;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import q79.d;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager;
import g79.a;
import android.app.Application;
import android.content.Context;
import l79.m;
import r79.a;
import w69.k;
import android.content.res.Resources;
import cw9.c;
import java.util.Set;
import p79.g;
import p79.h;
import th0.e;
import android.animation.TimeInterpolator;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.y;
import cc7.a;
import cc7.c;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.m$e;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.List;
import ec7.a;
import java.lang.Integer;
import j79.n;
import java.lang.Runnable;
import android.view.ViewGroup;
import ha9.c;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import io.reactivex.subjects.PublishSubject;
import j79.o;
import j79.p;
import erd.g;
import crd.b;
import brd.t;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.yxcorp.gifshow.album.preview.d;
import kotlin.TypeCastException;
import java.util.Objects;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import r79.c;
import java.util.Map;
import java.util.ArrayList;
import android.os.Bundle;
import java.lang.CharSequence;
import o79.d;
import android.animation.AnimatorSet;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import java.lang.Boolean;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import th0.n;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$c;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import u79.o;
import com.yxcorp.gifshow.models.QMedia;

public final class MediaPreviewSelectViewStub extends a implements m$c	// class@001a3e
{
    public HashMap A;
    public d e;
    public m f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;
    public boolean l;
    public g m;
    public AlbumSelectedLayoutManager n;
    public a o;
    public final MediaPreviewSelectViewStub$b p;
    public boolean q;
    public final Set r;
    public AnimatorSet s;
    public final Observer t;
    public final Observer u;
    public b v;
    public final l0 w;
    public final MediaPreviewFragment x;
    public final AbsPreviewFragmentViewBinder y;
    public final AbsPreviewSelectViewBinder z;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final MediaPreviewSelectViewStub$a F;

    static {
       int i;
       MediaPreviewSelectViewStub.F = new MediaPreviewSelectViewStub$a(null);
       MediaPreviewSelectViewStub.B = i.d(4.00f);
       i = i.c(R.dimen.arg_RES_7f0704b3);
       MediaPreviewSelectViewStub.C = i;
       MediaPreviewSelectViewStub.D = i.c(0x7f070501);
       MediaPreviewSelectViewStub.E = i - 6;
    }
    public void MediaPreviewSelectViewStub(l0 p0,MediaPreviewFragment p1,AbsPreviewFragmentViewBinder p2,AbsPreviewSelectViewBinder p3){
       int i;
       a.q(p0, "mManager");
       a.q(p1, "host");
       a.q(p2, "previewViewBinder");
       a.q(p3, "selectViewBinder");
       super(p1);
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.g = s.c(new MediaPreviewSelectViewStub$mPickRecyclerView$2(this));
       this.h = s.c(new MediaPreviewSelectViewStub$mNextStep$2(this));
       this.i = s.c(new MediaPreviewSelectViewStub$mCustomTitleArea$2(this));
       this.j = s.c(new MediaPreviewSelectViewStub$mBottomControlContainer$2(this));
       this.k = s.c(new MediaPreviewSelectViewStub$container$2(this));
       MediaPreviewSelectViewStub$b uob = new MediaPreviewSelectViewStub$b(this);
       this.p = uob;
       this.q = true;
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       this.r = linkedHashSe;
       this.t = new MediaPreviewSelectViewStub$e(this);
       this.u = new MediaPreviewSelectViewStub$d(this);
       FragmentActivity activity = p1.getActivity();
       if (activity != null) {
          ViewModel viewModel = ViewModelProviders.of(activity).get(d.class);
          a.h(viewModel, "ViewModelProviders.of\(it¡­setViewModel::class.java\)");
          this.e = viewModel;
       }
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (!PatchProxy.applyVoid(null, this, mediaPreview, "9")) {
          a c = a.c;
          this.n = new AlbumSelectedLayoutManager(c.b(), 0, 0);
          LifecycleOwner lifecycleOwn = this.e();
          MediaPreviewSelectViewStub te = this.e;
          String str = "mViewModel";
          if (te == null) {
             a.S(str);
          }
          MediaPreviewSelectViewStub te1 = this.e;
          if (te1 == null) {
             a.S(str);
          }
          m om = new m(lifecycleOwn, te, te1.s0().m().f(), c.b(c.b().getResources(), 0x7f070501), linkedHashSe, 1);
          v9.d1(this);
          this.f = v9;
          g og = new g();
          og.X(0);
          og.Y(new e());
          og.z(300);
          og.x(0);
          og.K(0);
          this.m = og;
          MediaPreviewSelectViewStub tf = this.f;
          if (tf == null) {
             a.S("mSelectedAdapter");
          }
          a uoa = new a(tf, 15, 0, 0);
          uoa.C(true, (i.d(60.00f) - 0), i.d(10.00f));
          uoa.B(true);
          this.o = uoa;
          m om1 = new m(uoa);
          om1.f(this.m());
          AlbumSelectRecyclerView uAlbumSelect = this.m();
          uAlbumSelect.setLayoutManager(this.n);
          uAlbumSelect.setItemAnimator(this.m);
          uAlbumSelect.addItemDecoration(new b(0, MediaPreviewSelectViewStub.C, MediaPreviewSelectViewStub.C, MediaPreviewSelectViewStub.B));
          tf = this.f;
          if (tf == null) {
             a.S("mSelectedAdapter");
          }
          uAlbumSelect.setAdapter(tf);
          uAlbumSelect.addOnScrollListener(uob);
          this.p(p0.u0());
          MediaPreviewSelectViewStub tf1 = this.f;
          if (tf1 == null) {
             a.S("mSelectedAdapter");
          }
          tf1.S0(p0.D0());
          this.j(true);
          if (!PatchProxy.applyVoid(null, this, mediaPreview, "10") && p0.u0() >= 0) {
             i = p0.C0().indexOf(Integer.valueOf(p0.u0()));
             int i1 = p0.D0().size();
             if (i >= 0 && i1 > i) {
                this.m().post(new n(this, i));
             }
          }
       }
    label_01b4 :
       return;
    }
    public static final m h(MediaPreviewSelectViewStub p0){
       p0 = p0.f;
       if (p0 == null) {
          a.S("mSelectedAdapter");
       }
       return p0;
    }
    public void a(int p0,int p1){
    }
    public void b(ViewModel p0){
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mediaPreview, "7")) {
          return;
       }
       super.b(p0);
       if (!PatchProxy.applyVoid(null, this, mediaPreview, "18")) {
          this.w.E0().observe(this.x, this.t);
          this.w.s0().observe(this.x, this.u);
          this.v = this.w.z0().subscribe(new o(this), p.b);
       }
       return;
    }
    public void c(int p0){
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.isSupport(mediaPreview) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, mediaPreview, "24")) {
          return;
       }
       Log.g("MediaPreviewSelectViewStub", "onSelectedItemPreviewClicked "+p0);
       if (p0 == -1) {
          return;
       }
       Integer integer = this.w.C0().get(p0);
       PreviewViewPager previewViewP = this.y.p();
       if (previewViewP != null) {
          a.h(integer, "previewIndex");
          previewViewP.setCurrentItem(integer.intValue());
       }
       previewViewP = this.y.p();
       a uoa = null;
       a adapter = (previewViewP != null)? previewViewP.getAdapter(): uoa;
       if (adapter instanceof d) {
          previewViewP = this.y.p();
          if (previewViewP != null) {
             uoa = previewViewP.getAdapter();
          }
          if (uoa == null) {
             a.L();
          }
          if (uoa != null) {
             a.h(integer, "previewIndex");
             uoa.I(integer.intValue());
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.preview.MediaPreviewAdapter");
          }
       }
       return;
    }
    public void d(int p0){
       String str;
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.isSupport(mediaPreview) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, mediaPreview, "23")) {
          return;
       }
       Log.g("MediaPreviewSelectViewStub", "deleteItemListener "+p0);
       int i = -1;
       if (p0 == i) {
          return;
       }
       MediaPreviewSelectViewStub tw = this.w;
       Objects.requireNonNull(tw);
       l0 ol0 = l0.class;
       if (!PatchProxy.isSupport(ol0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tw, ol0, "10")) {
          int i1 = (p0 >= 0 && p0 < tw.c.size())? tw.c.get(p0).intValue(): -1;
          if (i1 >= 0 && i1 < tw.a.t().size()) {
             MediaPreviewInfo mediaPreview1 = tw.a.s(i1);
             int selectIndex = mediaPreview1.getSelectIndex();
             tw.o0(tw.f, mediaPreview1.getMedia().getTypeLoggerStr());
             tw.m = tw.m + i;
             mediaPreview1.unSelect();
             if (!tw.b.contains(mediaPreview1)) {
                tw.b.add(mediaPreview1);
             }
             tw.c.remove(p0);
             tw.d.x(p0);
             tw.S0(selectIndex);
          }
       }
    label_00aa :
       this.x.lh();
       Bundle uBundle = this.w.x0();
       if (uBundle != null) {
          str = uBundle.getString("album_custom_param_page_name");
          if (str != null) {
          label_00c2 :
             a.h(str, "mManager.extra?.getStrin\x20\x02OM_PARAM_PAGE_NAME\) ?: \"\"\x00");
             i = (str.length() > 0)? 1: 0;
             if (i) {
                d.l(str);
             }
             return;
          }
       }
       str = "";
       goto label_00c2 ;
    }
    public void g(){
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mediaPreview, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, mediaPreview, "19")) {
          this.w.E0().removeObserver(this.t);
          this.w.s0().removeObserver(this.u);
          mediaPreview = this.v;
          if (mediaPreview != null) {
             mediaPreview.dispose();
          }
       }
       mediaPreview = this.s;
       if (mediaPreview != null) {
          mediaPreview.cancel();
       }
       return;
    }
    public final void i(int p0){
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.isSupport(mediaPreview) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, mediaPreview, "16")) {
          return;
       }
       List list = this.p(p0);
       if (list.isEmpty() ^ 0x01) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             MediaPreviewSelectViewStub tf = this.f;
             if (tf == null) {
                a.S("mSelectedAdapter");
             }
             tf.m0(i, Boolean.FALSE);
          }
       }
       return;
    }
    public final void j(boolean p0){
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.isSupport(mediaPreview) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mediaPreview, "11")) {
          return;
       }
       boolean b = false;
       boolean b1 = (this.w.D0().size() > 0)? true: false;
       if (!this.w.D0().size() || this.w.D0().size() == 1) {
          b = true;
       }
       this.k(b1, (p0 ^ 1), b);
       return;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewSelectViewStub.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().getView();
    }
    public final void k(boolean p0,boolean p1,boolean p2){
       int this;
       MediaPreviewSelectViewStub ts1;
       MediaPreviewSelectViewStub ts2;
       Animator[] uAnimatorArr;
       if (PatchProxy.isSupport(MediaPreviewSelectViewStub.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, MediaPreviewSelectViewStub.class, "13")) {
          return;
       }
       MediaPreviewSelectViewStub ts = this.s;
       if (ts != null) {
          ts.cancel();
       }
       this.s = null;
       int i = (p0)? 0: 8;
       int i1 = 0;
       this = (p0)? 0: 0x3f800000;
       if (p0) {
          i1 = 0x3f800000;
       }
       float f = 16.00f;
       int i2 = (p0)? i.d(f): 0;
       int i3 = (p0)? 0: i.d(f);
       this.w.K = p0;
       ViewGroup viewGroup = this.l();
       if (viewGroup != null && viewGroup.getVisibility() == i) {
          return;
       }else if(p1){
          this.s = new AnimatorSet();
          float[] uofloatArray = new float[]{this,i1};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.l(), "alpha", uofloatArray).setDuration(300);
          String str = "ObjectAnimator.ofFloat\(c¡­BOTTOM_ANIMATOR_DURATION\)";
          a.h(objectAnimat, str);
          float[] uofloatArray1 = new float[]{(float)i2,(float)i3};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.l(), "translationY", uofloatArray1).setDuration(300);
          a.h(objectAnimat1, str);
          if (p0) {
             ts1 = this.s;
             if (ts1 != null) {
                ts1.setInterpolator(new e());
             }
          }else {
             objectAnimat1.setInterpolator(new e());
             objectAnimat.setInterpolator(new n());
          }
          ts1 = this.s;
          if (ts1 == null) {
             a.L();
          }
          ts1.addListener(new MediaPreviewSelectViewStub$c(this, p0));
          if (p2) {
             ts2 = this.s;
             if (ts2 != null) {
                uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                ts2.playTogether(uAnimatorArr);
             }
          }else {
             ts2 = this.s;
             if (ts2 != null) {
                uAnimatorArr = new Animator[]{objectAnimat};
                ts2.playTogether(uAnimatorArr);
             }
          }
          ts2 = this.s;
          if (ts2 != null) {
             ts2.start();
          }
       }else {
          this.o(p0);
       }
       return;
    }
    public final ViewGroup l(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewSelectViewStub.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final AlbumSelectRecyclerView m(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewSelectViewStub.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final void n(o p0){
       String str1;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewSelectViewStub.class, "26")) {
          return;
       }
       Bundle uBundle = this.w.x0();
       String str = "";
       if (uBundle != null) {
          str1 = uBundle.getString("album_custom_param_page_name");
          if (str1 != null) {
          label_001f :
             a.h(str1, "mManager.extra?.getStrin\x20\x02OM_PARAM_PAGE_NAME\) ?: \"\"\x00");
             if (!p0.k()) {
                if (this.w.D0().size() > 0) {
                   str2 = (this.w.K != null)? "unclean": "clean";
                }else {
                label_004f :
                   int i = 1;
                   int i1 = (str1.length() > 0)? 1: 0;
                   if (i1) {
                      if (str.length() <= 0) {
                         i = 0;
                      }
                      if (i) {
                         d.j(str1, str);
                      }
                   }
                   return;
                }
             }else if(p0.isPlaying()){
                str2 = "play";
             }else {
                str2 = "pause";
             }
             str = str2;
             goto label_004f ;
          }
       }
       str1 = str;
       goto label_001f ;
    }
    public final void o(boolean p0){
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.isSupport(mediaPreview) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mediaPreview, "14")) {
          return;
       }
       ViewGroup viewGroup = this.l();
       if (viewGroup != null) {
          int i = (p0)? 0: 8;
          viewGroup.setVisibility(i);
       }
       ViewGroup viewGroup1 = this.l();
       if (viewGroup1 != null) {
          viewGroup1.setAlpha(0x3f800000);
       }
       viewGroup1 = this.l();
       if (viewGroup1 != null) {
          viewGroup1.setTranslationY(0);
       }
       return;
    }
    public final List p(int p0){
       ArrayList obj;
       MediaPreviewSelectViewStub mediaPreview = MediaPreviewSelectViewStub.class;
       if (PatchProxy.isSupport(mediaPreview)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, mediaPreview, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (p0 >= 0) {
          p0 = this.w.C0().indexOf(Integer.valueOf(p0));
          if (!PatchProxy.applyVoidOneRefs(obj, this, mediaPreview, "15")) {
             List list = this.w.D0();
             a.h(list, "mManager.selectedMediaList");
             Iterator iterator = list.iterator();
             boolean b = false;
             int i1 = 0;
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                if (uoc instanceof QMedia && uoc.isSelected()) {
                   uoc.setSelected(b);
                   obj.add(Integer.valueOf(i1));
                }
                i1 = i1 + 1;
             }
          }
          int i = this.w.D0().size();
          if (p0 >= 0 && (i > p0 && this.w.D0().get(p0) instanceof QMedia)) {
             this.w.D0().get(p0).setSelected(true);
             obj.add(Integer.valueOf(p0));
          }
       }
    label_009f :
       return obj;
    }
}
