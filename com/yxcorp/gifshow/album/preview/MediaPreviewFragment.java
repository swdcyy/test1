package com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import dc7.c;
import j79.q0;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import j79.b;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$a;
import java.util.ArrayList;
import n79.b;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$b;
import ga9.b;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import androidx.lifecycle.ViewModel;
import m79.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import w69.d;
import w69.d$b;
import w69.n0;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.AlbumLimitOption$a;
import ga9.c;
import ga9.c$a;
import w69.f;
import w69.f$b;
import w69.k;
import w69.k$b;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.List;
import j79.l0;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ic7.c;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import ekd.j;
import com.yxcorp.utility.Log;
import ekd.q;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultPreviewSelectViewBinder;
import kotlin.jvm.internal.a;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import j79.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n79.a;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import n79.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import n79.d;
import android.animation.Animator;
import n79.e;
import android.animation.Animator$AnimatorListener;
import u79.b;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$d;
import j79.d0;
import vsd.n;
import rsd.f;
import j79.h0;
import z0.a;
import r79.c;
import j79.d;
import j79.c;
import r79.a;
import q79.d;
import j79.a;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$b;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import android.view.View;
import j79.e0;
import android.view.View$OnClickListener;
import j79.f0;
import j79.g0;
import j79.i0;
import j79.j0;
import j79.k0;
import android.graphics.Bitmap$Config;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.StringBuilder;
import w69.k0;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import o79.b;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption;
import w69.b;
import nsd.u;
import q79.j;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import g79.a;
import w69.y0;
import androidx.lifecycle.MutableLiveData;
import n79.f;
import n79.g;
import th0.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import java.util.Iterator;
import s79.a;
import j79.x;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import j79.q;
import com.yxcorp.gifshow.album.preview.e;
import com.yxcorp.gifshow.album.preview.f;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$c;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$e;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import w69.x;
import android.widget.ImageView;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import kotlin.TypeCastException;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment$e;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.Float;
import ekd.b0;
import android.view.ViewTreeObserver;
import n79.i;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Exception;

public class MediaPreviewFragment extends AlbumBaseFragment implements c, q0	// class@001a2d
{
    public boolean A;
    public MediaPreviewFragment$e B;
    public boolean C;
    public d D;
    public a E;
    public l0 i;
    public int j;
    public o0 k;
    public Handler l;
    public List m;
    public d0 n;
    public q o;
    public x p;
    public h0 q;
    public b r;
    public d s;
    public e t;
    public c u;
    public n0 v;
    public b w;
    public b x;
    public boolean y;
    public PreviewViewPager$b z;
    public static final int F;

    public void MediaPreviewFragment(){
       super();
       this.k = new b();
       this.l = new MediaPreviewFragment$a(this);
       this.m = new ArrayList();
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = null;
       this.x = new b();
       this.y = true;
       this.B = null;
       this.C = false;
       this.D = null;
       this.E = new MediaPreviewFragment$b(this);
    }
    public b Wg(){
       return this.dh();
    }
    public b Yg(){
       return this.ih();
    }
    public ViewModel Zg(){
       return this.i;
    }
    public void a7(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewFragment.class, "8")) {
          return;
       }
       MediaPreviewFragment tx = this.x;
       tx.j = p0.d();
       tx.k = p0.e();
       return;
    }
    public final void ch(Bundle p0){
       Object obj2;
       l0 obj = this;
       MediaPreviewInfo[] obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MediaPreviewFragment.class, "14")) {
          return;
       }
       d uod = d.h.b(obj1);
       uod.h(obj.v);
       String str = obj1.getString("ALBUM_PREVIEW_MEDIA_LIST_KEY");
       int intx = obj1.getInt("ALBUM_PREVIEW_CURRENT_MEDIA_INDEX");
       int intx1 = obj1.getInt("ALBUM_PREVIEW_SELECTED_COUNT");
       ArrayList integerArray = obj1.getIntegerArrayList("ALBUM_PREVIEW_SELECTED_MEDIA_INDEX_LIST");
       int intx2 = obj1.getInt("album_target_select_index");
       boolean booleanx = obj1.getBoolean("ALBUM_PREVIEW_IS_VIDEO_LOOP", true);
       AlbumLimitOption uAlbumLimitO = AlbumLimitOption.H.b(obj1);
       c uoc = c.d.a(obj1);
       f uof = f.w.b(obj1);
       k ok = k.j0.b(obj1);
       Serializable serializable = SerializableHook.getSerializable(obj1, "album_selected_data");
       int intx3 = obj1.getInt("ALBUM_ERROR_TIP_STYLE");
       boolean booleanx1 = obj1.getBoolean("ALBUM_PREVIEW_SHOW_BOTTOM_SELECT_AREA");
       boolean booleanx2 = obj1.getBoolean("ALBUM_PREVIEW_TRANS_ANIMATOR_CUSTOM");
       boolean booleanx3 = obj1.getBoolean("ALBUM_PREVIEW_SHARE_SELECT_CONTAINER");
       Bundle bundle = obj1.getBundle("album_extra_param");
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0)) {
          Object[] objArray = new Object[17];
          objArray[0] = str;
          objArray[1] = Integer.valueOf(intx);
          objArray[2] = Integer.valueOf(intx1);
          objArray[3] = integerArray;
          objArray[4] = Integer.valueOf(intx2);
          objArray[5] = Boolean.valueOf(booleanx);
          objArray[6] = uAlbumLimitO;
          objArray[7] = uoc;
          objArray[8] = uod;
          objArray[9] = uof;
          objArray[10] = ok;
          objArray[11] = serializable;
          objArray[12] = Integer.valueOf(intx3);
          objArray[13] = Boolean.valueOf(booleanx1);
          objArray[14] = Boolean.valueOf(booleanx2);
          objArray[15] = Boolean.valueOf(booleanx3);
          objArray[16] = bundle;
          obj = null;
          obj1 = PatchProxy.apply(objArray, obj, ol0, "2");
          if (obj1 != PatchProxyResult.class) {
             obj2 = obj1;
          label_0123 :
             int i = this;
             i.i = obj2;
             i.j = p0.getInt("ALBUM_PREVIEW_TAB_TYPE");
             return;
          }
       }else {
          obj = null;
       }
       obj1 = c.c().b(str, MediaPreviewInfo[].class);
       if (j.h(obj1)) {
          Log.d("PreviewBug", "createDataManager:: MediaPreviewInfos is empty, return null");
       }else {
          ol0 = new l0(q.a(obj1), intx, intx1, integerArray, intx2, booleanx, uAlbumLimitO, uoc, uod, uof, ok, serializable, intx3, booleanx1, booleanx2, booleanx3, bundle);
       }
       obj2 = obj;
       goto label_0123 ;
    }
    public AbsPreviewFragmentViewBinder dh(){
       boolean b;
       AbsPreviewSelectViewBinder uAbsPreviewS;
       AbsPreviewFragmentViewBinder uAbsPreviewF = AbsPreviewFragmentViewBinder.class;
       Object[] objArray = null;
       MediaPreviewFragment obj = PatchProxy.apply(objArray, this, MediaPreviewFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       MediaPreviewFragment ti = this.i;
       if (ti != null && ti.F0() != null) {
          b = this.i.Q0();
          objArray = this.i.F0().a(uAbsPreviewF, this, this.j);
          uAbsPreviewS = this.i.F0().a(AbsPreviewSelectViewBinder.class, this, -1);
       }else {
          uAbsPreviewS = objArray;
       }
       if (objArray == null) {
          objArray = new DefaultPreviewFragmentViewBinder(this, this.j);
          uAbsPreviewS = new DefaultPreviewSelectViewBinder(this);
       }
       if (b && !PatchProxy.applyVoidOneRefs(uAbsPreviewS, objArray, uAbsPreviewF, "1")) {
          a.q(uAbsPreviewS, "viewBinder");
          objArray.g = uAbsPreviewS;
       }
       return objArray;
    }
    public final void eh(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewFragment.class, "26")) {
          return;
       }
       if (p0 != null && !p0.isDisposed()) {
          p0.dispose();
       }
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment.class, "24")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       MediaPreviewFragment ti = this.i;
       if (ti == null) {
          this.jh();
          return;
       }else {
          MediaPreviewFragment tt = this.t;
          if (tt != null) {
             tt.b(ti.b);
          }
          if (this.getArguments() != null) {
             String str = "ALBUM_PREVIEW_MEDIA_LIST_KEY";
             if (!TextUtils.x(this.getArguments().getString(str))) {
                c.c().e(this.getArguments().getString(str));
             }
          }
          this.jh();
          return;
       }
    }
    public l0 gh(){
       return this.i;
    }
    public b hh(){
       return this.x;
    }
    public AbsPreviewFragmentViewBinder ih(){
       return this.d;
    }
    public final void jh(){
       float f2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MediaPreviewFragment.class, "27")) {
          return;
       }
       MediaPreviewFragment tx = this.x;
       if (tx.D == null) {
          this.E.c();
          this.qh();
          return;
       }else {
          Objects.requireNonNull(tx);
          if (!PatchProxy.applyVoid(objArray, tx, b.class, "9") && (tx.C != null && tx.A != null)) {
             b z = tx.z;
             if (z != null) {
                if (tx.E != null) {
                   z.c();
                }else {
                   z = tx.y;
                   if (z == null || !z.isRunning()) {
                      z = tx.z;
                      if (z == null) {
                         a.L();
                      }
                      z.c();
                      tx.b();
                      b m = tx.m;
                      float f = (float)tx.f * m;
                      float f1 = (float)tx.g * m;
                      float[] uofloatArray = new float[]{tx.n + (((float)tx.h - f) / f2),(float)tx.j};
                      f2 = (float)2;
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tx.A, "translationX", uofloatArray);
                      float[] uofloatArray1 = new float[]{tx.o + (((float)tx.i - f1) / f2),(float)tx.k};
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tx.A, "translationY", uofloatArray1);
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      if (valueAnimato != null) {
                         valueAnimato.addUpdateListener(new c(tx));
                      }
                      ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      valueAnimato1.addUpdateListener(new d(tx, f, f1));
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,valueAnimato1,valueAnimato};
                      uAnimatorSet.playTogether(uAnimatorArr);
                      uAnimatorSet.addListener(new e(tx));
                      uAnimatorSet.setInterpolator(b.b());
                      uAnimatorSet.setDuration(250);
                      uAnimatorSet.start();
                      tx.y = uAnimatorSet;
                      tx.D = false;
                   }
                }
             }
          }
          if (this.x.d() != null && this.x.d().isRunning()) {
             this.x.d().addListener(new MediaPreviewFragment$d(this));
          }else {
             this.E.c();
             this.qh();
          }
          return;
       }
    }
    public boolean kh(){
       return this.A;
    }
    public void lh(){
       Object obj;
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment.class, "18")) {
          return;
       }
       MediaPreviewFragment tn = this.n;
       int i = 0;
       String str = "<set-?>";
       String str1 = "3";
       if (tn != null) {
          obj = new Object();
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoidOneRefs(obj, tn, d0.class, str1)) {
             a.q(obj, str);
             tn.e.b(tn, d0.j[i], obj);
          }
       }
       tn = this.q;
       if (tn != null) {
          obj = new Object();
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoidOneRefs(obj, tn, h0.class, str1)) {
             a.q(obj, str);
             tn.e.b(tn, h0.i[i], obj);
          }
       }
       return;
    }
    public final b mh(b p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MediaPreviewFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.eh(p0);
       return p1.apply(null);
    }
    public void nh(int p0){
       if (PatchProxy.isSupport(MediaPreviewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MediaPreviewFragment.class, "19")) {
          return;
       }
       MediaPreviewFragment ts = this.s;
       if (ts != null) {
          ts.Tb(p0, this.i.t0().getMedia());
       }
       ts = this.u;
       if (ts != null) {
          ts.b(p0, this.i.t0().getMedia());
       }
       if (this.getActivity() != null && (this.getArguments().getBoolean("ALBUM_PREVIEW_TRANSITION_ANIM", false) && (this.D.s0().i().b() && this.D.s0().j() != null))) {
          this.D.s0().j().b(this.i.t0().getMedia());
       }
    label_007f :
       return;
    }
    public void oh(PreviewViewPager$b p0,boolean p1){
       if (PatchProxy.isSupport(MediaPreviewFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, MediaPreviewFragment.class, "2")) {
          return;
       }
       this.z = p0;
       p1 = (p0 == null && p1)? true: false;
       this.y = p1;
       if (this.ih() != null && this.ih().p() != null) {
          this.ih().p().setShowBackground(this.y);
          this.ih().p().setBackgroundTransListener(p0);
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isAdded()) {
          return false;
       }
       this.fh();
       return true;
    }
    public void onBindClickEvent(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MediaPreviewFragment.class, "32")) {
          return;
       }
       MediaPreviewFragment tn = this.n;
       if (tn != null) {
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(objArray, tn, d0.class, "5")) {
             View view1 = tn.g.k();
             if (view1 != null) {
                view1.setOnClickListener(new e0(tn));
             }
             view1 = tn.g.l();
             if (view1 != null) {
                view1.setOnClickListener(new f0(tn));
             }
             view1 = tn.g.m();
             if (view1 != null) {
                view1.setOnClickListener(new g0(tn));
             }
          }
       }
       tn = this.q;
       if (tn != null) {
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(objArray, tn, h0.class, "6")) {
             View view = tn.g.k();
             if (view != null) {
                view.setOnClickListener(new i0(tn));
             }
             view = tn.g.l();
             if (view != null) {
                view.setOnClickListener(new j0(tn));
             }
             view = tn.g.m();
             if (view != null) {
                view.setOnClickListener(new k0(tn));
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       d uod = this;
       y0 obj = p0;
       d uod1 = d.class;
       if (PatchProxy.applyVoidOneRefs(obj, uod, MediaPreviewFragment.class, "1")) {
          return;
       }
       SubsamplingScaleImageView.setPreferredBitmapConfig(Bitmap$Config.ARGB_8888);
       Bundle arguments = this.getArguments();
       Log.g("PreviewBug", "onCreate:: savedInstanceState="+obj+", getArguments="+arguments);
       if (arguments != null) {
          uod.ch(arguments);
       }
       a uoa = new a(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0xffff, null);
       v4.p(arguments);
       if (v4.i().n == 1) {
          uod.D = ViewModelProviders.of(uod, new j(v4)).get(uod1);
       }else if(this.getActivity() != null){
          uod.D = ViewModelProviders.of(this.getActivity(), new j(v4)).get(uod1);
       }else {
          uod.D = ViewModelProviders.of(uod, new j(v4)).get(uod1);
       }
       MediaPreviewFragment i = uod.i;
       if (i != null) {
          i.O0(uod.D);
       }
       super.onCreate(p0);
       obj = a.c.d();
       obj.b();
       obj.d();
       uod.x.k(uod.E);
       MediaPreviewFragment u = uod.u;
       if (u != null) {
          u.g();
       }
       return;
    }
    public Animator onCreateAnimator(int p0,boolean p1,int p2){
       MediaPreviewFragment obj;
       boolean b;
       Bundle arguments;
       Object obj1;
       b uob = b.class;
       if (PatchProxy.isSupport(MediaPreviewFragment.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, MediaPreviewFragment.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.i;
       b = false;
       l0 d = (obj != null)? obj.D: null;
       Animator uAnimator = null;
       if (d != null) {
          if (this.C != null && !p1) {
             this.C = b;
             return uAnimator;
          }else {
             obj = this.x;
             arguments = this.getArguments();
             MediaPreviewFragment ti = this.i;
             Objects.requireNonNull(obj);
             if (PatchProxy.isSupport(uob)) {
                obj1 = PatchProxy.applyFourRefs(arguments, Boolean.valueOf(p1), this, ti, obj, b.class, "2");
                if (obj1 != PatchProxyResult.class) {
                   uAnimator = obj1;
                }else {
                label_0062 :
                   a.q(ti, "manager");
                   if (arguments != null) {
                      obj.h(arguments, p1, this);
                      uAnimator = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(300);
                      MutableLiveData mutableLiveD = (p1)? ti.w0(): ti.i;
                      uAnimator.addUpdateListener(new f(mutableLiveD));
                      uAnimator.addListener(new g(mutableLiveD));
                      a.h(uAnimator, "animator");
                      uAnimator.setInterpolator(new e());
                   }
                }
             }else {
                goto label_0062 ;
             }
             return uAnimator;
          }
       }else {
          obj = this.x;
          arguments = this.getArguments();
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(uob)) {
             obj1 = PatchProxy.applyThreeRefs(arguments, Boolean.valueOf(p1), this, obj, b.class, "3");
             if (obj1 != PatchProxyResult.class) {
                uAnimator = obj1;
             }else if(arguments == null){
                obj.h(arguments, p1, this);
             }
          }else {
             goto label_00c8 ;
          }
          return uAnimator;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       MediaPreviewFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MediaPreviewFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "PreviewBug";
       Log.g(str, "onCreateView:``: savedInstanceState="+p2);
       if (!PatchProxy.applyVoidOneRefs(p2, this, MediaPreviewFragment.class, "5")) {
          if (this.getArguments() == null && this.i == null) {
             if (p2 != null) {
                Log.g(str, "MediaPreviewFragment recreate from savedInstanceState");
                this.ch(p2.getBundle("saved_instance_bundle"));
             }else {
                Log.d(str, "getArgument==null and mManager==null£¬finish MediaPreviewActivity");
                if (this.getActivity() != null) {
                   this.getActivity().finish();
                }
             }
          }
          if (this.i == null) {
             this.ch(this.getArguments());
          }
          obj = this.i;
          if (obj == null) {
             Log.d(str, "mManager still not initialized£¬finish MediaPreviewActivity");
             if (this.getActivity() != null) {
                this.getActivity().finish();
             }
          }else {
             obj.O0(this.D);
          }
       }
    label_0089 :
       if (this.i != null) {
          Log.g(str, "mManager initialized in onCreateView, create new viewbinder");
          this.d = this.dh();
          this.i.g = this.k;
       }else {
          Log.d(str, "mManager still not initialized in onCreateView, use default");
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       this.x.k(null);
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MediaPreviewFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(objArray, this, MediaPreviewFragment.class, "17")) {
          Iterator iterator = this.m.iterator();
          while (iterator.hasNext()) {
             iterator.next().g();
          }
       }
       this.eh(this.r);
       this.eh(this.w);
       a.c.d().e();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewFragment.class, "11")) {
          return;
       }
       Log.g("PreviewBug", "onSaveInstanceState");
       p0.putBundle("saved_instance_bundle", this.getArguments());
       super.onSaveInstanceState(p0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       ClientEvent$ElementPackage obj;
       String str = "6";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaPreviewFragment.class, str)) {
          return;
       }
       if (this.i == null) {
          return;
       }
       boolean b = true;
       if (!PatchProxy.applyVoid(null, this, MediaPreviewFragment.class, "15")) {
          MediaPreviewFragment ti = this.i;
          String str4 = "ALBUM_PREVIEW_SLIDE_DOWN_EXIT";
          if (ti != null && ti.Q0()) {
             this.q = new h0(this.i, this, this.ih());
             x ox = new x(this.i, this.D, this, this.ih(), this.getArguments().getBoolean(str4));
             this.p = ti;
             this.m.add(this.q);
             this.m.add(this.p);
             this.m.add(new MediaPreviewSelectViewStub(this.i, this, this.ih(), this.ih().g));
          }else {
             this.n = new d0(this.i, this, this.ih(), this.getArguments().getBoolean("ALBUM_PREVIEW_SINGLE_CHOOSE_THEN_FINISH", b));
             q oq = new q(this.i, this.D, this, this.ih(), this.getArguments().getBoolean(str4));
             this.o = ti;
             this.m.add(this.n);
             this.m.add(this.o);
          }
       }
       super.onViewCreated(p0, p1);
       String str1 = "16";
       if (!PatchProxy.applyVoid(null, this, MediaPreviewFragment.class, str1)) {
          Iterator iterator = this.m.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(this.D);
          }
       }
       this.r = this.mh(this.r, new e(this));
       if (this.getArguments().getBoolean("ALBUM_PREVIEW_TRANSITION_ANIM", false)) {
          this.D.F0().setValue(null);
          this.w = this.mh(this.w, new f(this));
          if (this.ih().p() != null) {
             this.ih().p().setMoveViewListener(new MediaPreviewFragment$c(this));
          }
       }
       if (this.ih().p() != null) {
          PreviewViewPager previewViewP = this.ih().p();
          obj = PatchProxy.apply(null, this, MediaPreviewFragment.class, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             Bundle arguments = this.getArguments();
             if (arguments != null) {
                b = arguments.getBoolean("ALBUM_PREVIEW_ENABLE_SWIPE", b);
             }
          }
          previewViewP.w = b;
          this.ih().p().setShowBackground(this.y);
          this.ih().p().setBackgroundTransListener(this.z);
       }
       if (this.i.x0() != null) {
          String str2 = "album_custom_param_page_name";
          if (this.i.x0().getString(str2) != null) {
             String str3 = this.i.x0().getString(str2);
             if (!PatchProxy.applyVoidOneRefs(str3, null, d.class, str1)) {
                ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                obj = new ClientEvent$ElementPackage();
                obj.action2 = "PAGE_SHOW";
                showEvent.urlPackage = urlPackage;
                showEvent.elementPackage = obj;
                urlPackage.page2 = str3;
                a.c.f().h(showEvent);
             }
          }
       }
       if (this.D.s0().i().b() && this.D.s0().j() != null) {
          this.D.s0().j().c();
       }
       MediaPreviewFragment tx = this.x;
       PreviewViewPager previewViewP1 = this.ih().p();
       Objects.requireNonNull(tx);
       if (!PatchProxy.applyVoidTwoRefs(p0, previewViewP1, tx, b.class, str)) {
          a.q(p0, "fragmentView");
          a.q(previewViewP1, "pager");
          if (tx.B == null) {
             tx.B = p0;
          }
          if (tx.C == null) {
             tx.C = previewViewP1;
          }
          if (tx.A == null && !PatchProxy.applyVoid(null, tx, b.class, "7")) {
             b b1 = tx.B;
             if (b1 != null && b1 instanceof ViewGroup) {
                b b2 = tx.B;
                if (b2 == null) {
                   a.L();
                }
                tx.A = new ImageView(b2.getContext());
                FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                b2 = tx.A;
                if (b2 != null) {
                   b c = tx.C;
                   if (c == null) {
                      a.L();
                   }
                   b2.setMaxHeight(c.getHeight());
                }
                b2 = tx.A;
                if (b2 != null) {
                   b2.setVisibility(4);
                }
                b2 = tx.B;
                if (b2 != null) {
                   b2.addView(tx.A, layoutParams);
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
             }
          }
       }
    label_0270 :
       return;
    }
    public void ph(MediaPreviewFragment$e p0){
       this.B = p0;
    }
    public void qh(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment.class, "28")) {
          return;
       }
       this.A = true;
       if (this.getFragmentManager() != null) {
          this.getFragmentManager().beginTransaction().u(this).o();
       }
       MediaPreviewFragment tB = this.B;
       if (tB != null) {
          tB.a();
       }
       tB = this.u;
       if (tB != null) {
          tB.onClose();
       }
       if (this.getArguments().getBoolean("ALBUM_PREVIEW_TRANSITION_ANIM", false) && this.D.s0().j() != null) {
          this.D.s0().j().a();
       }
       return;
    }
    public void rh(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(MediaPreviewFragment.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, MediaPreviewFragment.class, "9")) {
          return;
       }
       MediaPreviewFragment tx = this.x;
       Objects.requireNonNull(tx);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), tx, b.class, "17")) {
          tx.m = p0;
          tx.n = p1;
          tx.o = p2;
          tx.l = Float.valueOf(p3);
       }
       return;
    }
    public void sh(String p0,boolean p1,b0 p2){
       b z;
       if (PatchProxy.isSupport(MediaPreviewFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, MediaPreviewFragment.class, "10")) {
          return;
       }
       MediaPreviewFragment tx = this.x;
       Objects.requireNonNull(tx);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, tx, b.class, "14")) {
          if (p0 == null) {
             z = tx.z;
             if (z != null) {
                z.e();
             }
          }else {
             tx.s = p0;
             tx.t = p2;
             Boolean uBoolean = Boolean.valueOf(p1);
             try{
                tx.u = uBoolean;
                if (tx.D == null) {
                   b z1 = tx.z;
                   if (z1 != null) {
                      z1.c();
                      if (p1) {
                         if (!PatchProxy.applyVoid(null, tx, b.class, "15")) {
                            b c = tx.C;
                            if (c != null && c.getViewTreeObserver() != null) {
                               c = tx.C;
                               if (c == null) {
                                  a.L();
                               }
                               ViewTreeObserver viewTreeObse = c.getViewTreeObserver();
                               if (viewTreeObse != null) {
                                  viewTreeObse.addOnGlobalLayoutListener(new i(tx));
                               }
                            }else {
                               c = tx.z;
                               if (c != null) {
                                  c.e();
                               }
                            }
                         }
                      }else {
                         tx.a();
                      }
                      tx.r = p0;
                   }
                }
             }catch(java.lang.Exception e9){
                e9.getMessage();
                z = tx.z;
                if (z != null) {
                   z.e();
                }
             }
          }
       }
    }
}
