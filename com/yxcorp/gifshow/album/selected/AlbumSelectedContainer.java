package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import l79.m$c;
import l79.m$b;
import dtd.a;
import j79.d;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$c;
import nsd.u;
import o79.i;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mClockIcon$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mPickLayout$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mPickGroundLayout$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mPickRecyclerView$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mSelectedDuration$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mSelectedDes$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mNextStep$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mCustomTitleArea$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mChoiceLayout$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mChoiceText$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mChoiceTextLabel$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mDivider$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mRightHeightContainerBg$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mRightHeightContainer$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mSingleMultiSelectSwitchLayout$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mSingleMultiSelectSwitcher$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mSingleMultiSelectTextView$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mContainerButton$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mContainerButtonClickView$2;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$d;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import g79.a;
import w69.m0;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$k;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import q79.d;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import r79.a;
import j79.a;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwai.robust.PatchProxy;
import w69.f;
import com.yxcorp.gifshow.album.selected.AlbumMultiSelectedLayoutManager;
import android.app.Application;
import l79.l;
import android.content.res.Resources;
import cw9.c;
import java.util.Set;
import l79.m;
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
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$r;
import w69.k;
import android.view.View;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import android.app.Activity;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import l79.c;
import android.view.View$OnClickListener;
import l79.i;
import java.lang.Runnable;
import l79.j;
import android.content.SharedPreferences$Editor;
import oe6.g;
import ha9.c;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import l79.k;
import androidx.lifecycle.LifecycleOwner;
import l79.e;
import l79.f;
import l79.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.Display;
import com.yxcorp.gifshow.album.preview.b;
import java.util.Locale;
import com.yxcorp.utility.TextUtils;
import l79.d;
import android.content.res.Configuration;
import com.kwai.moved.utility.AlbumEnv;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$a;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$b;
import android.widget.Button;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import l79.b;
import java.util.Objects;
import p79.c;
import android.animation.ObjectAnimator;
import o79.d;
import com.kwai.library.widget.popup.common.f;
import java.lang.Integer;
import android.animation.ValueAnimator;
import p79.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p79.e;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import java.lang.Float;
import j79.c;
import m79.g;
import n79.b;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import ec7.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.List;
import java.util.Collection;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import w69.k0;
import ekd.n1;
import android.text.TextPaint;
import java.lang.Number;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$m;
import r79.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.models.EmptyQMedia;
import io.reactivex.subjects.PublishSubject;
import m79.c;
import ha9.b;
import java.util.Collections;
import ha9.a;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import com.yxcorp.gifshow.album.selected.interact.AlbumSelectListenerDelegate;
import java.lang.Math;
import w69.d;
import w69.e0;
import p79.f;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$n;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$o;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$p;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$q;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.IAlbumMainFragment$e;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import com.yxcorp.gifshow.album.selected.interact.a;
import com.yxcorp.gifshow.album.selected.interact.a$a;
import androidx.fragment.app.c;
import w69.c0;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import j79.l0;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import androidx.viewpager.widget.ViewPager;
import kotlin.TypeCastException;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$l;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import java.lang.Long;
import ic7.a;
import androidx.core.content.ContextCompat;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$e;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$f;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$g;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$h;
import zf6.l;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$i;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$j;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.a;

public final class AlbumSelectedContainer implements m$c, m$b, a, d	// class@001abc
{
    public final AlbumSelectedContainer$d A;
    public boolean B;
    public final Set C;
    public List D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final SharedPreferences K;
    public a$c L;
    public a$c M;
    public boolean N;
    public boolean O;
    public boolean P;
    public c Q;
    public final String R;
    public final Observer S;
    public int T;
    public final AlbumFragment U;
    public final AbsSelectedContainerViewBinder V;
    public HashMap W;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public final p m;
    public final p n;
    public final p o;
    public final p p;
    public final p q;
    public final p r;
    public final p s;
    public final p t;
    public d u;
    public m v;
    public boolean w;
    public g x;
    public AlbumSelectedLayoutManager y;
    public a z;
    public static final int U0;
    public static final AlbumSelectedContainer$c V0;
    public static final int X;
    public static final int Y;
    public static final int Z;

    static {
       int i;
       AlbumSelectedContainer.V0 = new AlbumSelectedContainer$c(null);
       AlbumSelectedContainer.X = i.c(0x7f0704c4);
       i = i.c(R.dimen.arg_RES_7f0704b3);
       AlbumSelectedContainer.Y = i;
       AlbumSelectedContainer.Z = i.c(0x7f070501);
       AlbumSelectedContainer.U0 = i - 6;
    }
    public void AlbumSelectedContainer(AlbumFragment p0,AbsSelectedContainerViewBinder p1){
       boolean i;
       TextView textView;
       AlbumSelectedContainer$k ok1;
       a uoa;
       AlbumSelectedContainer uAlbumSelect1;
       long l;
       LifecycleOwner lifecycleOwn;
       View view;
       AlbumSelectedContainer u;
       int i1;
       long l1;
       String str;
       AlbumSelectedContainer u1;
       g og;
       a uoa1;
       AlbumSelectedContainer z;
       SharedPreferences sharedPrefer2;
       View view1;
       SharedPreferences sharedPrefer3;
       boolean b1;
       AlbumSelectedContainer uAlbumSelect = this;
       m obj = p0;
       FragmentActivity obj1 = p1;
       a.q(obj, "mAlbumFragment");
       a.q(obj1, "mViewBinder");
       super();
       uAlbumSelect.U = obj;
       uAlbumSelect.V = obj1;
       uAlbumSelect.b = s.c(new AlbumSelectedContainer$mClockIcon$2(uAlbumSelect));
       uAlbumSelect.c = s.c(new AlbumSelectedContainer$mPickLayout$2(uAlbumSelect));
       uAlbumSelect.d = s.c(new AlbumSelectedContainer$mPickGroundLayout$2(uAlbumSelect));
       uAlbumSelect.e = s.c(new AlbumSelectedContainer$mPickRecyclerView$2(uAlbumSelect));
       uAlbumSelect.f = s.c(new AlbumSelectedContainer$mSelectedDuration$2(uAlbumSelect));
       uAlbumSelect.g = s.c(new AlbumSelectedContainer$mSelectedDes$2(uAlbumSelect));
       uAlbumSelect.h = s.c(new AlbumSelectedContainer$mNextStep$2(uAlbumSelect));
       uAlbumSelect.i = s.c(new AlbumSelectedContainer$mCustomTitleArea$2(uAlbumSelect));
       uAlbumSelect.j = s.c(new AlbumSelectedContainer$mChoiceLayout$2(uAlbumSelect));
       uAlbumSelect.k = s.c(new AlbumSelectedContainer$mChoiceText$2(uAlbumSelect));
       uAlbumSelect.l = s.c(new AlbumSelectedContainer$mChoiceTextLabel$2(uAlbumSelect));
       uAlbumSelect.m = s.c(new AlbumSelectedContainer$mDivider$2(uAlbumSelect));
       uAlbumSelect.n = s.c(new AlbumSelectedContainer$mRightHeightContainerBg$2(uAlbumSelect));
       uAlbumSelect.o = s.c(new AlbumSelectedContainer$mRightHeightContainer$2(uAlbumSelect));
       uAlbumSelect.p = s.c(new AlbumSelectedContainer$mSingleMultiSelectSwitchLayout$2(uAlbumSelect));
       uAlbumSelect.q = s.c(new AlbumSelectedContainer$mSingleMultiSelectSwitcher$2(uAlbumSelect));
       uAlbumSelect.r = s.c(new AlbumSelectedContainer$mSingleMultiSelectTextView$2(uAlbumSelect));
       uAlbumSelect.s = s.c(new AlbumSelectedContainer$mContainerButton$2(uAlbumSelect));
       uAlbumSelect.t = s.c(new AlbumSelectedContainer$mContainerButtonClickView$2(uAlbumSelect));
       AlbumSelectedContainer$d uod = new AlbumSelectedContainer$d(uAlbumSelect);
       uAlbumSelect.A = uod;
       boolean b = true;
       uAlbumSelect.B = b;
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       uAlbumSelect.C = linkedHashSe;
       uAlbumSelect.D = new ArrayList();
       uAlbumSelect.F = b;
       uAlbumSelect.I = b;
       a c = a.c;
       Context uContext = p0.requireContext();
       a.h(uContext, "mAlbumFragment.requireContext\(\)");
       SharedPreferences sharedPrefer = c.h().b(uContext, "MediaSelectManager", 0);
       uAlbumSelect.K = sharedPrefer;
       uAlbumSelect.R = "PHOTO_PREVIEW";
       AlbumSelectedContainer$k ok = new AlbumSelectedContainer$k(uAlbumSelect);
       uAlbumSelect.S = ok;
       obj1 = p0.getActivity();
       if (obj1 != null) {
          ViewModel viewModel = ViewModelProviders.of(obj1).get(d.class);
          a.h(viewModel, "ViewModelProviders.of\(it¡­setViewModel::class.java\)");
          uAlbumSelect.u = viewModel;
          if (viewModel == null) {
             a.S("mViewModel");
          }
          uAlbumSelect.G = viewModel.s0().i().b();
       }
       if (!p0.Ph()) {
          ImageView imageView = this.v();
          i = 8;
          if (imageView != null) {
             imageView.setVisibility(i);
          }
          textView = this.H();
          if (textView != null) {
             textView.setVisibility(i);
          }
       }
       if (PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "61")) {
          ok1 = ok;
          uoa = c;
          uAlbumSelect1 = 2;
          l = 3000;
       }else {
          u = uAlbumSelect.u;
          if (u == null) {
             a.S("mViewModel");
          }
          SharedPreferences sharedPrefer1 = sharedPrefer;
          long l2 = 300;
          i = 0x7f070501;
          AlbumSelectedContainer$k ok2 = ok;
          l1 = 0;
          if (u.s0().d().b()) {
             uAlbumSelect.y = new AlbumMultiSelectedLayoutManager(c.b(), 0, 0);
             u1 = uAlbumSelect.u;
             if (u1 == null) {
                a.S("mViewModel");
             }
             l ol = v4;
             l ol1 = new l(p0, u1, p0.uh(), c.b(c.b().getResources(), i), linkedHashSe);
             ol.d1(uAlbumSelect);
             if (uAlbumSelect.P != null) {
                ol.b1(uAlbumSelect);
             }
             uAlbumSelect.v = ol;
             og = new g();
             og.X(0);
             og.Y(new e());
             og.z(l2);
             og.x(l1);
             og.K(0);
             i = true;
             og.x = i;
             uAlbumSelect.x = og;
             u1 = uAlbumSelect.v;
             if (u1 == null) {
                a.S("mSelectedAdapter");
             }
             uoa1 = new a(u1, 15, i, i);
             uoa1.C(i, (i.d(60.00f) - 0), i.d(10.00f));
             uoa1.B(i);
             uAlbumSelect.z = uoa1;
             u = uAlbumSelect.u;
             if (u == null) {
                a.S("mViewModel");
             }
             if (u.s0().d().d()) {
                z = uAlbumSelect.z;
                if (z == null) {
                   a.L();
                }
                new m(z).f(this.D());
             }
             sharedPrefer2 = sharedPrefer1;
             ok1 = ok2;
             uoa = c;
          }else {
             uAlbumSelect.y = new AlbumSelectedLayoutManager(c.b(), 0, 0);
             u1 = uAlbumSelect.u;
             if (u1 == null) {
                a.S("mViewModel");
             }
             obj = v5;
             uoa = c;
             sharedPrefer2 = sharedPrefer1;
             ok1 = ok2;
             m om = new m(p0, u1, p0.uh(), c.b(c.b().getResources(), i), linkedHashSe, 0, 32, 0);
             obj.d1(uAlbumSelect);
             if (uAlbumSelect.P != null) {
                obj.b1(uAlbumSelect);
             }
             uAlbumSelect.v = obj;
             og = new g();
             og.X(0);
             og.Y(new e());
             og.z(300);
             og.x(0);
             og.K(0);
             uAlbumSelect.x = og;
             z = uAlbumSelect.v;
             if (z == null) {
                a.S("mSelectedAdapter");
             }
             b1 = true;
             uoa1 = new a(z, 15, b1, 0);
             uoa1.C(b1, (i.d(60.00f) - 0), i.d(10.00f));
             uoa1.B(b1);
             uAlbumSelect.z = uoa1;
             u = uAlbumSelect.u;
             if (u == null) {
                a.S("mViewModel");
             }
             if (u.s0().d().d()) {
                z = uAlbumSelect.z;
                if (z == null) {
                   a.L();
                }
                new m(z).f(this.D());
             }
          }
          AlbumSelectRecyclerView uAlbumSelect2 = this.D();
          uAlbumSelect2.setLayoutManager(uAlbumSelect.y);
          uAlbumSelect2.setItemAnimator(uAlbumSelect.x);
          uAlbumSelect2.addItemDecoration(new b(0, AlbumSelectedContainer.X, AlbumSelectedContainer.X, AlbumSelectedContainer.X));
          z = uAlbumSelect.v;
          if (z == null) {
             a.S("mSelectedAdapter");
          }
          uAlbumSelect2.setAdapter(z);
          uAlbumSelect2.addOnScrollListener(uod);
          i1 = this.Q();
          z = uAlbumSelect.u;
          if (z == null) {
             a.S("mViewModel");
          }
          i = z.s0().m().r();
          if (i1) {
             float f = 80.00f;
             if (i) {
                view1 = this.B();
                if (view1 != null) {
                   view1.setTranslationY((float)i.d(f));
                }
                view1 = this.z();
                if (view1 != null) {
                   view1.setTranslationY((float)i.d(f));
                }
             }else {
                this.C().setTranslationY((float)i.d(f));
             }
          }
          view1 = this.C();
          i1 = (i1)? 0: 4;
          view1.setVisibility(i1);
          str = "canShowKSMultiModeBubble";
          if (!PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "83")) {
             u = uAlbumSelect.u;
             if (u == null) {
                a.S("mViewModel");
             }
             if (u.s0().m().j()) {
                u = uAlbumSelect.u;
                if (u == null) {
                   a.S("mViewModel");
                }
                if (u.s0().e().v()) {
                   sharedPrefer3 = sharedPrefer2;
                   if (sharedPrefer3.getBoolean(str, true)) {
                      u1 = uAlbumSelect.u;
                      if (u1 == null) {
                         a.S("mViewModel");
                      }
                      if (!u1.K0(p0.getActivity())) {
                      label_0393 :
                         l = 3000;
                      label_0412 :
                         if (PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "84") || uAlbumSelect.M == null) {
                            uAlbumSelect1 = 2;
                         }else {
                            u1 = uAlbumSelect.u;
                            if (u1 == null) {
                               a.S("mViewModel");
                            }
                            uAlbumSelect1 = 2;
                            if (u1.s0().m().j() == uAlbumSelect1) {
                               TextView textView1 = this.K();
                               if (textView1 != null) {
                                  textView1.post(new i(uAlbumSelect));
                               }
                            }else {
                               View view2 = this.J();
                               if (view2 != null) {
                                  view2.post(new j(uAlbumSelect));
                               }
                            }
                            g.a(sharedPrefer3.edit().putBoolean(str, 0));
                         }
                      }else {
                         a$c uoc1 = new a$c(p0.requireActivity());
                         uAlbumSelect.M = uoc1;
                         uoc1.F0(i.p(R.string.arg_RES_7f101898));
                         b1 = true;
                         uoc1.A(b1);
                         l = 3000;
                         uoc1.T(l);
                         uoc1.P(b1);
                         uoc1.v0((- i.d(3.00f)));
                         uoc1.K(new c(uAlbumSelect));
                         uoc1.q0(b1);
                         goto label_0412 ;
                      }
                   }else {
                      goto label_0393 ;
                   }
                }
             }
          }
       label_0391 :
          sharedPrefer3 = sharedPrefer2;
          goto label_0393 ;
       }
       if (PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "66")) {
          lifecycleOwn = p0;
       }else {
          u = uAlbumSelect.u;
          if (u == null) {
             a.S("mViewModel");
          }
          u.B().observeForever(ok1);
          lifecycleOwn = p0;
          u.Q().observe(lifecycleOwn, new k(uAlbumSelect));
       }
       if (!PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "23")) {
          u = uAlbumSelect.u;
          if (u == null) {
             a.S("mViewModel");
          }
          u.R0().observe(lifecycleOwn, new e(uAlbumSelect));
          view = this.J();
          l1 = 500;
          if (view != null) {
             view.setOnClickListener(new f(uAlbumSelect, 0, l1));
          }
          textView = this.K();
          if (textView != null) {
             textView.setOnClickListener(new g(uAlbumSelect, 0, l1));
          }
          if (this.N()) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, uAlbumSelect, AlbumSelectedContainer.class, "57")) {
                b obj2 = PatchProxy.apply(objArray, objArray, i.class, "15");
                if (obj2 != patchProxyRe) {
                   i = obj2.booleanValue();
                }else {
                   DisplayMetrics uDisplayMetr = new DisplayMetrics();
                   uoa.b().getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
                   i = ((int)((float)i.l() / uDisplayMetr.density) <= 370)? true: false;
                }
                if (i) {
                   obj2 = b.class;
                   String obj3 = PatchProxy.apply(null, null, obj2, "4");
                   if (obj3 != patchProxyRe) {
                      i1 = obj3.booleanValue();
                   }else {
                      str = PatchProxy.apply(null, null, obj2, "3");
                      obj3 = "en";
                      if (str != patchProxyRe) {
                      }else {
                         String language = b.a.getLanguage();
                         if (!TextUtils.x(language)) {
                            str = "zh";
                            if (!language.startsWith(str)) {
                            }
                         }
                      }
                      i1 = str.equals(obj3);
                   }
                   if (i1) {
                      textView = this.K();
                      if (textView != null) {
                         textView.setMaxWidth(i.d(25.00f));
                      }
                   }
                }
             }
          label_0561 :
             uAlbumSelect.U(0);
             uAlbumSelect.V(0);
             uAlbumSelect.X(true);
          }else {
             uAlbumSelect.X(0);
          }
       }
       if (!PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "24")) {
          u = uAlbumSelect.u;
          if (u == null) {
             a.S("mViewModel");
          }
          k i0 = u.s0().m().i0;
          uAlbumSelect.P = i0;
          if (i0 != null) {
             view = this.x();
             i = true;
             if (view != null) {
                view.setClickable(i);
             }
             view = this.x();
             if (view != null) {
                view.setOnClickListener(new d(uAlbumSelect));
             }
             uAlbumSelect.Z(i);
          }
       }
       if (!PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "25")) {
          Resources resources = uoa.b().getResources();
          a.h(resources, "AlbumSdkInner.appContext.resources");
          i1 = resources.getConfiguration().uiMode & 0x30;
          if (i1) {
             if (i1 != 16) {
                if (i1 == 32) {
                   AlbumEnv.b(uAlbumSelect1);
                }
             }else {
                AlbumEnv.b(1);
             }
          }else {
             AlbumEnv.b(0);
          }
       }
       if (uAlbumSelect.G != null) {
          uAlbumSelect.Q = new AlbumSelectedContainer$a(uAlbumSelect);
          view = this.s();
          if (view != null) {
             view.setOnClickListener(new AlbumSelectedContainer$b(uAlbumSelect));
          }
       }
       u = uAlbumSelect.u;
       if (u == null) {
          a.S("mViewModel");
       }
       if (u.s0().m().m() != -1) {
          Button uButton = this.A();
          if (uButton != null) {
             uAlbumSelect1 = uAlbumSelect.u;
             if (uAlbumSelect1 == null) {
                a.S("mViewModel");
             }
             uButton.setBackgroundResource(uAlbumSelect1.s0().m().m());
          }
       }
       u = uAlbumSelect.u;
       if (u == null) {
          a.S("mViewModel");
       }
       if (u.s0().d().d() && !PatchProxy.applyVoid(null, uAlbumSelect, AlbumSelectedContainer.class, "80")) {
          a$c uoc = new a$c(p0.requireActivity());
          uAlbumSelect.L = uoc;
          uoc.D0(BubbleInterface$Position.TOP);
          uoc.F0(i.p(R.string.arg_RES_7f101b9b));
          uoc.A(0);
          uoc.T(l);
          uoc.P(true);
          uoc.p0(i.d(24.00f));
          uoc.K(new b(uAlbumSelect));
          uoc.q0(true);
       }
       uAlbumSelect.T = -1;
       return;
    }
    public static void b0(AlbumSelectedContainer p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,int p6,Object p7){
       boolean b = (p6 & 0x02)? false: p2;
       boolean b1 = (p6 & 0x04)? true: p3;
       boolean b2 = (p6 & 0x08)? false: p4;
       int i = (p6 & 0x10)? 300: p5;
       p0.a0(p1, b, b1, b2, i);
       return;
    }
    public static void c0(AlbumSelectedContainer p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,Object p6){
       boolean b = (p5 & 0x04)? true: p3;
       boolean b1 = (p5 & 0x08)? false: p4;
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(AlbumSelectedContainer.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(b), Boolean.valueOf(b1), p0, AlbumSelectedContainer.class, "37")) {
          p0.a0(p1, p2, b, b1, 300);
       }
       return;
    }
    public static final m f(AlbumSelectedContainer p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mSelectedAdapter");
       }
       return p0;
    }
    public static void f0(AlbumSelectedContainer p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = -1;
       }
       p0.e0(p1);
       return;
    }
    public static final d g(AlbumSelectedContainer p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mViewModel");
       }
       return p0;
    }
    public static void n(AlbumSelectedContainer p0,boolean p1,boolean p2,boolean p3,int p4,Object p5){
       float f;
       AlbumSelectedContainer uAlbumSelect = p0;
       boolean b = (p4 & 0x01)? true: p1;
       boolean b1 = (p4 & 0x02)? true: p2;
       int i = 4;
       int i1 = 0;
       boolean b2 = (p4 & 0x04)? false: p3;
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(AlbumSelectedContainer.class) || (!PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Boolean.valueOf(b1), Boolean.valueOf(b2), p0, AlbumSelectedContainer.class, "36") && uAlbumSelect.P != null)) {
          View view = p0.w();
          if (view != null) {
             int i2 = 8;
             if (b2) {
                Object tag = view.getTag();
                if (tag instanceof ObjectAnimator) {
                   tag.cancel();
                }
                if (!view.getVisibility()) {
                   view.setVisibility(i2);
                }
                view = p0.x();
                if (view != null && !view.getVisibility()) {
                   view = p0.x();
                   if (view != null) {
                      view.setVisibility(i2);
                   }
                }
             }else if(b && view.getVisibility() == i2){
                d.k(uAlbumSelect.H);
             }
             i2 = c.b(f.j(), R.dimen.arg_RES_7f0704fd);
             int i3 = c.b(f.j(), R.dimen.arg_RES_7f070500);
             int i4 = i2 / 2;
             int i5 = 3;
             if (PatchProxy.isSupport(c.class)) {
                Object[] objArray = new Object[]{view,Boolean.valueOf(b),Integer.valueOf(300),Integer.valueOf(i2),Integer.valueOf(i3)};
                if (PatchProxy.applyVoid(objArray, null, c.class, "22")) {
                label_011c :
                   f = 0x3f800000;
                   c.l(view, b, 300, f, new LinearInterpolator());
                   c.l(p0.x(), b, 300, f, new LinearInterpolator());
                   if (b1) {
                      float f1 = (float)i4;
                      view.setPivotX(f1);
                      view.setPivotY(f1);
                      float f2 = 0;
                      if (PatchProxy.isSupport(c.class)) {
                         Object[] objArray1 = new Object[]{view,Boolean.valueOf(b),Integer.valueOf(300),Float.valueOf(f2),Float.valueOf(f)};
                         if (!PatchProxy.applyVoid(objArray1, null, c.class, "19")) {
                         }
                      }else if(b){
                         f = 0;
                         f2 = 0x3f800000;
                      }
                      c.m(view, f, f2, 300);
                   }else {
                      view.setScaleX(f);
                      view.setScaleY(f);
                   }
                   View view1 = view.findViewById(R.id.im_button);
                   if (view1 != null) {
                      c.n(view1, b, 300, (- (float)i.d(60.00f)));
                   }
                   view = view.findViewById(R.id.tv_button);
                   if (view != null) {
                      c.n(view, b, 300, (- (float)i.d(60.00f)));
                   }
                }
             }
             if (!b) {
                i3 = i2;
                i2 = i3;
             }
             int i6 = 0x7f0a4475;
             int[] tag1 = view.getTag(i6);
             if (tag1 instanceof ValueAnimator) {
                tag1.cancel();
             }
             tag1 = new int[]{i2,i3};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(tag1).setDuration((long)300);
             valueAnimato.setInterpolator(new e());
             valueAnimato.addUpdateListener(new a(view));
             valueAnimato.addListener(new e(view, i2, i3));
             view.setTag(i6, valueAnimato);
             valueAnimato.start();
             goto label_011c ;
          }
       }
    label_01a1 :
       return;
    }
    public final Button A(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final View B(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final View C(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final AlbumSelectRecyclerView D(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final View E(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final View F(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final TextView G(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final TextView H(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final View I(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final View J(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final TextView K(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public final c L(){
       return this.Q;
    }
    public final g M(int p0){
       b obj;
       RecyclerView recyclerView;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAlbumSelect, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.G != null) {
          obj = new b();
          AlbumAssetFragment uAlbumAssetF = this.r();
          if (uAlbumAssetF != null) {
             AbsAlbumAssetFragmentViewBinder uAbsAlbumAss = uAlbumAssetF.qh();
             if (uAbsAlbumAss != null) {
                recyclerView = uAbsAlbumAss.q();
             label_0036 :
                return obj.f(recyclerView, p0, null, true);
             }
          }
          recyclerView = null;
          goto label_0036 ;
       }else {
          return new b().f(this.D(), p0, null, true);
       }
    }
    public final boolean N(){
       AlbumSelectedContainer obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mViewModel");
       }
       boolean b = (obj.s0().m().j())? true: false;
       return b;
    }
    public final boolean O(){
       AlbumSelectedContainer obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mViewModel");
       }
       boolean b = true;
       if (obj.s0().m().r()) {
          obj = this.u;
          if (obj == null) {
             a.S("mViewModel");
          }
          if (obj.s0().m().j() != b) {
          label_0043 :
             return b;
          }
       }
       b = false;
       goto label_0043 ;
    }
    public final boolean P(){
       AlbumSelectedContainer obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mSelectedAdapter");
       }
       boolean itemCount = obj.getItemCount();
       AlbumSelectedContainer tu = this.u;
       if (tu == null) {
          a.S("mViewModel");
       }
       int i = tu.s0().e().p();
       Log.b("MediaSelectManager", "minSelectedCount="+i+", selectedMediaList.size="+itemCount);
       itemCount = (itemCount >= i)? true: false;
       return itemCount;
    }
    public final boolean Q(){
       boolean b;
       AlbumSelectedContainer obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       String str = "mViewModel";
       if (obj == null) {
          a.S(str);
       }
       if (obj.s0().m().w()) {
          obj = this.u;
          if (obj == null) {
             a.S(str);
          }
          if (obj.s0().e().v()) {
             obj = this.u;
             if (obj == null) {
                a.S(str);
             }
             if (obj.s0().m().j() == 2) {
             label_0058 :
                b = false;
             label_0059 :
                return b;
             }
          }
          b = true;
          goto label_0059 ;
       }else {
          goto label_0058 ;
       }
    }
    public final void R(){
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAlbumSelect, "26")) {
          return;
       }
       AlbumSelectedContainer tu = this.u;
       if (tu == null) {
          a.S("mViewModel");
       }
       Boolean value = tu.R0().getValue();
       if (value == null) {
          value = Boolean.FALSE;
       }
       a.h(value, "mViewModel.isSingleSelect.value ?: false");
       boolean b = value.booleanValue();
       AlbumSelectedContainer tu1 = this.u;
       if (tu1 == null) {
          a.S("mViewModel");
       }
       tu1.R0().setValue(Boolean.valueOf((b ^ 0x01)));
       if (!b) {
          tu1 = this.u;
          if (tu1 == null) {
             a.S("mViewModel");
          }
          List list = tu1.m();
          if (list != null) {
             this.D.clear();
             this.D.addAll(list);
          }
          tu1 = this.u;
          if (tu1 == null) {
             a.S("mViewModel");
          }
          tu1.z();
          if (!PatchProxy.applyVoid(objArray, this, uAlbumSelect, "29")) {
             RecyclerView$LayoutManager layoutManage = this.D().getLayoutManager();
             if (layoutManage instanceof LinearLayoutManager) {
                objArray = layoutManage;
             }
             if (objArray != null) {
                RecyclerView$ViewHolder viewHolder = this.D().findViewHolderForLayoutPosition(objArray.c());
                if (viewHolder != null) {
                   viewHolder = viewHolder.itemView;
                   a.h(viewHolder, "lastHolder.itemView");
                   float f = (float)(viewHolder.getHeight() >> 1);
                   float f1 = (float)(viewHolder.getWidth() >> 1);
                   tu1 = this.x;
                   if (tu1 != null) {
                      tu1.Z(f1, f);
                   }
                }
             }
          }
       label_00a9 :
          this.m();
       }else if(this.D.isEmpty() ^ 0x01){
          uAlbumSelect = this.u;
          if (uAlbumSelect == null) {
             a.S("mViewModel");
          }
          uAlbumSelect.g0(this.D);
       }
       uAlbumSelect = this.u;
       if (uAlbumSelect == null) {
          a.S("mViewModel");
       }
       k0 ok0 = uAlbumSelect.s0().f();
       if (ok0 != null) {
          ok0.m((b ^ 0x01));
       }
       return;
    }
    public final void S(){
       Button uButton;
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "62")) {
          return;
       }
       int i = 0x7f0704ef;
       if (this.H != null) {
          uButton = this.A();
          if (uButton != null) {
             uButton.setAlpha(0x3f800000);
          }
          uButton = this.A();
          if (uButton != null) {
             uButton.setMinWidth(i.c(i));
          }
       }else if(!this.P()){
          uButton = this.A();
          if (uButton != null) {
             uButton.setAlpha(0x3f000000);
          }
          uButton = this.A();
          if (uButton != null) {
             uButton.setMinWidth(i.c(R.dimen.arg_RES_7f0704ec));
          }
       }else {
          uButton = this.A();
          if (uButton != null) {
             uButton.setAlpha(0x3f800000);
          }
          uButton = this.A();
          if (uButton != null) {
             uButton.setMinWidth(i.c(i));
          }
       }
       return;
    }
    public final void T(){
       boolean b1;
       Button uButton1;
       AlbumSelectedContainer tv;
       AlbumSelectedContainer obj1;
       int i;
       StringBuilder str4;
       AlbumFragment a;
       k j;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumSelectedContainer.class, "64")) {
          return;
       }
       n1.c(this.A(), i.c(R.dimen.arg_RES_7f070502));
       Button uButton = this.A();
       boolean b = true;
       if (uButton != null) {
          TextPaint paint = uButton.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(b);
          }
       }
       uButton = this.A();
       if (uButton != null) {
          uButton.setClickable(b);
       }
       AlbumSelectedContainer tU = this.U;
       Objects.requireNonNull(tU);
       Object obj = PatchProxy.apply(objArray, tU, AlbumFragment.class, "65");
       String str = "mAlbumUIOptions";
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          a = tU.A;
          if (a == null) {
             a.S(str);
          }
          j = a.w;
       }
       if (b1 == null) {
          uButton1 = this.A();
          if (uButton1 != null) {
             uButton1.setText(this.U.Ah());
          }
       }else {
          tU = this.U;
          Objects.requireNonNull(tU);
          obj = PatchProxy.apply(objArray, tU, AlbumFragment.class, "66");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             a = tU.A;
             if (a == null) {
                a.S(str);
             }
             j = a.J;
          }
          str = "\(";
          String str1 = "mSelectedAdapter";
          if (b1 != null) {
             uButton = this.A();
             if (uButton != null) {
                StringBuilder str2 = this.U.Ah()+str;
                tv = this.v;
                if (tv == null) {
                   a.S(str1);
                }
                str2 = str2+tv.Z0()+"/";
                tv = this.U;
                Objects.requireNonNull(tv);
                obj1 = PatchProxy.apply(objArray, tv, AlbumFragment.class, "67");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                   AlbumFragment b2 = tv.B;
                   if (b2 == null) {
                      a.S("mAlbumLimitOptions");
                   }
                   i = b2.d();
                }
                uButton.setText(str2+i+"\)");
             }
          }else {
             uButton1 = this.A();
             if (uButton1 != null) {
                StringBuilder str3 = this.U.Ah();
                obj1 = this.v;
                if (obj1 == null) {
                   a.S(str1);
                }
                if (!obj1.Z0()) {
                   str4 = "";
                }else {
                   str4 = str;
                   tv = this.v;
                   if (tv == null) {
                      a.S(str1);
                   }
                   str4 = str4+tv.Z0()+"\)";
                }
                uButton1.setText(str3+str4);
             }
          }
       }
    label_0136 :
       if (this.D().f == null) {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          uButton = this.A();
          objectRef.element = uButton;
          if (uButton != null) {
             uButton = this.A();
             if (uButton != null && !uButton.getVisibility()) {
             label_015f :
                uButton = this.A();
                if (uButton != null) {
                   uButton.post(new AlbumSelectedContainer$m(this, objectRef));
                }
             }
          }
          objectRef.element = this.y();
          goto label_015f ;
       }
       return;
    }
    public void Tb(int p0,c p1){
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAlbumSelect, "48")) {
          return;
       }
       if (this.U.getActivity() != null) {
          uAlbumSelect = this.u;
          if (uAlbumSelect == null) {
             a.S("mViewModel");
          }
          if (uAlbumSelect.s0().d().b()) {
             List list = uAlbumSelect.m();
             if (list != null) {
                Iterator iterator = list.iterator();
                int i = 0;
                int i1 = 0;
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   int i2 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (!obj instanceof EmptyQMedia) {
                      int i3 = 1;
                      if (i == p0 && (p1 != null && p1.objectEquals(obj) == i3)) {
                         uAlbumSelect.D0().onNext(this.M(p0));
                      }else {
                         int i4 = i1 + p0;
                         if (i == i4 && (p1 != null && p1.objectEquals(obj) == i3)) {
                            uAlbumSelect.D0().onNext(this.M(i));
                         }
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                   i = i2;
                }
             }
          }else {
             uAlbumSelect.D0().onNext(this.M(p0));
          }
       }
       return;
    }
    public final void U(boolean p0){
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAlbumSelect, "59")) {
          return;
       }
       if (this.H != null) {
          this.I = p0;
       }else {
          this.I = p0;
          TextView textView = this.G();
          if (textView != null) {
             int i = (p0)? 0: 8;
             textView.setVisibility(i);
          }
          TextView textView1 = this.G();
          if (textView1 != null) {
             textView1.setAlpha(0x3f800000);
          }
       }
       return;
    }
    public final void V(boolean p0){
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAlbumSelect, "60")) {
          return;
       }
       if (this.H != null) {
          this.J = p0;
       }else {
          this.J = p0;
          ImageView imageView = this.v();
          int i = 0;
          if (imageView != null) {
             int i1 = (p0)? 0: 8;
             imageView.setVisibility(i1);
          }
          TextView textView = this.H();
          if (textView != null) {
             if (!p0) {
                i = 8;
             }
             textView.setVisibility(i);
          }
          ImageView imageView1 = this.v();
          if (imageView1 != null) {
             imageView1.setAlpha(0x3f800000);
          }
          TextView textView1 = this.H();
          if (textView1 != null) {
             textView1.setAlpha(0x3f800000);
          }
       }
       return;
    }
    public final void W(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer.class, "50")) {
          return;
       }
       a.q(p0, "list");
       Log.b("MediaSelectManager", "setSelectedList\(\) called with: list = ["+p0+']');
       AlbumSelectedContainer tv = this.v;
       String str = "mSelectedAdapter";
       if (tv == null) {
          a.S(str);
       }
       tv.S0(p0);
       AlbumSelectedContainer tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       tv1.k0();
       tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       tv = this.u;
       if (tv == null) {
          a.S("mViewModel");
       }
       boolean b = (tv.J() && this.U.Xh())? true: false;
       tv1.m = b;
       tv1 = this.u;
       if (tv1 == null) {
          a.S("mViewModel");
       }
       this.B = tv1.r();
       return;
    }
    public final void X(boolean p0){
       int i1;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAlbumSelect, "56")) {
          return;
       }
       this.O = p0;
       TextView textView = this.K();
       int i = 0;
       if (textView != null) {
          i1 = (p0)? 0: 8;
          textView.setVisibility(i1);
       }
       View view = this.I();
       if (view != null) {
          i1 = (p0)? 0: 8;
          view.setVisibility(i1);
       }
       view = this.I();
       if (view != null) {
          view.setAlpha(0x3f800000);
       }
       view = this.J();
       if (view != null) {
          if (!p0) {
             i = 8;
          }
          view.setVisibility(i);
       }
       View view1 = this.J();
       if (view1 != null) {
          view1.setAlpha(0x3f800000);
       }
       return;
    }
    public final void Y(int p0){
       this.T = p0;
    }
    public final void Z(boolean p0){
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAlbumSelect, "44")) {
          return;
       }
       if (this.j()) {
          if (p0) {
             View view = this.w();
             if (view != null && view.getVisibility() == 8) {
                d.k(this.H);
             }else {
                return;
             }
          }
          c.k(this.w(), p0, 300, 0x3f800000);
          c.k(this.x(), p0, 300, 0x3f800000);
       }
       return;
    }
    public void a(int p0,int p1){
       String str;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAlbumSelect, "49")) {
          return;
       }
       uAlbumSelect = this.u;
       if (uAlbumSelect == null) {
          a.S("mViewModel");
       }
       Objects.requireNonNull(uAlbumSelect);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uAlbumSelect, uod, "69")) {
          d g = uAlbumSelect.G;
          Objects.requireNonNull(g);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), g, uoc, "12")) {
             str = "AlbumSelectControllerImpl";
             Log.b(str, "swapSelectItem\(\) called with: from = ["+p0+"], to = ["+p1+']');
             if (p0 < 0 || p1 >= g.B().u()) {
                Log.d(str, "swapSelectItem: wrong args");
             }else {
                uoc = g.B();
                Objects.requireNonNull(uoc);
                c uoc1 = c.class;
                if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uoc, uoc1, "9")) {
                   b value = uoc.getValue();
                   if (value != null) {
                      b uob = b.class;
                      if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), value, uob, "6")) {
                         Collections.swap(value.g, p0, p1);
                         value.d(p0);
                         value.f = p1;
                         value.e(UpdateType.SWAP);
                      }
                   }
                   uoc.v();
                }
                g.e.a(p0, p1);
             }
          }
       }
       for (int i = Math.min(p0, p1); i <= Math.max(p0, p1); i = i + 1) {
          AlbumSelectedContainer tv = this.v;
          str = "mSelectedAdapter";
          if (tv == null) {
             a.S(str);
          }
          if (i < tv.O0().size()) {
             tv = this.U;
             AlbumSelectedContainer tv1 = this.v;
             if (tv1 == null) {
                a.S(str);
             }
             tv.Sh(tv1.L0(i));
          }else {
             break ;
          }
       }
       return;
    }
    public final void a0(boolean p0,boolean p1,boolean p2,boolean p3,int p4){
       boolean i5;
       int i6;
       int i7;
       int b5;
       int i8;
       View view;
       Object obj = this;
       boolean b = p0;
       boolean b1 = p2;
       boolean b2 = p3;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       int i = 4;
       int i1 = 5;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(uAlbumSelect)) {
          Object[] objArray = new Object[i1];
          objArray[i3] = Boolean.valueOf(p0);
          objArray[i2] = Boolean.valueOf(p1);
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, uAlbumSelect, "38")) {
             return;
          }
       }
       uAlbumSelect = obj.u;
       if (uAlbumSelect == null) {
          a.S("mViewModel");
       }
       if (!uAlbumSelect.s0().m().t()) {
          AlbumFragment.Uh(obj.U, false, 0, 0, false, false, 30, null);
          uAlbumSelect = obj.u;
          if (uAlbumSelect == null) {
             a.S("mViewModel");
          }
          if (uAlbumSelect.s0().c().a() != null) {
             obj.U.t3(i2);
          }
          return;
       }else if(!b && this.C().getVisibility()){
          return;
       }else {
          int b3 = this.Q();
          AlbumSelectedContainer u = obj.u;
          if (u == null) {
             a.S("mViewModel");
          }
          boolean b4 = u.s0().d().b();
          int i4 = 0x7f0704f2;
          b3 = (b3)? i.d(80.00f): i.c(i4);
          AlbumSelectedContainer v = obj.v;
          String str = "mSelectedAdapter";
          if (v == null) {
             a.S(str);
          }
          if (!v.Z0() && !b4) {
             if (b) {
             label_00db :
                i5 = b3;
             }else {
                i5 = (int)this.C().getTranslationY();
             }
          }else if(b){
             goto label_00db ;
          }else {
             i5 = null;
          }
          if (b) {
             v = obj.v;
             if (v == null) {
                a.S(str);
             }
             if (v.Z0() || (b4 && obj.F != null)) {
                c uoc = null;
             label_00ff :
                if (b || (b1 || b2)) {
                   uAlbumSelect = obj.U;
                   if (b) {
                      u = obj.v;
                      if (u == null) {
                         a.S(str);
                      }
                      if (u.getItemCount()) {
                         b4 = true;
                      label_0119 :
                         i6 = uoc;
                         i7 = i5;
                         AlbumFragment.Uh(uAlbumSelect, b4, 0, 0, 0, p3, 14, 0);
                      }
                   }
                   b4 = false;
                   goto label_0119 ;
                }else {
                   i6 = uoc;
                   i7 = i5;
                   i1 = 0;
                   int i9 = 1;
                }
                float f = 0x3f800000;
                if (p1) {
                   uAlbumSelect = obj.u;
                   if (uAlbumSelect == null) {
                      a.S("mViewModel");
                   }
                   if (uAlbumSelect.s0().m().r()) {
                      if (obj.H == null) {
                         c.g(this.z(), i7, i6, p0, p4, null);
                         i = i6;
                      }else {
                         view = this.z();
                         i = i6;
                         if (view != null) {
                            view.setTranslationY((float)i);
                         }
                      }
                      if (b) {
                         this.D().setAlpha(f);
                         this.D().setVisibility(0);
                      }
                      c.f(this.B(), this.B(), i7, i, 0x3f666666, p0, p4, null);
                      if (obj.P != null) {
                         i5 = false;
                         b4 = i7;
                         i4 = i;
                         b5 = p0;
                         i8 = p4;
                         c.h(this.w(), b4, i4, b5, i8, i5, null);
                         c.h(this.x(), b4, i4, b5, i8, i5, null);
                      }
                      c.g(this.D(), i7, i, p0, p4, new AlbumSelectedContainer$n(obj, b, b1, b2));
                   }else {
                      i2 = i6;
                      this.Z(p0);
                      view = this.C();
                      View view1 = this.B();
                      float f1 = 0x3f666666;
                      AlbumSelectedContainer$o oo = new AlbumSelectedContainer$o(obj, b, b1, b2);
                      uoc = c.class;
                      if (PatchProxy.isSupport(uoc)) {
                         Object[] objArray1 = new Object[]{view,view1,Integer.valueOf(i7),Integer.valueOf(i2),Float.valueOf(f1),Boolean.valueOf(p0),oo};
                         if (!PatchProxy.applyVoid(objArray1, null, uoc, "10")) {
                         }
                      }else {
                      }
                   }
                }else {
                   i2 = i6;
                   uAlbumSelect = obj.u;
                   if (uAlbumSelect == null) {
                      a.S("mViewModel");
                   }
                   if (uAlbumSelect.s0().m().r()) {
                      if (obj.H == null) {
                         c.g(this.z(), i7, i2, p0, p4, null);
                      }else {
                         view = this.z();
                         if (view != null) {
                            view.setTranslationY((float)i2);
                         }
                      }
                      if (b) {
                         this.D().setAlpha(f);
                         this.D().setVisibility(0);
                      }
                      c.g(this.B(), i7, i2, p0, p4, null);
                      if (obj.P != null) {
                         i5 = false;
                         b4 = i7;
                         i4 = i2;
                         b5 = p0;
                         i8 = p4;
                         c.h(this.w(), b4, i4, b5, i8, i5, null);
                         c.h(this.x(), b4, i4, b5, i8, i5, null);
                      }
                      c.g(this.D(), i7, i2, p0, p4, new AlbumSelectedContainer$p(obj, b, b1, b2));
                   }else {
                      this.Z(p0);
                      c.i(this.C(), i7, i2, b, new AlbumSelectedContainer$q(obj, b, b1, b2));
                   }
                }
                return;
             }
          }
       label_00f5 :
          if (obj.F == null) {
             b3 = i.c(i4);
          }
          b5 = b3;
          goto label_00ff ;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "41")) {
          return;
       }
       AlbumSelectedContainer.n(this, false, false, true, 3, null);
       return;
    }
    public void c(int p0){
       g og;
       List list;
       c uoc;
       DataType dataType;
       List list1;
       IAlbumMainFragment$e uoe;
       AlbumSelectedContainer u;
       int i1;
       g og1;
       Object obj = this;
       int i = p0;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uAlbumSelect, "40")) {
          return;
       }
       String str = "MediaSelectManager";
       Log.g(str, "onSelectedItemPreviewClicked "+i);
       if (!PatchProxy.isSupport(uAlbumSelect) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.TRUE, obj, uAlbumSelect, "45")) {
          boolean b = true;
          Log.g(str, "onSelectedItemPreviewClickedImpl "+i+", enableSwipe="+b);
          uAlbumSelect = -1;
          if (i != uAlbumSelect) {
             String str1 = "bottom";
             QMedia qMedia = null;
             String str2 = "mViewModel";
             boolean b1 = false;
             if (obj.G == null) {
                if (obj.U.getActivity() != null) {
                   uAlbumSelect = obj.u;
                   if (uAlbumSelect == null) {
                      a.S(str2);
                   }
                   this.D().scrollToPosition(i);
                   og = this.M(p0);
                   og.f(b);
                   list = uAlbumSelect.m();
                   if (list != null) {
                      uoc = list.get(i);
                      if (uoc != null) {
                         dataType = uoc.getDataType();
                      label_00a2 :
                         if (dataType != DataType.VIDEO) {
                            b = 0;
                         }
                         d.f(b, i, str1);
                         if (uAlbumSelect.s0().m().k()) {
                            list1 = uAlbumSelect.m();
                            if (list1 != null) {
                               qMedia = list1.get(i);
                            }
                            if (qMedia instanceof QMedia) {
                               uoe = obj.U.xh();
                               if (uoe != null) {
                                  uoe.a(uAlbumSelect.W0(i), qMedia, i, b1);
                               }
                            }
                         }else {
                            a$a.b(uAlbumSelect, obj.U.b(), p0, uAlbumSelect.m(), obj.T, og, this, null, 64, null);
                         }
                      }
                   }
                   dataType = qMedia;
                   goto label_00a2 ;
                }
             }else if(obj.H != null){
                Fragment uFragment = obj.U.getChildFragmentManager().findFragmentById(R.id.preview_frame);
                if (uFragment != null) {
                   u = obj.u;
                   if (u == null) {
                      a.S(str2);
                   }
                   i1 = u.W0(i);
                   MediaPreviewFragment mediaPreview = uFragment.n3();
                   if (mediaPreview != null) {
                      AlbumSelectedContainer v = obj.v;
                      if (v == null) {
                         a.S("mSelectedAdapter");
                      }
                      c uoc1 = v.L0(i);
                      if (!PatchProxy.isSupport(MediaPreviewFragment.class) || !PatchProxy.applyVoidTwoRefs(uoc1, Boolean.FALSE, mediaPreview, MediaPreviewFragment.class, "13")) {
                         List list2 = mediaPreview.i.A0().t();
                         int i2 = 0;
                         while (true) {
                            if (i2 < list2.size()) {
                               if (list2.get(i2).getMedia().objectEquals(uoc1)) {
                               label_0167 :
                                  if (i2 == uAlbumSelect) {
                                     if (uoc1 != null) {
                                        s.a(R.string.arg_RES_7f1018af);
                                     }else {
                                        s.a(R.string.arg_RES_7f10188d);
                                     }
                                  }else {
                                     mediaPreview.ih().p().setCurrentItem(i2, b1);
                                  }
                               }else {
                                  i2 = i2 + 1;
                               }
                            }else {
                               i2 = -1;
                               goto label_0167 ;
                            }
                         }
                      }
                   }
                   uAlbumSelect = obj.u;
                   if (uAlbumSelect == null) {
                      a.S(str2);
                   }
                   PublishSubject publishSubje = uAlbumSelect.D0();
                   AlbumAssetFragment uAlbumAssetF = this.r();
                   if (uAlbumAssetF != null) {
                      b1 = uAlbumAssetF.oh();
                   }
                   publishSubje.onNext(obj.M((i1 + b1)));
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.IAlbumPreviewFragmentHost");
                }
             }else if(obj.U.getActivity() != null){
                uAlbumSelect = obj.u;
                if (uAlbumSelect == null) {
                   a.S(str2);
                }
                this.D().scrollToPosition(i);
                u = obj.u;
                if (u == null) {
                   a.S(str2);
                }
                i1 = u.W0(i);
                AlbumAssetFragment uAlbumAssetF1 = this.r();
                int i3 = (uAlbumAssetF1 != null)? uAlbumAssetF1.oh(): 0;
                i3 = i3 + i1;
                if (i1 >= 0) {
                   og1 = obj.M(i3);
                }else {
                   g og2 = new g(0, 0, 0, 0, null, false, 63, null);
                }
                og = og1;
                og.f(b);
                list = uAlbumSelect.m();
                if (list != null) {
                   uoc = list.get(i);
                   if (uoc != null) {
                      dataType = uoc.getDataType();
                   label_020a :
                      if (dataType != DataType.VIDEO) {
                         b = 0;
                      }
                      d.f(b, i, str1);
                      if (uAlbumSelect.s0().m().k()) {
                         list1 = uAlbumSelect.m();
                         if (list1 != null) {
                            qMedia = list1.get(i);
                         }
                         if (qMedia instanceof QMedia) {
                            uoe = obj.U.xh();
                            if (uoe != null) {
                               uoe.a(uAlbumSelect.W0(i), qMedia, i, b1);
                            }
                         }
                      }else {
                         uAlbumSelect.f0(obj.U.b(), p0, uAlbumSelect.m(), obj.T, og, 0, obj.Q);
                      }
                   }
                }
                QMedia qMedia1 = qMedia;
                goto label_020a ;
             }
          }
       }
       return;
    }
    public void d(int p0){
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAlbumSelect, "39")) {
          return;
       }
       Log.g("MediaSelectManager", "deleteItemListener "+p0);
       if (p0 == -1) {
          return;
       }
       uAlbumSelect = this.u;
       if (uAlbumSelect == null) {
          a.S("mViewModel");
       }
       uAlbumSelect.y(p0);
       return;
    }
    public final void d0(){
       TextView textView;
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "76")) {
          return;
       }
       if (this.G == null) {
          return;
       }
       AlbumSelectedContainer tu = this.u;
       String str = "mViewModel";
       if (tu == null) {
          a.S(str);
       }
       if (tu.s0().m().o()) {
          textView = this.u();
          if (textView != null) {
             textView.setTextSize(14.00f);
          }
       }
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       c uoc = tu.w0();
       if (uoc != null) {
          AlbumSelectedContainer tu1 = this.u;
          if (tu1 == null) {
             a.S(str);
          }
          int i = tu1.d0(uoc);
          if (i != -1) {
             TextView textView1 = this.t();
             if (textView1 != null) {
                textView1.setText(String.valueOf((i + 1)));
             }
             textView = this.t();
             if (textView != null) {
                textView.setVisibility(0);
             }
             textView = this.u();
             if (textView != null) {
                textView.setVisibility(0);
             }
          }else {
             textView = this.t();
             if (textView != null) {
                textView.setVisibility(4);
             }
          }
       }
    label_007b :
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "42")) {
          return;
       }
       if (this.j()) {
          this.D().postDelayed(new AlbumSelectedContainer$l(this), 100);
       }
       return;
    }
    public final void e0(int p0){
       boolean b2;
       AlbumSelectedContainer v;
       TextView textView;
       boolean i;
       boolean b3;
       boolean b4;
       boolean b5;
       long uAlbumSelect1;
       Iterator iterator;
       IAlbumMainFragment$b uob;
       String str3;
       ImageView uAlbumSelect1;
       String b2;
       boolean b = this;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), b, uAlbumSelect, "54")) {
          return;
       }
       AlbumSelectedContainer u = b.u;
       String str = "mViewModel";
       if (u == null) {
          a.S(str);
       }
       if (!u.s0().m().t()) {
          return;
       }else {
          String str1 = "mSelectedAdapter";
          if (!PatchProxy.applyVoid(null, b, uAlbumSelect, "31")) {
             uAlbumSelect = b.u;
             if (uAlbumSelect == null) {
                a.S(str);
             }
             b2 = (uAlbumSelect.J() && b.U.Xh())? true: false;
             v = b.v;
             if (v == null) {
                a.S(str1);
             }
             if (v.m != b2) {
                v = b.v;
                if (v == null) {
                   a.S(str1);
                }
                v.m = b2;
                uAlbumSelect = b.v;
                if (uAlbumSelect == null) {
                   a.S(str1);
                }
                v = b.v;
                if (v == null) {
                   a.S(str1);
                }
                uAlbumSelect.q0(false, v.Z0(), Boolean.FALSE);
             }
          }
          this.k();
          String str2 = a.c.b().getString(R.string.arg_RES_7f1018ce);
          a.h(str2, "AlbumSdkInner.appContext¡­_select_image_video\n    \)");
          View view = this.C();
          if (!PatchProxy.applyVoidOneRefs(view, null, c.class, "15") && view != null) {
             ObjectAnimator tag = view.getTag(R.id.ksa_selected_list_layout);
             if (tag != null) {
                tag.cancel();
             }
          }
          boolean b1 = this.Q();
          uAlbumSelect = b.u;
          if (uAlbumSelect == null) {
             a.S(str);
          }
          b2 = uAlbumSelect.s0().d().b();
          if (b1) {
             i.d(80.00f);
          }else {
             this.C().getHeight();
          }
          v = b.v;
          if (v == null) {
             a.S(str1);
          }
          if (v.P0() && !b2) {
             this.S();
             this.T();
             AlbumSelectedContainer.c0(this, false, false, false, false, 12, null);
             b.V(false);
             b.E = false;
             if (!TextUtils.x(b.U.Eh())) {
                textView = this.G();
                if (textView != null) {
                   textView.setText(b.U.Eh());
                }
             }else {
                textView = this.G();
                if (textView != null) {
                   textView.setText(str2);
                }
             }
             b.U(b.U.Oh());
             if (b.H != null) {
                uAlbumSelect = b.u;
                if (uAlbumSelect == null) {
                   a.S(str);
                }
                if (uAlbumSelect.s0().m().r()) {
                   this.C().setVisibility(false);
                }
             }
             view = this.C();
             i = (b1)? 0: 4;
             view.setVisibility(i);
          }else {
             this.S();
             this.T();
             this.C().setVisibility(false);
             AlbumAssetFragment uAlbumAssetF = this.r();
             if (uAlbumAssetF != null) {
                AbsAlbumAssetFragmentViewBinder uAbsAlbumAss = uAlbumAssetF.qh();
                if (uAbsAlbumAss != null) {
                   RecyclerView recyclerView = uAbsAlbumAss.q();
                   if (recyclerView != null) {
                      b2 = recyclerView.canScrollVertically(1);
                   label_0184 :
                      if (b.N != null) {
                         if (b.U.Bh() != null) {
                            b.N = false;
                            MediaPreviewFragment mediaPreview = b.U.Bh();
                            if (mediaPreview != null) {
                               l0 ol0 = mediaPreview.gh();
                               if (ol0 != null) {
                                  ol0.P0(false);
                               }
                            }
                            i = true;
                            b3 = true;
                            b4 = false;
                            if (!b2) {
                               uAlbumSelect = b.u;
                               if (uAlbumSelect == null) {
                                  a.S(str);
                               }
                               if (uAlbumSelect.s0().m().r()) {
                                  b5 = true;
                               label_01c0 :
                                  AlbumSelectedContainer.c0(this, i, b3, b4, b5, 4, null);
                               }
                            }
                            b5 = false;
                            goto label_01c0 ;
                         }
                      }else if(b.E == null){
                         b.E = true;
                         i = true;
                         b3 = false;
                         b4 = false;
                         if (!b2) {
                            uAlbumSelect = b.u;
                            if (uAlbumSelect == null) {
                               a.S(str);
                            }
                            if (uAlbumSelect.s0().m().r()) {
                               b5 = true;
                            label_01eb :
                               AlbumSelectedContainer.c0(this, i, b3, b4, b5, 4, null);
                            }
                         }
                         b5 = false;
                         goto label_01eb ;
                      }else {
                         AlbumFragment.Uh(b.U, true, 0, p0, false, false, 18, null);
                      }
                      if (!TextUtils.x(b.U.Eh())) {
                         textView = this.G();
                         if (textView != null) {
                            textView.setText(b.U.Eh());
                         }
                         b.U(1);
                         b.V(false);
                      }else {
                         uAlbumSelect = b.u;
                         if (uAlbumSelect == null) {
                            a.S(str);
                         }
                         if (!uAlbumSelect.J()) {
                            if (b.U.Oh()) {
                               textView = this.G();
                               if (textView != null) {
                                  textView.setText(str2);
                               }
                               b.U(1);
                            }else {
                               b.U(false);
                            }
                            b.V(false);
                            uAlbumSelect = b.u;
                            if (uAlbumSelect == null) {
                               a.S(str);
                            }
                            uAlbumSelect1 = uAlbumSelect.u();
                            iterator = b.U.rh().l().iterator();
                            while (iterator.hasNext()) {
                               uob = iterator.next();
                               if (uob != null) {
                                  uob.a(Long.valueOf(uAlbumSelect1));
                               }
                            }
                         }else {
                            uAlbumSelect = b.u;
                            if (uAlbumSelect == null) {
                               a.S(str);
                            }
                            uAlbumSelect1 = uAlbumSelect.u();
                            if (b.U.Ph()) {
                               b.V(1);
                            }
                            TextView textView1 = this.H();
                            if (textView1 != null) {
                               textView1.setText(a.d.a(uAlbumSelect1));
                            }
                            iterator = b.U.rh().l().iterator();
                            while (iterator.hasNext()) {
                               uob = iterator.next();
                               if (uob != null) {
                                  uob.a(Long.valueOf(uAlbumSelect1));
                               }
                            }
                            v = b.u;
                            if (v == null) {
                               a.S(str);
                            }
                            long l = Long.MAX_VALUE;
                            if (v.s0().e().j() - l < 0) {
                               v = b.u;
                               if (v == null) {
                                  a.S(str);
                               }
                               l = v.s0().e().j();
                               str3 = i.q(R.string.arg_RES_7f1018a2, String.valueOf((l / (long)0xea60)));
                               a.h(str3, "CommonUtil.string\(\n     ¡­  maxTimeText\n          \)");
                            }else if(b.U.Dh() > 0 && !TextUtils.x(b.U.Ch())){
                               str3 = b.U.Ch();
                               l = b.U.Dh();
                            }else {
                               str3 = "";
                            }
                            TextView textView2 = this.H();
                            if (textView2 != null) {
                               Context context = this.C().getContext();
                               int i1 = (uAlbumSelect1 - l > 0)? 0x7f060b20: 0x7f060b3a;
                               textView2.setTextColor(ContextCompat.getColor(context, i1));
                            }
                            if (uAlbumSelect1 - l > 0 && !TextUtils.x(str3)) {
                               uAlbumSelect1 = this.v();
                               if (uAlbumSelect1 != null) {
                                  uAlbumSelect1.setSelected(1);
                               }
                               textView = this.G();
                               if (textView != null) {
                                  textView.setText(str3);
                               }
                               b.U(1);
                            }else if(b.U.Oh()){
                               uAlbumSelect = b.U;
                               Objects.requireNonNull(uAlbumSelect);
                               TextView obj = PatchProxy.apply(null, uAlbumSelect, AlbumFragment.class, "63");
                               if (obj != PatchProxyResult.class) {
                                  b2 = obj.booleanValue();
                               }else {
                                  AlbumFragment k uAlbumSelect2 = uAlbumSelect.A;
                                  if (uAlbumSelect2 == null) {
                                     a.S("mAlbumUIOptions");
                                  }
                                  uAlbumSelect2 = uAlbumSelect2.t;
                               }
                               if (b2 == null) {
                                  b2 = a.c.b().getResources().getString(R.string.arg_RES_7f1018ce);
                                  a.h(b2, "AlbumSdkInner.appContext¡­album_select_image_video\)");
                                  obj = this.G();
                                  if (obj != null) {
                                     obj.setText(b2);
                                  }
                                  b.U(1);
                               label_03c5 :
                                  uAlbumSelect1 = this.v();
                                  if (uAlbumSelect1 != null) {
                                     uAlbumSelect1.setSelected(false);
                                  }
                               }
                            }
                            b.U(false);
                            goto label_03c5 ;
                         }
                      }
                   }
                }
             }
             b2 = false;
             goto label_0184 ;
          }
          if (this.N()) {
             b.U(false);
             b.V(false);
          }
          return;
       }
    }
    public final void h(boolean p0){
       TextView textView;
       ImageView imageView;
       View view;
       Button uButton;
       int[] ointArray;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAlbumSelect, "70")) {
          return;
       }
       if (this.G == null) {
          return;
       }
       this.k();
       this.H = p0;
       AnimatorSet uAnimatorSet = new AnimatorSet();
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       boolean b = true;
       int i1 = 2;
       Property property = (AlbumEnv.a() == i1)? 1: null;
       int i2 = (property)? 0x7f060b2a: 0x7f060b38;
       this.Z(b);
       int i3 = 0x7f060b23;
       int i4 = 0x7f0704ef;
       int i5 = 0x7f0704ec;
       String str = "minWidth";
       if (p0) {
          if (!property && this.P != null) {
             this.o(b, i1);
          }
          if (this.I != null && this.G() != null) {
             uArrayList.add(ObjectAnimator.ofFloat(this.G(), View.ALPHA, new float[i1]{0x3f800000,0}));
             textView = this.G();
             if (textView != null) {
                textView.setTag(uAnimatorSet);
             }
          }
          if (this.J != null && (this.v() != null && this.H() != null)) {
             uArrayList.add(ObjectAnimator.ofFloat(this.v(), View.ALPHA, new float[i1]{0x3f800000,0}));
             uArrayList.add(ObjectAnimator.ofFloat(this.H(), View.ALPHA, new float[i1]{0x3f800000,0}));
             imageView = this.v();
             if (imageView != null) {
                imageView.setTag(uAnimatorSet);
             }
             textView = this.H();
             if (textView != null) {
                textView.setTag(uAnimatorSet);
             }
          }
       label_00c4 :
          view = this.s();
          if (view != null) {
             view.setTag(uAnimatorSet);
          }
          uButton = this.A();
          if (uButton != null) {
             uButton.setTag(uAnimatorSet);
          }
          view = this.B();
          if (view != null) {
             view.setTag(uAnimatorSet);
          }
          ointArray = new int[i1];
          ointArray[i] = i.c(i5);
          ointArray[b] = i.c(i4);
          objectAnimat = ObjectAnimator.ofInt(this.A(), str, ointArray);
          objectAnimat1 = ObjectAnimator.ofFloat(this.A(), View.ALPHA, new float[i1]{0x3f000000,0x3f800000});
          if (this.s() != null) {
             uArrayList.add(ObjectAnimator.ofFloat(this.s(), View.ALPHA, new float[i1]{0,0x3f800000}));
          }
          int[] ointArray1 = new int[i1];
          ointArray1[i] = i.a(i2);
          ointArray1[b] = i.a(i3);
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofInt(this.B(), "backgroundColor", ointArray1);
          a.h(objectAnimat2, "ObjectAnimator.ofInt\(\n  ¡­ound_black_alpha\)\n      \)");
          objectAnimat2.setEvaluator(new ArgbEvaluator());
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(this.B(), View.ALPHA, new float[i1]{0x3f800000,0x3f666666});
          if (!this.P()) {
             Button uButton1 = this.A();
             if (uButton1 != null && !uButton1.getVisibility()) {
                uArrayList.add(objectAnimat);
                uArrayList.add(objectAnimat1);
             }
          }
          uArrayList.add(objectAnimat2);
          uArrayList.add(objectAnimat3);
          uAnimatorSet.addListener(new AlbumSelectedContainer$e(this));
       }else if(property == null && this.P != null){
          this.o(i1, b);
       }
       if (this.s() != null) {
          uArrayList.add(ObjectAnimator.ofFloat(this.s(), View.ALPHA, new float[i1]{0x3f800000,0}));
       }
       if (this.I != null && this.G() != null) {
          uArrayList.add(ObjectAnimator.ofFloat(this.G(), View.ALPHA, new float[i1]{0,0x3f800000}));
          textView = this.H();
          if (textView != null) {
             textView.setTag(uAnimatorSet);
          }
       }
       if (this.J != null && (this.v() != null && this.H() != null)) {
          uArrayList.add(ObjectAnimator.ofFloat(this.v(), View.ALPHA, new float[i1]{0,0x3f800000}));
          uArrayList.add(ObjectAnimator.ofFloat(this.H(), View.ALPHA, new float[i1]{0,0x3f800000}));
          imageView = this.v();
          if (imageView != null) {
             imageView.setTag(uAnimatorSet);
          }
       }
       view = this.s();
       if (view != null) {
          view.setTag(uAnimatorSet);
       }
       uButton = this.A();
       if (uButton != null) {
          uButton.setTag(uAnimatorSet);
       }
       view = this.B();
       if (view != null) {
          view.setTag(uAnimatorSet);
       }
       ointArray = new int[i1];
       ointArray[i] = i.c(i4);
       ointArray[b] = i.c(i5);
       objectAnimat = ObjectAnimator.ofInt(this.A(), str, ointArray);
       objectAnimat1 = ObjectAnimator.ofFloat(this.A(), View.ALPHA, new float[i1]{0x3f800000,0x3f000000});
       if (!this.P()) {
          Button uButton2 = this.A();
          if (uButton2 != null && !uButton2.getVisibility()) {
             uArrayList.add(objectAnimat);
             uArrayList.add(objectAnimat1);
          }
       }
       view = this.B();
       if (view != null && !view.getAlpha()) {
          view = this.B();
          if (view != null) {
             view.setAlpha(0x3f800000);
          }
          view = this.B();
          if (view != null) {
             view.setVisibility(i);
          }
          view = this.B();
          if (view != null) {
             view.setBackgroundColor(i.a(i2));
          }
       }else {
          ointArray = new int[i1];
          ointArray[i] = i.a(i3);
          ointArray[b] = i.a(i2);
          objectAnimat = ObjectAnimator.ofInt(this.B(), "backgroundColor", ointArray);
          a.h(objectAnimat, "ObjectAnimator.ofInt\(\n  ¡­\(selectBGColor\)\n        \)");
          objectAnimat.setEvaluator(new ArgbEvaluator());
          uArrayList.add(objectAnimat);
          uArrayList.add(ObjectAnimator.ofFloat(this.B(), View.ALPHA, new float[i1]{0x3f666666,0x3f800000}));
       }
       uAnimatorSet.addListener(new AlbumSelectedContainer$f(this));
       uAnimatorSet.setDuration(300);
       uAnimatorSet.setInterpolator(new e());
       uAnimatorSet.playTogether(uArrayList);
       uAnimatorSet.start();
       return;
    }
    public final void i(boolean p0,boolean p1){
       TextView textView;
       ImageView imageView;
       View view;
       Button uButton;
       int[] ointArray;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       boolean b = this;
       int b1 = p0;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), b, uAlbumSelect, "71")) {
          return;
       }
       if (b.G == null) {
          return;
       }
       this.k();
       b.H = b1;
       AnimatorSet uAnimatorSet = new AnimatorSet();
       ArrayList uArrayList = new ArrayList();
       boolean b2 = true;
       int i = 0;
       int i1 = 2;
       Property property = (AlbumEnv.a() == i1)? 1: null;
       int i2 = (property)? 0x7f060b2a: 0x7f060b38;
       b.Z(b2);
       int i3 = 0x7f060b23;
       int i4 = 0x7f0704ef;
       int i5 = 0x7f0704ec;
       if (b1) {
          if (!property && b.P != null) {
             b.o(b2, i1);
          }
          if (b.I != null && this.G() != null) {
             uArrayList.add(ObjectAnimator.ofFloat(this.G(), View.ALPHA, new float[i1]{0x3f800000,0}));
             textView = this.G();
             if (textView != null) {
                textView.setTag(uAnimatorSet);
             }
          }
          if (b.J != null && (this.v() != null && this.H() != null)) {
             uArrayList.add(ObjectAnimator.ofFloat(this.v(), View.ALPHA, new float[i1]{0x3f800000,0}));
             uArrayList.add(ObjectAnimator.ofFloat(this.H(), View.ALPHA, new float[i1]{0x3f800000,0}));
             imageView = this.v();
             if (imageView != null) {
                imageView.setTag(uAnimatorSet);
             }
             textView = this.H();
             if (textView != null) {
                textView.setTag(uAnimatorSet);
             }
          }
       label_00cc :
          view = this.s();
          if (view != null) {
             view.setTag(uAnimatorSet);
          }
          uButton = this.A();
          if (uButton != null) {
             uButton.setTag(uAnimatorSet);
          }
          view = this.B();
          if (view != null) {
             view.setTag(uAnimatorSet);
          }
          ointArray = new int[i1];
          ointArray[i] = i.c(i5);
          ointArray[b2] = i.c(i4);
          objectAnimat = ObjectAnimator.ofInt(this.A(), "minWidth", ointArray);
          if (this.s() != null) {
             uArrayList.add(ObjectAnimator.ofFloat(this.s(), View.ALPHA, new float[i1]{0,0x3f800000}));
          }
          int[] ointArray1 = new int[i1];
          ointArray1[i] = i.a(i2);
          ointArray1[b2] = i.a(i3);
          objectAnimat1 = ObjectAnimator.ofInt(this.B(), "backgroundColor", ointArray1);
          a.h(objectAnimat1, "ObjectAnimator.ofInt\(\n  ¡­ound_black_alpha\)\n      \)");
          objectAnimat1.setEvaluator(new ArgbEvaluator());
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.B(), View.ALPHA, new float[i1]{0x3f800000,0x3f666666});
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(this.A(), View.ALPHA, new float[i1]{0x3f000000,0x3f800000});
          if (!this.P()) {
             Button uButton1 = this.A();
             if (uButton1 != null && !uButton1.getVisibility()) {
                uArrayList.add(objectAnimat);
                uArrayList.add(objectAnimat3);
             }
          }
          uArrayList.add(objectAnimat1);
          uArrayList.add(objectAnimat2);
          uAnimatorSet.addListener(new AlbumSelectedContainer$g(b));
       }else if(property == null && b.P != null){
          b.o(i1, b2);
       }
       if (this.s() != null) {
          uArrayList.add(ObjectAnimator.ofFloat(this.s(), View.ALPHA, new float[i1]{0x3f800000,0}));
       }
       if (b.I != null && this.G() != null) {
          uArrayList.add(ObjectAnimator.ofFloat(this.G(), View.ALPHA, new float[i1]{0,0x3f800000}));
          textView = this.H();
          if (textView != null) {
             textView.setTag(uAnimatorSet);
          }
       }
       if (b.J != null && (this.v() != null && this.H() != null)) {
          uArrayList.add(ObjectAnimator.ofFloat(this.v(), View.ALPHA, new float[i1]{0,0x3f800000}));
          uArrayList.add(ObjectAnimator.ofFloat(this.H(), View.ALPHA, new float[i1]{0,0x3f800000}));
          imageView = this.v();
          if (imageView != null) {
             imageView.setTag(uAnimatorSet);
          }
       }
       view = this.s();
       if (view != null) {
          view.setTag(uAnimatorSet);
       }
       uButton = this.A();
       if (uButton != null) {
          uButton.setTag(uAnimatorSet);
       }
       view = this.B();
       if (view != null) {
          view.setTag(uAnimatorSet);
       }
       b1 = this.Q();
       AlbumSelectedContainer u = b.u;
       String str = "mViewModel";
       if (u == null) {
          a.S(str);
       }
       int b3 = u.s0().d().b();
       float[] uofloatArray = 0x7f0704f2;
       b1 = (b1)? i.d(80.00f): i.c(uofloatArray);
       AlbumSelectedContainer v = b.v;
       if (v == null) {
          a.S("mSelectedAdapter");
       }
       if (v.Z0() || (b3 && b.F != null)) {
          b3 = 0;
       }else if(b.F != null){
          b3 = b1;
       }else {
          b3 = i.c(uofloatArray);
       }
       float f = (float)b3;
       if (this.C().getTranslationY() - f && p1) {
          v = b.u;
          if (v == null) {
             a.S(str);
          }
          if (!v.s0().m().r()) {
             uofloatArray = new float[i1];
             uofloatArray[i] = (float)b1;
             uofloatArray[b2] = f;
             uArrayList.add(ObjectAnimator.ofFloat(this.C(), View.TRANSLATION_Y, uofloatArray));
             view = this.B();
             if (view != null) {
                view.setVisibility(i);
             }
             view = this.B();
             if (view != null) {
                view.setAlpha(0x3f666666);
             }
             view = this.B();
             if (view != null) {
                view.setBackgroundColor(i.a(i2));
             }
          }
       }
    label_02c0 :
       view = this.B();
       if (view != null && !view.getAlpha()) {
          view = this.B();
          if (view != null) {
             view.setAlpha(0x3f800000);
          }
          view = this.B();
          if (view != null) {
             view.setVisibility(i);
          }
          view = this.B();
          if (view != null) {
             view.setBackgroundColor(i.a(i2));
          }
       }else {
          ointArray = new int[i1];
          ointArray[i] = i.a(i3);
          ointArray[b2] = i.a(i2);
          objectAnimat = ObjectAnimator.ofInt(this.B(), "backgroundColor", ointArray);
          a.h(objectAnimat, "ObjectAnimator.ofInt\(\n  ¡­electBGColor\)\n          \)");
          objectAnimat.setEvaluator(new ArgbEvaluator());
          uArrayList.add(objectAnimat);
          uArrayList.add(ObjectAnimator.ofFloat(this.B(), View.ALPHA, new float[i1]{0x3f666666,0x3f800000}));
       }
       ointArray = new int[i1];
       ointArray[i] = i.c(i4);
       ointArray[b2] = i.c(0x7f0704ec);
       objectAnimat = ObjectAnimator.ofInt(this.A(), "minWidth", ointArray);
       objectAnimat1 = ObjectAnimator.ofFloat(this.A(), View.ALPHA, new float[i1]{0x3f800000,0x3f000000});
       if (!this.P()) {
          Button uButton2 = this.A();
          if (uButton2 != null && !uButton2.getVisibility()) {
             uArrayList.add(objectAnimat);
             uArrayList.add(objectAnimat1);
          }
       }
       uAnimatorSet.addListener(new AlbumSelectedContainer$h(b));
       uAnimatorSet.setDuration(300);
       uAnimatorSet.setInterpolator(new e());
       uAnimatorSet.playTogether(uArrayList);
       uAnimatorSet.start();
       return;
    }
    public final boolean j(){
       AlbumSelectedContainer obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.P != null) {
          obj = this.v;
          String str = "mSelectedAdapter";
          if (obj == null) {
             a.S(str);
          }
          if (obj.O0().size() == b) {
             obj = this.U;
             AlbumSelectedContainer tv = this.v;
             if (tv == null) {
                a.S(str);
             }
             Object obj1 = tv.O0().get(0);
             a.h(obj1, "mSelectedAdapter.list[0]");
             if (obj.Yh(obj1)) {
             label_004d :
                return b;
             }
          }
       }
    label_004c :
       b = false;
       goto label_004d ;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U.getView();
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "68")) {
          return;
       }
       this.l(this.G());
       this.l(this.v());
       this.l(this.s());
       this.l(this.A());
       this.l(this.B());
       return;
    }
    public final void l(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer.class, "74")) {
          return;
       }
       AnimatorSet uAnimatorSet = null;
       AnimatorSet tag = (p0 != null)? p0.getTag(): uAnimatorSet;
       if (tag instanceof AnimatorSet) {
          AnimatorSet tag1 = (p0 != null)? p0.getTag(): uAnimatorSet;
          if (tag1 instanceof AnimatorSet) {
             uAnimatorSet = tag1;
          }
          if (uAnimatorSet != null) {
             uAnimatorSet.cancel();
          }
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "51")) {
          return;
       }
       Log.g("MediaSelectManager", "clear");
       AlbumSelectedContainer tv = this.v;
       if (tv == null) {
          a.S("mSelectedAdapter");
       }
       tv.K0();
       return;
    }
    public final void o(int p0,int p1){
       int color;
       AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
       if (PatchProxy.isSupport(uAlbumSelect) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAlbumSelect, "69")) {
          return;
       }
       a c = a.c;
       p0 = ContextCompat.getColor(l.h(c.b(), p0), R.color.arg_RES_7f060b65);
       color = ContextCompat.getColor(l.h(c.b(), p1), R.color.arg_RES_7f060b65);
       View view = this.w();
       if (view != null) {
          ImageView imageView = view.findViewById(R.id.im_button);
          TextView textView = view.findViewById(R.id.tv_button);
          if (imageView != null) {
             imageView.setImageDrawable(ContextCompat.getDrawable(l.h(c.b(), p1), R.drawable.arg_RES_7f080fd1));
          }
          if (textView != null) {
             textView.setTextColor(ContextCompat.getColor(l.h(c.b(), p1), R.color.arg_RES_7f060b52));
          }
          int[] ointArray = new int[]{p0,color};
          ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
          a.h(valueAnimato, "ObjectAnimator.ofInt\(fromColor, toColor\)");
          valueAnimato.setEvaluator(new ArgbEvaluator());
          valueAnimato.addUpdateListener(new AlbumSelectedContainer$i(f.j().getDrawable(R.drawable.arg_RES_7f080f86), view.findViewById(R.id.button_background_layout)));
          valueAnimato.setDuration(150);
          if (view.getTag(0x7f0a4429) instanceof ValueAnimator) {
             Object tag = view.getTag(R.id.view_color);
             if (!tag instanceof ValueAnimator) {
                tag = null;
             }
             if (tag != null) {
                tag.cancel();
             }
          }
          view.setTag(R.id.view_color, valueAnimato);
          valueAnimato.start();
       }
       return;
    }
    public final void p(c p0,List p1,int p2,boolean p3){
       if (PatchProxy.isSupport(AlbumSelectedContainer.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, AlbumSelectedContainer.class, "35")) {
          return;
       }
       if (this.P == null) {
          return;
       }
       int i = 1;
       if (p3) {
          if (p1.size() == i && this.U.Yh(p0)) {
             AlbumSelectedContainer.n(this, false, false, false, 7, null);
          }else if(p1.size() > i){
             AlbumSelectedContainer.n(this, false, false, true, 3, null);
          }
       }else if(!p1.size() && this.U.Yh(p0)){
          AlbumSelectedContainer.n(this, false, false, false, 6, null);
       }else if(p1.size() == i && this.U.Yh(p1.get(0))){
          if (!p2) {
             this.D().postDelayed(new AlbumSelectedContainer$j(this), 100);
          }else {
             AlbumSelectedContainer.n(this, true, false, false, 4, null);
          }
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer.class, "82")) {
          return;
       }
       AlbumSelectedContainer tL = this.L;
       if (tL != null) {
          a uoa = tL.h0();
          if (uoa != null && uoa.K() == true) {
             tL = this.L;
             if (tL != null) {
                uoa = tL.h0();
                if (uoa != null) {
                   uoa.o();
                }
             }
          }
       }
       return;
    }
    public final AlbumAssetFragment r(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, AlbumSelectedContainer.class, "46");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.U.ch().get(0);
       if (obj == null) {
          return objArray;
       }
       Fragment uFragment = PatchProxy.apply(objArray, obj, AlbumHomeFragment.class, "19");
       if (uFragment != patchProxyRe) {
       }else {
          ViewPager viewPager = obj.uh().k();
          if (viewPager != null) {
             objArray = viewPager.getAdapter();
          }
          if (objArray != null) {
             uFragment = objArray.a(obj.z);
             a.h(uFragment, "\(getViewBinder\(\).myViewP¡­rrentSelectPosition\n    \)");
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.kwai.library.widget.viewpager.tabstrip.FragmentAdapter");
          }
       }
       if (uFragment != null) {
          return uFragment;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumAssetFragment");
       }
    }
    public final View s(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final TextView t(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final TextView u(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final ImageView v(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final View w(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final View x(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public final FrameLayout y(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final View z(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
}
