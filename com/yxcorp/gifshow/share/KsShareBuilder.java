package com.yxcorp.gifshow.share.KsShareBuilder;
import uo7.l;
import com.yxcorp.gifshow.share.KsShareBuilder$b;
import nsd.u;
import com.yxcorp.gifshow.share.KsShareBuilder$a;
import java.lang.Object;
import wkd.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import mhc.y;
import mhc.f2;
import com.kwai.kwaishare.kit.ShareKitConfig;
import au6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bu6.a;
import au6.d;
import bu6.d;
import au6.a;
import com.yxcorp.utility.Log;
import bu6.e;
import cu6.a;
import com.kwai.kwaishare.system.SystemShareApi;
import eu6.a;
import eu6.d;
import eu6.f;
import eu6.g;
import fu6.a;
import com.kwai.kwaishare.weibo.WeiboShareApi;
import com.kwai.sharelib.KsShareApi;
import com.yxcorp.gifshow.share.KsShareBuilder$Companion$2;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import uo7.d0;
import rhc.b0;
import cp7.d;
import uo7.g0;
import uo7.f0;
import uo7.d0$a;
import cp7.j;
import rhc.f0;
import fp7.c;
import fp7.k;
import rhc.h0;
import gp7.c;
import mhc.c0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import android.app.Activity;
import uo7.a0;
import java.util.HashSet;
import java.lang.Boolean;
import brd.a0;
import n3d.a;
import o56.c;
import o56.a;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import com.kwai.kwaishare.weibo.WeiboShareApi$a;
import android.content.Context;
import fu6.d;
import mhc.o2;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import msd.a;
import mhc.u;
import msd.q;
import oic.g1;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import uo7.k;
import com.yxcorp.gifshow.share.KsShareBuilder$c;
import erd.o;
import xf6.l;
import com.google.gson.JsonObject;
import java.util.Collection;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.l1;
import com.google.gson.JsonElement;
import zf6.k;
import xf6.i;
import com.yxcorp.gifshow.share.KsShareBuilder$d;
import mhc.f0;
import mhc.e0;
import mhc.o0;

public final class KsShareBuilder extends l	// class@001b45
{
    public boolean E;
    public final HashSet F;
    public boolean G;
    public final HashSet H;
    public a0 I;
    public final LoginParams J;
    public ForwardGridSectionFragment K;
    public static final a L;
    public static final KsShareBuilder$b M;

    static {
       u ou = null;
       KsShareBuilder.M = new KsShareBuilder$b(ou);
       KsShareBuilder.L = KsShareBuilder$a.b;
       String obj = b.a(0x91df3e4);
       a.o(obj, "Singleton.get\(ForwardService::class.java\)");
       obj = obj.a().a();
       a.o(obj, "defaultWechatAppIdFromSecuritySDK");
       ShareKitConfig.k.g(obj);
       String str = "1";
       if (PatchProxy.applyVoid(ou, ou, b.class, str)) {
       }else {
          String str1 = "newShare";
          if (!PatchProxy.applyVoid(ou, ou, a.class, str)) {
             d.a().c("qq", new d());
             Log.b(str1, "QQ_CHANNEL");
             d.a().c("qzone", new e());
             Log.b(str1, "QZONE_CHANNEL");
          }
          if (!PatchProxy.applyVoid(ou, ou, a.class, str)) {
             d.a().c("more", new SystemShareApi());
             Log.b(str1, "SYSTEM_CHANNEL");
          }
          if (!PatchProxy.applyVoid(ou, ou, a.class, str)) {
             d.a().c("wechat", new d());
             Log.b(str1, "WECHAT_CHANNEL");
             d.a().c("wechatMoments", new f());
             Log.b(str1, "WECHAT_MOMENTS_CHANNEL");
             d.a().c("wechatWow", new g());
             Log.b(str1, "WECHAT_WOW_CHANNEL");
          }
          if (!PatchProxy.applyVoid(ou, ou, a.class, str)) {
             d.a().c("weibo", new WeiboShareApi());
             Log.b(str1, "WEIBO_CHANNEL");
          }
       }
       KsShareApi s = KsShareApi.s;
       KsShareBuilder$Companion$2 iNSTANCE = KsShareBuilder$Companion$2.INSTANCE;
       Objects.requireNonNull(s);
       if (PatchProxy.applyOneRefs(iNSTANCE, s, KsShareApi.class, "18") != PatchProxyResult.class) {
       }else {
          a.p(iNSTANCE, "defaultConsumer");
          KsShareApi.n = iNSTANCE;
       }
       long l = 0;
       long l1 = a.t().b("shareTimeout", l);
       Objects.requireNonNull(s);
       if (l1 - l >= 0) {
          KsShareApi.f = KsShareApi.f + (l1 * (long)1000);
       }
       d0$a c = d0.c;
       c.a("qq", new b0(new d()));
       c.a("qzone", new b0(new j()));
       c.a("wechat", new f0(new c()));
       c.a("wechatMoments", new f0(new k()));
       c.a("weibo", new h0(new c()));
       c.a("h5", new c0());
    }
    public void KsShareBuilder(GifshowActivity p0,String p1,String p2){
       super(p0, p1, p2, null, null, 24, null);
    }
    public void KsShareBuilder(GifshowActivity p0,String p1,String p2,LoginParams p3){
       super(p0, p1, p2, p3, null, 16, null);
    }
    public void KsShareBuilder(GifshowActivity p0,String p1,String p2,LoginParams p3,ForwardGridSectionFragment p4){
       a.p(p0, "currentActivity");
       a.p(p1, "subBiz");
       a.p(p2, "subjectId");
       a.p(p3, "loginParams");
       super(p0, p1, p2, p4);
       this.J = p3;
       this.K = p4;
       this.F = new HashSet();
       this.H = new HashSet();
       a0 uoa0 = a0.B(Boolean.TRUE);
       a.o(uoa0, "Single.just\(true\)");
       this.I = uoa0;
       Activity uActivity = this.b();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       uActivity.e(KsShareBuilder.L);
       KsShareApi s = KsShareApi.s;
       c uoc = a.a();
       p2 = "AppEnv.get\(\)";
       a.o(uoc, p2);
       String str = "zhongtai";
       boolean b = (uoc.c() && d.a().b(str))? true: false;
       s.m(b);
       KsShareApi.c = a.t().d("enableShareImagePreferPNG", false);
       c uoc1 = a.a();
       a.o(uoc1, p2);
       if (uoc1.c()) {
          Host host = d.a().c(str);
          if (host != null) {
             host = host.mHost;
          label_0092 :
             KsShareApi.d = host;
             WeiboShareApi$a e = WeiboShareApi.e;
             if (!e.b()) {
                Application b1 = a.B;
                a.o(b1, "AppEnv.APP");
                e.a(b1, null);
             }
             return;
          }
       }
       d uod = null;
       goto label_0092 ;
    }
    public void KsShareBuilder(GifshowActivity p0,String p1,String p2,LoginParams p3,ForwardGridSectionFragment p4,int p5,u p6){
       ForwardGridSectionFragment uForwardGrid = null;
       if (p5 & 0x08) {
          p3 = o2.f(0, 1, uForwardGrid);
       }
       LoginParams loginParams = p3;
       if (p5 & 0x10) {
          uForwardGrid = ForwardGridSectionFragment$Companion.d(ForwardGridSectionFragment.W0, p0, uForwardGrid, 2, uForwardGrid);
       }
       super(p0, p1, p2, loginParams, uForwardGrid);
       return;
    }
    public final KsShareBuilder A(u p0){
       a.p(p0, "l");
       KsShareBuilder tK = this.K;
       if (tK != null) {
          tK.J = p0;
       }
       return this;
    }
    public final KsShareBuilder B(q p0){
       a.p(p0, "showListener");
       KsShareBuilder tK = this.K;
       if (tK != null) {
          a.p(p0, "value");
          tK.L = new g1(p0);
       }
       return this;
    }
    public final KsShareBuilder C(String p0){
       KsShareBuilder obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "platform");
       obj = this.K;
       if (obj != null) {
          obj.T = p0;
       }
       return this;
    }
    public final KsShareBuilder D(SharePosInfo p0){
       KsShareBuilder obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sharePosInfo");
       obj = this.K;
       if (obj != null) {
          obj.S = p0;
       }
       return this;
    }
    public k a(){
       int i1;
       String str1;
       JsonArray jsonArray;
       Iterator iterator;
       Object[] objArray;
       KsShareBuilder ksShareBuild = KsShareBuilder.class;
       l ol = l.class;
       a0 obj = PatchProxy.apply(null, this, ksShareBuild, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I.u(new KsShareBuilder$c(this));
       a.o(obj, "mBizCustomStartSharePrep¡­Login, loginParams\)\n    }");
       if (PatchProxy.applyOneRefs(obj, this, ol, "2") != PatchProxyResult.class) {
       }else {
          a.p(obj, "prepare");
          this.u = obj;
       }
       String str = "";
       boolean b = 2;
       int i = 1;
       if (this.f == null) {
          i1 = l.e("KEY_SHARE_STYLE", 0);
          if (i1 != i) {
             if (i1 != b) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      str1 = (i1 != 5)? str: "TEXT";
                   }else {
                      str1 = "PICTURE";
                   }
                }else {
                   str1 = "TOKEN";
                }
             }else {
                str1 = "CARD";
             }
          }else {
             str1 = "MINI_PROGRAM";
          }
          this.q(str1);
       }
       if (this.h == null) {
          i1 = l.e("KEY_SHARE_MODE", 0);
          if (i1 != i) {
             if (i1 == b) {
                str = "SYSTEM";
             }
          }else {
             str = "APP";
          }
          this.r(str);
       }
       str1 = "12";
       JsonObject jsonObject = PatchProxy.apply(null, this, ksShareBuild, str1);
       if (jsonObject != PatchProxyResult.class) {
       }else if(this.G != null || (this.F.isEmpty() && this.H.isEmpty())){
          jsonObject = this.c();
       }else {
          jsonObject = this.c();
          if (jsonObject == null) {
             jsonObject = new JsonObject();
          }
          KsShareBuilder tF = this.F;
          if (!(tF.isEmpty() ^ i)) {
             objArray = null;
          }
          if (tF != null) {
             jsonArray = new JsonArray();
             iterator = tF.iterator();
             while (iterator.hasNext()) {
                jsonArray.a0(iterator.next());
             }
             jsonObject.G("clientSharePanelElementIds", jsonArray);
          }
          tF = this.H;
          if (!(tF.isEmpty() ^ i)) {
             objArray = null;
          }
          if (tF != null) {
             jsonArray = new JsonArray();
             iterator = tF.iterator();
             while (iterator.hasNext()) {
                jsonArray.a0(iterator.next());
             }
             jsonObject.G("sharePanelBlackList", jsonArray);
          }
       }
       if (jsonObject != null) {
          this.l(jsonObject);
       }
       if (this.k == null) {
          jsonObject = new JsonObject();
          if (PatchProxy.applyOneRefs(jsonObject, this, ol, str1) != PatchProxyResult.class) {
          }else {
             a.p(jsonObject, "param");
             this.k = jsonObject;
          }
       }
       String str2 = (k.d())? "dark": "light";
       if (PatchProxy.applyOneRefs(str2, this, ol, "24") != PatchProxyResult.class) {
       }else {
          a.p(str2, "theme");
          this.v = str2;
       }
       boolean b1 = i.k();
       if (PatchProxy.isSupport(ol) && PatchProxy.applyOneRefs(Boolean.valueOf(b1), this, ol, "19") != PatchProxyResult.class) {
       }else {
          this.r = b1;
       }
       b1 = l.c("KEY_ENABLE_SHARE_QQ_MINI_PROGRAM_DEBUG", 0);
       if (PatchProxy.isSupport(ol) && PatchProxy.applyOneRefs(Boolean.valueOf(b1), this, ol, "20") != PatchProxyResult.class) {
       }else {
          this.s = b1;
       }
       KsShareBuilder$d uod = new KsShareBuilder$d(this);
       if (PatchProxy.applyOneRefs(uod, this, ol, "21") != PatchProxyResult.class) {
       }else {
          a.p(uod, "progressHdl");
          this.y = uod;
       }
       this.K = null;
       this.D = null;
       return super.a();
    }
    public final KsShareBuilder s(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ids");
       this.F.addAll(p0);
       return this;
    }
    public final KsShareBuilder t(f0 p0){
       KsShareBuilder obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj != null) {
          ForwardGridSectionFragment.Mh(obj, p0, 0, 2, null);
       }
       return this;
    }
    public final KsShareBuilder u(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ids");
       this.H.addAll(p0);
       return this;
    }
    public final KsShareBuilder v(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       JsonObject jsonObject = o2.l(p0);
       if (jsonObject != null) {
          this.n = jsonObject;
       }
       return this;
    }
    public final KsShareBuilder w(e0 p0){
       a.p(p0, "bannerListener");
       KsShareBuilder tK = this.K;
       if (tK != null) {
          tK.M = p0;
       }
       return this;
    }
    public final KsShareBuilder x(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "prepare");
       this.I = p0;
       return this;
    }
    public final KsShareBuilder y(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsShareBuilder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       JsonObject jsonObject = o2.l(p0);
       if (jsonObject != null) {
          this.j = jsonObject;
       }
       return this;
    }
    public final KsShareBuilder z(o0 p0){
       a.p(p0, "dialogListener");
       KsShareBuilder tK = this.K;
       if (tK != null) {
          tK.K = p0;
       }
       return this;
    }
}
