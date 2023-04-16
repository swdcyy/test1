package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$c;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$d;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$e;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$a;
import io.reactivex.internal.functions.Functions;
import b95.a;
import w85.a;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import b8a.w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.o;
import q87.c;
import y8a.d;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Boolean;
import java.util.BitSet;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import io.reactivex.subjects.PublishSubject;
import brd.y;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.nasa.NasaSlideParam;

public final class NasaSimilarPhotoAutoPlayPresenter extends SlidePlayAutoPlayNextPresenter	// class@0018bb
{
    public final String f1;
    public PublishSubject g1;
    public PublishSubject h1;
    public t i1;
    public t j1;
    public long k1;
    public a l1;
    public y m1;
    public w n1;
    public MilanoContainerEventBus o1;
    public NasaBizParam p1;

    public void NasaSimilarPhotoAutoPlayPresenter(){
       super();
       this.f1 = "NasaSimilarPhotoAutoPlayPresenter";
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaSimilarPhotoAutoPlayPresenter.class, "13")) {
          return;
       }
       super.E8();
       NasaSimilarPhotoAutoPlayPresenter tg1 = this.g1;
       if (tg1 == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(tg1.subscribe(new NasaSimilarPhotoAutoPlayPresenter$c(this)));
       tg1 = this.h1;
       if (tg1 == null) {
          a.S("mAiTextFragmentVisiblePublisher");
       }
       this.X7(tg1.subscribe(new NasaSimilarPhotoAutoPlayPresenter$d(this)));
       tg1 = this.i1;
       if (tg1 == null) {
          a.S("mSimilarPhotoDisableAutoPlayNextObservable");
       }
       this.X7(tg1.subscribe(new NasaSimilarPhotoAutoPlayPresenter$e(this)));
       tg1 = this.j1;
       if (tg1 != null) {
          this.X7(tg1.subscribe(new NasaSimilarPhotoAutoPlayPresenter$a(this), Functions.e));
       }
       if (this.l1.n().b()) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          ViewModel viewModel = ViewModelProviders.of(activity).get(w.class);
          a.o(viewModel, "ViewModelProviders.of\(fr¡­amaViewModel::class.java\)");
          this.n1 = viewModel;
          viewModel.r0().observe(this.G, new NasaSimilarPhotoAutoPlayPresenter$f(this));
          tg1 = this.o1;
          if (tg1 != null) {
             this.X7(tg1.r.subscribe(new NasaSimilarPhotoAutoPlayPresenter$b(this)));
          }
       }
       return;
    }
    public void E9(){
       SlidePlayAutoPlayNextPresenter tx;
       if (PatchProxy.applyVoid(null, this, NasaSimilarPhotoAutoPlayPresenter.class, "21")) {
          return;
       }
       int i = 0;
       if (this.l1.n().b()) {
          String str = "mPhoto";
          if (this.V0.H(this.x)) {
             Object[] objArray = new Object[i];
             o.C().w(this.f1, "---------playNext: ", objArray);
             this.V0.L(this.W0);
             tx = this.x;
             a.o(tx, str);
             d.a(tx, true, "100");
          }else {
             tx = this.x;
             a.o(tx, str);
             d.a(tx, i, "102");
          }
       }else if(this.V0.H(this.x)){
          this.V0.L(this.W0);
       }else {
          this.V0.k(i, i);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, NasaSimilarPhotoAutoPlayPresenter.class, "12")) {
          return;
       }
       super.F8();
       this.W0 = true;
       return;
    }
    public void H9(int p0){
       NasaSimilarPhotoAutoPlayPresenter nasaSimilarP = NasaSimilarPhotoAutoPlayPresenter.class;
       if (PatchProxy.isSupport(nasaSimilarP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, nasaSimilarP, "24")) {
          return;
       }
       if (p0 > 0 && this.s != null) {
          View[] viewArray = new View[]{this.t};
          n.Z(8, viewArray);
          SlidePlayAutoPlayNextPresenter ts = this.s;
          if (ts != null) {
             ts.setText(a1.r(R.string.arg_RES_7f100304, String.valueOf(p0)));
          }
       }
       return;
    }
    public final void L9(boolean p0,int p1){
       NasaSimilarPhotoAutoPlayPresenter nasaSimilarP = NasaSimilarPhotoAutoPlayPresenter.class;
       if (PatchProxy.isSupport(nasaSimilarP) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, nasaSimilarP, "14")) {
          return;
       }
       if (p0) {
          this.T.set(p1);
          this.G9();
       }else {
          this.T.clear(p1);
          if (this.n9()) {
             this.F9();
          }
       }
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, NasaSimilarPhotoAutoPlayPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.l1.n().b())? false: super.W8();
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaSimilarPhotoAutoPlayPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.p1 = this.s8(NasaBizParam.class);
       Object obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.g1 = obj;
       obj = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.h1 = obj;
       obj = this.r8("SIMILAR_PHOTO_DISABLE_AUTO_PLAY_NEXT_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.S¡­UTO_PLAY_NEXT_OBSERVABLE\)");
       this.i1 = obj;
       this.l1 = this.q8(a.class);
       this.j1 = this.r8("DETAIL_PLAY_PROGRESS_OBSERVABLE");
       obj = this.r8("SERIAL_LAST_EPISODE_SWITCH_TO_FIRST_OBSERVER");
       a.o(obj, "inject\(DetailAccessIds.S¡­SWITCH_TO_FIRST_OBSERVER\)");
       this.m1 = obj;
       this.o1 = this.s8(MilanoContainerEventBus.class);
       return;
    }
    public void k9(){
       int i;
       NasaSimilarPhotoAutoPlayPresenter nasaSimilarP = NasaSimilarPhotoAutoPlayPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaSimilarP, "20")) {
          return;
       }
       super.k9();
       Context uContext = this.G.requireContext();
       a.o(uContext, "mFragment.requireContext\(\)");
       TypedValue obj = PatchProxy.applyOneRefs(uContext, this, nasaSimilarP, "25");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = new TypedValue();
          uContext.getTheme().resolveAttribute(R.attr.arg_RES_7f0400f6, obj, true);
          Resources resources = uContext.getResources();
          a.o(resources, "context.resources");
          i = TypedValue.complexToDimensionPixelSize(obj.data, c.c(resources));
       }
       i = i + a1.e(12.00f);
       if (i.c()) {
          i = i + n.A(this.G.requireContext());
       }
       SlidePlayAutoPlayNextPresenter tq = this.q;
       ViewGroup$LayoutParams layoutParams = (tq != null)? tq.getLayoutParams(): objArray;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          objArray = layoutParams;
       }
       if (objArray != null) {
          objArray.topMargin = i;
       }
       if (objArray) {
          objArray.rightMargin = a1.e(19.00f);
       }
       return;
    }
    public boolean n9(){
       boolean b1;
       NasaSimilarPhotoAutoPlayPresenter tp1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaSimilarPhotoAutoPlayPresenter nasaSimilarP = NasaSimilarPhotoAutoPlayPresenter.class;
       Object[] objArray = null;
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(objArray, this, nasaSimilarP, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.V0;
       a.o(obj, "mSlidePlayViewModel");
       boolean b = false;
       if (obj.C() && this.l1.n().b()) {
          Object obj1 = PatchProxy.apply(objArray, this, nasaSimilarP, "26");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             SlidePlayAutoPlayNextPresenter tx = this.x;
             a.o(tx, "mPhoto");
             if (tx.isVideoType() && r1.l3(this.x.mEntity)) {
                tp1 = this.n1;
                if (tp1 != null) {
                   MutableLiveData mutableLiveD = tp1.r0();
                   if (mutableLiveD != null) {
                      objArray = mutableLiveD.getValue();
                   }
                }
                if (a.g(objArray, Boolean.TRUE)) {
                   b1 = true;
                }
             }
          label_0070 :
             b1 = false;
          }
          if (b1) {
          label_0073 :
             tp1 = this.p1;
             if (tp1 != null) {
                NasaSlideParam nasaSlidePar = tp1.getNasaSlideParam();
                if (nasaSlidePar != null && nasaSlidePar.mIsMusicRadio == 1) {
                label_0081 :
                   b = true;
                }
             }
          }else {
             goto label_0081 ;
          }
       }else {
          goto label_0073 ;
       }
    label_0082 :
       return b;
    }
    public boolean o9(){
       NasaSimilarPhotoAutoPlayPresenter obj = PatchProxy.apply(null, this, NasaSimilarPhotoAutoPlayPresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p1;
       boolean b = true;
       if (obj != null) {
          NasaSlideParam nasaSlidePar = obj.getNasaSlideParam();
          if (nasaSlidePar != null && nasaSlidePar.mEnableMusicRadioBackPlay == b) {
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
}
