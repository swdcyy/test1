package com.yxcorp.gifshow.aggregate.AggregateActivity;
import ml8.d;
import je.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import ia5.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import b69.a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment;
import java.io.Serializable;
import ekd.j0;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Boolean;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import k2b.k2;
import k2b.u1;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import android.text.TextUtils;
import java.lang.Exception;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import y59.a;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public class AggregateActivity extends GifshowActivity implements d, a	// class@001928
{
    public QPhoto A;
    public int B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public int J;
    public RecyclerFragment K;
    public KwaiActionBar y;
    public View z;

    public void AggregateActivity(){
       super();
       this.J = 0;
    }
    public int M(){
       return 2;
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, AggregateActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(this.A);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, AggregateActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(this.A);
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, AggregateActivity.class, "13")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AggregateActivity.class, "1")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a3f50);
       this.y = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public int f(){
       AggregateActivity obj = PatchProxy.apply(null, this, AggregateActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.K;
       if (obj != null) {
          return obj.f();
       }
       return 0;
    }
    public int getPage(){
       AggregateActivity obj = PatchProxy.apply(null, this, AggregateActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.K;
       if (obj != null) {
          return obj.getPage();
       }
       return 0;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AggregateActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://photo";
    }
    public void onCreate(Bundle p0){
       String str20;
       boolean b1;
       LaunchModel launchModel;
       LaunchModel$b uob;
       int b2;
       String str = this;
       AggregateActivity uAggregateAc = AggregateActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, str, uAggregateAc, "2")) {
          return;
       }
       super.onCreate(p0);
       str.setContentView(R.layout.arg_RES_7f0d0024);
       str.doBindView(this.getWindow().getDecorView());
       if (!PatchProxy.applyVoid(null, str, uAggregateAc, "3")) {
          if (this.getIntent() == null || this.getIntent().getData() == null) {
             this.finish();
          }else {
             Uri data = this.getIntent().getData();
             String host = data.getHost();
             String path = data.getPath();
             if (("kwai").equals(data.getScheme())) {
                String str1 = "realtimecard";
                String str2 = "pymk";
                if (!("aggregate").equals(host) && (str2.equals(host) || str1.equals(host))) {
                   String str3 = "/user";
                   String str4 = "/detail";
                   String str5 = "/recommendUsers";
                   if (!str3.equals(path) && (!("/feed").equals(path) && (str5.equals(path) || str4.equals(path)))) {
                      String str6 = w0.a(data, "title");
                      String str7 = "contentType";
                      String str8 = w0.a(data, str7);
                      str.C = w0.a(data, "pageType");
                      String str9 = "topUsers";
                      String str10 = "title";
                      str.D = w0.a(data, str9);
                      String str11 = str3;
                      str.E = w0.a(data, "extraInfo");
                      String str12 = "extraInfo";
                      str.G = w0.a(data, "extParams");
                      String str13 = "extParams";
                      String str14 = "pageType";
                      String str15 = "useContact";
                      str.F = w0.a(data, "timestamp");
                      String str16 = "followRefer";
                      String str17 = "timestamp";
                      str.H = w0.a(data, str16);
                      str3 = "page2Name";
                      boolean b = data.getBooleanQueryParameter("useContact", false);
                      str.I = w0.a(data, str3);
                      String str18 = "referPageID";
                      String str19 = w0.a(data, str18);
                      Uri uri = data;
                      str.B = Integer.valueOf(str8).intValue();
                      if (!TextUtils.x(str19)) {
                         str.J = Integer.valueOf(str19).intValue();
                      }
                   label_0116 :
                      str19 = str16;
                      str16 = 8;
                      if (!a.a()) {
                         if (str.y.getVisibility() == str16) {
                            str.y.setVisibility(0);
                         }else {
                            uob = 0;
                         }
                         str20 = str8;
                         str.y.e(R.drawable.arg_RES_7f0819d9, -1, TextUtils.k(str6));
                      }else {
                         str20 = str8;
                         str.y.setVisibility(8);
                      }
                      Bundle uBundle = new Bundle();
                      if (str2.equals(host) && str5.equals(path)) {
                         if (str.D == null) {
                            this.finish();
                         }else if(a.a() || PatchProxy.applyVoid(null, str, uAggregateAc, "7")){
                            str.y.j(j.n(str, R.drawable.arg_RES_7f081df9, 0x7f060151)).m(-1).r("");
                            str.z.setVisibility(8);
                         }
                         uBundle.putString(str9, str.D);
                         str.K = new UserAggregateFragment();
                         host = str14;
                      }else if(str1.equals(host) && str4.equals(path)){
                         str.K = new FeedAggregateFragment();
                         uBundle.putInt(str7, str.B);
                         host = str14;
                         uBundle.putString(host, str.C);
                         uBundle.putString(str3, str.I);
                         uBundle.putInt(str18, str.J);
                      }else {
                         host = str14;
                         if (str20 == null) {
                            this.finish();
                         }else if((str11).equals(path)){
                            str.K = new UserAggregateFragment();
                         }else {
                            str.K = new FeedAggregateFragment();
                         }
                         uBundle.putString(str19, str.H);
                         str9 = str15;
                         b1 = b;
                         uBundle.putBoolean(str9, b1);
                         uBundle.putInt(str7, str.B);
                         uBundle.putString(host, str.C);
                         uBundle.putString(str17, str.F);
                      label_0210 :
                         str.A = j0.e(this.getIntent(), "photo");
                         path = "prsid";
                         Uri uri1 = uri;
                         uBundle.putString(path, w0.a(uri1, path));
                         str4 = str12;
                         uBundle.putString(str4, str.E);
                         str5 = str13;
                         uBundle.putString(str5, str.G);
                         SerializableHook.putSerializable(uBundle, "photo", str.A);
                         if (a.a()) {
                            if (PatchProxy.isSupport(uAggregateAc)) {
                               launchModel = PatchProxy.applyTwoRefs(uri1, Boolean.valueOf(b1), str, uAggregateAc, "4");
                               if (launchModel != PatchProxyResult.class) {
                               label_033d :
                                  KwaiRnActivity.D3(str, launchModel);
                                  this.finish();
                               }
                            }
                            uob = new LaunchModel$b();
                            k2 ok2 = u1.n();
                            uob.i("SocialPymkGroup");
                            uob.j("UserAggregate");
                            LaunchModel$b uob1 = uob.e("containerSource", "AggregateActivity").e("themeStyle", "1").e("navTitle", w0.a(uri1, str10)).b(str7, str.B).e(host, str.C).e(path, w0.a(uri1, path));
                            ok2 = (ok2 != null)? ok2.d: null;
                            uob1 = uob1.e("referPage", ok2).e(str4, str.E).e(str5, str.G);
                            String str21 = PatchProxy.apply(null, str, uAggregateAc, "6");
                            path = "profileUserId";
                            if (str21 != PatchProxyResult.class) {
                            }else {
                               try{
                                  str21 = new c().a(str.G).e0(path).w();
                                  if (TextUtils.isEmpty(str21)) {
                                  }
                               }catch(java.lang.Exception e0){
                                  e0.printStackTrace();
                               }
                               str21 = null;
                            }
                            LaunchModel$b uob2 = uob1.e(path, str21);
                            k2 obj = PatchProxy.apply(null, null, uAggregateAc, "5");
                            if (obj != PatchProxyResult.class) {
                               b2 = obj.booleanValue();
                            }else if(u1.j() != null){
                               obj = u1.j().c;
                            }else {
                               obj = null;
                            }
                            if (obj == 237) {
                               ClientEvent$UrlPackage page = (u1.p() != null)? u1.p().page: null;
                               if (page == 2) {
                                  b2 = true;
                               }
                            }
                            b2 = false;
                            b2 = (b2)? 18: 34;
                            uob2.b("userRecoPortal", b2).f(str9, b1).f("isAggregateUseContactBefore", a.a());
                            launchModel = uob.h();
                            goto label_033d ;
                         }else {
                            str.K.setArguments(uBundle);
                            uAggregateAc = str.K;
                            GifshowActivity gifshowActiv = GifshowActivity.class;
                            if (!PatchProxy.isSupport(gifshowActiv) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(0x7f0a0fe6), uAggregateAc, str, gifshowActiv, "57")) {
                               e uoe = this.getSupportFragmentManager().beginTransaction();
                               uoe.v(R.id.fragment_container, uAggregateAc);
                               uoe.l();
                            }
                         }
                      }
                      str9 = str15;
                      b1 = b;
                      goto label_0210 ;
                   }
                }
             }
             this.finish();
          }
       }
       return;
    }
    public void u3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AggregateActivity.class, "8")) {
          return;
       }
       this.y.r(p0);
       if (TextUtils.x(p0)) {
          this.z.setVisibility(8);
       }else {
          this.z.setVisibility(0);
       }
       return;
    }
}
