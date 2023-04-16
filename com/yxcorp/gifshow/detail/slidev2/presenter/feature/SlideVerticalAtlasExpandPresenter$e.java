package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import rf5.u;
import xx9.a;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Boolean;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import o56.c;
import o56.a;
import android.app.Application;
import ekd.p0;
import com.yxcorp.gifshow.util.rx.RxBus;
import ur7.a;
import java.lang.Integer;
import e17.i;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.a0;
import ge5.d;
import joc.z;
import android.view.ViewGroup;
import com.yxcorp.gifshow.detail.slidev2.widget.SimpleSwipeLayout;
import android.view.LayoutInflater;
import ag6.a;
import ekd.c;
import android.widget.FrameLayout;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import e8a.j1;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import joc.c;
import g9a.b;
import e8a.l1;
import g9a.b$a;
import joc.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import e8a.k1;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.a;
import java.lang.CharSequence;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import m9a.m;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.UUID;
import io.reactivex.subjects.PublishSubject;
import e8a.i1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$openLongAtlas$1;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import e8a.m1;
import java.lang.Runnable;

public final class SlideVerticalAtlasExpandPresenter$e extends m	// class@00192e
{
    public final SlideVerticalAtlasExpandPresenter c;

    public void SlideVerticalAtlasExpandPresenter$e(SlideVerticalAtlasExpandPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       SlideVerticalAtlasExpandPresenter s;
       ViewGroup viewGroup;
       MilanoContainerEventBus a;
       View view;
       String str2;
       SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "view");
       int i = 3;
       if (this.c.d9()) {
          s = this.c.S;
          if (s != null) {
             s.W(i);
          }
          return;
       }else {
          SlideVerticalAtlasExpandPresenter$e tc = this.c;
          Objects.requireNonNull(tc);
          Object[] objArray = null;
          SlideVerticalAtlasExpandPresenter slideVertica1 = PatchProxy.apply(objArray, tc, slideVertica, "22");
          String str = "mSwipeToProfileFeedMovement";
          if (slideVertica1 != PatchProxyResult.class) {
          }else {
             slideVertica1 = tc.P;
             if (slideVertica1 == null) {
                a.S(str);
             }
          }
          if (slideVertica1.v()) {
             s = this.c.y;
             if (s == null) {
                a.S("mScreenCleanStatusCombination");
             }
             if (!s.c()) {
                this.c.e9(false);
             }
             return;
          }else {
             PhotoDetailLogger photoDetailL = SlideVerticalAtlasExpandPresenter.R8(this.c).get();
             if (photoDetailL != null) {
                photoDetailL.exitAtlasCoverMode();
             }
             tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.isSupport(slideVertica) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tc, slideVertica, "33")) {
                InvalidGestureChecker.h.b(tc.getContext(), AnswerType.OPEN_OR_CLOSE_LONG_ALAS);
                c uoc = a.a();
                a.o(uoc, "AppEnv.get\(\)");
                if (!p0.C(uoc.a())) {
                   RxBus.f.b(new a(true));
                   Object[] objArray1 = new Object[true];
                   objArray1[0] = Integer.valueOf(2000);
                   i.b(R.style.arg_RES_7f110668, 0x7f1038e7, objArray1);
                }
                SlideVerticalAtlasExpandPresenter p = tc.P;
                if (p == null) {
                   a.S(str);
                }
                if (!p.v()) {
                   s = tc.P;
                   if (s == null) {
                      a.S(str);
                   }
                   s.l();
                }else if(tc.d9()){
                   s = tc.S;
                   if (s != null) {
                      s.W(i);
                   }
                }else if(tc.T == null){
                   tc.T = w9.c(tc.getActivity());
                }
                SlideVerticalAtlasExpandPresenter t = tc.T;
                if (t != null) {
                   t.n(false, 5);
                }
                t = tc.V;
                if (t != null) {
                   a0 uoa0 = t.b();
                   if (uoa0 != null) {
                      uoa0.a(true);
                   }
                }
                if (!PatchProxy.applyVoid(objArray, tc, slideVertica, "35")) {
                   if (tc.s == null) {
                      viewGroup = tc.Z8();
                      Activity activity2 = tc.getActivity();
                      SimpleSwipeLayout simpleSwipeL = (activity2 != null)? activity2.findViewById(R.id.long_expand_root_layout): objArray;
                      tc.s = simpleSwipeL;
                      if (simpleSwipeL == null) {
                         view = a.c(LayoutInflater.from(tc.getContext()), R.layout.arg_RES_7f0d1054, viewGroup, false);
                         Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.slidev2.widget.SimpleSwipeLayout");
                         tc.s = view;
                         a.m(view);
                         c.c(view, "longAtlas");
                         str2 = 1;
                      }else {
                         str2 = null;
                      }
                      SlideVerticalAtlasExpandPresenter s1 = tc.s;
                      a.m(s1);
                      s1.setClickable(true);
                      s1 = tc.s;
                      a.m(s1);
                      View view1 = s1.findViewById(R.id.long_atlas_recycler_view);
                      a.o(view1, "mExpandRootLayout!!.find¡­long_atlas_recycler_view\)");
                      SlideVerticalAtlasExpandPresenter s2 = tc.s;
                      a.m(s2);
                      tc.t = s2.findViewById(0x7f0a0797);
                      s2 = tc.s;
                      a.m(s2);
                      tc.v = s2.findViewById(0x7f0a0db7);
                      s2 = tc.s;
                      a.m(s2);
                      TextView textView = s2.findViewById(R.id.long_atlas_position_view);
                      tc.V0 = textView;
                      if (textView != null) {
                         TextPaint paint = textView.getPaint();
                         if (paint != null) {
                            paint.setFakeBoldText(true);
                         }
                      }
                      s2 = tc.V0;
                      if (s2 != null) {
                         GradientDrawable gradientDraw = new GradientDrawable();
                         gradientDraw.setColor(a1.a(R.color.arg_RES_7f06020a));
                         gradientDraw.setShape(false);
                         gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07027a));
                         s2.setBackground(gradientDraw);
                      }
                      s2 = tc.v;
                      a.m(s2);
                      s2.setSpecialView(view1);
                      s2 = tc.v;
                      a.m(s2);
                      s2.setAssistListener(new j1(tc));
                      c uoc1 = new c();
                      uoc1.C(new b(new l1(tc)));
                      SlideVerticalAtlasExpandPresenter s3 = tc.s;
                      a.m(s3);
                      s3.setTouchDetector(uoc1);
                      if (str2) {
                         viewGroup.addView(tc.s);
                      }
                      view1.setNeedIgnoreAfterDetachedFromWindow(true);
                      view1.setLayoutManager(new LinearLayoutManager(tc.getContext()));
                      tc.u = view1;
                      view1.addOnScrollListener(tc.A);
                      t = tc.t;
                      a.m(t);
                      t.setOnClickListener(new k1(tc));
                      if (str2) {
                         tc.X8(tc.t);
                         tc.X8(tc.V0);
                      }
                      tc.P8(false);
                   }
                   t = tc.V0;
                   if (t != null) {
                      t.setVisibility(false);
                   }
                   t = tc.V0;
                   CharSequence text = (t != null)? t.getText(): objArray;
                   t = (text == null || !text.length())? 1: null;
                   if (t) {
                      t = tc.u;
                      if (t != null && !t.getScrollState()) {
                         t = tc.u;
                         a.m(t);
                         RecyclerView$LayoutManager layoutManage = t.getLayoutManager();
                         Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                         tc.j9(layoutManage);
                      }
                   }
                   t = tc.v;
                   a.m(t);
                   t.setVerticalPhotosScaleHelper(tc.X0);
                }
                Activity activity = tc.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
                m.a(activity);
                t = tc.s;
                a.m(t);
                if (t.getParent() == null) {
                   tc.Z8().addView(tc.s, -1, -1);
                }
                t = tc.s;
                a.m(t);
                if (t.getVisibility()) {
                   tc.h9(true);
                }
                t = tc.u;
                a.m(t);
                RecyclerView$Adapter adapter = t.getAdapter();
                p = tc.H;
                str = "mAdapter";
                if (p == null) {
                   a.S(str);
                }
                if (a.g(adapter, p) ^ true) {
                   t = tc.u;
                   a.m(t);
                   p = tc.H;
                   if (p == null) {
                      a.S(str);
                   }
                   t.setAdapter(p);
                }
                String str1 = UUID.randomUUID().toString();
                a.o(str1, "UUID.randomUUID\(\).toString\(\)");
                p = tc.u;
                if (p != null) {
                   p.setTag(str1);
                }
                p = tc.E;
                if (p != null) {
                   p.onNext(str1);
                }
                t = tc.s;
                a.m(t);
                viewGroup = t.findViewById(R.id.expanded_long_atlas_like_image_container);
                viewGroup.removeAllViews();
                p = tc.K;
                if (p == null) {
                   a.S("mChangeLikeContainer");
                }
                p[0] = viewGroup;
                if (!PatchProxy.applyVoid(objArray, tc, slideVertica, "36")) {
                   if (tc.U == null) {
                      tc.U = new i1(tc);
                   }
                   Activity activity1 = tc.getActivity();
                   Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                   activity1.F2(tc.U);
                }
                slideVertica = tc.N;
                if (slideVertica == null) {
                   a.S("mIsAtlasDetailModeRef");
                }
                Boolean tRUE = Boolean.TRUE;
                slideVertica.set(tRUE);
                slideVertica = tc.C;
                if (slideVertica != null) {
                   slideVertica.onNext(tRUE);
                }
                slideVertica = tc.D;
                if (slideVertica != null) {
                   a = slideVertica.a;
                   if (a != null) {
                      a.onNext(tRUE);
                   }
                }
                slideVertica = tc.I;
                if (slideVertica == null) {
                   a.S("mLogListener");
                }
                slideVertica.get().a(a$a.a(316, "EXPAND_ATLAS"));
                Kgi.c(new SlideVerticalAtlasExpandPresenter$openLongAtlas$1(tc));
                slideVertica = tc.V0;
                if (slideVertica != null) {
                   slideVertica.post(new m1(tc));
                }
             }
          label_0380 :
             return;
          }
       }
    }
}
