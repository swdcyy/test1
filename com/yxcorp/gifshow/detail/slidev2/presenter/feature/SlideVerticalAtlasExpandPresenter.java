package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$d;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$b;
import e8a.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.TextView;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.content.Context;
import r0.a;
import y17.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import bm5.b;
import brd.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$f;
import erd.g;
import crd.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$h;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$i;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import com.kwai.library.widget.popup.common.c;
import o56.c;
import o56.a;
import android.app.Application;
import ekd.p0;
import ur7.a;
import android.view.ViewGroup;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import joc.a0;
import ge5.d;
import joc.z;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Float;
import android.os.SystemClock;
import java.util.Collection;
import java.util.List;
import ze5.a;
import kxb.b;
import ekd.i;
import android.view.ViewGroup$MarginLayoutParams;
import a2.l;
import a2.j;
import p1.b;
import java.lang.Integer;
import ekd.p1;
import java.lang.Number;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import android.view.ViewConfiguration;
import w85.a;
import qrd.l1;
import eda.p;
import e8a.p1;
import java.util.HashMap;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import rf5.u;
import xx9.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.StringBuilder;

public class SlideVerticalAtlasExpandPresenter extends a implements g	// class@001936
{
    public final RecyclerView$r A;
    public final PublishSubject B;
    public PublishSubject C;
    public MilanoContainerEventBus D;
    public PublishSubject E;
    public t F;
    public a G;
    public g H;
    public f I;
    public List J;
    public ViewGroup[] K;
    public BaseFragment L;
    public QPhoto M;
    public f N;
    public t O;
    public u P;
    public t Q;
    public a R;
    public SlidePlayViewModel S;
    public SwipeLayout T;
    public a U;
    public boolean U0;
    public d V;
    public TextView V0;
    public long W;
    public boolean W0;
    public boolean X;
    public final PhotosScaleHelpView$c X0;
    public Canvas Y;
    public a Y0;
    public Bitmap Z;
    public a r;
    public SimpleSwipeLayout s;
    public View t;
    public SlideLongAtlasRecyclerView u;
    public PhotosScaleHelpView v;
    public TextView w;
    public f x;
    public a y;
    public final p z;
    public static final SlideVerticalAtlasExpandPresenter$a Z0;

    static {
       SlideVerticalAtlasExpandPresenter.Z0 = new SlideVerticalAtlasExpandPresenter$a(null);
    }
    public void SlideVerticalAtlasExpandPresenter(){
       super();
       this.z = s.c(new SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2(this));
       this.A = new SlideVerticalAtlasExpandPresenter$c(this);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.B = publishSubje;
       this.X0 = new SlideVerticalAtlasExpandPresenter$d(this);
       this.Y0 = new SlideVerticalAtlasExpandPresenter$b(this);
       this.U7(new r());
    }
    public static final f R8(SlideVerticalAtlasExpandPresenter p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mLogger");
       }
       return p0;
    }
    public void E8(){
       SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slideVertica, "27")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter tM = this.M;
       if (tM == null) {
          a.S("mPhoto");
       }
       if (!tM.isLongPhotos()) {
          slideVertica = this.w;
          if (slideVertica != null) {
             slideVertica.setVisibility(8);
          }
          return;
       }else if(!NasaSlidePlayExperimentUtil.j()){
          tM = this.w;
          if (tM != null) {
             tM.setVisibility(0);
          }
          tM = this.w;
          if (tM != null) {
             tM.setCompoundDrawables(objArray, objArray, objArray, objArray);
          }
          tM = this.w;
          ViewGroup$LayoutParams layoutParams = (tM != null)? tM.getLayoutParams(): objArray;
          if (layoutParams != null) {
             layoutParams.height = a1.d(0x7f0702ef);
          }
          SlideVerticalAtlasExpandPresenter tw = this.w;
          if (tw != null) {
             tw.setLayoutParams(layoutParams);
          }
          tM = this.w;
          if (tM != null) {
             String str = a1.p(R.string.arg_RES_7f1005cf);
             a.o(str, "CommonUtil.string\(R.string.click_to_open\)");
             SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(str, this, slideVertica, "47");
             if (spannableStr != PatchProxyResult.class) {
             }else {
                spannableStr = new SpannableStringBuilder(str);
                Matcher matcher = Pattern.compile("£ü").matcher(str);
                SlideVerticalAtlasExpandPresenter tw1 = this.w;
                a.m(tw1);
                Drawable uDrawable = a.d(tw1.getContext(), R.drawable.arg_RES_7f0824de);
                a uoa = new a(uDrawable, "");
                a.m(uDrawable);
                uoa.c((uDrawable.getIntrinsicWidth() - a1.d(R.dimen.arg_RES_7f07034b)), a1.e(10.00f));
                while (matcher.find()) {
                   spannableStr.setSpan(uoa, matcher.start(), matcher.end(), 33);
                }
             }
             tM.setText(spannableStr);
          }
          slideVertica = this.w;
          if (slideVertica != null) {
             slideVertica.setCompoundDrawablePadding(a1.e(4.00f));
          }
          slideVertica = this.w;
          if (slideVertica != null) {
             int i = (NasaSlidePlayExperimentUtil.e())? 0x7f08017e: 0x7f08018f;
             slideVertica.setBackgroundResource(i);
          }
       }
       slideVertica = this.w;
       if (slideVertica != null) {
          slideVertica.setOnClickListener(new SlideVerticalAtlasExpandPresenter$e(this));
       }
       this.X7(RxBus.f.f(b.class).subscribe(new SlideVerticalAtlasExpandPresenter$f(this)));
       slideVertica = this.w;
       if (slideVertica != null) {
          slideVertica.setClickable(0);
       }
       slideVertica = this.L;
       String str1 = "mFragment";
       if (slideVertica == null) {
          a.S(str1);
       }
       Fragment parentFragme = slideVertica.getParentFragment();
       if (parentFragme != null) {
          objArray = SlidePlayViewModel.B0(parentFragme);
       }
       this.S = objArray;
       if (objArray != null) {
          slideVertica = this.L;
          if (slideVertica == null) {
             a.S(str1);
          }
          objArray.P(slideVertica, this.Y0);
       }
       slideVertica = this.O;
       if (slideVertica == null) {
          a.S("mScrollLongObservable");
       }
       this.X7(slideVertica.subscribe(new SlideVerticalAtlasExpandPresenter$g(this), Functions.e));
       slideVertica = this.Q;
       if (slideVertica == null) {
          a.S("mCaptionFoldProgressObservable");
       }
       this.X7(slideVertica.subscribe(new SlideVerticalAtlasExpandPresenter$h(this)));
       if (this.F != null) {
          slideVertica = this.M;
          if (slideVertica == null) {
             a.S("mPhoto");
          }
          if (slideVertica.isLongPhotos()) {
             slideVertica = this.F;
             a.m(slideVertica);
             this.X7(slideVertica.subscribe(new SlideVerticalAtlasExpandPresenter$i(this)));
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, SlideVerticalAtlasExpandPresenter.class, "32")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter tH = this.H;
       if (tH != null) {
          if (tH == null) {
             a.S("mAdapter");
          }
          tH.Z0();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlideVerticalAtlasExpandPresenter.class, "31")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter tu = this.u;
       if (tu != null) {
          tu.setAdapter(null);
       }
       tu = this.s;
       if (tu != null) {
          ViewPropertyAnimator viewProperty = tu.animate();
          if (viewProperty != null) {
             viewProperty.setListener(null);
          }
       }
       this.S8(false);
       return;
    }
    public final boolean S8(boolean p0){
       SlideVerticalAtlasExpandPresenter obj;
       SlideVerticalAtlasExpandPresenter tN;
       MilanoContainerEventBus a;
       SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(slideVertica)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, slideVertica, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       InvalidGestureChecker.h.b(this.getContext(), AnswerType.OPEN_OR_CLOSE_LONG_ALAS);
       obj = this.r;
       if (obj != null) {
          obj.o();
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (!p0.C(uoc.a())) {
          RxBus.f.b(new a(false));
       }
       obj = this.s;
       if (obj != null) {
          a.m(obj);
          if (!obj.getVisibility()) {
             obj = this.K;
             if (obj == null) {
                a.S("mChangeLikeContainer");
             }
             object oobject = obj[0];
             if (oobject instanceof ViewGroup) {
                int childCount = oobject.getChildCount();
                int i = 0;
                while (i < childCount) {
                   View childAt = oobject.getChildAt(i);
                   a.o(childAt, "getChildAt\(index\)");
                   if (childAt instanceof LottieAnimationView) {
                      childAt.f();
                   }
                   i = i + 1;
                }
                oobject.removeAllViews();
             }
             this.h9(false);
             if (!PatchProxy.applyVoid(null, this, slideVertica, "37") && this.U != null) {
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                activity.l3(this.U);
             }
             slideVertica = this.T;
             if (slideVertica != null) {
                slideVertica.n(true, 5);
             }
             slideVertica = this.V;
             if (slideVertica != null) {
                a0 uoa0 = slideVertica.b();
                if (uoa0 != null) {
                   uoa0.g(true);
                }
             }
             slideVertica = this.K;
             if (slideVertica == null) {
                a.S("mChangeLikeContainer");
             }
             slideVertica[0] = null;
             if (p0) {
                tN = this.N;
                if (tN == null) {
                   a.S("mIsAtlasDetailModeRef");
                }
                tN.set(Boolean.FALSE);
             }
             tN = this.C;
             if (tN != null) {
                tN.onNext(Boolean.FALSE);
             }
             tN = this.D;
             if (tN != null) {
                a = tN.a;
                if (a != null) {
                   a.onNext(Boolean.FALSE);
                }
             }
             tN = this.x;
             if (tN == null) {
                a.S("mLogger");
             }
             PhotoDetailLogger photoDetailL = tN.get();
             if (photoDetailL != null) {
                photoDetailL.enterAtlasCoverMode();
             }
             return true;
          }
       }
       return false;
    }
    public final void V8(float p0,float p1){
       SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(slideVertica) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, slideVertica, "44")) {
          return;
       }
       this.W = SystemClock.elapsedRealtime();
       this.X = true;
       int i = 0;
       SlideVerticalAtlasExpandPresenter tJ = this.J;
       if (tJ == null) {
          a.S("mSlideLikeEventListeners");
       }
       int i1 = tJ.size();
       for (; i < i1; i = i + 1) {
          SlideVerticalAtlasExpandPresenter tJ1 = this.J;
          if (tJ1 == null) {
             a.S("mSlideLikeEventListeners");
          }
          tJ1.get(i).K(p0, p1);
       }
       return;
    }
    public final boolean W8(){
       SlideVerticalAtlasExpandPresenter obj = PatchProxy.apply(null, this, SlideVerticalAtlasExpandPresenter.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.M;
       if (obj == null) {
          a.S("mPhoto");
       }
       return b.a(obj);
    }
    public final void X8(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter.class, "40")) {
          return;
       }
       if (i.c()) {
          Integer integer = null;
          ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): integer;
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          if (p0 != null) {
             l ol = j.a(p0);
             if (ol != null) {
                b uob = ol.f(1);
                if (uob != null) {
                   integer = Integer.valueOf(uob.b);
                }
             }
             if (integer != null) {
                i = integer.intValue();
             label_0045 :
                layoutParams.topMargin = layoutParams.topMargin + i;
             }
          }
          i = p1.f(this.getContext());
          goto label_0045 ;
       }
       return;
    }
    public final int Y8(){
       int i2;
       SlideVerticalAtlasExpandPresenter obj = PatchProxy.apply(null, this, SlideVerticalAtlasExpandPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       String str = "mPhoto";
       if (this.W8()) {
          obj = this.M;
          if (obj == null) {
             a.S(str);
          }
          int[] atlasIndices = obj.getAtlasIndices();
          a.m(atlasIndices);
          a.o(atlasIndices, "mPhoto.atlasIndices!!");
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          int len = atlasIndices.length;
          for (int i = 0; i < len; i = i + 1) {
             int i1 = atlasIndices[i];
             Integer integer = Integer.valueOf(i1);
             ArrayList uArrayList = linkedHashMa.get(integer);
             if (uArrayList == null) {
                uArrayList = new ArrayList();
                linkedHashMa.put(integer, uArrayList);
             }
             uArrayList.add(Integer.valueOf(i1));
          }
          i2 = linkedHashMa.size();
       }else {
          obj = this.M;
          if (obj == null) {
             a.S(str);
          }
          i2 = obj.getAtlasList().size();
       }
       return i2;
    }
    public final ViewGroup Z8(){
       Activity obj = PatchProxy.apply(null, this, SlideVerticalAtlasExpandPresenter.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       a.m(obj);
       View view = obj.findViewById(0x1020002);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       return view;
    }
    public final PublishSubject a9(){
       return this.B;
    }
    public final QPhoto b9(){
       SlideVerticalAtlasExpandPresenter obj = PatchProxy.apply(null, this, SlideVerticalAtlasExpandPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final boolean c9(){
       Object obj = PatchProxy.apply(null, this, SlideVerticalAtlasExpandPresenter.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((SystemClock.elapsedRealtime() - this.W) - (long)ViewConfiguration.getJumpTapTimeout() < 0)? true: false;
       return b;
    }
    public final boolean d9(){
       boolean b;
       SlideVerticalAtlasExpandPresenter obj = PatchProxy.apply(null, this, SlideVerticalAtlasExpandPresenter.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       if (obj == null) {
          a.S("mDetailParam");
       }
       if (obj.g()) {
          obj = this.S;
          if (obj == null || obj.b1()) {
             b = true;
          label_0033 :
             return b;
          }
       }
       b = false;
       goto label_0033 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter.class, "26")) {
          return;
       }
       a.m(p0);
       TextView textView = p0.findViewById(R.id.open_long_atlas);
       this.w = textView;
       if (textView != null) {
          ViewGroup$LayoutParams layoutParams = (textView != null)? textView.getLayoutParams(): null;
          SlideVerticalAtlasExpandPresenter tw = this.w;
          if (tw != null) {
             tw.setHeight(a1.e(32.00f));
          }
          tw = this.w;
          if (tw != null) {
             tw.setPadding(a1.e(12.00f), a1.e(6.00f), a1.e(12.00f), a1.e(6.00f));
          }
          tw = this.w;
          if (tw != null) {
             tw.setTextSize(12.00f);
          }
          textView.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void e9(boolean p0){
       SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(slideVertica) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slideVertica, "28")) {
          return;
       }
       RxBus f = RxBus.f;
       SlideVerticalAtlasExpandPresenter tM = this.M;
       if (tM == null) {
          a.S("mPhoto");
       }
       String photoId = tM.getPhotoId();
       a.o(photoId, "mPhoto.photoId");
       f.b(new p(photoId, p0));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideVerticalAtlasExpandPresenter.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SlideVerticalAtlasExpandPresenter.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SlideVerticalAtlasExpandPresenter.class, new p1());
       }else {
          obj.put(SlideVerticalAtlasExpandPresenter.class, null);
       }
       return obj;
    }
    public final void h9(boolean p0){
       SlideVerticalAtlasExpandPresenter ts;
       SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
       if (PatchProxy.isSupport(slideVertica) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slideVertica, "48")) {
          return;
       }
       long l = 300;
       if (p0) {
          ts = this.s;
          if (ts != null) {
             ts.setAlpha(0);
             ts.setVisibility(0);
             ts.animate().alpha(0x3f800000).setDuration(l).setListener(null);
          }
       }else {
          ts = this.v;
          if (ts != null) {
             ts.setEnabled(0);
          }
          ts = this.s;
          if (ts != null) {
             ViewPropertyAnimator viewProperty = ts.animate();
             if (viewProperty != null) {
                viewProperty = viewProperty.alpha(0);
                if (viewProperty != null) {
                   viewProperty = viewProperty.setDuration(l);
                   if (viewProperty != null) {
                      SlideVerticalAtlasExpandPresenter$mExpandRootLayoutGoneListener$2$a omExpandRoot = PatchProxy.apply(null, this, slideVertica, "2");
                      if (omExpandRoot == PatchProxyResult.class) {
                         omExpandRoot = this.z.getValue();
                      }
                      viewProperty.setListener(omExpandRoot);
                   }
                }
             }
          }
       }
    label_006b :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlideVerticalAtlasExpandPresenter.class, "1")) {
          return;
       }
       f obj = this.r8("SLIDE_PLAY_PHOTO_LONG_ATLAS_ADAPTER");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­PHOTO_LONG_ATLAS_ADAPTER\)");
       this.H = obj;
       obj = this.x8("LOG_LISTENER");
       a.o(obj, "injectRef\(AccessIds.LOG_LISTENER\)");
       this.I = obj;
       Object obj1 = this.r8("DETAIL_CLICK_LIKE_LISTENERS");
       a.o(obj1, "inject\(AccessIds.DETAIL_CLICK_LIKE_LISTENERS\)");
       this.J = obj1;
       obj1 = this.r8("DETAIL_CHANGE_LIKE_CONTAINER");
       a.o(obj1, "inject\(DetailAccessIds.D¡­IL_CHANGE_LIKE_CONTAINER\)");
       this.K = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.L = obj1;
       obj1 = this.q8(QPhoto.class);
       a.o(obj1, "inject\(QPhoto::class.java\)");
       this.M = obj1;
       obj1 = this.q8(a.class);
       a.o(obj1, "inject\(DetailPlayModule::class.java\)");
       this.R = obj1;
       this.C = this.t8("FEATURED_LONG_ATLAS_OPEN");
       this.D = this.s8(MilanoContainerEventBus.class);
       this.V = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.E = this.t8("SLIDE_PLAY_ATLAS_RV_ID");
       obj = this.x8("THANOS_SLIDEPLAY_ATLAS_OPENSTATE");
       a.o(obj, "injectRef\(AccessIds.THAN¡­LIDEPLAY_ATLAS_OPENSTATE\)");
       this.N = obj;
       obj1 = this.r8("LONG_SCROLL_RECYCLER_VIEW_OBSERVABLE");
       a.o(obj1, "inject\(DetailAccessIds.L¡­RECYCLER_VIEW_OBSERVABLE\)");
       this.O = obj1;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.x = obj;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.P = obj1;
       obj1 = this.r8("CAPTION_FOLD_PROGRESS_OBSERVABLE");
       a.o(obj1, "inject\(DetailAccessIds.C¡­FOLD_PROGRESS_OBSERVABLE\)");
       this.Q = obj1;
       obj1 = this.q8(a.class);
       a.o(obj1, "inject\(DetailParam::class.java\)");
       this.G = obj1;
       this.F = this.t8("SLIDE_PLAY_CLICK_TO_ATLAS_DETAIL");
       obj1 = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.y = obj1;
       return;
    }
    public final void j9(LinearLayoutManager p0){
       int i;
       SlideVerticalAtlasExpandPresenter tM1;
       String str;
       CharSequence text;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter.class, "3")) {
          return;
       }
       if (!p0.h()) {
          i = 1;
       }else {
          int i2 = p0.E();
          SlideVerticalAtlasExpandPresenter tM2 = this.M;
          if (tM2 == null) {
             a.S("mPhoto");
          }
          if (i2 == (tM2.getAtlasList().size() - 1)) {
             tM1 = this.M;
             if (tM1 == null) {
                a.S("mPhoto");
             }
             i = tM1.getAtlasList().size();
          }else {
             i = ((p0.i0() + p0.c()) / 2) + 1;
          }
       }
       if (i <= 0) {
          i = 1;
       }
       if (this.W8()) {
          SlideVerticalAtlasExpandPresenter tM = this.M;
          if (tM == null) {
             a.S("mPhoto");
          }
          int[] atlasIndices = tM.getAtlasIndices();
          a.m(atlasIndices);
          int i1 = i - 1;
          if (atlasIndices.length > i1) {
             tM1 = this.M;
             if (tM1 == null) {
                a.S("mPhoto");
             }
             int[] atlasIndices1 = tM1.getAtlasIndices();
             a.m(atlasIndices1);
             str = (atlasIndices1[i1] + 1)+'/'+this.Y8();
             tM = this.V0;
             if (tM != null) {
                text = tM.getText();
                if (text != null && !text.equals(str)) {
                   tM = this.V0;
                   if (tM != null) {
                      tM.setText(str);
                   }
                }
             }
          }else {
          label_00a7 :
             str = i+'/'+this.Y8();
             tM = this.V0;
             if (tM != null) {
                text = tM.getText();
                if (text != null && !text.equals(str)) {
                   tM = this.V0;
                   if (tM != null) {
                      tM.setText(str);
                   }
                }
             }
          }
       }else {
          goto label_00a7 ;
       }
    label_00d4 :
       tM1 = this.V0;
       if (tM1 != null) {
          tM1.requestLayout();
       }
       return;
    }
}
