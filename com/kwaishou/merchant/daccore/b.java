package com.kwaishou.merchant.daccore.b;
import c08.a;
import java.lang.Object;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch;
import crd.a;
import java.lang.String;
import b08.a;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import d08.a;
import n08.a;
import com.kwaishou.merchant.daccore.PendantHolder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import l08.c;
import a08.p;
import mv.a;
import java.lang.System;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import nv.c;
import com.kuaishou.bowl.event.utils.a;
import mv.e;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension;
import com.kuaishou.bowl.event.utils.StageName;
import q08.c;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import brd.t;
import t45.d;
import brd.z;
import com.kwaishou.merchant.daccore.a;
import a08.d;
import erd.g;
import crd.b;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zsd.u;
import java.util.concurrent.ConcurrentHashMap;
import d08.b;
import com.kwaishou.merchant.daccore.pendant.base.PendantState;
import java.lang.reflect.Constructor;
import com.kwaishou.merchant.daccore.event.ELiveEvent;
import java.lang.Enum;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import m08.a;
import com.kwaishou.merchant.daccore.b$a;
import su.o;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import com.kuaishou.merchant.router.b;
import fw8.r;
import fw8.r$a;
import p08.a;
import cb4.e;
import fq5.b;
import hf3.a;
import b08.j;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopResourceLivePendantData;
import lf3.g;
import b08.g;
import vu.i;
import vu.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import e08.b;
import a08.h;
import a08.o;
import k08.a;
import k08.a$a;
import com.kwaishou.merchant.daccore.pendant.a;
import com.kwaishou.merchant.daccore.pendant.a$a;
import k08.c;
import k08.c$b;
import com.kwaishou.merchant.daccore.mount.PendantMountService;
import g08.a;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import com.kwaishou.merchant.daccore.rnlive.RNHeadless;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import com.kuaishou.krn.model.LaunchModel$b;
import java.io.Serializable;
import com.kwai.sdk.switchconfig.a;
import o08.f;
import java.lang.reflect.Type;
import el.a;
import trd.t0;
import com.kuaishou.krn.model.LaunchModel;
import o08.e;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import o08.c;
import com.kwaishou.merchant.daccore.rnlive.RNHeadless$a;
import zj0.x;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import qrd.l1;
import o08.a;
import io.reactivex.subjects.PublishSubject;
import a08.g;
import a08.m;
import a08.a;
import a08.l;
import su.g;
import b08.f;
import android.text.TextUtils;
import java.util.HashMap;
import fv.g;
import java.util.ArrayList;
import java.lang.Integer;
import fv.h;
import java.util.List;
import tu.g;
import a08.k;
import a08.j;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import f08.b;
import f08.b$a;
import a08.f;
import a08.i;
import com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant;
import q08.a;
import a08.c;
import a08.b;

public class b	// class@00130a
{
    public RNLive a;
    public PendantHolder b;
    public p c;
    public PendantDataServer d;
    public a e;
    public b f;
    public b g;
    public final PendantEnvReadyLatch h;
    public final a i;
    public b j;
    public r$a k;
    public String l;

    public void b(a p0){
       super();
       PendantEnvReadyLatch pendantEnvRe = new PendantEnvReadyLatch(2);
       this.h = pendantEnvRe;
       this.i = new a();
       this.e = p0;
       String str = a.d(p0);
       this.l = str;
       pendantEnvRe.c = str;
       this.d = new PendantDataServer();
    }
    public final void a(a p0){
       String str2;
       b uob = this;
       a uoa = p0;
       long l = p0.e();
       String str = p0.f();
       b b = uob.b;
       String str1 = p0.f();
       Map map = null;
       if (b != null) {
          a uoa1 = b.f(l, str1);
          if (uoa1 != null) {
             str2 = a.b(uoa1);
          label_0022 :
             if (TextUtils.x(str2)) {
                f$a.d(f.a, uob.l, str, l+" getComponentNameFromRenderUrl empty", null, null, 24, null);
             }
             boolean b1 = true;
             if (!uob.g(str2)) {
                f.d(uob.l, str, "isPendantConfigDynamicStyle false", map, b1);
                return;
             }else {
                JsonObject jsonObject = p0.c();
                if (jsonObject == null || jsonObject.D()) {
                   f.d(uob.l, str, "data is null", map, b1);
                }
                f.c(uob.l, str, "action createAndShowPendant");
                if (a.j(uob.b, str)) {
                   f.c(uob.l, str, "pendant already exist,dismiss first");
                   uob.c.a(uob.b.j(str));
                }
                uoa1 = a.a();
                long l1 = System.currentTimeMillis();
                Objects.requireNonNull(uoa1);
                a uoa2 = a.class;
                if (PatchProxy.isSupport(uoa2)) {
                   str1 = PatchProxy.applyOneRefs(Long.valueOf(l1), uoa1, uoa2, "6");
                   if (str1 != PatchProxyResult.class) {
                   }else {
                   label_00ae :
                      c.f("p0: "+l1);
                      str1 = a.a();
                      if (uoa1.f(str1) != null) {
                         uoa1.f(str1).a = l1;
                      }
                   }
                }else {
                   goto label_00ae ;
                }
                uoa.f = str1;
                PendantExtension pendantExten = uob.b.d(l);
                a uoa3 = uob.b.f(l, str);
                if (pendantExten != null && str2 != null) {
                   c.a(StageName.pendant_determine_show, uoa, uob.e);
                   DyTroubleShooting.f(uob.l, str, DACKeyNode.COMPONENT_SHOULD_SHOW, "start shouldShow", null, false, null, false, 240, null);
                   a uoa4 = new a(this, str, str1, p0, uoa3, pendantExten, str2, jsonObject);
                   uob.i.c(pendantExten.k(uob.e, str2, p0.g(), jsonObject, str, uoa3).observeOn(d.a).subscribe(v11, new d(uob, str)));
                }else {
                   String str3 = str;
                   if (pendantExten == null) {
                      f.a(uob.l, str3, "not find pendantExtension");
                   }
                }
                return;
             }
          }
       }
       str2 = map;
       goto label_0022 ;
    }
    public final c b(a p0,Map p1){
       a uoa1;
       b uob1;
       b c;
       c uoc;
       boolean b;
       b uob = this;
       a uoa = p0;
       Map map = p1;
       if (uob.b != null) {
          String str = p0.f();
          uoa1 = uob.b.f(p0.e(), p0.f());
          b l = uob.l;
          Objects.requireNonNull(PendantUtil.a);
          if (uoa1 != null) {
             uob1 = (!map || p1.isEmpty())? 1: null;
             if (!uob1) {
                f$a.c(f.a, l, str, "checkPendantInfo data", p1, false, 16, null);
                PendantMountInfo pendantMount1 = uoa1.e();
                Object obj1 = map.get("width");
                Object obj2 = map.get("height");
                Object obj3 = map.get("animationSwitch");
                Object obj4 = map.get("insertPicUrl");
                Object obj5 = map.get("priority");
                Object obj6 = map.get("layoutType");
                if (obj1 instanceof Number && pendantMount1 != null) {
                   pendantMount1.setWidth(obj1.intValue());
                }
                if (obj2 instanceof Number && pendantMount1 != null) {
                   pendantMount1.setHeight(obj2.intValue());
                }
                if (obj3 instanceof Boolean && pendantMount1 != null) {
                   pendantMount1.setAnimationSwitch(obj3.booleanValue());
                }
                if (obj4 instanceof String && pendantMount1 != null) {
                   pendantMount1.setInsertPicUrl(obj4);
                }
                if (obj5 instanceof Number && pendantMount1 != null) {
                   pendantMount1.setPriority(obj5.intValue());
                }
                if (obj6 instanceof Number && pendantMount1 != null) {
                   pendantMount1.setLayoutType(obj6.intValue());
                }
             }
          }
          if (uoa1 == null) {
             f$a.c(f.a, l, str, "checkPendantInfo failed:pendantTemple is null", DyTroubleShooting.c.m(), false, 16, null);
          }
       }else {
          f.a(uob.l, p0.f(), "checkPendantInfo error:pendantHolder is null");
       }
    label_00e4 :
       c.a(StageName.pendant_create_view_start, uoa, uob.e);
       uob1 = uob.b;
       b e = uob.e;
       c = uob.c;
       Objects.requireNonNull(uob1);
       String str1 = a.d(e);
       String str2 = p0.f();
       if (e.a() == null) {
          f$a.b(f.a, str1, str2, "createPendant failed: activity is null", null, null, 24, null);
       }else {
          long l1 = p0.e();
          JsonObject jsonObject = p0.c();
          PendantExtension pendantExten = uob1.d(l1);
          if (pendantExten == null) {
             f$a.b(f.a, str1, str2, "createPendant failed: get pendantExtension null", null, null, 24, null);
          }else {
             Object obj = uob1.g().get(Long.valueOf(l1));
             if (obj == null) {
                f$a.b(f.a, str1, str2, "createPendant failed: not find pendantTemplate", null, null, 24, null);
             }else {
                String str3 = p0.f();
                ConcurrentHashMap uConcurrentH = (str3 == null || u.S1(str3))? 1: null;
                try{
                   if (!uConcurrentH) {
                      c uoc1 = uob1.h().get(str3);
                      if (uoc1 != null) {
                         uoa1 = uoc1.f();
                         if (uoa1 != null) {
                            PendantMountInfo pendantMount = uoa1.e();
                            if (pendantMount != null) {
                               b = pendantMount.isUnCheckDuplicate();
                            label_018b :
                               if (uoc1 != null && !b) {
                                  f$a.c(f.a, uob1.d, str3, str3+" has duplicate pendant,oriTime:"+uoc1.c().h+" currTime:"+Long.valueOf(p0.d()).longValue(), null, false, 24, null);
                                  uoc1.d = PendantState.WILL_UNMOUNT;
                                  if (c != null) {
                                     c.a(uob1.j(str3));
                                  }
                               }
                            }
                         }
                      }
                      b = false;
                      goto label_018b ;
                   }
                }catch(java.lang.Exception e0){
                   f$a.b(f.a, uob1.d, str3, "checkDuplicate error", e0, null, 16, null);
                }
             label_01f4 :
                PendantExtension c1 = pendantExten.c;
                b uob2 = new b(str2, obj, pendantExten, e, jsonObject, uoa.f, p0.h(), p0.d());
                if (c1 != null) {
                   int i = 1;
                   try{
                      Class[] uClassArray = new Class[i];
                      uClassArray[0] = b.class;
                      Constructor declaredCons = c1.getDeclaredConstructor(uClassArray);
                      if (declaredCons != null) {
                         Object[] objArray = new Object[i];
                         objArray[0] = v8;
                         StageName stageName = declaredCons.newInstance(objArray);
                      label_0239 :
                         if (!stageName instanceof c) {
                            f$a.b(f.a, str1, str2, "createPendant failed: pendantClass is null or not extends BasePendant", null, null, 24, null);
                         }else {
                            uob1.h().put(str2, stageName);
                            uoc = stageName;
                         label_025a :
                            c.a(StageName.pendant_create_view_end, uoa, uob.e);
                            return uoc;
                         }
                      }
                   }catch(java.lang.Exception e0){
                      f$a.b(f.a, str1, str2, "createPendant failed: pendant class newInstance error", e0, null, 16, null);
                   }
                }
             }
          }
       }
       uoc = null;
       goto label_025a ;
    }
    public void c(ELiveEvent p0){
       b e;
       Iterator iterator;
       String str2;
       String liveId;
       b uob = this;
       f$a.k(f.a, uob.e, "dispatchEvent:"+p0.name(), null, 4, null);
       b b = uob.b;
       if (b != null) {
          e = uob.e;
          iterator = b.e().entrySet().iterator();
          while (iterator.hasNext()) {
             PendantExtension value = iterator.next().getValue();
             Objects.requireNonNull(value);
             switch (a.a[p0.ordinal()]){
                 case 1:
                   value.c(e);
                   break;
                 case 2:
                   value.d(e);
                   break;
                 case 3:
                   value.d(e);
                   break;
                 case 4:
                   value.g(e);
                   break;
                 case 5:
                   value.f(e);
                   break;
                 case 6:
                   value.a(e);
                   break;
                 case 7:
                   value.e(e);
                   break;
                 default:
             }
          }
       }
       int i = b$a.a[p0.ordinal()];
       String str = "LIVE_WATCH";
       PendantDataServer pendantDataS = 1;
       String str1 = "kwaimerchant://pendant";
       a uoa = null;
       if (i != 2) {
          if (i != 3) {
             if (i == 4) {
                b = uob.f;
                if (b != null) {
                   b.dispose();
                }
                b = uob.g;
                if (b != null) {
                   b.dispose();
                }
                uob.i.dispose();
                b = uob.d;
                b.d().dispose();
                o oo = o.c();
                pendantDataS = b.h;
                if (pendantDataS != null) {
                   str2 = pendantDataS.e();
                   if (str2 != null) {
                      str = str2;
                   }
                }
                pendantDataS = b.h;
                if (pendantDataS != null) {
                   PendantLiveContext pendantLiveC = pendantDataS.d();
                   if (pendantLiveC != null) {
                      str2 = pendantLiveC.getLiveId();
                   label_00c4 :
                      oo.n(str, str2);
                      b.h = uoa;
                      b = uob.e;
                      if (b != null) {
                         b.h();
                         uob.e = uoa;
                      }
                      e = uob.b;
                      if (e != null) {
                         try{
                            ConcurrentHashMap uConcurrentH = e.h();
                            if (uConcurrentH != null) {
                               iterator = uConcurrentH.entrySet().iterator();
                               while (iterator.hasNext()) {
                                  c value1 = iterator.next().getValue();
                                  if (value1 != null) {
                                     value1.k(0);
                                  }
                               }
                            }
                            e.h().clear();
                         }catch(java.lang.Exception e0){
                            f$a.o(f.a, e.d, "releasePendant error", e0, null, 8, null);
                         }
                      }
                   }
                }
                a uoa1 = uoa;
                goto label_00c4 ;
             }
          }else if(a.f(uob.e) == pendantDataS){
             b.t(a.i(uob.e), str1);
          }else {
             b.u(str1);
          }
          b = uob.d;
          if (b != null) {
             b.q(uob.e);
          }
          b = uob.j;
          if (b != null) {
             b.dispose();
          }
          r.c().g(uob.k);
          uob.k = uoa;
       }else if(a.f(uob.e) == pendantDataS){
          b.g(a.i(uob.e), str1, new a(a.e(uob.e), uob));
       }else {
          b.h(str1, new a(a.e(uob.e), uob));
       }
       b = uob.d;
       if (b != null) {
          e = uob.e;
          b h = uob.h;
          b uob1 = e.b();
          a uoa2 = (uob1 != null)? uob1.u(): uoa;
          b uob2 = e.b();
          if (uob2 != null) {
             uoa = uob2.getLiveStreamId();
          }
          j oj = new j(b, uoa, h);
          b.c = oj;
          if (uoa2 != null) {
             uoa2.u0(915, LiveRoomSignalMessage$SCKwaishopResourceLivePendantData.class, oj);
          }
          f$a uoa3 = f.a;
          f$a.k(uoa3, b.h, "register old signal listener", null, 4, null);
          f$a.k(uoa3, b.h, "register new signal listener", null, 4, 0);
          o oo1 = o.c();
          String str3 = e.e();
          if (str3 != null) {
             str = str3;
          }
          PendantLiveContext pendantLiveC1 = e.d();
          if (pendantLiveC1 != null) {
             liveId = pendantLiveC1.getLiveId();
             if (liveId != null) {
             label_01dc :
                g og = new g(b, h);
                Objects.requireNonNull(oo1);
                if (!PatchProxy.applyVoidThreeRefs(str, liveId, og, oo1, o.class, "21")) {
                   oo1.e(str).m(liveId, og);
                }
             }
          }
          liveId = "";
          goto label_01dc ;
       }
       uob.j = RxBus.f.f(b.class).observeOn(d.a).subscribe(new h(uob));
       if (uob.k == null) {
          uob.k = new o(uob);
          r.c().a(uob.k);
       }
    label_0227 :
       return;
    }
    public a d(){
       return this.e;
    }
    public PendantHolder e(){
       return this.b;
    }
    public void f(){
       g og;
       LifecycleOwner lifecycleOwn;
       b uob = this;
       uob.b = new PendantHolder(uob.l);
       uob.k("NativePendant", a.class, new a$a());
       uob.k("RNPendant", a.class, new a$a());
       uob.k("TKPendant", c.class, new c$b());
       b e = uob.e;
       a b = (e != null)? e.b: null;
       uob.c = new p(new PendantMountService(b, uob.l));
       DyTroubleShooting.e(a.d(uob.e), DACKeyNode.DAC_ENV_INIT, "start init RNLive", null, false, null, false, 120, null);
       RNLive rNLive = new RNLive();
       uob.a = rNLive;
       b e1 = uob.e;
       b h = uob.h;
       rNLive.d = e1;
       GifshowActivity gifshowActiv = e1.a();
       e = e1.b();
       String str = (e != null)? e.getLiveStreamId(): null;
       PendantLiveContext pendantLiveC = e1.d();
       if (gifshowActiv != null) {
          e = null;
          f uof = 1;
          String str1 = (str == null || u.S1(str))? 1: null;
          if (!str1) {
             RNHeadless rNHeadless = v11;
             RNHeadless rNHeadless1 = v11;
             rNHeadless = new RNHeadless(gifshowActiv, null, 0, 6, 0);
             LaunchModel$b uob2 = new LaunchModel$b();
             uob2.i("KwaishopCLivePendant");
             uob2.j("rnLive");
             uob2 = uob2.k(uof);
             uob2.g(e);
             LaunchModel$b uob3 = uob2.f("enableBackBtnHandler", e);
             uob3 = uob3.e("liveStreamId", str).d("liveContext", pendantLiveC);
             str1 = (pendantLiveC != null)? pendantLiveC.getRouterSessionId(): null;
             uob3 = uob3.e("routerToken", str1);
             str1 = (pendantLiveC != null)? pendantLiveC.getLiveId(): null;
             uob2 = uob3.e("tsPageId", str1);
             try{
                Map value = a.t().getValue("RNLiveLaunchConfig", new f().getType(), t0.z());
                if (value != null) {
                   Iterator iterator = value.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      String key = uEntry.getKey();
                      uob2.e(key, uEntry.getValue());
                   }
                }
             }catch(java.lang.Exception e0){
                Throwable throwable = e0;
                String str2 = (pendantLiveC)? pendantLiveC.getLiveId(): null;
                DyTroubleShooting.j(str2, DACKeyNode.DAC_FRAMEWORK, "rnLive getSwitchConfig error", throwable, null, false, null, 112, null);
             }
             GifshowActivity gifshowActiv1 = gifshowActiv;
             e uoe = new e(rNLive, str, pendantLiveC, gifshowActiv1, h);
             rNHeadless1.u = v7;
             rNHeadless1.v = a.d(rNLive.d);
             og = null;
             rNHeadless1.g(gifshowActiv1, og, uob2.h());
             rNHeadless1.Gg(new c(rNHeadless1, v7));
             rNLive.a = rNHeadless1;
             rNLive.b = new a("RNLive_"+str, a.d(e1));
          label_018f :
             uob.e.e = uob.a;
             if (uob.d == null) {
                uob.d = new PendantDataServer();
             }
             uob.f = uob.d.f().subscribe(new g(uob), new m(uob));
             uob.g = uob.d.c().subscribe(new a(uob), new l(uob));
             e = uob.d;
             b e2 = uob.e;
             e.h = e2;
             PendantLiveContext pendantLiveC1 = e2.d();
             String liveId = (pendantLiveC1 != null)? pendantLiveC1.getLiveId(): og;
             e.i = liveId;
             b uob1 = e2.b();
             if (uob1 != null) {
                uob1.d();
             }
             uob1 = e2.b();
             liveId = (uob1 != null)? uob1.getLiveStreamId(): og;
             e.g = liveId;
             o oo = o.c();
             g og1 = e.g(e.h);
             uof = new f(e, e2);
             Objects.requireNonNull(oo);
             if (!PatchProxy.applyVoidTwoRefs(og1, uof, oo, o.class, "7")) {
                if (TextUtils.isEmpty(og1.a)) {
                   c.b("register failed pageContext or pageCode is null");
                   uof.a(new HashMap());
                }else if(!g.c(og1.a)){
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(Integer.valueOf(30));
                   oo.t(og1.a, h.d(og1), uArrayList, uof, false, "LiveWatchDy");
                }
                oo.f(og1).h(og1, uof);
             }
             uob.i.c(uob.h.g(Boolean.TRUE).subscribe(new k(uob), new j(uob)));
             return;
          }
       }
       og = null;
       goto label_018f ;
    }
    public boolean g(String p0){
       boolean b = DynamicPendantSwitch.a(a.f(this.e), p0);
       f.e(this.e, p0+" isConfigDynamic:"+b);
       return b;
    }
    public void h(String p0,String p1,Map p2){
       try{
          if (this.c != null && (this.b == null || (TextUtils.x(p0) && TextUtils.x(p1)))) {
             return;
          }else {
             DyTroubleShooting.c(this.l, p0, "mountInfoChange");
             if (!TextUtils.x(p0)) {
                c uoc = this.b.b(p0);
                if (uoc != null) {
                   this.c.d(uoc, p2);
                }else {
                   DyTroubleShooting.c(this.l, p0, "mountInfoChange not find pendant");
                }
             }else {
                List list = this.b.c(p1);
                if (q.f(list)) {
                   return;
                }else {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      this.c.d(iterator.next(), p2);
                   }
                }
             }
          }
       }catch(java.lang.Exception e11){
          DyTroubleShooting.l(this.l, p0, "mountInfoChange error", e11, null, false, null, 112, null);
       }
       return;
    }
    public void i(List p0){
       boolean b;
       f$a a = f.a;
       b te = this.e;
       try{
          Objects.requireNonNull(a);
          String str = a.d(te);
          if (p0 != null) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa.a() != 3) {
                   b = (uoa.g() == DataSource.ROUTER || uoa.g() == DataSource.NONE)? true: false;
                   DyTroubleShooting c = DyTroubleShooting.c;
                   String str1 = uoa.f();
                   a j = uoa.j;
                   if (j == null) {
                      j = uoa.b();
                   }
                   if (j == null) {
                      j = Long.valueOf(uoa.e());
                   }
                   c.a(str, str1, j.toString(), b);
                }
                Map map = DyTroubleShooting.c.m();
                map.put("componentData", uoa.c());
                DyTroubleShooting.f(str, uoa.f(), DACKeyNode.COMPONENT_DATA_CHECK, "processAction source:"+uoa.g().name()+" action:"+uoa.a(), map, true, null, false, 192, null);
             }
          }
       }catch(java.lang.Exception e0){
          b$a.b(b.a, "logProcessAction error", e0, null, 4, null);
       }
       if (this.h.f()) {
          this.j(p0);
       }else {
          this.i.c(this.h.g(p0).subscribe(new f(this), new i(this)));
       }
       return;
    }
    public synchronized final void j(List p0){
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa == null) {
             continue ;
          }else {
             f$a a = f.a;
             f$a.f(a, this.l, uoa.f(), "startProcessBusinessData action:"+uoa.a(), null, false, 24, null);
             int i = uoa.a();
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      continue ;
                   }else {
                      List list = this.b.i(uoa);
                      if (list != null) {
                         Iterator iterator1 = list.iterator();
                         while (iterator1.hasNext()) {
                            c uoc = iterator1.next();
                            uoc.h(uoa.c(), uoa.g());
                            this.c.a(uoc);
                            c c = uoc.c;
                            a uoa1 = uoc.f();
                            if (c != null) {
                               c.h(this.e, uoa.c(), uoa.g(), a.b(uoa1));
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }else if(!a.j(this.b, uoa.f())){
                   this.a(uoa);
                }else {
                   b tb = this.b;
                   if (tb != null) {
                      String str = uoa.f();
                      JsonObject jsonObject = uoa.c();
                      Objects.requireNonNull(tb);
                      if (str != null) {
                         f$a.t(a, tb.d, str, "updatePendant", null, false, false, 56, null);
                         c uoc1 = tb.h().get(str);
                         if (uoc1 != null) {
                            uoc1.j(jsonObject);
                         }
                         if (uoc1 == null) {
                            f$a.t(a, tb.d, str, "updatePendant failed:pendant not exist", null, false, false, 56, null);
                         }
                      }
                   }
                }
             }else {
                this.a(uoa);
             }
          }
       }
       return;
    }
    public void k(String p0,Class p1,PendantExtension p2){
       b tb = this.b;
       if (tb != null) {
          p2.c = p1;
          tb.e().put(p0, p2);
       }
       return;
    }
    public final void l(c p0){
       a a;
       if (p0 == null) {
          return;
       }
       if (p0 instanceof BaseDynamicPendant) {
          PendantMountInfo pendantMount = p0.f().e();
          boolean waitRendered = (pendantMount != null)? pendantMount.getWaitRendered(): false;
          a.b(p0.f());
          if (!waitRendered) {
             this.c.c(p0);
          }
          BaseDynamicPendant j = p0.j;
          if (j != null) {
             a = j.a;
             if (a != null) {
             label_0035 :
                this.i.c(a.observeOn(d.a).subscribe(new c(this, p0, waitRendered), new b(this, p0)));
             }
          }
          a = t.empty();
          goto label_0035 ;
       }else {
          this.c.c(p0);
       }
       return;
    }
}
