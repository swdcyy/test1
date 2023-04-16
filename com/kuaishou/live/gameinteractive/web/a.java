package com.kuaishou.live.gameinteractive.web.a;
import v43.a;
import k51.c;
import v43.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import java.util.HashSet;
import java.lang.Integer;
import java.util.Set;
import brd.t;
import com.kuaishou.live.gameinteractive.web.a$p;
import com.kuaishou.live.gameinteractive.web.a$q;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import e43.b;
import e43.a;
import t45.d;
import brd.z;
import com.kuaishou.live.gameinteractive.web.a$g;
import erd.o;
import java.lang.StringBuilder;
import com.kuaishou.live.gameinteractive.web.a$n;
import com.kuaishou.live.gameinteractive.web.a$o;
import t02.a0;
import k67.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f43.c;
import android.app.Activity;
import fq5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.util.Map;
import com.kuaishou.live.gameinteractive.web.model.GameWebLiveInfo;
import com.kuaishou.live.gameinteractive.web.a$j;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.gameinteractive.web.a$m;
import ht5.b$b;
import ht5.d;
import ht5.b;
import lp3.e;
import p91.m;
import om1.a;
import lp3.c;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import lm1.f;
import ht5.a;
import com.kuaishou.live.external.invoke.gzone.model.JsGamePayParams;
import com.kuaishou.live.gameinteractive.web.a$e;
import com.kuaishou.live.gameinteractive.web.a$f;
import org.json.JSONObject;
import com.kuaishou.live.gameinteractive.web.a$k;
import com.kuaishou.live.gameinteractive.web.a$l;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.gameinteractive.web.a$c;
import com.kuaishou.live.gameinteractive.web.a$d;
import com.kuaishou.live.gameinteractive.web.a$r;
import com.kuaishou.live.gameinteractive.web.a$a;
import java.lang.Long;
import com.kuaishou.live.gameinteractive.web.a$h;
import com.kuaishou.live.gameinteractive.web.a$i;
import com.kuaishou.live.gameinteractive.web.a$b;
import com.kuaishou.live.gameinteractive.web.model.GameWebBalanceData;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import m53.m;

public abstract class a extends c implements a	// class@001c0c
{
    public a0 p;
    public static String sLivePresenterClassName = "GameInteractiveCommonBridgePresenter";

    public void a(){
       super();
    }
    public void A3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "bridge -- sendLike", objArray);
       HashSet hashSet = new HashSet();
       hashSet.add(Integer.valueOf(5));
       this.X7(this.P8(hashSet, 0).subscribe(new a$p(this, p0), new a$q(this, p0)));
       return;
    }
    public t C3(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "queryEnergy", objArray);
       return a.a().a().subscribeOn(d.b).map(new a$g(this));
    }
    public void F3(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "bridge -- liveComment:"+p0, objArray);
       HashSet hashSet = new HashSet();
       hashSet.add(Integer.valueOf(2));
       this.X7(this.P8(hashSet, 0).subscribe(new a$n(this, p0, p1), new a$o(this, p1)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a0 r1 = this.p.R1;
       if (r1 != null) {
          r1.Ma(false);
       }
       return;
    }
    public final t P8(Set p0,boolean p1){
       String obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (!TextUtils.x(this.R8())) {
          return c.c().b(this.R8(), this.getActivity(), p0, p1, this.p.b().a());
       }else if(!TextUtils.x(this.S8())){
          c uoc = c.c();
          obj = this.S8();
          Activity activity = this.getActivity();
          ClientContent$LiveStreamPackage liveStreamPa = this.p.b().a();
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          int i = 0;
          if (PatchProxy.isSupport(uoc1)) {
             Object[] objArray = new Object[]{obj,activity,p0,Boolean.valueOf(p1),liveStreamPa};
             ot = PatchProxy.apply(objArray, uoc, uoc1, "10");
             if (ot != patchProxyRe) {
             }else if(TextUtils.x(obj)){
                Object[] objArray1 = new Object[i];
                a.C().t("GameLiveAuthManager", "checkAndRequestAuthByPlayId error --- empty playId!", objArray1);
                ot = t.error(new IllegalArgumentException("checkAndRequestAuthByPlayId error --- empty playId!"));
             }else {
                ot = uoc.b(uoc.a.get(obj), activity, p0, p1, liveStreamPa);
             }
          }else {
             goto label_008c ;
          }
          return ot;
       }else {
          return t.error(new IllegalArgumentException("Neither getPlayId\(\) nor getAppId\(\) is implemented!"));
       }
    }
    public abstract String R8();
    public abstract String S8();
    public void V8(GameWebLiveInfo p0){
    }
    public t Vb(boolean p0,int[] p1){
       HashSet obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s("GameInteractiveCommonBridgeImpl", "getLiveInfo", objArray);
       uoa = this.p;
       if (uoa == null || uoa.Z2 == null) {
          return t.error(new IllegalStateException("livePlayCallerContext invalid!"));
       }else {
          obj = new HashSet();
          if (p1 != null) {
             int len = p1.length;
             int i1 = 0;
             while (i1 < len) {
                int i2 = p1[i1];
                if (i2 != 1 && (i2 != 2 && i2 != 3)) {
                   Object[] objArray1 = new Object[i];
                   a.C().t("GameInteractiveCommonBridgeImpl", "getLiveInfo with invalid withUserInfo code -- "+i2, objArray1);
                }else {
                   obj.add(Integer.valueOf(i2));
                }
                i1 = i1 + 1;
             }
          }
          return this.P8(obj, true).map(new a$j(this, p0, obj));
       }
    }
    public void W8(int p0,String p1,Gift p2,c p3){
       a0 z2;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "6")) {
          return;
       }
       b$b uob = new b$b(p2);
       uob.g(p1);
       uob.d(p0);
       uob.f(0);
       uob.h(null);
       uob.i(true);
       uob.l(2);
       uob.k(new a$m(this, p3));
       b uob1 = uob.a();
       a tp = this.p;
       if (tp != null) {
          z2 = tp.Z2;
          if (z2 != null) {
             i oi = new i(z2.t5().a(a.class).o6());
             oi.e().k(uob1);
             oi.g(f.a(uob1));
             uob1.a("key_send_gift_context", oi);
          }
       }
       z2 = this.p.I1;
       if (z2 != null) {
          z2.a7(uob1);
       }
       return;
    }
    public void Yb(JsGamePayParams p0,c p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "13")) {
          return;
       }
       String str = "GameInteractiveCommonBridgeImpl";
       int i = 0;
       if (p0 == null) {
          objArray = new Object[i];
          a.C().t(str, "pay error -- JsGamePayParams is Empty!", objArray);
          return;
       }else {
          String liveStreamId = this.p.Z2.getLiveStreamId();
          if (TextUtils.x(liveStreamId)) {
             objArray = new Object[i];
             a.C().t(str, "pay error -- liveStreamId is Empty!", objArray);
             return;
          }else {
             Object[] objArray1 = new Object[i];
             a.C().s(str, "pay -- type:"+p0.type+"  payData:"+p0.payData, objArray1);
             HashSet hashSet = new HashSet();
             hashSet.add(Integer.valueOf(9));
             this.X7(this.P8(hashSet, i).subscribe(new a$e(this, p0, liveStreamId, p1), new a$f(this, p1)));
             return;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
    public void l3(){
    }
    public void o6(JSONObject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "bridge -- sendGiftToAnchor:"+p0, objArray);
       HashSet hashSet = new HashSet();
       hashSet.add(Integer.valueOf(1));
       this.X7(this.P8(hashSet, 0).subscribe(new a$k(this, p0, p1), new a$l(this, p1)));
       return;
    }
    public String uf(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = null;
       if (TextUtils.x(p0)) {
          return str;
       }
       obj = c.c();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "6");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else if(TextUtils.x(p0)){
          GameLiveAuthInfo gameLiveAuth = obj.b.get(p0);
          if (gameLiveAuth != null) {
             str = gameLiveAuth.a;
          }
       }
       return str;
    }
    public void vc(boolean p0,c p1){
       Object[] objArray1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "12")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s("GameInteractiveCommonBridgeImpl", "updataFollowStatus", objArray);
       String str = "";
       if (this.getActivity() instanceof GifshowActivity) {
          uoa = this.p;
          if (uoa != null && uoa.Z2 != null) {
             HashSet hashSet = new HashSet();
             hashSet.add(Integer.valueOf(8));
             this.X7(this.P8(hashSet, i).subscribe(new a$c(this, p0, p1), new a$d(this, p1)));
          }else {
             objArray1 = new Object[i];
             a.C().t("GameInteractiveCommonBridgeImpl", "updataFollowStatus -- failed! live service state abnormal", objArray1);
             p1.onError(-1, str);
          }
       }else {
          objArray1 = new Object[i];
          a.C().t("GameInteractiveCommonBridgeImpl", "updataFollowStatus -- failed! not GifshowActivity", objArray1);
          p1.onError(-1, str);
       }
       return;
    }
    public void vd(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "showLiveSharePanel", objArray);
       HashSet hashSet = new HashSet();
       hashSet.add(Integer.valueOf(7));
       this.X7(this.P8(hashSet, 0).subscribe(new a$r(this, p0), new a$a(this, p0)));
       return;
    }
    public void wf(long p0,long p1,c p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, a.class, "15")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s("GameInteractiveCommonBridgeImpl", "sendKCoinGift -- giftId:"+p0+"  count:"+p1, objArray);
       String str = "";
       int i1 = -1;
       if (TextUtils.x(this.R8())) {
          objArray1 = new Object[i];
          a.C().t("GameInteractiveCommonBridgeImpl", "sendKCoinGift error -- appId empty!", objArray1);
          if (p2 != null) {
             p2.onError(i1, str);
          }
          return;
       }else {
          a tp = this.p;
          if (tp == null || tp.Z2 == null) {
             objArray1 = new Object[i];
             a.C().t("GameInteractiveCommonBridgeImpl", "sendKCoinGift error -- livePlayCallerContext invalid!", objArray1);
             if (p2 != null) {
                p2.onError(i1, str);
             }
             return;
          }else {
             HashSet hashSet = new HashSet();
             hashSet.add(Integer.valueOf(1));
             a$h oh = new a$h(this, p0, p1, p2);
             this.X7(this.P8(hashSet, i).subscribe(v8, new a$i(this, p2)));
             return;
          }
       }
    }
    public t z9(){
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "queryAnchorFollowStatus", objArray);
       obj = this.p;
       if (obj == null || obj.Z2 == null) {
          return t.error(new IllegalStateException("livePlayCallerContext invalid!"));
       }
       HashSet hashSet = new HashSet();
       hashSet.add(Integer.valueOf(4));
       return this.P8(hashSet, true).map(new a$b(this));
    }
    public GameWebBalanceData zg(){
       Object[] objArray = null;
       GameWebBalanceData obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray1 = new Object[0];
       a.C().s("GameInteractiveCommonBridgeImpl", "getBalanceData", objArray1);
       if (this.p == null) {
          return objArray;
       }
       obj = new GameWebBalanceData();
       obj.kCoin = d.a(0x630bc993).d1().q();
       obj.kShell = m.a(this.p);
       return obj;
    }
}
