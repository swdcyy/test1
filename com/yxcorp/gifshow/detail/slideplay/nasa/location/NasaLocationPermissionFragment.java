package com.yxcorp.gifshow.detail.slideplay.nasa.location.NasaLocationPermissionFragment;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import j6a.g;
import java.util.Map;
import java.util.HashMap;
import uw9.p3;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import x1a.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import wh5.c;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import x1a.a;
import android.os.Bundle;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import android.view.View;
import androidx.fragment.app.Fragment;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import android.content.Context;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import j6a.c;
import msd.q;
import com.yxcorp.gifshow.util.l;

public class NasaLocationPermissionFragment extends DetailSlidePlayFragment implements g	// class@00174f
{
    public NasaBizParam F;
    public BaseFragment G;
    public PresenterV2 H;
    public static final int I;

    public void NasaLocationPermissionFragment(){
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaLocationPermissionFragment.class, "10")) {
          return;
       }
       this.mh();
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "10");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaLocationPermissionFragment.class, "11")) {
          return;
       }
       this.ph();
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "11");
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaLocationPermissionFragment.class, "9")) {
          return;
       }
       this.oh();
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "9");
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaLocationPermissionFragment.class, "8")) {
          return;
       }
       this.nh();
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "8");
       return;
    }
    public void d0(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaLocationPermissionFragment.class, "7")) {
          return;
       }
       NasaLocationPermissionFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
       }
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "7");
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaLocationPermissionFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "13");
          return new g();
       }else {
          PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "13");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaLocationPermissionFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaLocationPermissionFragment.class, new g());
       }else {
          obj.put(NasaLocationPermissionFragment.class, null);
       }
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "14");
       return obj;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DetailSlidePlayFragment obj = PatchProxy.applyWithListener(objArray, this, NasaLocationPermissionFragment.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.x;
       String str = PatchProxy.applyOneRefs(obj, objArray, p3.class, "8");
       if (str != patchProxyRe) {
       }else {
          a$a uoa = new a$a();
          uoa.h((obj.mPhoto.getPosition() + 1));
          uoa.c(c.b());
          uoa.b(e.d().getParamType());
          uoa.e(p3.c());
          uoa.g(obj.getDetailLogParam().getPageUrlParamMap());
          str = uoa.a().toString();
       }
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "12");
       return str;
    }
    public String getUrl(){
       return "";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaLocationPermissionFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "5");
          return;
       }else {
          String str = "6";
          if (!PatchProxy.applyVoidWithListener(null, this, NasaLocationPermissionFragment.class, str)) {
             if (this.H != null) {
                PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, str);
             }else {
                PresenterV2 presenterV2 = new PresenterV2();
                this.H = presenterV2;
                presenterV2.U7(new LocationPermissionCardPresenter());
                this.H.f(this.requireView());
                PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, str);
             }
          }
          Object[] objArray = new Object[]{this,photoDetailP};
          this.H.i(objArray);
          PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "5");
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaLocationPermissionFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.G = this;
       this.F = a.a(this.ch());
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i1;
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, NasaLocationPermissionFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          this.j = a.c(p0, 0x7f0d1075, p1, false);
       }
       String str = "3";
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, this, NasaLocationPermissionFragment.class, str)) {
          int i = n.j(this.requireActivity());
          if (i <= 0) {
             i = n.t(this.requireActivity());
             i1 = (i.c())? 0: n.A(this.requireContext());
             i = i - i1;
          }
          i1 = a1.d(0x7f070fdf) + n.A(this.requireContext());
          View view = this.j.findViewById(R.id.location_permission_title);
          View view1 = this.j.findViewById(R.id.location_permission_card);
          i = (((i - i1) - (a1.d(0x7f070bf1) + a1.d(0x7f070319))) - ((view.getHeight() + view1.getHeight()) + a1.d(0x7f0702ef))) / 2;
          ConstraintLayout$LayoutParams layoutParams = view.getLayoutParams();
          layoutParams.topMargin = i1 + i;
          view.setLayoutParams(layoutParams);
          ConstraintLayout$LayoutParams layoutParams1 = view1.getLayoutParams();
          layoutParams1.bottomMargin = i;
          view1.setLayoutParams(layoutParams1);
          PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, str);
       }
       str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, this, NasaLocationPermissionFragment.class, str)) {
          this.j.setPadding(false, false, false, a1.d(R.dimen.arg_RES_7f070bf1));
          l.b(this.j, new c(this));
          PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, str);
       }
       PatchProxy.onMethodExit(NasaLocationPermissionFragment.class, "2");
       return this.j;
    }
}
