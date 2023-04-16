package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$g;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import android.graphics.Bitmap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import jg9.t0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import j8c.a;
import q87.c;
import oc9.d0;
import jg9.f;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import jg9.v;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import jg9.l0;
import android.view.View$OnClickListener;
import jg9.s0;
import p79.h;
import th0.e;
import android.animation.TimeInterpolator;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.y;
import android.graphics.drawable.Drawable;
import jg9.e0;
import qrd.l1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import sm6.b;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import java.lang.StringBuilder;
import android.animation.Animator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o79.i;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.view.animation.LinearInterpolator;
import android.animation.AnimatorSet$Builder;
import jg9.h;
import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;
import jg9.i;
import jg9.j;
import jg9.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qrd.p;
import com.kwai.kve.SmartCoverTaskBuilder;
import crd.b;
import jg9.w;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import jg9.x;
import jg9.y;
import oa0.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$insertNewPhoto$2;
import msd.l;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPictureAnimatorHelper$startScaleAnimator$1;

public final class MultiTakePictureController$g implements g	// class@000ed2
{
    public final MultiTakePictureController b;
    public final Bitmap c;
    public final String d;
    public final int e;

    public void MultiTakePictureController$g(MultiTakePictureController p0,Bitmap p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       String str1;
       Object obj2;
       MultiTakePictureController$g og;
       t0 ot01;
       boolean i2;
       String str2;
       MultiTakePictureController x1;
       MultiTakePictureController u1;
       RecyclerView$LayoutManager layoutManage;
       Context obj3;
       Object[] objArray3;
       boolean i5;
       float f;
       f n;
       float[] uofloatArray1;
       ObjectAnimator objectAnimat1;
       View view1;
       ObjectAnimator objectAnimat3;
       ObjectAnimator objectAnimat4;
       MultiTakePictureController obj = this;
       MultiTakePictureController obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MultiTakePictureController$g.class, "1")) {
       }else {
          MultiTakePictureController$g b = obj.b;
          MultiTakePictureController$g c = obj.c;
          a.o(obj1, "it");
          MultiTakePictureController$g d = obj.d;
          a.o(d, "picturePath");
          MultiTakePictureController$g e = obj.e;
          Objects.requireNonNull(b);
          t0 ot0 = t0.class;
          if (!PatchProxy.isSupport(MultiTakePictureController.class) || !PatchProxy.applyVoidFourRefs(c, obj1, d, Integer.valueOf(e), b, MultiTakePictureController.class, "20")) {
             String u = MultiTakePictureController.U;
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w(u, "insertNewPhoto", objArray);
             if (b.c1() && !b.f2()) {
                f uof = f.class;
                String str = "2";
                if (PatchProxy.applyVoid(null, b, MultiTakePictureController.class, "21") || b.v != null) {
                   str1 = str;
                   obj2 = obj1;
                   og = d;
                }else {
                   Object[] objArray2 = new Object[i];
                   a.D().w(u, "showMultiTakePicturePanel", objArray2);
                   b.v = true;
                   if (b.t == null) {
                      x1 = b.y;
                      String str3 = "multiTakePictureStubInflater";
                      if (x1 == null) {
                         a.S(str3);
                      }
                      b.t = x1.b(0x7f0a2c4c);
                      MultiTakePictureController y = b.y;
                      if (y == null) {
                         a.S(str3);
                      }
                      b.u = y.b(0x7f0a2c4d);
                      y = b.J;
                      x1 = b.t;
                      a.m(x1);
                      Objects.requireNonNull(y);
                      str2 = 0x7f0a2dbe;
                      if (!PatchProxy.applyVoidOneRefs(x1, y, uof, str)) {
                         a.p(x1, "multiTakePicturePanel");
                         y.e = x1;
                         y.f = x1.findViewById(str2);
                         y.n = x1.findViewById(0x7f0a2c4b);
                      }
                      x1 = b.u;
                      a.m(x1);
                      d d1 = b.d;
                      String str4 = "mCallerContext";
                      a.o(d1, str4);
                      BaseFragment uBaseFragmen = d1.f();
                      str2 = "mCallerContext.fragment";
                      a.o(uBaseFragmen, str2);
                      obj2 = obj1;
                      obj1 = b.u;
                      a.m(obj1);
                      str1 = str;
                      d d2 = b.d;
                      a.o(d2, str4);
                      og = d;
                      d d3 = b.d;
                      a.o(d3, str4);
                      BaseFragment uBaseFragmen1 = d3.f();
                      a.o(uBaseFragmen1, str2);
                      b.x = new t0(x1, uBaseFragmen, new MultiPicturePreviewHelper(obj1, d2, b, uBaseFragmen1));
                      obj = b.t;
                      a.m(obj);
                      b.A = obj.findViewById(0x7f0a2dbf);
                      obj = b.t;
                      View view = (obj != null)? obj.findViewById(R.id.next_btn_layout): null;
                      b.B = view;
                      if (view != null) {
                         view.setAlpha(0x3f800000);
                      }
                      obj = b.u;
                      a.m(obj);
                      y = b.x;
                      a.m(y);
                      obj.setAdapter(y);
                      obj = b.x;
                      a.m(obj);
                      obj.N0(b);
                      obj = b.u;
                      a.m(obj);
                      d d4 = b.d;
                      a.o(d4, str4);
                      BaseFragment uBaseFragmen2 = d4.f();
                      a.o(uBaseFragmen2, str2);
                      obj.setLayoutManager(new LinearLayoutManager(uBaseFragmen2.getContext(), 0, 0));
                      obj = b.u;
                      a.m(obj);
                      d4 = b.d;
                      a.o(d4, str4);
                      uBaseFragmen2 = d4.f();
                      a.o(uBaseFragmen2, str2);
                      d2 = b.d;
                      a.o(d2, str4);
                      BaseFragment uBaseFragmen3 = d2.f();
                      a.o(uBaseFragmen3, str2);
                      d1 = b.d;
                      a.o(d1, str4);
                      BaseFragment uBaseFragmen4 = d1.f();
                      a.o(uBaseFragmen4, str2);
                      obj3 = uBaseFragmen4.getContext();
                      obj.addItemDecoration(new b(0, n.c(uBaseFragmen2.getContext(), 17.00f), n.c(uBaseFragmen3.getContext(), 14.00f), n.c(obj3, 9.00f)));
                      obj = b.x;
                      a.m(obj);
                      obj = b.t;
                      if (obj != null) {
                         view = obj.findViewById(R.id.next_btn_layout);
                         if (view != null) {
                            view.setOnClickListener(new l0(b));
                         }
                      }
                      s0 os0 = new s0();
                      os0.X(0);
                      os0.Y(new e());
                      os0.z(300);
                      os0.x(0);
                      os0.K(0);
                      y = b.u;
                      a.m(y);
                      y.setItemAnimator(os0);
                      obj = b.t;
                      if (obj != null && (!PatchProxy.applyVoidOneRefs(obj, b, MultiTakePictureController.class, "44") && !PatchProxy.applyVoidOneRefs(obj, b, MultiTakePictureController.class, "45"))) {
                         TextView textView = obj.findViewById(R.id.multi_take_mode_recommend_btn_tv);
                         Drawable background = textView.getBackground();
                         a.o(background, "background");
                         background.setAlpha(77);
                         textView.setOnClickListener(new e0(b));
                         b.M = textView;
                      }
                   label_0240 :
                      objArray3 = null;
                   }else {
                      str1 = str;
                      obj2 = obj1;
                      og = d;
                      obj = b.x;
                      if (obj != null) {
                         Object[] objArray4 = null;
                         if (!PatchProxy.applyVoid(objArray4, obj, ot0, "9")) {
                            obj.f.clear();
                            obj.i.clear();
                            obj.h = objArray4;
                            obj.e.clear();
                         }
                      }
                      obj = b.x;
                      if (obj != null) {
                         obj.k0();
                      }
                      obj = b.x;
                      a.m(obj);
                      obj.N0(b);
                      objArray3 = null;
                      if (!PatchProxy.applyVoid(objArray3, b, MultiTakePictureController.class, "46") && !PatchProxy.applyVoid(objArray3, b, MultiTakePictureController.class, "47")) {
                         obj = b.M;
                         if (obj != null) {
                            obj.setVisibility(8);
                         }
                      }
                   }
                label_0292 :
                   obj = b.J;
                   ObjectAnimator obj4 = PatchProxy.apply(objArray3, b, MultiTakePictureController.class, "39");
                   if (obj4 != PatchProxyResult.class) {
                      i2 = obj4.booleanValue();
                   }else if(CameraLogger.d(b.d)){
                      i2 = true;
                   }else {
                      i2 = false;
                   }
                   Objects.requireNonNull(obj);
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i2), obj, uof, "4")) {
                      if (obj.m != null) {
                         uof = obj.j;
                         if (uof != null) {
                            g.y(uof.findViewById(R.id.record_btn), uof);
                         }
                      }
                      obj.a = 0;
                      if (b.t(obj.j)) {
                         i5 = b.e(obj.j);
                      }else {
                         uof = obj.j;
                         a.m(uof);
                         i5 = b.g(uof);
                      }
                      if (i5 < 0) {
                         i5 = 0;
                      }
                      MultiTakePictureController$b v = MultiTakePictureController.V;
                      if (i5 >= v.b()) {
                         i = i5 - v.b();
                      }else if((i5 * 2) >= v.b()){
                         i = v.b() - i5;
                         obj.a = i;
                         i = (i + i5) - v.b();
                      }else {
                         f = (float)i5;
                      label_031f :
                         objArray2 = new Object[0];
                         a.D().w("MultiPictureAnimatorHelper", "deltaHeight: "+i5+" cameraViewOffsetY: "+obj.a+" "+"multiTakePicturePanelOffsetY: "+f, objArray2);
                         uof = obj.e;
                         if (uof != null) {
                            uof.setTranslationY(((float)-1 * f));
                         }
                         uof = obj.d;
                         if (uof != null && uof.isRunning()) {
                            uof.cancel();
                         }
                         uof = obj.g;
                         ViewGroup$LayoutParams layoutParams = (uof != null)? uof.getLayoutParams(): null;
                         if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                            layoutParams = null;
                         }
                         ViewGroup$MarginLayoutParams bottomMargin = (layoutParams != null)? layoutParams.bottomMargin: 0;
                         obj.b = (((f + (float)v.b()) + (float)i.c(0x7f070f4e)) + (float)i.d(12.00f)) - (float)bottomMargin;
                         AnimatorSet uAnimatorSet = new AnimatorSet();
                         n = obj.n;
                         a.m(n);
                         boolean i6 = 2;
                         float[] uofloatArray = new float[i6];
                         uofloatArray[0] = obj.b;
                         uofloatArray[1] = 0;
                         obj4 = ObjectAnimator.ofFloat(n, View.TRANSLATION_Y, uofloatArray).setDuration(250);
                         a.o(obj4, "ObjectAnimator.ofFloat\(\n¡­      \).setDuration\(250L\)");
                         obj4.setInterpolator(a.b(0.25f, 0.10f, 0.25f, 0x3f800000));
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(n, View.ALPHA, new float[i6]{0,0x3f800000}).setDuration(250);
                         a.o(objectAnimat, "ObjectAnimator.ofFloat\(\n¡­      \).setDuration\(250L\)");
                         objectAnimat.setInterpolator(new LinearInterpolator());
                         AnimatorSet$Builder uBuilder = uAnimatorSet.play(obj4).with(objectAnimat);
                         f h1 = obj.h;
                         float f1 = 0x3f19999a;
                         float f2 = 0.32f;
                         if (h1 != null && obj.a(h1, (int)obj.b)) {
                            h1.setTranslationY(obj.b);
                            h1.requestLayout();
                            uofloatArray1 = new float[]{0};
                            obj4 = ObjectAnimator.ofFloat(h1, View.TRANSLATION_Y, uofloatArray1);
                            i6 = i2;
                            objectAnimat1 = obj4.setDuration(250);
                            a.o(objectAnimat1, "actionBarAnimator.setDuration\(250L\)");
                            ot01 = ot0;
                            objectAnimat1.setInterpolator(a.b(f2, 0x3f70a3d7, f1, 0x3f800000));
                            uBuilder.with(obj4);
                         }else {
                            i6 = i2;
                            ot01 = ot0;
                         }
                         h1 = obj.j;
                         if (h1 != null) {
                            view1 = h1.findViewById(R.id.camera_scroll_snapshot_tab_container);
                            if (view1 != null) {
                               f uof1 = (n.z(obj.j) >= i.d(0x43af0000))? 1: null;
                               if (uof1) {
                                  if (obj.a(view1, (int)obj.b)) {
                                     view1.setTranslationY(obj.b);
                                     uofloatArray1 = new float[]{0};
                                     obj4 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, uofloatArray1);
                                     ObjectAnimator objectAnimat2 = obj4.setDuration(250);
                                     a.o(objectAnimat2, "animator.setDuration\(250L\)");
                                     objectAnimat2.setInterpolator(a.b(f2, 0x3f70a3d7, f1, 0x3f800000));
                                     uBuilder.with(obj4);
                                  }
                               }else if(view1.isShown()){
                                  objectAnimat3 = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[2]{0x3f800000,0});
                                  objectAnimat4 = objectAnimat3.setDuration(50);
                                  a.o(objectAnimat4, "snapTabAnimator.setDuration\(50L\)");
                                  objectAnimat4.setInterpolator(new LinearInterpolator());
                                  objectAnimat3.addListener(new h(view1));
                                  uBuilder.with(objectAnimat3);
                               }
                            }
                         }
                         h1 = obj.g;
                         if (h1 != null) {
                            a.m(h1);
                            if (obj.a(h1, (int)obj.b)) {
                               h1 = obj.g;
                               a.m(h1);
                               h1.setTranslationY(obj.b);
                               h1 = obj.h;
                               a.m(h1);
                               h1.requestLayout();
                               h1 = obj.g;
                               a.m(h1);
                               uofloatArray1 = new float[]{0};
                               obj4 = ObjectAnimator.ofFloat(h1, View.TRANSLATION_Y, uofloatArray1);
                               objectAnimat1 = obj4.setDuration(250);
                               a.o(objectAnimat1, "takePictureBtnAnimator.setDuration\(250L\)");
                               objectAnimat1.setInterpolator(a.b(f2, 0x3f70a3d7, f1, 0x3f800000));
                               uBuilder.with(obj4);
                            }
                         }
                         h1 = obj.j;
                         a.m(h1);
                         view1 = h1.findViewById(R.id.camera_tab_scroll_container);
                         if (view1 != null) {
                            view1.clearAnimation();
                            view1.animate().cancel();
                            uofloatArray1 = new float[]{(float)-1 * obj.b};
                            objectAnimat3 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, uofloatArray1);
                            objectAnimat4 = objectAnimat3.setDuration(250);
                            a.o(objectAnimat4, "bottomTabMoveAnimator.setDuration\(250L\)");
                            objectAnimat4.setInterpolator(a.b(f2, 0x3f70a3d7, f1, 0x3f800000));
                            uBuilder.with(objectAnimat3);
                            objectAnimat3 = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[2]{0x3f800000,0});
                            objectAnimat4 = objectAnimat3.setDuration(150);
                            a.o(objectAnimat4, "bottomTabAlphaAnimator.setDuration\(150L\)");
                            objectAnimat4.setInterpolator(new LinearInterpolator());
                            objectAnimat3.addListener(new i(view1));
                            uBuilder.with(objectAnimat3);
                         }
                         obj.d = uAnimatorSet;
                         a.m(uAnimatorSet);
                         uAnimatorSet.addListener(new j(obj, i6));
                         uof = obj.d;
                         if (uof != null) {
                            uof.addListener(new g());
                         }
                         uof = obj.d;
                         a.m(uof);
                         uof.start();
                         if (i6) {
                            uof = obj.d;
                            if (uof != null) {
                               uof.end();
                            }
                         }
                         uof = obj.l;
                         if (uof != null) {
                            view1 = uof.findViewById(R.id.side_bar_right_shader);
                            i5 = true;
                         }else {
                            i5 = true;
                            view1 = null;
                         }
                         obj.d(view1, i5);
                      label_05bf :
                         obj = b.x;
                         a.m(obj);
                         int i1 = obj.K0().size();
                         MultiTakePictrueItem multiTakePic = new MultiTakePictrueItem(og, e, c.getWidth(), c.getHeight());
                         MultiTakePictureController x = b.x;
                         a.m(x);
                         CopyOnWriteArrayList uCopyOnWrite = x.K0();
                         if (uCopyOnWrite instanceof Collection && uCopyOnWrite.isEmpty()) {
                            i2 = 0;
                         }else {
                            Iterator iterator = uCopyOnWrite.iterator();
                            i2 = 0;
                            while (iterator.hasNext()) {
                               if (iterator.next().f()) {
                                  i2 = i2 + 1;
                                  if (i2 < 0) {
                                     CollectionsKt__CollectionsKt.V();
                                  }
                               }
                            }
                         }
                         multiTakePic.h(i2);
                         SmartCoverTaskBuilder smartCoverTa = PatchProxy.apply(null, b, MultiTakePictureController.class, "43");
                         if (smartCoverTa == PatchProxyResult.class) {
                            smartCoverTa = b.N.getValue();
                         }
                         str2 = "photoScoreTaskBuilder";
                         a.o(smartCoverTa, str2);
                         b uob = PatchProxy.applyTwoRefs(smartCoverTa, c, multiTakePic, MultiTakePictrueItem.class, str1);
                         if (uob != PatchProxyResult.class) {
                         }else {
                            a.p(smartCoverTa, str2);
                            a.p(c, "bitmap");
                            Object[] objArray1 = new Object[0];
                            a.D().w("MultiTakePictureItem", "score start: "+multiTakePic.d, objArray1);
                            uob = a0.y(new w(smartCoverTa, c)).T(d.c).R(new x(multiTakePic), new y(multiTakePic));
                            a.o(uob, "Single\n      .fromCallab¡­s\(INVALID_SCORE\)\n      }\)");
                         }
                         b.Y1(uob);
                         str2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
                         if (a.A()) {
                            x1 = b.x;
                            a.m(x1);
                            u1 = b.u;
                            a.m(u1);
                            layoutManage = u1.getLayoutManager();
                            Objects.requireNonNull(layoutManage, str2);
                            b.J.c(i1, c, x1, layoutManage, multiTakePic, new MultiTakePictureController$insertNewPhoto$2(b));
                         }else {
                            int i4 = -1;
                            x1 = b.x;
                            a.m(x1);
                            u1 = b.u;
                            a.m(u1);
                            layoutManage = u1.getLayoutManager();
                            Objects.requireNonNull(layoutManage, str2);
                            b.J.c(i1, c, x1, layoutManage, multiTakePic, MultiPictureAnimatorHelper$startScaleAnimator$1.INSTANCE);
                         }
                         x = b.x;
                         a.m(x);
                         Objects.requireNonNull(x);
                         obj3 = obj2;
                         if (!PatchProxy.applyVoidTwoRefs(multiTakePic, obj3, x, ot01, "10")) {
                            a.p(multiTakePic, "item");
                            a.p(obj3, "bitmap");
                            i1 = x.e.size() - 1;
                            x.e.add(multiTakePic);
                            x.f.put(multiTakePic.c(), obj3);
                            x.n0((x.e.size() - 1));
                            if (i1 >= 0) {
                               x.l0(i1);
                            }
                            int i3 = x.e.size() - 1;
                            if (i3 >= 0) {
                               x.j.smoothScrollToPosition(i3);
                            }
                            t0 h = x.h;
                            if (h != null) {
                               h.Y(i3);
                            }
                         }
                      }
                      f = (float)i;
                      goto label_031f ;
                   }
                }
                ot01 = ot0;
                goto label_05bf ;
             }
          }
       }
       return;
    }
}
