package com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserVideoFragment;
import k6a.g;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import k6a.u;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import g6a.a0;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uw9.p3;
import android.os.Bundle;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import android.content.Context;
import lnc.a1;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import le5.f;
import g6a.s;
import msd.q;
import com.yxcorp.gifshow.util.l;

public class NasaGrootRecommendUserVideoFragment extends DetailSlidePlayFragment implements g, g	// class@001726
{
    public NasaBizParam F;
    public c G;
    public e H;
    public PublishSubject I;
    public int J;
    public BaseFragment K;
    public PresenterV2 L;
    public boolean M;
    public static final int N;

    public void NasaGrootRecommendUserVideoFragment(){
       super();
       this.I = PublishSubject.g();
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, "12")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "12");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, "13")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "13");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, "11")) {
          return;
       }
       this.M = false;
       this.oh();
       NasaGrootRecommendUserVideoFragment tG = this.G;
       if (tG != null) {
          u.j(tG.V1());
       }
       tG = this.H;
       if (tG != null) {
          tG.c();
          this.requireActivity().l3(this.H);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "11");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, "10")) {
          return;
       }
       this.M = true;
       this.nh();
       NasaGrootRecommendUserVideoFragment tG = this.G;
       if (tG != null) {
          u.k(tG.V1());
       }
       if (this.H != null) {
          this.requireActivity().F2(this.H);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "10");
       return;
    }
    public boolean V(){
       return this.M;
    }
    public void d0(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, "9")) {
          return;
       }
       NasaGrootRecommendUserVideoFragment tL = this.L;
       if (tL != null) {
          tL.destroy();
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "9");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootRecommendUserVideoFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "15");
          return new a0();
       }else {
          PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "15");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootRecommendUserVideoFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaGrootRecommendUserVideoFragment.class, new a0());
       }else {
          obj.put(NasaGrootRecommendUserVideoFragment.class, null);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "16");
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getPageParams(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "14");
       return p3.d(this.rh(), true);
    }
    public String getUrl(){
       return "";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootRecommendUserVideoFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "4");
          return;
       }else {
          String str = "6";
          Object[] objArray = null;
          if (!PatchProxy.applyVoidWithListener(objArray, this, NasaGrootRecommendUserVideoFragment.class, str)) {
             if (this.L != null) {
                PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, str);
             }else {
                PresenterV2 presenterV2 = new PresenterV2();
                this.L = presenterV2;
                presenterV2.U7(new RecommendUserVideoListPresenter());
                this.L.f(this.requireView());
                PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, str);
             }
          }
          str = "7";
          if (!PatchProxy.applyVoidWithListener(objArray, this, NasaGrootRecommendUserVideoFragment.class, str)) {
             if (this.G == null) {
                this.G = new c(this.J);
             }
             PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, str);
          }
          str = "5";
          if (!PatchProxy.applyVoidOneRefsWithListener(photoDetailP, this, NasaGrootRecommendUserVideoFragment.class, str)) {
             if (this.H == null) {
                this.H = new e(this, this.G);
             }
             this.H.d(photoDetailP.mPhoto);
             PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, str);
          }
          Object[] objArray1 = new Object[]{this,photoDetailP};
          this.L.i(objArray1);
          PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "4");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootRecommendUserVideoFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.K = this;
       this.F = a.a(this.ch());
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       String str;
       int i1;
       float f;
       ConstraintLayout$LayoutParams layoutParams;
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, NasaGrootRecommendUserVideoFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          this.j = a.c(p0, 0x7f0d107d, p1, false);
          str = "3";
          if (!PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, str)) {
             int i = n.j(this.requireActivity());
             if (i <= 0) {
                i = n.t(this.requireActivity());
                i1 = (i.c())? 0: n.A(this.requireContext());
                i = i - i1;
             }
             i = i - c.b(this.requireContext().getResources(), 0x7f070bf1);
             i1 = (a1.d(0x7f070fdf) + n.A(this.requireContext())) + a1.e(24.00f);
             this.j.findViewById(0x7f0a3498).getLayoutParams().topMargin = i1;
             int i2 = a1.e(62.00f) + i1;
             f = 58.00f;
             if (f.b()) {
                f = 9.00f;
             }
             i = (((i - n.c(this.getActivity(), 385.00f)) - a1.e(f)) - i2) - n.c(this.getActivity(), 47.00f);
             i2 = 0x7f0a34da;
             if (i > 200) {
                layoutParams = this.j.findViewById(i2).getLayoutParams();
                layoutParams.height = a1.e(385.00f);
                layoutParams.topMargin = a1.e(48.00f);
             }else if(i > 100){
                layoutParams = this.j.findViewById(i2).getLayoutParams();
                layoutParams.height = a1.e(385.00f);
                layoutParams.topMargin = a1.e(45.00f);
             }
             this.J = 3;
             PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, str);
          }
       }
       if (!f.b()) {
          str = "8";
          if (!PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserVideoFragment.class, str)) {
             this.j.setPadding(false, false, false, c.b(this.getContext().getResources(), R.dimen.arg_RES_7f070bf1));
             l.b(this.j, new s(this));
             PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, str);
          }
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserVideoFragment.class, "2");
       return this.j;
    }
}
