package com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;
import b03.b;
import iy2.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.lang.Object;
import km8.b;
import java.util.Map;
import nsd.u;
import java.util.Set;
import com.google.common.collect.o;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import io7.f;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import b03.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.Ref$LongRef;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$getDiskUsage$1;
import msd.p;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.Pair;
import b03.d;
import java.util.Objects;
import java.util.ArrayList;
import trd.u;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.HashSet;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import trd.t0;
import vz2.c0;
import java.lang.StringBuilder;
import uz2.b;
import uz2.b$a;
import java.io.File;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$a;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$b;
import erd.g;
import crd.b;

public final class LiveEffectResCleanManager	// class@001b52
{
    public static b a;
    public static c b;
    public static PublishSubject c;
    public static Set d;
    public static final LiveEffectResCleanManager e;

    static {
       JsonElement jsonElement;
       boolean b;
       LiveEffectResCleanManager.e = new LiveEffectResCleanManager();
       b uob = b.class;
       String str = "";
       String str1 = a.a.getString("liveEffectDownloadInfo", str);
       JsonObject jsonObject = null;
       uob = (str1 == null || str1 == str)? jsonObject: b.a(str1, uob);
       if (uob == null) {
          b uob1 = new b(0, 0, null, 0, 15, null);
       }
       LiveEffectResCleanManager.a = uob;
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       LiveEffectResCleanManager.d = set;
       c uoc = null;
       int i = 0;
       f uof = a.t().u("SOURCE_LIVE").f("liveEffectResCleanConfig");
       if (uof != null) {
          jsonElement = uof.c();
          if (jsonElement != null) {
             jsonObject = jsonElement.r();
          }
       }
       if (jsonObject != null) {
          jsonElement = jsonObject.e0("enableClean");
          if (jsonElement != null) {
             b = jsonElement.d();
          label_0071 :
             if (jsonObject != null) {
                jsonElement = jsonObject.e0("enableCleanPreload");
                if (jsonElement != null) {
                   i = jsonElement.d();
                }
             }
             if (jsonObject != null) {
                jsonElement = jsonObject.e0("disablePreloadPeriod");
                if (jsonElement != null) {
                   uoc = jsonElement.t();
                }
             }
             long l = uoc;
             boolean b1 = i;
             boolean b2 = b;
             c uoc1 = new c(0, 0, 0, b2, b1, l, 0, 71, null);
             LiveEffectResCleanManager.b = jsonElement;
             b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "cleanConfig init", "cleanConfig", LiveEffectResCleanManager.b);
          }
       }
       b = 0;
       goto label_0071 ;
    }
    public void LiveEffectResCleanManager(){
       super();
    }
    public static final long c(int p0){
       Ref$LongRef obj;
       LiveEffectResCleanManager liveEffectRe = LiveEffectResCleanManager.class;
       if (PatchProxy.isSupport(liveEffectRe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, liveEffectRe, "6");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = new Ref$LongRef();
       obj.element = 0;
       LiveEffectResCleanManager.e.e(p0, new LiveEffectResCleanManager$getDiskUsage$1(obj));
       b.d0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "getDiskUsage", "type", Integer.valueOf(p0), "ret", Long.valueOf(obj.element));
       return obj.element;
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, LiveEffectResCleanManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (LiveEffectResCleanManager.b.a() && (System.currentTimeMillis() - LiveEffectResCleanManager.a.d) - TimeUnit.DAYS.toMillis(LiveEffectResCleanManager.b.f) < 0)? true: false;
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "getEnableCleanPreload", "ret", Boolean.valueOf(b));
       return b;
    }
    public static final void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveEffectResCleanManager.class, "4")) {
          return;
       }
       String str = "sendList";
       a.p(p0, str);
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "onSend", str, p0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          String first = pair.getFirst();
          int i = (pair.getSecond().booleanValue())? 4: 1;
          d uod = LiveEffectResCleanManager.a.a().get(first);
          if (uod == null) {
             d uod1 = new d(first, i, 0, 4, null);
             LiveEffectResCleanManager.a.a().put(first, uod);
          }else {
             uod.d(i);
          }
       }
       LiveEffectResCleanManager.e.i();
       return;
    }
    public static final boolean g(String p0){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveEffectResCleanManager.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "magicId");
       boolean b = false;
       d uod = LiveEffectResCleanManager.a.a().get(p0);
       if (uod == null) {
          d uod1 = new d(p0, 1, 0, 4, null);
          LiveEffectResCleanManager.a.a().put(p0, uod);
       }
       c b1 = LiveEffectResCleanManager.b;
       int i = uod.a();
       b b2 = LiveEffectResCleanManager.a.b;
       Objects.requireNonNull(b1);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i), Long.valueOf(b2), b1, uoc, "1");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else if(i != 1){
             if (i != 2) {
                l = b1.c;
             }else if((System.currentTimeMillis() - b2) - TimeUnit.DAYS.toMillis(1) <= 0){
                l = b1.b;
             }else {
                l = b1.c;
             }
          }else {
             l = b1.a;
          }
       }else {
          goto label_006a ;
       }
       if ((System.currentTimeMillis() - uod.b()) - l > 0) {
          b = true;
       }
       return b;
    }
    public static final void h(List p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveEffectResCleanManager.class, "12")) {
          return;
       }
       a.p(p0, "all");
       b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "update", "all.size", Integer.valueOf(p0.size()));
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().mId);
       }
       HashSet hashSet = new HashSet(uArrayList);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator1 = LiveEffectResCleanManager.a.a().entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          if (hashSet.contains(uEntry.getKey())) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       a = LiveEffectResCleanManager.a;
       Map map = t0.J0(linkedHashMa);
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(map, a, b.class, "2")) {
          a.p(map, "<set-?>");
          a.c = map;
       }
       LiveEffectResCleanManager.e.i();
       return;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectResCleanManager.class, "13")) {
          return;
       }
       a.p(p0, "magicId");
       MagicEmoji$MagicFace magicFace = c0.b(p0);
       if (magicFace == null) {
          b.Z(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "[addResWhiteList]"+p0+"£¬magicFace is null");
          return;
       }else {
          p0 = b.a.b(magicFace);
          if (p0 != null) {
             LiveEffectResCleanManager.d.add(p0);
          }
          return;
       }
    }
    public final c b(){
       return LiveEffectResCleanManager.b;
    }
    public final void e(int p0,p p1){
       LiveEffectResCleanManager liveEffectRe = LiveEffectResCleanManager.class;
       if (PatchProxy.isSupport(liveEffectRe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveEffectRe, "8")) {
          return;
       }
       Iterator iterator = LiveEffectResCleanManager.a.a().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          MagicEmoji$MagicFace magicFace = c0.b(uEntry.getKey());
          if (magicFace != null) {
             File uFile = b.a.d(magicFace);
             if (uFile != null && uFile.exists()) {
                int i = uEntry.getValue().a() & p0;
                if (i > 0) {
                   p1.invoke(uFile, uEntry.getValue());
                }
             }
          }
       }
       return;
    }
    public final void i(){
       PublishSubject publishSubje;
       if (PatchProxy.applyVoid(null, this, LiveEffectResCleanManager.class, "9")) {
          return;
       }
       if (LiveEffectResCleanManager.c == null) {
          publishSubje = PublishSubject.g();
          LiveEffectResCleanManager.c = publishSubje;
          a.m(publishSubje);
          publishSubje.debounce(3, TimeUnit.SECONDS).subscribe(LiveEffectResCleanManager$a.b, LiveEffectResCleanManager$b.b);
       }
       publishSubje = LiveEffectResCleanManager.c;
       a.m(publishSubje);
       publishSubje.onNext(Boolean.TRUE);
       return;
    }
}
