package com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter$b;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter$a;
import io.reactivex.internal.functions.Functions;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import io.reactivex.subjects.PublishSubject;
import w85.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.nasa.NasaSlideParam;

public final class NasaFeedSlidePhotoAutoPlayPresenter extends SlidePlayAutoPlayNextPresenter	// class@0018b4
{
    public PublishSubject f1;
    public PublishSubject g1;
    public t h1;
    public long i1;
    public a j1;
    public NasaBizParam k1;

    public void NasaFeedSlidePhotoAutoPlayPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaFeedSlidePhotoAutoPlayPresenter.class, "9")) {
          return;
       }
       super.E8();
       NasaFeedSlidePhotoAutoPlayPresenter tNasaFeedSli = this.f1;
       if (tNasaFeedSli == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(tNasaFeedSli.subscribe(new NasaFeedSlidePhotoAutoPlayPresenter$b(this)));
       tNasaFeedSli = this.g1;
       if (tNasaFeedSli == null) {
          a.S("mAiTextFragmentVisiblePublisher");
       }
       this.X7(tNasaFeedSli.subscribe(new NasaFeedSlidePhotoAutoPlayPresenter$c(this)));
       tNasaFeedSli = this.h1;
       if (tNasaFeedSli != null) {
          this.X7(tNasaFeedSli.subscribe(new NasaFeedSlidePhotoAutoPlayPresenter$a(this), Functions.e));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, NasaFeedSlidePhotoAutoPlayPresenter.class, "8")) {
          return;
       }
       super.F8();
       this.W0 = true;
       return;
    }
    public void H9(int p0){
       NasaFeedSlidePhotoAutoPlayPresenter nasaFeedSlid = NasaFeedSlidePhotoAutoPlayPresenter.class;
       if (PatchProxy.isSupport(nasaFeedSlid) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, nasaFeedSlid, "15")) {
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
    public boolean P8(){
       return true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaFeedSlidePhotoAutoPlayPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.k1 = this.s8(NasaBizParam.class);
       Object obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.f1 = obj;
       obj = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.g1 = obj;
       this.j1 = this.q8(a.class);
       this.h1 = this.r8("DETAIL_PLAY_PROGRESS_OBSERVABLE");
       return;
    }
    public void k9(){
       int i;
       NasaFeedSlidePhotoAutoPlayPresenter nasaFeedSlid = NasaFeedSlidePhotoAutoPlayPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaFeedSlid, "12")) {
          return;
       }
       super.k9();
       Context uContext = this.G.requireContext();
       a.o(uContext, "mFragment.requireContext\(\)");
       TypedValue obj = PatchProxy.applyOneRefs(uContext, this, nasaFeedSlid, "16");
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
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(null, this, NasaFeedSlidePhotoAutoPlayPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.V0;
       SlidePlayAutoPlayNextPresenter tV0 = this.V0;
       a.o(tV0, "mSlidePlayViewModel");
       int i = 1;
       if (obj.q(obj.M(this.x)) >= (tV0.Q() - i)) {
          i = false;
       }
       return i;
    }
    public boolean o9(){
       NasaFeedSlidePhotoAutoPlayPresenter obj = PatchProxy.apply(null, this, NasaFeedSlidePhotoAutoPlayPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k1;
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
