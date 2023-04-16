package com.yxcorp.gifshow.music.radio.MusicRadioFeedItemFragment;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wpb.g;
import gqb.q;
import gqb.u;
import gqb.g;
import gqb.o;
import android.view.View;
import im8.c;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.music.radio.MusicRadioActivity;
import aqb.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;

public final class MusicRadioFeedItemFragment extends DetailSlidePlayFragment	// class@002069
{
    public NasaBizParam F;
    public PresenterV2 G;
    public QPhoto H;
    public a I;
    public PublishSubject J;

    public void MusicRadioFeedItemFragment(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.J = publishSubje;
    }
    public void H2(){
    }
    public int M(){
       return 1;
    }
    public void N2(){
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, MusicRadioFeedItemFragment.class, "8")) {
          return;
       }
       this.y.t1().r(this);
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, MusicRadioFeedItemFragment.class, "7")) {
          return;
       }
       this.y.t1().n(this);
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, MusicRadioFeedItemFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicRadioLogger.a.b(this.H);
    }
    public String o(){
       return "MUSIC_PLAYER_DETAIL";
    }
    public void onActivityCreated(Bundle p0){
       MusicRadioFeedItemFragment tG;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRadioFeedItemFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, MusicRadioFeedItemFragment.class, "6")) {
          if (this.G == null) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.G = presenterV2;
             presenterV2.U7(new g());
             tG = this.G;
             if (tG != null) {
                tG.U7(new q());
             }
             tG = this.G;
             if (tG != null) {
                tG.U7(new u());
             }
             tG = this.G;
             if (tG != null) {
                tG.U7(new g());
             }
             tG = this.G;
             if (tG != null) {
                tG.U7(new o());
             }
          }
          View view = this.getView();
          if (view != null) {
             MusicRadioFeedItemFragment tG1 = this.G;
             if (tG1 != null) {
                tG1.f(view);
             }
          }
          tG = this.G;
          if (tG != null) {
             Object[] objArray = new Object[]{new c("FRAGMENT", this),this.H,new c("DETAIL_PROCESS_EVENT", this.J),this.I};
             tG.i(objArray);
          }
       }
       this.qh();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRadioFeedItemFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.F = a.a(this.ch());
       this.y = SlidePlayViewModel.B0(this.getParentFragment());
       FragmentActivity activity = this.getActivity();
       a uoa = null;
       if (!activity instanceof MusicRadioActivity) {
          activity = uoa;
       }
       if (activity != null) {
          uoa = activity.x3();
       }
       this.I = uoa;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicRadioFeedItemFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       obj = this.ch();
       QPhoto qPhoto = (obj != null)? obj.b(QPhoto.class): null;
       this.H = qPhoto;
       super.onCreateView(p0, p1, p2);
       return a.c(p0, 0x7f0d04f5, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MusicRadioFeedItemFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       MusicRadioFeedItemFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
       }
       this.G = null;
       return;
    }
}
