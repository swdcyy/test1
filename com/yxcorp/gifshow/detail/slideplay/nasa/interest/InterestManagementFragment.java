package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementFragment;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import i6a.j;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i6a.q;
import i6a.f;
import le5.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import im8.c;
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
import ekd.i;
import com.yxcorp.utility.n;
import lnc.a1;
import com.yxcorp.gifshow.nasa.NasaSlideParam;

public class InterestManagementFragment extends DetailSlidePlayFragment implements g	// class@00173e
{
    public NasaBizParam F;
    public PresenterV2 G;

    public void InterestManagementFragment(){
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, InterestManagementFragment.class, "8")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(InterestManagementFragment.class, "8");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, InterestManagementFragment.class, "10")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(InterestManagementFragment.class, "10");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, InterestManagementFragment.class, "9")) {
          return;
       }
       this.oh();
       PatchProxy.onMethodExit(InterestManagementFragment.class, "9");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, InterestManagementFragment.class, "7")) {
          return;
       }
       this.nh();
       PatchProxy.onMethodExit(InterestManagementFragment.class, "7");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, InterestManagementFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(InterestManagementFragment.class, "11");
          return new j();
       }else {
          PatchProxy.onMethodExit(InterestManagementFragment.class, "11");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, InterestManagementFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(InterestManagementFragment.class, new j());
       }else {
          obj.put(InterestManagementFragment.class, null);
       }
       PatchProxy.onMethodExit(InterestManagementFragment.class, "12");
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestManagementFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       DetailSlidePlayFragment tx = this.x;
       if (tx == null || tx.mPhoto == null) {
          PatchProxy.onMethodExit(InterestManagementFragment.class, "4");
          return;
       }else {
          View view = this.requireView();
          if (!PatchProxy.applyVoidOneRefsWithListener(view, this, InterestManagementFragment.class, "5")) {
             InterestManagementFragment$a uoa = new InterestManagementFragment$a();
             PresenterV2 presenterV2 = new PresenterV2();
             this.G = presenterV2;
             presenterV2.U7(new q());
             this.G.U7(new f());
             if (f.g() || f.m(this.x)) {
                this.G.U7(new CountdownToAutoPlayPresenter());
             }
             this.G.f(view);
             Object[] objArray = new Object[]{this.x,new c("FRAGMENT", this),uoa};
             this.G.i(objArray);
             PatchProxy.onMethodExit(InterestManagementFragment.class, "5");
          }
          PatchProxy.onMethodExit(InterestManagementFragment.class, "4");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestManagementFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = a.a(this.ch());
       PatchProxy.onMethodExit(InterestManagementFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, InterestManagementFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          i = 0x7f0d1071;
          this.j = (SlidePerformanceExp.g())? new AX2C(p0.getContext()).inflateSync(i, p1, false): a.g(p0, i, p1, false);
       }
    label_003a :
       GrootBaseFragment tj = this.j;
       String str = "3";
       if (!PatchProxy.applyVoidOneRefsWithListener(tj, this, InterestManagementFragment.class, str)) {
          int i1 = (i.c())? n.A(this.getContext()): 0;
          i1 = i1 + a1.d(0x7f07030d);
          i = (!f.b() || (!this.F.getNasaSlideParam().isHomePage() && !this.F.getNasaSlideParam().isTrendingPage()))? a1.d(R.dimen.arg_RES_7f070bf1): 0;
          tj.setPadding(false, i1, false, i);
          PatchProxy.onMethodExit(InterestManagementFragment.class, str);
       }
       PatchProxy.onMethodExit(InterestManagementFragment.class, "2");
       return this.j;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoidWithListener(null, this, InterestManagementFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       InterestManagementFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
          this.G = null;
       }
       PatchProxy.onMethodExit(InterestManagementFragment.class, "6");
       return;
    }
}