package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailFragment;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import p6a.d;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import le5.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import android.view.View;
import androidx.fragment.app.Fragment;
import im8.c;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;

public class RelaxTimeDetailFragment extends DetailSlidePlayFragment implements g	// class@0017a8
{
    public PresenterV2 F;
    public BaseFragment G;
    public NasaBizParam H;

    public void RelaxTimeDetailFragment(){
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailFragment.class, "7")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "7");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailFragment.class, "9")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "9");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailFragment.class, "8")) {
          return;
       }
       this.oh();
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "8");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailFragment.class, "6")) {
          return;
       }
       this.nh();
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "6");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, RelaxTimeDetailFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "10");
          return new d();
       }else {
          PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "10");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, RelaxTimeDetailFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(RelaxTimeDetailFragment.class, new d());
       }else {
          obj.put(RelaxTimeDetailFragment.class, null);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "11");
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RelaxTimeDetailFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "3");
          return;
       }else {
          String str = "4";
          if (!PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailFragment.class, str)) {
             if (this.F != null) {
                PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, str);
             }else {
                PresenterV2 presenterV2 = new PresenterV2();
                this.F = presenterV2;
                presenterV2.U7(new RelaxTimeDetailPresenter());
                if (f.g() || f.m(this.x)) {
                   this.F.U7(new CountdownToAutoPlayPresenter());
                }
                this.F.f(this.requireView());
                PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, str);
             }
          }
          Object[] objArray = new Object[]{this,photoDetailP,new c("FRAGMENT", this)};
          this.F.i(objArray);
          PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "3");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RelaxTimeDetailFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.G = this;
       this.H = a.a(this.ch());
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, RelaxTimeDetailFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          this.j = a.c(p0, 0x7f0d107f, p1, false);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "2");
       return this.j;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       RelaxTimeDetailFragment tF = this.F;
       if (tF != null) {
          tF.destroy();
          this.F = null;
       }
       PatchProxy.onMethodExit(RelaxTimeDetailFragment.class, "5");
       return;
    }
}
