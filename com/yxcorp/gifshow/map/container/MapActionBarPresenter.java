package com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$mKrnListener$1;
import krb.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import mrd.a;
import xl8.b;
import java.lang.Boolean;
import uw5.b$a;
import uw5.b;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$i;
import uw5.c;
import z1.a;
import fm7.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import g6b.c;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import v5b.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import android.view.View;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import com.yxcorp.gifshow.util.w0;
import v5b.b;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$e;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$f;
import com.kuaishou.krn.event.a;
import oj0.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$g;
import hka.a;
import com.yxcorp.gifshow.map.data.model.RnCityInfo;
import js6.a;
import java.lang.Double;
import wkd.b;
import x5b.a;
import t45.d;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$c;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nearby.common.citymap.NearbyCityNameMapManager;
import com.yxcorp.gifshow.map.search.SearchFragment;
import com.yxcorp.gifshow.map.search.SearchFragment$c;
import java.util.Objects;
import com.yxcorp.gifshow.map.search.SearchFragment$a;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$h;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.map.MapLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.map.map.utils.MapUtils;
import android.widget.Button;
import com.yxcorp.utility.n;
import android.widget.ImageButton;
import k3d.b;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import qrd.l1;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$b;
import v5b.k;
import java.util.Map;
import java.util.HashMap;

public final class MapActionBarPresenter extends PresenterV2 implements g	// class@001c71
{
    public final a A;
    public final d B;
    public final a C;
    public final b D;
    public final a E;
    public final a F;
    public final b G;
    public final a H;
    public final String I;
    public final double J;
    public final double K;
    public String L;
    public final BaseFragment M;
    public View p;
    public View q;
    public ImageButton r;
    public ImageButton s;
    public b t;
    public c u;
    public Button v;
    public boolean w;
    public SearchFragment x;
    public View y;
    public String z;
    public static final MapActionBarPresenter$a N;

    static {
       MapActionBarPresenter.N = new MapActionBarPresenter$a(null);
    }
    public void MapActionBarPresenter(String p0,double p1,double p2,String p3,BaseFragment p4){
       super();
       this.I = p0;
       this.J = p1;
       this.K = p2;
       this.L = p3;
       this.M = p4;
       this.z = "";
       this.A = new MapActionBarPresenter$mKrnListener$1(this);
       d uod = a.b().a(LocalDelegateType.ACTIVITY_LOCAL);
       a.o(uod, "CurrentCityManager.getIn¡­egateType.ACTIVITY_LOCAL\)");
       this.B = uod;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.C = uoa;
       this.D = new b(Boolean.FALSE);
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.E = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.F = uoa;
       b$a uoa1 = new b$a();
       uoa1.b(false);
       b uob = uoa1.a();
       a.o(uob, "RoamPanelConfig.Builder\(¡­owMap\(false\)\n    .build\(\)");
       this.G = uob;
       MapActionBarPresenter$i oi = new MapActionBarPresenter$i(this);
       this.H = oi;
       c uoc = new c();
       uoc.e(3);
       uoc.c(false);
       uoc.d(true);
       this.U7(d.c(oi, uoc));
    }
    public void E8(){
       MapActionBarPresenter tp;
       MapActionBarPresenter mapActionBar = MapActionBarPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mapActionBar, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, mapActionBar, "10")) {
          String str1 = (TextUtils.x(this.I))? a1.p(R.string.arg_RES_7f103c33): this.I;
          str1 = this.X8(str1);
          this.z = str1;
          MapActionBarPresenter tu = this.u;
          if (tu != null) {
             c f = tu.f;
             if (f != null) {
                f.mRealDisplayTitle = str1;
             }
          }
          this.X7(t.timer(500, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new c(this)));
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, mapActionBar, "8")) {
          String str = "rightActionBarContainer";
          if (MapExperimentUtils.g.e()) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             tp.setVisibility(8);
          }else {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             tp.setVisibility(i);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, mapActionBar, "14") && !TextUtils.x(this.I)) {
          CityInfo uCityInfo = new CityInfo();
          uCityInfo.mCityName = this.X8(this.I);
          if (!TextUtils.x(this.L)) {
             uCityInfo.mRoamCityId = this.L;
          }
          MapActionBarPresenter tJ = this.J;
          double d = (double)i;
          if (tJ - d > 0) {
             MapActionBarPresenter tK = this.K;
             if (tK - d > 0) {
                uCityInfo.mLatitude = tJ;
                uCityInfo.mLongitude = tK;
             }
          }
          this.B.b(uCityInfo);
       }
       if (!PatchProxy.applyVoid(objArray, this, mapActionBar, "4")) {
          w0.a(this.s, 0x3f000000);
          m1.a(this.s, new b(this), R.id.search_btn);
       }
       mapActionBar = this.t;
       if (mapActionBar != null) {
          t ot = mapActionBar.c();
          if (ot != null) {
             b uob = ot.subscribe(new MapActionBarPresenter$e(this), Functions.e);
             if (uob != null) {
                this.X7(uob);
             }
          }
       }
       this.X7(this.C.subscribe(new MapActionBarPresenter$f(this)));
       a.b().a("MAP_OPEN_ROAM_PANEL", this.A);
       a.b().a("MAP_OPEN_SEARCH_PANEL", this.A);
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapActionBarPresenter.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.F2(new MapActionBarPresenter$g(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MapActionBarPresenter.class, "17")) {
          return;
       }
       a.b().c("MAP_OPEN_ROAM_PANEL", this.A);
       a.b().c("MAP_OPEN_SEARCH_PANEL", this.A);
       return;
    }
    public final void P8(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MapActionBarPresenter.class, "18")) {
          return;
       }
       a.b.GO("MAP_CHANGE_CITY", new RnCityInfo(p0, p1, p2));
       return;
    }
    public final void R8(double p0,double p1,boolean p2){
       if (PatchProxy.isSupport(MapActionBarPresenter.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), Double.valueOf(p1), Boolean.valueOf(p2), this, MapActionBarPresenter.class, "16")) {
          return;
       }
       this.X7(b.a(0x42d90323).a(p0, p1).observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new MapActionBarPresenter$c(this, p2), MapActionBarPresenter$d.b));
       return;
    }
    public final d S8(){
       return this.B;
    }
    public final a V8(){
       return this.C;
    }
    public final b W8(){
       return this.D;
    }
    public final String X8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MapActionBarPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0) || a.g("NULL", p0)) {
          p0 = a1.p(R.string.arg_RES_7f103c33);
          a.o(p0, "CommonUtil.string\(R.string.photo_map_select_city\)");
       }else {
          a.m(p0);
          p0 = NearbyCityNameMapManager.c.b(p0);
       }
       return p0;
    }
    public final void Y8(){
       c childFragmen;
       MapActionBarPresenter tx;
       MapCenterInfo mAddress;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapActionBarPresenter.class, "5")) {
          return;
       }
       SearchFragment$a r = SearchFragment.r;
       SearchFragment$c uoc = new SearchFragment$c(this.u, this.z);
       Objects.requireNonNull(r);
       SearchFragment searchFragme = PatchProxy.applyOneRefs(uoc, r, SearchFragment$a.class, "1");
       if (searchFragme != PatchProxyResult.class) {
       }else {
          a.p(uoc, "searchParams");
          searchFragme = new SearchFragment();
          searchFragme.o = uoc;
       }
       this.x = searchFragme;
       if (searchFragme != null) {
          searchFragme.n = new MapActionBarPresenter$h(this);
       }
       MapActionBarPresenter tM = this.M;
       if (tM != null) {
          childFragmen = tM.getChildFragmentManager();
          if (childFragmen != null) {
             e uoe = childFragmen.beginTransaction();
             if (uoe != null) {
                tx = this.x;
                a.m(tx);
                uoe.v(R.id.history_container, tx);
                uoe.n();
             }
          }
       }
       tM = this.u;
       if (tM != null) {
          tM.b(true);
       }
       tM = this.u;
       if (tM != null) {
          childFragmen = tM.f;
          if (childFragmen != null) {
             mAddress = childFragmen.mAddress;
          label_0072 :
             tx = this.M;
             if (!PatchProxy.applyVoidTwoRefs(mAddress, tx, objArray, MapLogger.class, "29")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MAP_SEARCH";
                i3 oi3 = i3.f();
                MapLocationAddressResponse$LocationAddress mCity = (mAddress != null)? mAddress.mCity: objArray;
                oi3.d("city_name", mCity);
                if (mAddress != null) {
                   objArray = mAddress.mProvince;
                }
                oi3.d("provice_name", objArray);
                uElementPack.params = oi3.e();
                u1.B(new ClickMetaData().setLogPage(tx).setType(true).setDirection(0).setElementPackage(uElementPack).setIsRealTime(0));
             }
             return;
          }
       }
       mAddress = objArray;
       goto label_0072 ;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, MapActionBarPresenter.class, "11")) {
          return;
       }
       if (MapExperimentUtils.g.e()) {
          return;
       }
       if (MapUtils.a.b()) {
          Button uButton = m1.f(this.m8(), R.id.btn_mylocation);
          this.v = uButton;
          View[] viewArray = new View[]{uButton};
          n.Z(0, viewArray);
       }
       return;
    }
    public void doBindView(View p0){
       MapActionBarPresenter mapActionBar = MapActionBarPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mapActionBar, "3")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.status_bar_padding_view);
       a.o(view, "ViewBindUtils.bindWidget¡­.status_bar_padding_view\)");
       this.q = view;
       this.r = m1.f(p0, 0x7f0a2a72);
       this.s = m1.f(p0, 0x7f0a376a);
       View view1 = m1.f(p0, R.id.actionbar_right_layout);
       a.o(view1, "ViewBindUtils.bindWidget¡­d.actionbar_right_layout\)");
       this.p = view1;
       p0 = m1.f(p0, R.id.title_root);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.title_root\)");
       this.y = p0;
       if (!PatchProxy.applyVoid(null, this, mapActionBar, "6")) {
          float f = 0;
          View[] viewArray = new View[1];
          int i = 0;
          MapActionBarPresenter tq = this.q;
          if (tq == null) {
             a.S("mStatusBarView");
          }
          viewArray[i] = tq;
          b.a(f, viewArray);
          MapActionBarPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S("mStatusBarView");
          }
          mapActionBar = this.q;
          if (mapActionBar == null) {
             a.S("mStatusBarView");
          }
          ViewGroup$LayoutParams layoutParams = mapActionBar.getLayoutParams();
          Context context = this.getContext();
          a.m(context);
          layoutParams.height = n.A(context);
          tq1.setLayoutParams(layoutParams);
       }
       m1.a(this.r, new MapActionBarPresenter$b(this), R.id.map_contianer_back_btn);
       w0.a(this.r, 0x3f000000);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MapActionBarPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MapActionBarPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MapActionBarPresenter.class, new k());
       }else {
          obj.put(MapActionBarPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MapActionBarPresenter.class, "1")) {
          return;
       }
       this.t = this.r8("PHOTO_MAP_MAP_TITLE_UPDATE");
       this.u = this.r8("PHOTO_MAP_MAP_PAGE_STATE");
       return;
    }
}
