package com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserFragment;
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
import g6a.r;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uw9.p3;
import android.os.Bundle;
import k6a.t;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kuaishou.ax2c.AX2C;
import android.content.Context;
import i2b.a;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import lnc.a1;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import g6a.j;
import msd.q;
import com.yxcorp.gifshow.util.l;

public class NasaGrootRecommendUserFragment extends DetailSlidePlayFragment implements g, g	// class@001725
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

    public void NasaGrootRecommendUserFragment(){
       super();
       this.I = PublishSubject.g();
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserFragment.class, "12")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "12");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserFragment.class, "13")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "13");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserFragment.class, "11")) {
          return;
       }
       this.M = false;
       this.oh();
       NasaGrootRecommendUserFragment tG = this.G;
       if (tG != null) {
          u.j(tG.V1());
       }
       tG = this.H;
       if (tG != null) {
          tG.c();
          this.requireActivity().l3(this.H);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "11");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserFragment.class, "10")) {
          return;
       }
       this.M = true;
       this.nh();
       NasaGrootRecommendUserFragment tG = this.G;
       if (tG != null) {
          u.k(tG.V1());
       }
       if (this.H != null) {
          this.requireActivity().F2(this.H);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "10");
       return;
    }
    public boolean V(){
       return this.M;
    }
    public void d0(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserFragment.class, "9")) {
          return;
       }
       NasaGrootRecommendUserFragment tL = this.L;
       if (tL != null) {
          tL.destroy();
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "9");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootRecommendUserFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "15");
          return new r();
       }else {
          PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "15");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootRecommendUserFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaGrootRecommendUserFragment.class, new r());
       }else {
          obj.put(NasaGrootRecommendUserFragment.class, null);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "16");
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getPageParams(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootRecommendUserFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "14");
       return p3.d(this.rh(), false);
    }
    public String getUrl(){
       return "";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootRecommendUserFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "4");
          return;
       }else {
          String str = "6";
          Object[] objArray = null;
          if (!PatchProxy.applyVoidWithListener(objArray, this, NasaGrootRecommendUserFragment.class, str)) {
             if (this.L != null) {
                PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, str);
             }else {
                PresenterV2 presenterV2 = new PresenterV2();
                this.L = presenterV2;
                presenterV2.U7(new t());
                this.L.U7(new i());
                this.L.f(this.requireView());
                PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, str);
             }
          }
          str = "7";
          if (!PatchProxy.applyVoidWithListener(objArray, this, NasaGrootRecommendUserFragment.class, str)) {
             if (this.G == null) {
                this.G = new c(this.J);
             }
             PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, str);
          }
          str = "5";
          if (!PatchProxy.applyVoidOneRefsWithListener(photoDetailP, this, NasaGrootRecommendUserFragment.class, str)) {
             if (this.H == null) {
                this.H = new e(this, this.G);
             }
             this.H.d(photoDetailP.mPhoto);
             PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, str);
          }
          Object[] objArray1 = new Object[]{this,photoDetailP};
          this.L.i(objArray1);
          PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "4");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootRecommendUserFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.K = this;
       this.F = a.a(this.ch());
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int this;
       String str;
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, NasaGrootRecommendUserFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          this = 0x7f0d107a;
          this.j = (SlidePerformanceExp.g())? new AX2C(p0.getContext()).inflateSync(this, p1, false): a.g(p0, this, p1, false);
          str = "3";
          p0 = PatchProxy.applyWithListener(null, this, NasaGrootRecommendUserFragment.class, str);
          if (p0 != patchProxyRe) {
             i = p0.intValue();
          }else {
             i = n.j(this.requireActivity());
             if (i <= 0) {
                i = n.t(this.requireActivity());
                i1 = (i.c())? 0: n.A(this.requireContext());
                i = i - i1;
             }
             i1 = (a1.d(0x7f070fdf) + n.A(this.requireContext())) + a1.e(24.00f);
             int i2 = a1.e(68.00f);
             this.j.findViewById(0x7f0a3498).getLayoutParams().topMargin = i1;
             this.j.findViewById(0x7f0a348f).getLayoutParams().bottomMargin = i2;
             i = ((i - c.b(this.requireContext().getResources(), 0x7f070bf1)) - i1) - i2;
             i1 = a1.e(148.00f);
             i2 = a1.e(0x42f80000);
             this = a1.e(16.00f);
             int i3 = 3;
             while (true) {
                int i4 = i1 * i3;
                int i5 = i3 - 1;
                int i6 = i5 * this;
                i4 = i4 + i6;
                i4 = i4 + i2;
                if (i4 > i) {
                   if (i5 == 1) {
                      i = i5;
                   label_00e6 :
                      View view = this.j.findViewById(R.id.recycler_view);
                      i1 = (i1 * i) + (this * (i - 1));
                      view.getLayoutParams().L = i1;
                      view.setMinimumHeight(i1);
                      PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, str);
                   }else {
                      i3 = i5;
                   }
                }else {
                   i = i3;
                   goto label_00e6 ;
                }
             }
          }
          this.J = i;
       }
       str = "8";
       if (!PatchProxy.applyVoidWithListener(null, this, NasaGrootRecommendUserFragment.class, str)) {
          this.j.setPadding(false, false, false, c.b(this.getContext().getResources(), R.dimen.arg_RES_7f070bf1));
          l.b(this.j, new j(this));
          PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, str);
       }
       PatchProxy.onMethodExit(NasaGrootRecommendUserFragment.class, "2");
       return this.j;
    }
}
