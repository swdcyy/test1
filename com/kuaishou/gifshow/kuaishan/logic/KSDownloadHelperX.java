package com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import x80.a;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$Companion$sInstance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Object;
import km8.b;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import eb7.a;
import android.app.Application;
import o56.a;
import wkd.b;
import c0d.a;
import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$b;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.b;
import io.reactivex.g;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.Integer;
import jb7.a;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import kb7.a;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import com.kuaishou.gifshow.kuaishan.logic.c;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.d;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.e;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$c;
import java.lang.System;
import java.util.Map;
import java.util.ArrayList;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.Pair;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import java.util.List;
import java.lang.Iterable;
import java.io.File;
import x80.j;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$d;
import java.lang.Long;
import oa0.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class KSDownloadHelperX implements a	// class@0019f3
{
    public String a;
    public final a b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final CopyOnWriteArrayList i;
    public final KSDownloadHelperX$b j;
    public boolean k;
    public String l;
    public static final p m;
    public static final SharedPreferences n;
    public static final KSDownloadHelperX$a o;

    static {
       KSDownloadHelperX.o = new KSDownloadHelperX$a(null);
       KSDownloadHelperX.m = s.b(LazyThreadSafetyMode.SYNCHRONIZED, KSDownloadHelperX$Companion$sInstance$2.INSTANCE);
       Object obj = b.b("kuaishan_md5_list_");
       a.o(obj, "PreferenceContext.get\(\n ¡­  RESOURCE_CHECKLIST_KEY\)");
       KSDownloadHelperX.n = obj;
    }
    public void KSDownloadHelperX(){
       super();
       this.a = "";
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv\n      .getAppContext\(\)");
       this.b = new a(uApplication, b.a(0x1a7467ca));
       this.c = new HashMap();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = new CopyOnWriteArrayList();
       Application uApplication1 = a.b();
       a.o(uApplication1, "AppEnv.getAppContext\(\)");
       Object obj = b.a(0x1a7467ca);
       a.o(obj, "Singleton.get\(DnsResolver::class.java\)");
       KSDownloadHelperX$b uob = new KSDownloadHelperX$b(this, uApplication1, "FLASH_FILTER", ":ks-features:ft-post:kuaishan", obj);
       this.j = v0;
    }
    public void KSDownloadHelperX(u p0){
       super();
       this.a = "";
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv\n      .getAppContext\(\)");
       this.b = new a(uApplication, b.a(0x1a7467ca));
       this.c = new HashMap();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = new CopyOnWriteArrayList();
       Application uApplication1 = a.b();
       a.o(uApplication1, "AppEnv.getAppContext\(\)");
       Object obj = b.a(0x1a7467ca);
       a.o(obj, "Singleton.get\(DnsResolver::class.java\)");
       KSDownloadHelperX$b uob = new KSDownloadHelperX$b(this, uApplication1, "FLASH_FILTER", ":ks-features:ft-post:kuaishan", obj);
       this.j = new CopyOnWriteArrayList();
    }
    public static final t h(KSTemplateDetailInfo p0,String p1,boolean p2){
       t obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KSDownloadHelperX.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, KSDownloadHelperX.class, "32");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       KSDownloadHelperX$a o = KSDownloadHelperX.o;
       Objects.requireNonNull(o);
       if (PatchProxy.isSupport(KSDownloadHelperX$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), o, KSDownloadHelperX$a.class, "12");
          if (obj != patchProxyRe) {
          label_0056 :
             return obj;
          }
       }
       a.p(p0, "templateInfo");
       a.p(p1, "downloadSourceType");
       obj = t.create(new b(p0, p2, p1));
       a.o(obj, "Observable.create { emit¡­ceType, listener\)\n      }");
       goto label_0056 ;
    }
    public static final KSDownloadHelperX l(){
       Object obj = PatchProxy.apply(null, null, KSDownloadHelperX.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSDownloadHelperX.o.a();
    }
    public static final String n(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSDownloadHelperX.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSDownloadHelperX.o.d(p0);
    }
    public static final boolean o(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSDownloadHelperX.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KSDownloadHelperX.o.e(p0);
    }
    public static final t p(KSTemplateDetailInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDownloadHelperX$a obj = PatchProxy.applyOneRefs(p0, null, KSDownloadHelperX.class, "31");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KSDownloadHelperX.o;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, KSDownloadHelperX$a.class, "11");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "templateInfo");
          e.w("Download AE builtin res for template starts, templateId="+p0.mTemplateId);
          if (!obj.f(p0)) {
             ot = t.just(Integer.valueOf(100));
             a.o(ot, "Observable.just\(KuaiShanSettings.ONE_HUNDRED\)");
          }else {
             obj.a().r("");
             ot = ResourceSdk.d(ResourceSdk.f, new a("FLASH_FILTER", 1, Object.class), null, 2, null).a(CachePolicy.NETWORK_ELSE_CACHE).doOnError(c.b).map(d.b).flatMap(e.b);
             a.o(ot, "createRepo\(bizConfig\).fe¡­Sdk\(infoList\)\n          }");
          }
       }
       return ot;
    }
    public void a(DownloadConfig p0,ClipTemplateDownloadListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDownloadHelperX.class, "8")) {
          return;
       }
       a.p(p0, "downloadConfig");
       a.p(p1, "listener");
       Object[] objArray = new Object[0];
       e.D().s("KS_Hodor", "downloadSharedRes : "+p0.getFileName(), objArray);
       KSDownloadHelperX$c uoc = new KSDownloadHelperX$c(this);
       String str = "";
       String fileName = p0.getFileName();
       if (fileName == null) {
          fileName = "";
       }
       str = str+fileName+String.valueOf(System.currentTimeMillis());
       this.g.put(p0.getId(), str);
       if (this.h.contains(str)) {
          Object obj = this.h.get(str);
          a.m(obj);
          obj.add(p1);
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p1);
          this.h.put(str, uArrayList);
          this.b.d(p0, uoc);
       }
       p1.onStart(p0.getId());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, KSDownloadHelperX.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KS_Hodor", "cancelAeBuiltInResDownload", objArray);
       if (this.k != null) {
          this.j.b(this.l);
       }
       return;
    }
    public void c(PostBaseResourceDownloadHelper$InfoWithResource p0,String p1){
       this.g(p0, p1);
    }
    public void d(PostBaseResourceDownloadHelper$InfoWithResource p0,String p1,PostBaseResourceDownloadHelper$a p2){
       this.i(p0, p1, p2);
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDownloadHelperX.class, "6")) {
          return;
       }
       a.p(p0, "downloadSourceType");
       Object[] objArray = new Object[0];
       e.D().s("KS_Hodor", "cancelTemplateDownloadByType : all tasks with type "+p0, objArray);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.f.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (TextUtils.n(uEntry.getKey().getSecond(), p0)) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       Iterator iterator1 = linkedHashMa.values().iterator();
       while (iterator1.hasNext()) {
          this.b.b(iterator1.next().getId());
       }
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDownloadHelperX.class, "9")) {
          return;
       }
       a.p(p0, "taskId");
       Object[] objArray = new Object[0];
       e.D().s("KS_Hodor", "cancelSharedResDownload : "+p0, objArray);
       List list = this.m(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().onCancel();
          }
       }
       String str = this.g.get(p0);
       if (str != null) {
          this.h.remove(str);
          str = this.g.remove(p0);
       }
       this.b.b(p0);
       return;
    }
    public void g(KSTemplateDetailInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDownloadHelperX.class, "5")) {
          return;
       }
       a.p(p0, "downloadInfo");
       a.p(p1, "downloadSourceType");
       Object[] objArray = new Object[0];
       e.D().s("KS_Hodor", "cancelTemplateDownload : "+p0.mTemplateId, objArray);
       DownloadConfig uDownloadCon = this.f.get(this.k(p0, p1));
       if (uDownloadCon != null) {
          this.b.b(uDownloadCon.getId());
       }
       return;
    }
    public void i(KSTemplateDetailInfo p0,String p1,PostBaseResourceDownloadHelper$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSDownloadHelperX.class, "4")) {
          return;
       }
       a.p(p0, "downloadInfo");
       a.p(p1, "downloadSourceType");
       a.p(p2, "listener");
       String str = "downloadTemplate : ";
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().s("KS_Hodor", str+p0.mTemplateId, objArray);
       KSTemplateDetailInfo mTemplateId = p0.mTemplateId;
       a.o(mTemplateId, "downloadInfo.mTemplateId");
       this.c.put(mTemplateId, p2);
       if (this.f.containsKey(this.k(p0, p1))) {
          Object[] objArray1 = new Object[i];
          e.D().s("KS_Hodor", str+p0.mTemplateId+" is downloading, join in", objArray1);
          return;
       }else {
          KSDownloadHelperX$a o = KSDownloadHelperX.o;
          File uFile = new File(o.b(p0)+o.c(p0));
          if (uFile.exists()) {
             uFile.delete();
          }
          mTemplateId = p0.mTemplateId;
          a.o(mTemplateId, "downloadInfo.mTemplateId");
          this.d.put(mTemplateId, uFile);
          j oj = PatchProxy.applyOneRefs(p0, this, KSDownloadHelperX.class, "18");
          if (oj != PatchProxyResult.class) {
          }else {
             oj = new j(this, p0);
          }
          this.e.put(oj.getId(), Long.valueOf(System.currentTimeMillis()));
          this.f.put(this.k(p0, p1), oj);
          this.b.d(oj, new KSDownloadHelperX$d(this, p0, p1));
          return;
       }
    }
    public final String j(boolean p0){
       KSDownloadHelperX kSDownloadHe = KSDownloadHelperX.class;
       if (PatchProxy.isSupport(kSDownloadHe)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, kSDownloadHe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          String str = a.a.getString("ae_builtin_res_path", "");
          a.o(str, "DefaultPreferenceHelper.getAeBuiltinResPath\(\)");
          return str;
       }else {
          return this.a;
       }
    }
    public final Pair k(KSTemplateDetailInfo p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSDownloadHelperX.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(p0.mTemplateId, p1);
    }
    public final List m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDownloadHelperX.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       p0 = this.g.get(p0);
       if (p0 == null) {
          return null;
       }
       a.o(p0, "mSharedResIdFileNameMap[taskId] ?: return null");
       return this.h.get(p0);
    }
    public final void q(KSTemplateDetailInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDownloadHelperX.class, "21")) {
          return;
       }
       File uFile = this.d.remove(p0.mTemplateId);
       if (uFile != null && uFile.exists()) {
          uFile.delete();
       }
       this.c.remove(p0.mTemplateId);
       DownloadConfig uDownloadCon = this.f.remove(this.k(p0, p1));
       if (uDownloadCon != null) {
          this.e.remove(uDownloadCon.getId());
       }
       return;
    }
    public final void r(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDownloadHelperX.class, "1")) {
          return;
       }
       a.p(p0, "path");
       this.a = p0;
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("ae_builtin_res_path", p0);
       g.a(uEditor);
       return;
    }
}
