package com.kuaishou.commercial.o;
import nl9.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.ad.fanstop.a;
import java.util.Objects;
import x81.b;
import h91.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dm0.a;
import com.kwai.framework.abtest.f;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.ad.fanstop.NeoPendentType$a;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown$SCENE;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown;
import nl0.c;
import nl0.c$a;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import java.util.HashMap;
import nl0.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Float;
import java.lang.Number;
import p49.d;
import java.lang.Integer;
import com.kuaishou.live.preview.item.presenter.ad.d;
import el3.d;
import zl0.d1;
import zl0.c1;
import com.kuaishou.live.ad.social.l;
import com.kuaishou.live.ad.social.b;
import zl0.b;
import com.kuaishou.live.ad.push.c;
import wl0.c;
import com.kuaishou.live.ad.fanstop.g;
import com.kuaishou.live.ad.fanstop.e;
import pl0.j;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import bm0.a;
import bm0.f$d;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import x81.d;
import org.json.JSONObject;
import pp.a;
import java.lang.Throwable;
import q87.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import zl0.y;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import fg6.a;
import com.google.gson.Gson;
import pl0.n0;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import ol0.a;
import com.kuaishou.live.ad.social.t;
import zl9.b;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mxb.e;
import mxb.f;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener;
import com.kuaishou.live.common.ad.fanstop.b;
import x81.a;
import x81.e;
import x81.f;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import ekd.q;
import kp.r1;
import java.util.Iterator;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.google.gson.JsonObject;
import tkd.b;
import tkd.d;
import nl9.c0;
import com.google.gson.JsonElement;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import mxb.j0;
import mxb.i0;
import com.kuaishou.commercial.l;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import cw.s;
import msd.l;
import com.kuaishou.live.ad.social.NonAdLogHelper;
import bm0.h;
import wkd.b;
import mxb.c1;
import mxb.c1$a;
import ul0.e;
import ul0.c;
import zl0.q1;
import zl0.i1;
import ul0.d;
import nl0.c$e;
import nl0.c$c;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import xl0.c;
import u49.c;
import brd.t;
import cjd.e;
import erd.o;
import xl0.a;
import xl0.b;
import erd.g;
import crd.b;
import com.kuaishou.live.ad.social.e;
import bm0.f;
import zl0.r1;
import zl0.g1;
import pl0.q0;
import zl0.y0;
import pl0.f;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import cw.q;
import com.kuaishou.commercial.n;
import rl0.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;

public class o implements r	// class@00150e
{

    public void o(){
       super();
    }
    public void D0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "19")) {
          return;
       }
       a uoa = a.g();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, a.class, "12") && a.c) {
          a.g().i(new b(uoa));
       }
       return;
    }
    public boolean DH(BaseFeed p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "48");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, DetailVideoNeoLivePendantController.class, "31");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): DetailVideoNeoLivePendantController.s.a(p0);
       return b;
    }
    public PresenterV2 DV(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "32");
       return new a();
    }
    public boolean E4(){
       Object obj = PatchProxy.apply(null, this, o.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("canReportLiveProfileAdLog");
    }
    public boolean Ea(BaseFeed p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DetailVideoNeoLivePendantController$a obj = PatchProxy.applyOneRefs(p0, this, o.class, "49");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, DetailVideoNeoLivePendantController.class, "32");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = DetailVideoNeoLivePendantController.s;
          Objects.requireNonNull(obj);
          NeoPendentType obj1 = PatchProxy.applyOneRefs(p0, obj, DetailVideoNeoLivePendantController$a.class, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             NeoPendentType$a companion = NeoPendentType.Companion;
             obj1 = NeoPendentType.H5_TO_LIVE_NEO_COMMON;
             PhotoAdvertisement photoAdverti = (p0 != null)? p0.get("AD"): null;
             b = companion.a(obj1, null, null, photoAdverti);
          }
       }
       return b;
    }
    public NeoLiveCountDown Ef(Activity p0,View p1,BaseFeed p2,String p3,NeoLiveCountDown$SCENE p4){
       Object obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, oo, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DetailVideoNeoLivePendantController uDetailVideo = new DetailVideoNeoLivePendantController(p0, p1, p2, p3, p4);
       return obj;
    }
    public void Ep(BaseFeed p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "16")) {
          return;
       }
       c uoc = c.b.a();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(p0, uoc, c.class, "3")) {
          a.p(p0, "feed");
          Object[] objArray = new Object[0];
          j0.f("CommercialLiveAdLogAltDataManager", "unBindFeed "+p0.getId(), objArray);
          if (uoc.a.containsKey(p0)) {
             a uoa = uoc.a.get(p0);
             if (uoa != null && !PatchProxy.applyVoid(null, uoa, a.class, "7")) {
                uoa.c = true;
                a = uoa.a;
                if (a != true && a != true) {
                   uoa.d();
                }
             }
          }
       }
       return;
    }
    public String FP(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, o.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.g();
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyOneRefs(p0, obj, a.class, "4");
       if (str != patchProxyRe) {
       }else if(!TextUtils.x(p0)){
          str = obj.c(p0);
       }else {
          str = obj.f();
       }
       return str;
    }
    public float GN(String p0,float p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, oo, "52");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return d.d.a(p0, p1);
    }
    public PresenterV2 GP(int p0){
       Object[] obj;
       if (PatchProxy.isSupport2(o.class, "8")) {
          obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, o.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       switch (p0){
           case 0:
             PatchProxy.onMethodExit(o.class, "8");
             return new j();
           case 1:
             PatchProxy.onMethodExit(o.class, "8");
             return new e();
           case 2:
             PatchProxy.onMethodExit(o.class, "8");
             return new g();
           case 3:
             PatchProxy.onMethodExit(o.class, "8");
             return new c();
           case 4:
             PatchProxy.onMethodExit(o.class, "8");
             return new c();
           case 5:
             PatchProxy.onMethodExit(o.class, "8");
             return new b();
           case 6:
             PatchProxy.onMethodExit(o.class, "8");
             return new b();
           case 7:
             PatchProxy.onMethodExit(o.class, "8");
             return new l();
           case 8:
             PatchProxy.onMethodExit(o.class, "8");
             return new c1();
           case 9:
             PatchProxy.onMethodExit(o.class, "8");
             return new d1();
           case 10:
             PatchProxy.onMethodExit(o.class, "8");
             return new d();
           case 11:
             PatchProxy.onMethodExit(o.class, "8");
             return new d();
           default:
             obj = new Object[0];
             j0.c("CommercialLivePluginImpl", "unknown presenter:"+p0, obj);
             PatchProxy.onMethodExit(o.class, "8");
             return null;
       }
    }
    public boolean II(Object p0,LiveStreamFeed p1,boolean p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, o.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null) {
          p0 = p0.b;
          if (p0 != null) {
             return p0.a(p1, p2);
          }
       }
       return false;
    }
    public PresenterV2 Kl(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "29");
       return new LiveAdAudienceBellCardPresenter();
    }
    public boolean LX(LiveStreamFeed p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       d obj = PatchProxy.applyOneRefs(p0, this, o.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = d.class;
       Object obj1 = null;
       Object obj2 = PatchProxy.applyOneRefs(p0, obj1, obj, str);
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          obj2 = 0;
          if (p0 != null) {
             PhotoAdvertisement photoAdverti = p0.get("AD");
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mExtData;
                if (photoAdverti != null) {
                   String obj3 = PatchProxy.applyOneRefs(photoAdverti, obj1, obj, "6");
                   if (obj3 != patchProxyRe) {
                      b = obj3.booleanValue();
                   }else {
                      JSONObject jSONObject = new JSONObject(photoAdverti);
                      obj3 = jSONObject.getString("payerId");
                      String str1 = jSONObject.getString("authorId");
                      if (!TextUtils.x(obj3) && (!TextUtils.x(str1) && !TextUtils.n(obj3, str1))) {
                         obj2 = 1;
                      }
                   label_0088 :
                      b = obj2;
                   }
                }
             }
          }
          b = false;
       }
       return b;
    }
    public String La(){
       Object obj = PatchProxy.apply(null, this, o.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g().f();
    }
    public void NG(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "20")) {
          return;
       }
       Objects.requireNonNull(a.g());
       a.c = p0;
       return;
    }
    public boolean OB(LiveStreamFeedWrapper p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null){
          p0 = p0.mEntity;
          if (p0 != null) {
             b = d.d(p0);
          }
       }
       b = false;
       return b;
    }
    public float OW(String p0,float p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, oo, "53");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return d.c.a(p0, p1);
    }
    public PresenterV2 P6(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "26");
       return new y();
    }
    public String QK(QPhoto p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, o.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData mLiveAdReran = photoAdverti.mLiveAdRerankContext;
             if (mLiveAdReran != null) {
                try{
                   return a.a.q(mLiveAdReran);
                }catch(java.lang.Exception e3){
                   obj = new Object[0];
                   j0.c("CommercialLivePluginImpl", "getLiveAdRerankContext error:"+e3, obj);
                }
             }
          }
       }
    }
    public PresenterV2 QR(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "25");
       return new n0();
    }
    public AbstractLiveJsCommand SR(){
       Object obj = PatchProxy.apply(null, this, o.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public b TQ(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAdGetLiveConversionInfoHandler(p0);
    }
    public void UW(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "35")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.b;
          if (p0 != null) {
             p0.b(p1);
             return;
          }
       }
       b.Z(LiveLogTag.LIVE_TVC_AD, "tryToShowTVC why here?");
       return;
    }
    public e Uw(){
       Object obj = PatchProxy.apply(null, this, o.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
    public UpdateFansTopStatusListener$FansTopStatus XK(){
       Object obj = PatchProxy.apply(null, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g().d();
    }
    public boolean Xx(int p0){
       d obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "24");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = d.class;
       if (PatchProxy.isSupport(obj)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, obj, "7");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 < 1 && !d.c()){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_0039 ;
       }
       return b;
    }
    public void YS(UpdateFansTopStatusListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "10")) {
          return;
       }
       a uoa = a.g();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(p0, uoa, a.class, "11")) {
          b uob = new b();
          a uoa1 = new a(uoa, p0);
          if (!PatchProxy.applyVoidOneRefs(uoa1, uob, b.class, "4")) {
             if (d.c()) {
                uoa1.a(UpdateFansTopStatusListener$FansTopStatus.CLOSE);
             }else {
                a.g().a(new e(uob, uoa1));
                a.g().i(new f(uob, uoa1));
             }
          }
       }
       return;
    }
    public void Z6(Map p0,List p1,List p2,QPhoto p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, o.class, "45")) {
          return;
       }
       if (!q.f(p2) && !q.f(p1)) {
          int i = (p3 == null)? 0: r1.z1(p3.mEntity) + 1;
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             PhotoAdvertisementInterface advertisemen = iterator.next().getAdvertisement();
             if (advertisemen instanceof PhotoAdvertisement) {
                PhotoAdvertisement mAdData = advertisemen.mAdData;
                if (mAdData != null && !q.h(mAdData.mLiveAdRerankContext)) {
                   JsonObject jsonObject = new JsonObject();
                   d.a(-500494672).P7(jsonObject, p1, i);
                   String str = jsonObject.toString();
                   p0.put("adClientInfo", str);
                   break ;
                }
             }
          }
       }
       return;
    }
    public boolean ZX(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.d(p0);
    }
    public void a6(BaseFeed p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "17")) {
          return;
       }
       c.b.a().b(p0, p1);
       return;
    }
    public void aI(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "43")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "HELP_TO_TOP_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uClickEvent.contentPackage = uContentPack;
       u1.a0(uClickEvent);
       return;
    }
    public void aT(QPhoto p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "2")) {
          return;
       }
       LiveAdLogParamAppender liveAdLogPar = f.b(p2);
       if (liveAdLogPar == null) {
          i0.a().e(140, p0.mEntity).f(l.b).q("apiExtData", TextUtils.i(p1, "")).a();
       }else {
          NonAdLogHelper.b(140, liveAdLogPar, p0.mEntity, new s(p1));
       }
       return;
    }
    public void bn(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "33")) {
          return;
       }
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "1") || (p0 != null && p0.mPhoto != null)) {
          c1$a uoa = b.a(-192651539).e(p0.mPhoto.getId());
          if (uoa != null) {
             p0.setTvcShowStartTimeMs(uoa.a);
             p0.setTvcShowEndTimeMs(uoa.b);
             p0.setRequestTvcStartTimeMs(uoa.d);
             p0.setRequestTvcEndTimeMs(uoa.e);
             p0.setTvcRequestType(uoa.f);
             uoa = uoa.c;
             if (uoa > 0) {
                p0.setStartActivityTime(uoa);
             }
          }
       }
       return;
    }
    public boolean cf(LiveStreamFeed p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 != null){
          PhotoAdvertisement photoAdverti = p0.get("AD");
          if (photoAdverti != null && photoAdverti.mAdLiveForFansTop != null) {
             b = true;
          }
       }
       b = false;
       return b;
    }
    public void ck(BaseFeed p0,int p1,int p2,int p3,int p4){
       Object[] objArray;
       o oo = o.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       int i4 = 5;
       if (PatchProxy.isSupport(oo)) {
          objArray = new Object[i4];
          objArray[i3] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[i2] = Integer.valueOf(p2);
          objArray[i1] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, oo, "14")) {
             return;
          }
       }
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          objArray = new Object[i4];
          objArray[i3] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[i2] = Integer.valueOf(p2);
          objArray[i1] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (!PatchProxy.applyVoid(objArray, null, uoe, "2")) {
          label_0061 :
             c uoc = new c(p0, p1, p2, p3, p4);
             if (p2 == 1) {
                c.b.a().b(p0, uoe);
             }else {
                uoe.run();
             }
          }
       }else {
          goto label_0061 ;
       }
       return;
    }
    public b d8(q1 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i1(p0);
    }
    public void dT(BaseFeed p0,int p1,int p2,int p3,int p4){
       Object[] objArray;
       a a;
       object oobject = p0;
       o oo = o.class;
       int i = 4;
       int i1 = 2;
       int i2 = 5;
       if (PatchProxy.isSupport(oo)) {
          objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[i1] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, oo, "15")) {
             return;
          }
       }else {
          int i3 = this;
       }
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[i1] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (!PatchProxy.applyVoid(objArray, null, uoe, "1")) {
          label_0065 :
             d uod = new d(p0, p1, p2, p3, p4);
             if (p2 == 1) {
                c uoc = c.b.a();
                Objects.requireNonNull(uoc);
                if (!PatchProxy.applyVoidTwoRefs(p0, v11, uoc, c.class, "1")) {
                   a.p(p0, "feed");
                   if (!uoc.a.containsKey(p0)) {
                      uoc.a.put(p0, new a(new c$e(uoc, p0)));
                   }
                   a uoa = uoc.a.get(p0);
                   if (uoa != null) {
                      _monitor_enter(uoa);
                      if (PatchProxy.applyVoidTwoRefs(p0, v11, uoa, a.class, "1")) {
                         _monitor_exit(uoa);
                      }else {
                         a.p(p0, "feed");
                         uoa.e.add(v11);
                         Object[] objArray1 = new Object[0];
                         j0.f("AdLogTrackHelper", "trackEventRandomDelay "+uoa.a, objArray1);
                         if (k.x(p0) != null) {
                            uoa.c(3);
                         }else if(uoa.a != 3){
                            uoa.c(0);
                         }
                         objArray1 = new Object[0];
                         j0.f("AdLogTrackHelper", "trackEventRandomDelay after check "+uoa.a, objArray1);
                         a = uoa.a;
                         if (a != null) {
                            if (a == 3) {
                               uoa.d();
                            }
                         }else {
                            uoa.e(p0);
                         }
                         _monitor_exit(uoa);
                      }
                   }
                }
             }else {
                v11.run();
             }
          }
       }else {
          goto label_0065 ;
       }
       return;
    }
    public void eI(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "51")) {
          return;
       }
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(p0, obj, c.class, "1")) {
          if (p0 != null) {
             obj = p0.get("pecRequestParams");
          }
          int i = 0;
          String str = (obj == null || !obj.length())? 1: null;
          if (!str) {
             Object[] objArray = new Object[i];
             j0.f("PecCouponHelper", "request pec coupon started", objArray);
             b.a(0x3a268c29).b(obj).map(new e()).map(a.b).subscribe(b.b);
          }
       }
       return;
    }
    public PresenterV2 eR(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "27");
       return new e();
    }
    public int fZ(){
       Object obj = PatchProxy.apply(null, this, o.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.g().e();
    }
    public PresenterV2 hW(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "36");
       return new f();
    }
    public boolean isAvailable(){
       return true;
    }
    public void jx(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "42")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BUY_FANS_TOP_TOO";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public b kC(r1 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g1(p0);
    }
    public PresenterV2 kJ(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "40");
       return new q0();
    }
    public PresenterV2 ks(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "30");
       return new y0();
    }
    public String o50(boolean p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oo, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.g().h(p0, p1);
    }
    public PresenterV2 qq(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "28");
       return new c();
    }
    public Object qu(int p0){
       a obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.c = p0;
       return obj;
    }
    public PresenterV2 sA(){
       Object obj = PatchProxy.applyWithListener(null, this, o.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(o.class, "31");
       return new f();
    }
    public void uk(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "41")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BUY_FANS_TOP_TOO";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
    public KwaiDialogFragment vi(Activity p0,c p1,String p2,String p3,String p4,int p5){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, oo, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.e(p0, p1, p2, p3, p4, p5);
    }
    public void yT(int p0,QPhoto p1,int p2,String p3,Map p4){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oo, "1")) {
             return;
          }
       }
       LiveAdLogParamAppender liveAdLogPar = f.b(p4);
       if (liveAdLogPar == null) {
          i0.a().e(p0, p1.mEntity).f(new q(p2)).q("apiExtData", TextUtils.i(p3, "")).a();
       }else {
          NonAdLogHelper.b(p0, liveAdLogPar, p1.mEntity, new n(p2, p3));
       }
       return;
    }
    public void z7(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "23")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, c.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 1326;
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.name = QCurrentUser.me().getId();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.type = 1;
          showEvent.elementPackage = uElementPack;
          showEvent.contentPackage = uContentPack;
          u1.g0(showEvent);
       }
       return;
    }
}
