package com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import vz2.a;
import vz2.b;
import com.kuaishou.live.effect.resource.download.common.i;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.u1;
import com.kuaishou.live.effect.resource.download.common.j;
import com.kuaishou.live.effect.resource.download.common.g;
import com.kuaishou.live.effect.resource.download.common.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.util.List;
import pp.c;
import uz2.b$a;
import uz2.b;
import c03.b;
import java.lang.Boolean;
import tz2.b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import java.lang.Enum;
import trd.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import uz2.a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.kuaishou.live.effect.resource.download.v2.d;
import com.kuaishou.live.effect.resource.download.common.p;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$MagicGiftDownloadState;
import w51.a;
import xf6.l;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$a;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$b;
import vz2.v;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import vz2.s;
import erd.g;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.io.File;
import sz2.g;
import wz2.a;
import java.lang.Integer;
import vz2.o;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;
import com.kuaishou.live.effect.resource.download.common.MagicGiftNetworkMonitor;
import com.kuaishou.live.effect.resource.download.common.o;
import android.content.IntentFilter;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.util.ArrayList;
import java.util.Collection;
import com.kuaishou.live.effect.resource.download.common.b;
import xz2.a;
import vz2.f;
import ixc.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import com.kuaishou.live.effect.resource.download.common.m;
import erd.o;
import com.kuaishou.live.effect.resource.download.common.n;
import vz2.u;
import com.kuaishou.live.effect.resource.download.common.k;
import vz2.r;
import java.util.Set;
import vz2.m;
import java.util.concurrent.Future;
import vz2.l;
import vz2.c0;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.i;
import java.util.Iterator;
import java.util.Map$Entry;
import qkd.b;
import com.kuaishou.live.effect.resource.download.common.h;
import java.lang.Long;
import lrd.b;
import vz2.t;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import io.reactivex.subjects.PublishSubject;
import vz2.q;
import com.kuaishou.live.effect.resource.download.common.l;

public class LiveMagicGiftDownloadController implements a	// class@001b29
{
    public final List a;
    public final b b;
    public final int c;
    public final int d;
    public final long e;
    public Map f;
    public Map g;
    public final Map h;
    public LiveMagicGiftDownloadController$MagicGiftDownloadState i;
    public int j;
    public MagicGiftNetworkMonitor k;
    public final a l;
    public int m;
    public Future n;
    public b o;
    public b p;
    public Set q;
    public PublishSubject r;
    public final a0 s;
    public final a0 t;
    public static final int u;

    static {
       i b;
       b uob = b.class;
       b c = b.c;
       b = i.b;
       Objects.requireNonNull(c);
       if (PatchProxy.applyVoidOneRefs(b, c, uob, "1")) {
       }else {
          a.p(b, "runnable");
          u1.a(c);
          b.a = b;
       }
       j b1 = j.b;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(b1, c, uob, "2")) {
          a.p(b1, "runnable");
          u1.a(c);
          b.b = b1;
       }
       LiveMagicGiftDownloadController.t().l.d = g.a;
    }
    public void LiveMagicGiftDownloadController(){
       boolean b;
       HashMap obj1;
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       List list = LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD.appendTag("LiveMagicGiftDownloadController");
       this.a = list;
       b$a uoa = b$a.class;
       b uob = b.class;
       d uod = PatchProxy.apply(null, this, LiveMagicGiftDownloadController.class, "4");
       if (uod != patchProxyRe) {
       }else {
          String str = "13";
          b$a obj2 = PatchProxy.apply(null, null, uob, str);
          if (obj2 != patchProxyRe) {
             b2 = obj2.booleanValue();
          }else {
             obj2 = b.a;
             Objects.requireNonNull(obj2);
             Object obj4 = PatchProxy.apply(null, obj2, uoa, "12");
             b2 = (obj4 != patchProxyRe)? obj4.booleanValue(): b.c.b();
          }
          b.P(list, "[getMagicGiftDownloadManager]enableDependencyDownload:"+b2);
          if (b2) {
             b$a obj3 = PatchProxy.apply(null, null, uob, "14");
             if (obj3 != patchProxyRe) {
             }else {
                obj3 = b.a;
                Objects.requireNonNull(obj3);
                obj3 = PatchProxy.apply(null, obj3, uoa, str);
                if (obj3 != patchProxyRe) {
                }else {
                   try{
                      String str1 = b.c.f();
                      obj1 = new HashMap();
                      obj1.put(IMagicGiftResourceLoader$Type.SO.name(), t.k("ykit_module"));
                      if (!TextUtils.x(str1)) {
                         obj3 = a.a.i(str1, new a().getType());
                         a.o(obj3, "Gsons.KWAI_GSON.fromJson¡­List<String>>>\(\) {}.type\)");
                      }
                   }catch(java.lang.Exception e1){
                      b.g0(LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD, "[LiveEffectResourceUtils][getDependencyDownloadBlacklist]", e1);
                   }
                   obj3 = obj1;
                }
             }
             uod = new d(obj3);
          }else {
             uod = new p();
          }
       }
       this.b = uod;
       this.c = 18;
       this.d = 0x13880;
       this.e = 5000;
       this.f = new ConcurrentHashMap();
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = LiveMagicGiftDownloadController$MagicGiftDownloadState.READY;
       int i = 0;
       this.j = i;
       a uoa1 = a.class;
       a uoa2 = PatchProxy.apply(null, null, uoa1, "1");
       if (uoa2 != patchProxyRe) {
       }else {
          Object obj = PatchProxy.apply(null, null, uoa1, "7");
          b = (obj != patchProxyRe)? obj.booleanValue(): b.c.a();
          if (b) {
             obj1 = PatchProxy.apply(null, null, uoa1, "2");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                obj1 = PatchProxy.apply(null, null, a.class, "44");
                b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): l.c("forceOpenLiveEffectLowDisk", i);
                if (b1) {
                   i = true;
                }else {
                   b1 = b.a(0x5f2ddeb4).h() ^ 1;
                }
             }
             i = b1;
          }
          uoa2 = new a(i);
       }
       this.l = uoa2;
       this.q = new CopyOnWriteArraySet();
       this.s = new LiveMagicGiftDownloadController$a(this);
       this.t = new LiveMagicGiftDownloadController$b(this);
       return;
    }
    public void LiveMagicGiftDownloadController(v p0){
       boolean b;
       HashMap obj1;
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       List list = LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD.appendTag("LiveMagicGiftDownloadController");
       this.a = list;
       b$a uoa = b$a.class;
       b uob = b.class;
       d uod = PatchProxy.apply(null, this, LiveMagicGiftDownloadController.class, "4");
       if (uod != patchProxyRe) {
       }else {
          String str = "13";
          b$a obj2 = PatchProxy.apply(null, null, uob, str);
          if (obj2 != patchProxyRe) {
             b2 = obj2.booleanValue();
          }else {
             obj2 = b.a;
             Objects.requireNonNull(obj2);
             Object obj4 = PatchProxy.apply(null, obj2, uoa, "12");
             b2 = (obj4 != patchProxyRe)? obj4.booleanValue(): b.c.b();
          }
          b.P(list, "[getMagicGiftDownloadManager]enableDependencyDownload:"+b2);
          if (b2) {
             b$a obj3 = PatchProxy.apply(null, null, uob, "14");
             if (obj3 != patchProxyRe) {
             }else {
                obj3 = b.a;
                Objects.requireNonNull(obj3);
                obj3 = PatchProxy.apply(null, obj3, uoa, str);
                if (obj3 != patchProxyRe) {
                }else {
                   try{
                      String str1 = b.c.f();
                      obj1 = new HashMap();
                      obj1.put(IMagicGiftResourceLoader$Type.SO.name(), t.k("ykit_module"));
                      if (!TextUtils.x(str1)) {
                         obj3 = a.a.i(str1, new a().getType());
                         a.o(obj3, "Gsons.KWAI_GSON.fromJson¡­List<String>>>\(\) {}.type\)");
                      }
                   }catch(java.lang.Exception e0){
                      b.g0(LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD, "[LiveEffectResourceUtils][getDependencyDownloadBlacklist]", e0);
                   }
                   obj3 = obj1;
                }
             }
             uod = new d(obj3);
          }else {
             uod = new p();
          }
       }
       this.b = uod;
       this.c = 18;
       this.d = 0x13880;
       this.e = 5000;
       this.f = new ConcurrentHashMap();
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = LiveMagicGiftDownloadController$MagicGiftDownloadState.READY;
       int i = 0;
       this.j = i;
       a uoa1 = a.class;
       a uoa2 = PatchProxy.apply(null, null, uoa1, "1");
       if (uoa2 != patchProxyRe) {
       }else {
          Object obj = PatchProxy.apply(null, null, uoa1, "7");
          b = (obj != patchProxyRe)? obj.booleanValue(): b.c.a();
          if (b) {
             obj1 = PatchProxy.apply(null, null, uoa1, "2");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                obj1 = PatchProxy.apply(null, null, a.class, "44");
                b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): l.c("forceOpenLiveEffectLowDisk", i);
                if (b1) {
                   i = true;
                }else {
                   b1 = b.a(0x5f2ddeb4).h() ^ 1;
                }
             }
             i = b1;
          }
          uoa2 = new a(i);
       }
       this.l = uoa2;
       this.q = new CopyOnWriteArraySet();
       this.s = new LiveMagicGiftDownloadController$a(this);
       this.t = new LiveMagicGiftDownloadController$b(this);
       return;
    }
    public static LiveMagicGiftDownloadController t(){
       return LiveMagicGiftDownloadController$c.a;
    }
    public final void A(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMagicGiftDownloadController.class, "23")) {
          return;
       }
       LiveMagicGiftDownloadController to = this.o;
       if (to != null) {
          to.dispose();
       }
       this.o = t.timer(0x13880, TimeUnit.MILLISECONDS).observeOn(d.c).subscribe(new s(this, p0));
       return;
    }
    public void B(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMagicGiftDownloadController.class, "20")) {
          return;
       }
       this.f.put(p0.mId, p0);
       this.g.remove(p0.mId);
       this.i(p0);
       this.w(new HashMap(this.f));
       b.P(this.a, "[updateMagicGiftAvailableState]£º"+p0.mId+"*"+p0.mName+" sNeedDownloadMagicGifts.size: "+this.g.size());
       return;
    }
    public boolean a(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMagicGiftDownloadController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String str = b.c(p0);
       if (TextUtils.x(str)) {
          return b;
       }
       File uFile = b.e(p0);
       if (uFile != null && (uFile.exists() && g.a(p0, uFile, "local render gift"))) {
          b = true;
       }
    label_003a :
       if (!b) {
          b.P(this.a, "[checkAndUpdateMagicFaceStatus]: remove cache£¬id:"+p0.mId+",exit:"+this.h.get(str));
          LiveMagicGiftDownloadController th = this.h;
          _monitor_enter(th);
          this.h.put(str, Boolean.FALSE);
          _monitor_exit(th);
          this.f.remove(p0.mId);
       }
       return b;
    }
    public boolean b(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMagicGiftDownloadController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v(p0, false);
    }
    public void c(String p0,boolean p1,a p2){
       if (PatchProxy.isSupport(LiveMagicGiftDownloadController.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LiveMagicGiftDownloadController.class, "32")) {
          return;
       }
       b.P(this.a, "[refreshMagicGift]£ºfrom : "+p2.d());
       this.l(0);
       this.h();
       this.f(p0, p1, p2);
       return;
    }
    public void d(List p0,int p1){
       LiveMagicGiftDownloadController liveMagicGif = LiveMagicGiftDownloadController.class;
       if (PatchProxy.isSupport(liveMagicGif) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveMagicGif, "27")) {
          return;
       }
       if (p0.isEmpty()) {
          return;
       }
       c.a(new o(this, p0, p1));
       return;
    }
    public boolean e(){
       boolean b = (this.i == LiveMagicGiftDownloadController$MagicGiftDownloadState.READY)? true: false;
       return b;
    }
    public void f(String p0,boolean p1,a p2){
       boolean b;
       int this;
       LiveMagicGiftDownloadController liveMagicGif = LiveMagicGiftDownloadController.class;
       if (PatchProxy.isSupport(liveMagicGif) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LiveMagicGiftDownloadController.class, "5")) {
          return;
       }
       a i = p2.i;
       b.P(this.a, "[asyncDownloadMagicGift]:  downloadConfig:"+p2+" liveStreamId:"+p0+" isAnchor:"+p1+" sDownloadAllMagicGiftRetryCount: "+this.j+" sDownloadAllMagicGiftState: "+this.i+" sIsLowDiskMode: "+this.l.a());
       if (this.j > 18) {
          return;
       }
       LiveMagicGiftDownloadController ti = this.i;
       if (ti == LiveMagicGiftDownloadController$MagicGiftDownloadState.COMPLETED) {
          return;
       }
       LiveMagicGiftDownloadController$MagicGiftDownloadState dOWNLOADING = LiveMagicGiftDownloadController$MagicGiftDownloadState.DOWNLOADING;
       if (ti == dOWNLOADING) {
          return;
       }
       b = (this.l.a() || LiveEffectResCleanManager.d())? true: i;
       this.i = dOWNLOADING;
       if (!PatchProxy.applyVoidOneRefs(p2, this, liveMagicGif, "15") && this.k == null) {
          MagicGiftNetworkMonitor magicGiftNet = new MagicGiftNetworkMonitor();
          this.k = magicGiftNet;
          magicGiftNet.a = new o(this, p2);
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
          UniversalReceiver.e(a.a().a(), this.k, intentFilter);
          MagicGiftNetworkMonitor.b = true;
       }
       this.j = this.j + 1;
       if (!this.g.isEmpty()) {
          ArrayList uArrayList = new ArrayList(this.g.values());
          b.P(this.a, "[asyncDownloadMagicGift]: already have needDownload MagicGifts --  size: "+this.g.size());
          this.m = uArrayList.size();
          this.r(uArrayList, p2);
          b.P(this.a, "have get magic face ids");
          return;
       }else {
          int i1 = 0;
          this.m = i1;
          int i2 = p2.d();
          Objects.requireNonNull(b.n);
          int i3 = 4;
          u ou = 2;
          this = 3;
          if (i2 != 1) {
             if (i2 != ou) {
                if (i2 != this) {
                   if (i2 != i3) {
                      i3 = 0;
                   }
                }else {
                   i3 = 3;
                }
             }else {
                i3 = 2;
             }
          }else {
             i3 = 1;
          }
          a.f("START", i3);
          LoadPolicy loadPolicy = (p2.a == 1)? 1: null;
          if (!loadPolicy) {
             i1 = f.e.b() ^ 1;
          }
          if (i1) {
             b.P(this.a, "[asyncDownloadMagicGift]: hitFrequencyControl");
             return;
          }else {
             z c = d.c;
             k ok = new k(this, i3, b, p2, p1);
             qa.s(c.class, LoadPolicy.SILENT_IF_DOWNLOADED).C(m.b).I(n.b).G(c).w(new u(p2, i3, p0, p1)).subscribeOn(c).observeOn(d.a).subscribe(i1, new r(this, i3));
             return;
          }
       }
    }
    public MagicEmoji$MagicFace g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMagicGiftDownloadController.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return this.f.get(p0);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveMagicGiftDownloadController.class, "12")) {
          return;
       }
       b.P(this.a, "[resetDownloadAllMagicGiftsState]: curState = "+this.i);
       this.i = LiveMagicGiftDownloadController$MagicGiftDownloadState.READY;
       return;
    }
    public void i(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMagicGiftDownloadController.class, "3")) {
          return;
       }
       String str = b.c(p0);
       if (str == null) {
          return;
       }
       LiveMagicGiftDownloadController th = this.h;
       _monitor_enter(th);
       this.h.put(str, Boolean.TRUE);
       _monitor_exit(th);
       return;
    }
    public void j(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMagicGiftDownloadController.class, "28")) {
          return;
       }
       this.u().a(p0);
       return;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, LiveMagicGiftDownloadController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.i == LiveMagicGiftDownloadController$MagicGiftDownloadState.COMPLETED)? true: false;
       b.P(this.a, "isDownloadAllMagicGiftsCompleted: "+b+" currentMagicIds: "+this.f.keySet());
       return b;
    }
    public void l(int p0){
       this.m = p0;
    }
    public a m(){
       return this.l;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, LiveMagicGiftDownloadController.class, "11")) {
          return;
       }
       c.a(new m(this));
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, LiveMagicGiftDownloadController.class, "6")) {
          return;
       }
       b.P(this.a, "[checkAvailableMagicGiftState]: sAvailableMagicGifts size:"+this.f.size()+",sHasExistMagicGifts size:"+this.h.size());
       LiveMagicGiftDownloadController tn = this.n;
       if (tn != null && (tn.isDone() || this.n.isCancelled())) {
          this.n = c.k(new l(this));
       }
       return;
    }
    public final void p(){
       boolean b;
       ArrayList uArrayList;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMagicGiftDownloadController.class, "8")) {
          return;
       }
       List list = c0.d();
       if (list.isEmpty()) {
          return;
       }
       File[] uFileArray = e.b().sk().listFiles();
       HashMap hashMap = new HashMap();
       if (uFileArray != null) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             String name = oobject.getName();
             if (!TextUtils.x(name)) {
                List obj = PatchProxy.applyOneRefs(name, objArray, i.class, "7");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   a.p(name, "fileName");
                   b = a.g(".nomedia", name);
                }
                if (!b) {
                   name = i.c(name);
                   obj = hashMap.get(name);
                   if (obj == null) {
                      uArrayList = new ArrayList();
                   }
                   uArrayList.add(oobject);
                   hashMap.put(name, uArrayList);
                }
             }
             i = i + 1;
          }
       }
       if (!hashMap.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             if (!LiveEffectResCleanManager.g(magicFace.mId)) {
                hashMap.remove(b.c(magicFace));
             }
          }
          LiveEffectResCleanManager.h(list);
          Objects.requireNonNull(LiveEffectResCleanManager.e);
          Iterator iterator1 = LiveEffectResCleanManager.d.iterator();
          while (iterator1.hasNext()) {
             hashMap.remove(iterator1.next());
          }
          iterator1 = hashMap.entrySet().iterator();
          while (iterator1.hasNext()) {
             iterator = iterator1.next().getValue().iterator();
             while (iterator.hasNext()) {
                File uFile = iterator.next();
                try{
                   b.x(uFile);
                   b.P(this.a, "[deleteExpiredMagicGiftFile]"+uFile);
                }catch(java.io.IOException e2){
                   b.y(this.a, "[deleteExpiredMagicGiftFile]e:", e2);
                   goto label_00d8 ;
                }
             }
          }
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, LiveMagicGiftDownloadController.class, "13")) {
          return;
       }
       this.h();
       return;
    }
    public final void r(List p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMagicGiftDownloadController.class, "29")) {
          return;
       }
       c.a(new h(this, p0, p1));
       return;
    }
    public final List s(Collection p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveMagicGiftDownloadController.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          MagicEmoji$MagicFace magicFace = iterator.next();
          if (b.f(magicFace)) {
             obj.add(magicFace);
          }
       }
       return obj;
    }
    public b u(){
       return this.b;
    }
    public final boolean v(MagicEmoji$MagicFace p0,boolean p1){
       Boolean obj;
       LiveMagicGiftDownloadController liveMagicGif = LiveMagicGiftDownloadController.class;
       if (PatchProxy.isSupport(liveMagicGif)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, liveMagicGif, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          b.P(this.a, "[hasDownloadMagicGift]: magicGift is null");
          return b;
       }else {
          String str = b.c(p0);
          if (str == null) {
             b.P(this.a, "[hasDownloadMagicGift]: fileKey is null");
             return b;
          }else {
             obj = this.h.get(str);
             if (obj == null || (obj.booleanValue() && p1)) {
                obj = Boolean.valueOf(this.u().g(p0));
                LiveMagicGiftDownloadController th = this.h;
                _monitor_enter(th);
                if (this.h.get(str) == null) {
                   this.h.put(str, obj);
                }
                _monitor_exit(th);
             }
             return obj.booleanValue();
          }
       }
    }
    public final void w(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMagicGiftDownloadController.class, "25")) {
          return;
       }
       this.x(p0, 5000);
       return;
    }
    public final void x(Map p0,long p1){
       LiveMagicGiftDownloadController liveMagicGif = LiveMagicGiftDownloadController.class;
       if (PatchProxy.isSupport(liveMagicGif) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, liveMagicGif, "26")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          liveMagicGif = this.p;
          if (liveMagicGif != null) {
             liveMagicGif.dispose();
          }
          this.p = t.timer(p1, TimeUnit.MILLISECONDS).observeOn(b.e()).subscribe(new t(this, p0, p1));
       }
       return;
    }
    public final void y(){
       LiveMagicGiftDownloadController liveMagicGif = LiveMagicGiftDownloadController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMagicGif, "21")) {
          return;
       }
       if (!this.g.size() && this.i == LiveMagicGiftDownloadController$MagicGiftDownloadState.DOWNLOADING) {
          this.i = LiveMagicGiftDownloadController$MagicGiftDownloadState.COMPLETED;
          b.P(this.a, "[updateAllMagicGiftDownloadState]£ºall down good ");
          if (!PatchProxy.applyVoid(objArray, this, liveMagicGif, "16")) {
             LiveMagicGiftDownloadController tk = this.k;
             if (tk != null) {
                if (!PatchProxy.applyVoidOneRefs(tk, this, liveMagicGif, "17")) {
                   try{
                      UniversalReceiver.f(a.b(), tk);
                   }catch(java.lang.Exception e0){
                      b.y(this.a, "safeUnregisterReceiver", e0);
                   }
                }
             }
          }
          b.P(this.a, "[updateAllMagicGiftDownloadState]£ºnotify listener all down completed");
       }
       return;
    }
    public void z(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMagicGiftDownloadController.class, "22")) {
          return;
       }
       if (a.t().u("SOURCE_LIVE").d("liveEffectResLruOpt", false)) {
          this.q.add(p0);
          if (this.r == null) {
             PublishSubject publishSubje = PublishSubject.g();
             this.r = publishSubje;
             publishSubje.debounce(3, TimeUnit.SECONDS).subscribe(new q(this), l.b);
          }
          this.r.onNext(Boolean.TRUE);
       }
       return;
    }
}
