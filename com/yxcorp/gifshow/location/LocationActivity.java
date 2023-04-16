package com.yxcorp.gifshow.location.LocationActivity;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.location.LocationFragment;
import com.yxcorp.gifshow.location.LocationActivity$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.feature.component.searchhistory.SearchLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.RelativeLayout;
import j2b.a;
import android.view.View$OnClickListener;
import j2b.b;
import android.widget.LinearLayout;
import j2b.c;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.Window;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.location.LocationActivity$b;
import com.yxcorp.gifshow.location.a;
import java.io.Serializable;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.mix.Location;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import j2b.f;
import j2b.t;
import j2b.s;
import j2b.e;
import j2b.g;
import com.kwai.feature.component.searchhistory.SearchLayout$e;
import ty5.d;
import j2b.h;
import android.view.View$OnLayoutChangeListener;
import ow8.c;
import cx8.a;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import f66.i;
import jq.a;
import q87.c;
import android.content.SharedPreferences;
import oe6.n;
import com.yxcorp.gifshow.util.PostUtils;
import android.net.Uri;
import kotlin.jvm.internal.a;
import lnc.b7;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Set;
import ekd.x0;
import trd.d1;
import java.util.Iterator;
import com.kuaishou.krn.model.LaunchModel;
import js6.a;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.kuaishou.krn.event.a;
import j2b.d;
import oj0.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.text.TextPaint;
import lnc.a1;

public class LocationActivity extends GifshowActivity implements d	// class@001ad7
{
    public TextView A;
    public SearchLayout B;
    public LinearLayout C;
    public ImageView D;
    public TextView E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public String J;
    public String K;
    public String L;
    public Location M;
    public String N;
    public final LocationFragment O;
    public KwaiRnFragment P;
    public ViewGroup Q;
    public ViewGroup R;
    public TextView S;
    public TextView T;
    public View U;
    public View V;
    public ViewGroup W;
    public d X;
    public RelativeLayout y;
    public ViewGroup z;
    public static final int Y;

    public void LocationActivity(){
       super();
       this.G = n.c(a.a().a(), 100.00f);
       this.H = false;
       this.I = false;
       this.J = null;
       this.O = new LocationFragment();
       this.X = new LocationActivity$a(this);
    }
    public int M(){
       return 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationActivity.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a37a6);
       this.z = m1.f(p0, 0x7f0a0ed7);
       this.A = m1.f(p0, 0x7f0a4141);
       this.y = m1.f(p0, 0x7f0a3698);
       this.Q = m1.f(p0, 0x7f0a0931);
       this.R = m1.f(p0, 0x7f0a314d);
       TextView textView = m1.f(p0, R.id.title_location);
       this.S = textView;
       textView.setOnClickListener(new a(this));
       this.U = m1.f(p0, 0x7f0a3f5b);
       textView = m1.f(p0, R.id.title_poi);
       this.T = textView;
       textView.setOnClickListener(new b(this));
       this.V = m1.f(p0, 0x7f0a3f66);
       this.W = m1.f(p0, 0x7f0a3160);
       LinearLayout linearLayout = m1.f(p0, R.id.ll_location_switch);
       this.C = linearLayout;
       linearLayout.setOnClickListener(new c(this));
       this.D = m1.f(p0, 0x7f0a154d);
       this.E = m1.f(p0, 0x7f0a41c6);
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, LocationActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+j0.f(this.getIntent(), "photo_task_id");
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LocationActivity.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://location";
    }
    public String o(){
       return "POST_SELECT_LOCATION";
    }
    public void onCreate(Bundle p0){
       LocationActivity locationActi = LocationActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, locationActi, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       this.setContentView(R.layout.arg_RES_7f0d0eae);
       this.doBindView(this.getWindow().getDecorView());
       KwaiActionBar kwaiActionBa = this.findViewById(R.id.title_root);
       String str = j0.f(this.getIntent(), "page_title");
       this.N = j0.f(this.getIntent(), "photo_id");
       if (TextUtils.x(str)) {
          this.S.setText(R.string.arg_RES_7f10476a);
       }else {
          this.S.setText(str);
       }
       this.T.setText(R.string.arg_RES_7f1047e4);
       kwaiActionBa.j(j.n(this, R.drawable.arg_RES_7f0824a7, 0x7f060148));
       kwaiActionBa.m(-1);
       Bundle uBundle = new Bundle();
       boolean b = j0.a(this.getIntent(), "show_none", true);
       uBundle.putBoolean("show_none", b);
       uBundle.putString("location_ext_params", j0.f(this.getIntent(), "location_ext_params"));
       String str1 = "photo_task_id";
       uBundle.putString(str1, j0.f(this.getIntent(), str1));
       if (!b) {
          kwaiActionBa.i(R.drawable.common_nav_close_black);
          kwaiActionBa.getLeftButton().setOnClickListener(new LocationActivity$b(this));
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, locationActi, "9")) {
          String str3 = this.u3();
          if (!TextUtils.x(str3)) {
             this.x3(str3);
             this.O.Jh(str3);
          }
          this.A.setOnClickListener(new a(this));
       }
       String str2 = "MEDIA_LOCATION_LIST";
       if (j0.e(this.getIntent(), str2) != null) {
          this.J = a.a.q(j0.e(this.getIntent(), str2));
          this.H = true;
          this.I = true;
       }
       if (this.I != null) {
          this.O.G = this.J;
       }
       this.O.setArguments(uBundle);
       this.M = j0.e(this.getIntent(), "location");
       if (!PatchProxy.applyVoid(objArray, this, locationActi, "15")) {
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.w(R.id.container_layout, this.O, this.O.getClass().getSimpleName());
          uoe.m();
       }
       if (!PatchProxy.applyVoid(objArray, this, locationActi, "4")) {
          s.e(this, new f(this));
       }
       this.O.R = new e(this);
       if (!PatchProxy.applyVoid(objArray, this, locationActi, "8")) {
          this.B.setSearchHint(this.getString(R.string.arg_RES_7f100f55));
          this.B.setSearchHistoryFragmentCreator(new g(this));
          this.B.setSearchListener(this.X);
          this.B.setNeedCloseHistoryPanelWhenIsEmpty(true);
          this.B.setSearchHint(R.string.search_hint_nearby_poi);
          this.y.addOnLayoutChangeListener(new h(this));
          if (c.t()) {
             this.W.setVisibility(0);
          }else {
             this.W.setVisibility(8);
          }
          LocationActivity tM = this.M;
          if (tM != null) {
             if (c.r(tM)) {
                this.z3();
             }else {
                this.y3();
             }
          }else if(a.c() == 1){
             this.y3();
          }else if(a.c() == 2){
             this.z3();
          }else if(c.t()){
             this.z3();
          }else {
             this.y3();
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LocationActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public final String u3(){
       Intent obj = PatchProxy.apply(null, this, LocationActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       if (obj == null) {
          return null;
       }
       Location location = j0.e(obj, "photo_location");
       if (location == null) {
          return null;
       }
       return location.getCity();
    }
    public boolean v3(){
       Object obj = PatchProxy.apply(null, this, LocationActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enablePublishPoiOffsite", false);
    }
    public void w3(){
       LocationActivity locationActi = LocationActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, locationActi, "16")) {
          return;
       }
       String str = "LocationActivity";
       if (!c.t()) {
          objArray = new Object[0];
          a.b().t(str, "showShopPromotion is false", objArray);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, locationActi, "19")){
          Object[] objArray1 = new Object[0];
          a.b().w(str, "initPoiFragmentIfNeeded", objArray1);
          if (this.P != null) {
             objArray = new Object[0];
             a.b().w(str, "initPoiFragmentIfNeeded, fragment is ready", objArray);
          }else {
             String str1 = PatchProxy.apply(objArray, objArray, c.class, "4");
             if (str1 != PatchProxyResult.class) {
             }else {
                str1 = n.b().getString(PostUtils.s("shop_promotion_url"), "");
             }
             Uri uri = Uri.parse(str1);
             a.p(uri, "uri");
             if (b7.a(uri)) {
                LaunchModel$b uob = new LaunchModel$b();
                uob.f("enableBackBtnHandler", 0);
                Set set = x0.c(uri);
                if (set == null) {
                   set = d1.k();
                }
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   String str2 = iterator.next();
                   String str3 = x0.a(uri, str2);
                   if (TextUtils.n(str2, "title")) {
                      uob.m(str3);
                   }else if(TextUtils.n(str2, "bundleId")){
                      uob.i(str3);
                   }else if(TextUtils.n(str2, "componentName")){
                      uob.j(str3);
                   }else if(TextUtils.n(str2, "autoPageShow")){
                      uob.g(Boolean.parseBoolean(str3));
                   }else {
                      uob.e(str2, str3);
                   }
                }
                objArray = uob.h();
             }
             a.b.Gg(objArray);
             if (objArray == null) {
                objArray = new Object[0];
                a.b().t(str, "showPoiFragment, launchModel is null", objArray);
             }else {
                objArray.g().putString("containerSource", str);
                LocationCityInfo locationCity = u.e("default");
                if (locationCity != null && !locationCity.isInvalid()) {
                   objArray.g().putDouble("latitude", locationCity.mLatitude);
                   objArray.g().putDouble("longitude", locationCity.mLongitude);
                }
                objArray.g().putString("photoId", TextUtils.k(this.N));
                if (c.r(this.M)) {
                   objArray.g().putString("poiId", String.valueOf(this.M.getId()));
                   objArray.g().putString("extParams", this.M.getExtParams());
                }
                a.b().a("krn_publish_poi_onsettled", new d(this));
                KwaiRnFragment kwaiRnFragme = KwaiRnFragment.Yg(objArray);
                if (!kwaiRnFragme.isHidden()) {
                   this.P = kwaiRnFragme;
                }
             }
          }
       }
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.w(R.id.poi_container_layout, this.P, this.P.getClass().getSimpleName());
       uoe.o();
       return;
    }
    public void x3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationActivity.class, "11")) {
          return;
       }
       if (TextUtils.x(p0) || !this.v3()) {
          this.A.setVisibility(8);
       }else {
          int i = 0;
          this.A.setVisibility(i);
          int i1 = 4;
          if (p0.length() > i1) {
             Object[] objArray = new Object[]{p0.substring(i, i1)};
             this.A.setText(String.format("%s...", objArray));
          }else {
             this.A.setText(p0);
          }
          if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "69")) {
             u1.u0(6, a.g(p0), null);
          }
       }
       if (TextUtils.x(p0)) {
          p0 = "";
       }
       this.O.K = p0;
       this.L = p0;
       return;
    }
    public final void y3(){
       if (PatchProxy.applyVoid(null, this, LocationActivity.class, "17")) {
          return;
       }
       this.Q.setVisibility(0);
       int i = 8;
       this.R.setVisibility(i);
       this.B.setVisibility(0);
       this.z.setVisibility(0);
       this.S.getPaint().setFakeBoldText(true);
       this.S.setTextSize(2, 17.00f);
       this.S.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       if (c.t()) {
          this.U.setVisibility(0);
       }else {
          this.U.setVisibility(i);
       }
       this.T.getPaint().setFakeBoldText(0);
       this.T.setTextSize(2, 16.00f);
       this.T.setTextColor(a1.a(R.color.arg_RES_7f0607cf));
       this.V.setVisibility(i);
       if (this.H != null) {
          if (!PatchProxy.applyVoid(null, null, a.class, "68")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CURRENT_POI";
             u1.u0(3, uElementPack, null);
          }
          this.C.setVisibility(0);
       }else {
          this.C.setVisibility(i);
       }
       a.f(true);
       return;
    }
    public final void z3(){
       if (PatchProxy.applyVoid(null, this, LocationActivity.class, "18")) {
          return;
       }
       this.Q.setVisibility(8);
       this.R.setVisibility(0);
       this.B.setVisibility(8);
       this.z.setVisibility(8);
       this.S.getPaint().setFakeBoldText(0);
       this.S.setTextSize(2, 16.00f);
       this.S.setTextColor(a1.a(R.color.arg_RES_7f0607cf));
       this.U.setVisibility(8);
       this.T.getPaint().setFakeBoldText(true);
       this.T.setTextSize(2, 17.00f);
       this.T.setTextColor(a1.a(R.color.arg_RES_7f0607de));
       this.V.setVisibility(0);
       this.C.setVisibility(8);
       a.f(2);
       return;
    }
}
