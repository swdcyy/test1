package com.yxcorp.gifshow.map.container.PhotoMapContainerFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j6b.a;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import j6b.v;
import j6b.r;
import u5b.d;
import android.os.Bundle;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import vrb.a;
import com.kwai.nearby.startup.local.model.NearbyMapConfig;
import b6b.q;
import java.lang.Float;
import u5b.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import g6b.b;
import java.util.Map;
import k6b.b;
import java.lang.Boolean;
import k2b.k2;
import k2b.u1;
import v5b.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import k6b.g;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import rvb.k;
import rvb.k$a;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import rvb.b;
import rvb.n;
import rvb.g$b;
import rvb.f;
import rvb.c;
import b6b.r;
import i2b.a;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import g6b.c;
import f07.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.map.map.utils.MapUtils;
import lnc.a1;
import com.kwai.framework.location.k;
import lnc.g2;
import im8.c;

public final class PhotoMapContainerFragment extends BaseFragment implements g2$a	// class@001c72
{
    public int A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public l H;
    public g2 j;
    public l k;
    public String l;
    public double m;
    public double n;
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public String v;
    public String w;
    public float x;
    public int y;
    public String z;

    public void PhotoMapContainerFragment(){
       super(null, null, null, null, 15, null);
       this.l = "";
       this.o = "";
       this.p = "";
       this.q = "";
       this.r = "";
       this.v = "";
       this.w = "";
       this.z = "";
       this.C = "";
       this.D = "";
       this.E = "";
       this.F = "";
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhotoMapContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new MapBottomFeedPresenter());
       MapExperimentUtils g = MapExperimentUtils.g;
       if (g.b() || g.f()) {
          obj.U7(new MomentContainerControlPresenter());
       }
       MapActionBarPresenter mapActionBar = new MapActionBarPresenter(this.l, this.n, this.m, this.q, this);
       obj.U7(g);
       obj.U7(new v(this));
       obj.U7(new r());
       PatchProxy.onMethodExit(PhotoMapContainerFragment.class, "9");
       return obj;
    }
    public int M(){
       return 1;
    }
    public int f(){
       return 297;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PhotoMapContainerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d();
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, PhotoMapContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.c();
    }
    public void onCreate(Bundle p0){
       q d;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMapContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       PluginDownloadExtension.k.s("map_sdk_plugin", 30);
       String str = "2";
       boolean b = false;
       d uod = null;
       if (!PatchProxy.applyVoid(null, this, PhotoMapContainerFragment.class, str)) {
          a b1 = a.b;
          NearbyMapConfig mMapDefaultL = b1.b().mMapDefaultLevel;
          NearbyMapConfig mMapMaxLevel = b1.b().mMapMaxLevel;
          d = q.d;
          float f = (mMapDefaultL != null)? mMapDefaultL.floatValue(): 0;
          d.d(f);
          f = (mMapMaxLevel != null)? mMapMaxLevel.floatValue(): 0;
          q oq = q.class;
          if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), d, oq, str)) {
             q.a = d.a(f);
          }
          Object[] objArray = new Object[b];
          a.c.w("PhotoMapContainerFragment", "¡¾setMapConfig¡¿ mapDefaultLevel = "+mMapDefaultL+" £¬mapMaxLevel = "+mMapMaxLevel, objArray);
       }
       str = "pageSource";
       if (!PatchProxy.applyVoid(null, this, PhotoMapContainerFragment.class, "10")) {
          p0 = this.getArguments();
          if (p0 != null) {
             this.n = p0.getDouble("latitude", 0);
             this.m = p0.getDouble("longitude", 0);
             String str1 = p0.getString("defaultTitle", "");
             a.o(str1, "it.getString\(PhotoMapActivity.DEFAULT_TITLE, \"\"\)");
             this.l = str1;
             str1 = p0.getString("city", "");
             a.o(str1, "it.getString\(PhotoMapActivity.CITY, \"\"\)");
             this.o = str1;
             str1 = p0.getString("roamCityId", "");
             a.o(str1, "it.getString\(PhotoMapActivity.ROAM_CITY_ID, \"\"\)");
             this.q = str1;
             str1 = p0.getString("mapEnterSource", "");
             a.o(str1, "it.getString\(PhotoMapAct¡­ity.MAP_ENTER_SOURCE, \"\"\)");
             this.p = str1;
             str1 = p0.getString("province", "");
             a.o(str1, "it.getString\(PhotoMapActivity.PROVINCE, \"\"\)");
             this.r = str1;
             this.s = p0.getBoolean("isLocator", b);
             this.t = p0.getBoolean("isLocationWhenAuthorized", b);
             this.u = p0.getBoolean("roleDisable", b);
             str1 = p0.getString("feedId", "");
             a.o(str1, "it.getString\(PhotoMapActivity.FEED_ID, \"\"\)");
             this.v = str1;
             str1 = p0.getString("feedType", "");
             a.o(str1, "it.getString\(PhotoMapActivity.FEED_TYPE, \"\"\)");
             this.w = str1;
             this.y = p0.getInt("fromSource", b);
             str1 = p0.getString(str, "");
             a.o(str1, "it.getString\(PhotoMapActivity.PAGE_SOURCE, \"\"\)");
             this.z = str1;
             this.A = p0.getInt("innerLocationSourceType", b);
             this.B = p0.getBoolean("distanceTagAnnotationed", b);
             str1 = p0.getString("momentUserId", "");
             a.o(str1, "it.getString\(PhotoMapActivity.MOMENT_USER_ID, \"\"\)");
             this.C = str1;
             str1 = p0.getString("extlistUserId", "");
             a.o(str1, "it.getString\(PhotoMapAct¡­ity.EXT_LIST_USER_ID, \"\"\)");
             this.D = str1;
             str1 = p0.getString("chatroomUserId", "");
             a.o(str1, "it.getString\(PhotoMapAct¡­ty.CHAT_ROOM_USER_ID, \"\"\)");
             this.E = str1;
             String str2 = p0.getString("momentUserType", "");
             a.o(str2, "it.getString\(PhotoMapAct¡­ity.MOMENT_USER_TYPE, \"\"\)");
             this.F = str2;
             this.G = p0.getBoolean("showMomentList", b);
             float floatx = p0.getFloat("firstLevel", uod);
             if (!PatchProxy.isSupport(PhotoMapContainerFragment.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(floatx), this, PhotoMapContainerFragment.class, "11")) {
                Float uFloat = b.b(b.b.b());
                floatx = (uFloat != null)? uFloat.floatValue(): q.d.a(floatx);
                this.x = floatx;
             }
          }
       }
       PhotoMapContainerFragment to = this.o;
       PhotoMapContainerFragment tr = this.r;
       PhotoMapContainerFragment tz = this.z;
       b = true;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(to, tr, tz, Boolean.valueOf(b), null, d.class, "3")) {
          a.p(to, "cityName");
          a.p(tr, "proviceName");
          a.p(tz, str);
          d.b = "city_name="+to+"&provice_name="+tr+"&page_source="+tz;
          k2 ok2 = u1.j();
          a.o(ok2, "Logger.getCurrentPage\(\)");
          ok2.x(d.b);
       }
       if (!PatchProxy.applyVoid(null, this, PhotoMapContainerFragment.class, "8")) {
          this.k = new l();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       g og = g.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoMapContainerFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       p2 = null;
       if (!PatchProxy.applyVoidOneRefs(this, p2, og, "1")) {
          a.p(this, "owner");
          if (LocalConfigKeyHelper.b()) {
             n.f(k.f, this, p2, 4, p2).f(g$b.a);
          }
       }
       if (!PatchProxy.applyVoid(p2, p2, og, "5") && LocalConfigKeyHelper.b()) {
          n.f(k.f, p2, p2, 6, p2).f(r.b);
       }
       return a.g(p0, 0x7f0d04fb, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       PhotoMapContainerFragment tH;
       boolean b;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoMapContainerFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.H = new l();
       MapLocationAddressResponse$LocationAddress locationAddr = new MapLocationAddressResponse$LocationAddress();
       locationAddr.mCity = this.o;
       locationAddr.mProvince = this.r;
       MapCenterInfo mapCenterInf = new MapCenterInfo();
       mapCenterInf.mAddress = locationAddr;
       mapCenterInf.mIsLocationWhenAuthorized = this.t;
       q d = q.d;
       d.e(this.x);
       Object obj = null;
       PhotoMapContainerFragment photoMapCont = null;
       if (this.n - photoMapCont && this.m - photoMapCont) {
          tH = this.H;
          if (tH == null) {
             a.S("mPhotoMapContainerCallerContext");
          }
          tH.a().k = new b(this.n, this.m);
          tH = this.x;
          if (tH - (float)0 <= 0) {
             float f = d.b();
          }
          mapCenterInf.mOriginalCenterLatLng = new b(this.n, this.m);
          Boolean uBoolean = Boolean.valueOf(this.u);
          Object obj1 = PatchProxy.applyOneRefs(uBoolean, obj, a.class, "1");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(a.a.mEnableShowUserRole != null && (a.g(uBoolean, Boolean.TRUE) ^ 1)){
             b = true;
          }else {
             b = false;
          }
          if (b && !TextUtils.x(this.v)) {
             this.m = this.m + ((MapUtils.a.e(13.00f, tH) * 0x3fc540789613d31c) / (double)4);
          }
          mapCenterInf.mCurrentCenterLatLng = new b(this.n, this.m);
          str = (TextUtils.x(this.l))? a1.p(R.string.arg_RES_7f103c33): this.l;
          mapCenterInf.mDefaultTitle = str;
          mapCenterInf.mMapZoomLevel = tH;
       }else {
          mapCenterInf.mCurrentCenterLatLng = new b(0x404145fd7a13c255, 0x405b3bdf0d413123);
          str = (TextUtils.x(this.l))? a1.p(R.string.arg_RES_7f103c33): this.l;
          mapCenterInf.mDefaultTitle = str;
          mapCenterInf.mMapZoomLevel = 5.00f;
          mapCenterInf.mIsRequestIpLocation = true;
       }
       if (this.s != null) {
          mapCenterInf.mIsLocation = (k.c("default"))? this.s: true;
       }
    label_0124 :
       mapCenterInf.mMapEnterSource = this.p;
       PhotoMapContainerFragment tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.f = mapCenterInf;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.h = this.v;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.i = this.w;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.j = this.y;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.m = this.A;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.n = this.B;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.o = this.u;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.q = this.C;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.r = this.E;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.s = this.D;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.p = this.F;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.t = this.G;
       tH1 = this.H;
       if (tH1 == null) {
          a.S("mPhotoMapContainerCallerContext");
       }
       tH1.u = this.q;
       if (!PatchProxy.applyVoid(obj, this, PhotoMapContainerFragment.class, "7")) {
          if (this.j == null) {
             this.j = new g2(this, this);
          }
          tH1 = this.j;
          if (tH1 != null) {
             Object[] objArray = new Object[3];
             objArray[0] = this;
             tH = this.H;
             if (tH == null) {
                a.S("mPhotoMapContainerCallerContext");
             }
             objArray[1] = tH;
             objArray[2] = new c("FRAGMENT", this);
             tH1.b(objArray);
          }
       }
       return;
    }
}
