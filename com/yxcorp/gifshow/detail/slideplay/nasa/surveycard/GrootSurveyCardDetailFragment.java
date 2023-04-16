package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.GrootSurveyCardDetailFragment;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import android.os.Bundle;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import lnc.a1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.GrootSurveyCardDetailFragment$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.d;
import im8.c;

public class GrootSurveyCardDetailFragment extends DetailSlidePlayFragment	// class@0017bb
{
    public NasaBizParam F;
    public PresenterV2 G;
    public static final int H;

    public void GrootSurveyCardDetailFragment(){
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootSurveyCardDetailFragment.class, "8")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "8");
       return;
    }
    public int M(){
       return 1;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootSurveyCardDetailFragment.class, "10")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "10");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootSurveyCardDetailFragment.class, "9")) {
          return;
       }
       this.oh();
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "9");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootSurveyCardDetailFragment.class, "7")) {
          return;
       }
       this.nh();
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "7");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getUrl(){
       return "ks://photo";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrootSurveyCardDetailFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = a.a(this.ch());
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, GrootSurveyCardDetailFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       this.j = a.c(p0, 0x7f0d1525, p1, false);
       if (!f.b() || (!this.F.getNasaSlideParam().isHomePage() && !this.F.getNasaSlideParam().isTrendingPage())) {
          String str = "6";
          if (!PatchProxy.applyVoidWithListener(null, this, GrootSurveyCardDetailFragment.class, str)) {
             this.j.setPadding(false, false, false, a1.d(R.dimen.arg_RES_7f070bf1));
             PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, str);
          }
       }
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "2");
       return this.j;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootSurveyCardDetailFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       GrootSurveyCardDetailFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
          this.G = null;
       }
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "5");
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, GrootSurveyCardDetailFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       DetailSlidePlayFragment tx = this.x;
       if (tx == null || tx.mPhoto == null) {
          PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "3");
          return;
       }else if(PatchProxy.applyVoidOneRefsWithListener(p0, this, GrootSurveyCardDetailFragment.class, "4")){
          String str = "12";
          GrootSurveyCardDetailFragment$a uoa = PatchProxy.applyWithListener(null, this, GrootSurveyCardDetailFragment.class, str);
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new GrootSurveyCardDetailFragment$a();
             PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, str);
          }
          PresenterV2 presenterV2 = new PresenterV2();
          this.G = presenterV2;
          presenterV2.U7(new e());
          this.G.U7(new d());
          this.G.f(p0);
          Object[] objArray = new Object[]{this.x,new c("FRAGMENT", this),uoa};
          this.G.i(objArray);
          PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "4");
       }
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment.class, "3");
       return;
    }
}
