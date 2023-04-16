package com.yxcorp.gifshow.growth.home.pymk.NasaGrootRecommendUserSlideFragment;
import k6a.g;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.growth.home.pymk.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ro5.a;
import oo5.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import uo5.a;
import vna.b;
import k6a.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import vna.n;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uw9.p3;
import android.os.Bundle;
import vna.q;
import com.yxcorp.gifshow.growth.home.pymk.d;
import com.yxcorp.gifshow.growth.home.pymk.RecoUserSlidePlayStatusPresenter;
import com.yxcorp.gifshow.growth.home.pymk.i;
import android.view.View;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import le5.f;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import vna.c;
import msd.q;
import com.yxcorp.gifshow.util.l;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class NasaGrootRecommendUserSlideFragment extends DetailSlidePlayFragment implements g, g	// class@001397
{
    public NasaBizParam F;
    public b G;
    public PublishSubject H;
    public PublishSubject I;
    public PublishSubject J;
    public boolean K;
    public int L;
    public int M;
    public BaseFragment N;
    public PresenterV2 O;
    public boolean P;
    public static final int Q;

    public void NasaGrootRecommendUserSlideFragment(){
       super();
       this.H = PublishSubject.g();
       this.I = PublishSubject.g();
       this.J = PublishSubject.g();
       this.K = false;
       this.L = f.Q;
       this.M = f.R;
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, NasaGrootRecommendUserSlideFragment.class, "11")) {
          return;
       }
       this.mh();
       a.n(this, false);
       a.h(this, false);
       a.c(this.getActivity(), false, 6);
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, NasaGrootRecommendUserSlideFragment.class, "12")) {
          return;
       }
       this.ph();
       a.n(this, true);
       a.h(this, true);
       a.c(this.getActivity(), true, 6);
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, NasaGrootRecommendUserSlideFragment.class, "10")) {
          return;
       }
       this.P = false;
       this.oh();
       NasaGrootRecommendUserSlideFragment tG = this.G;
       if (tG != null) {
          u.j(tG.V1());
       }
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, NasaGrootRecommendUserSlideFragment.class, "9")) {
          return;
       }
       this.P = true;
       this.nh();
       NasaGrootRecommendUserSlideFragment tG = this.G;
       if (tG != null) {
          u.k(tG.V1());
       }
       return;
    }
    public boolean V(){
       return this.P;
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, NasaGrootRecommendUserSlideFragment.class, "8")) {
          return;
       }
       NasaGrootRecommendUserSlideFragment tO = this.O;
       if (tO != null) {
          tO.destroy();
       }
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaGrootRecommendUserSlideFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NasaGrootRecommendUserSlideFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaGrootRecommendUserSlideFragment.class, new n());
       }else {
          obj.put(NasaGrootRecommendUserSlideFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, NasaGrootRecommendUserSlideFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p3.d(this.rh(), false);
    }
    public String getUrl(){
       return "";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaGrootRecommendUserSlideFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, NasaGrootRecommendUserSlideFragment.class, "5") && this.O == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.O = presenterV2;
          presenterV2.U7(new q());
          this.O.U7(new d());
          this.O.U7(new RecoUserSlidePlayStatusPresenter());
          this.O.U7(new i());
          this.O.f(this.requireView());
       }
       if (!PatchProxy.applyVoid(objArray, this, NasaGrootRecommendUserSlideFragment.class, "6") && this.G == null) {
          this.G = new b();
       }
       objArray = new Object[]{this,photoDetailP};
       this.O.i(objArray);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaGrootRecommendUserSlideFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.N = this;
       this.F = a.a(this.ch());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NasaGrootRecommendUserSlideFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       boolean b = false;
       if (this.j == null) {
          this.j = a.c(p0, 0x7f0d107e, p1, b);
       }
       Object[] objArray = null;
       if (!f.b() && !PatchProxy.applyVoid(objArray, this, NasaGrootRecommendUserSlideFragment.class, "7")) {
          this.j.setPadding(b, b, b, c.b(this.getContext().getResources(), R.dimen.arg_RES_7f070bf1));
          l.b(this.j, new c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, NasaGrootRecommendUserSlideFragment.class, "3")) {
          int i = a1.d(0x7f070fdf) + n.A(this.requireContext());
          p2.topMargin = i;
          int i1 = (((n.j(this.requireActivity()) - i) - a1.e(0x41f00000)) - (a1.e(161.00f) + a1.e(49.00f))) - (a1.e(160.00f) - a1.e(36.00f));
          if (i1 < f.R) {
             this.K = true;
             i1 = (((i1 + a1.e(26.00f)) + a1.e(6.00f)) + a1.e(8.00f)) + a1.e(9.00f);
             this.L = (i1 * 3) / 4;
          }
          this.M = i1;
       }
       return this.j;
    }
}
