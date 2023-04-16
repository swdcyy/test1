package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.Promise;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import te6.b;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.kwai.kds.facemagic.a;
import gs6.d;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import ek0.d;
import com.facebook.react.bridge.ReadableMap;
import ik0.m;
import lj0.c;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.kds.krn.api.resource.ResourceDir;
import com.yxcorp.gifshow.util.v;
import zsd.u;
import qkd.b;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import ob7.a;
import jb7.a;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import pb7.a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$b;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$SubSolutionType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.b;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$c;
import java.lang.CharSequence;
import kb7.a;
import jb7.b;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import za7.a;
import c0d.a;
import android.content.Context;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$d;
import erd.o;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$e;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$f;
import erd.g;
import crd.b;
import android.text.TextUtils;

public final class ResourceDownLoadBridge extends KrnBridge	// class@0015d3
{
    public static final ResourceDownLoadBridge$a Companion;

    static {
       ResourceDownLoadBridge.Companion = new ResourceDownLoadBridge$a(null);
    }
    public void ResourceDownLoadBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public final void abortPrefetch(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "8")) {
          return;
       }
       a.p(p0, "url");
       a.p(p1, "promise");
       Integer integer = DownloadManager.n().p(p0);
       if (integer != null) {
          DownloadManager.n().c(integer.intValue());
       }
       return;
    }
    public final String animateAssetWithKey(String p0,String p1){
       a uoa;
       d uod;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "key";
       a.p(p0, obj);
       String str = b.a(-1427269270).A(p0, p1);
       try{
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0(obj, p0);
          jsonObject.c0("sub_path", p1);
          p1 = "FaceMagicLoggerManager.get\(\)";
          obj = "error_code";
          if (str == null) {
             jsonObject.a0(obj, Integer.valueOf(1));
             uoa = a.a();
             a.o(uoa, p1);
             uod = uoa.b();
             uod.a("krn_warmup_result", jsonObject.toString());
          }else {
             jsonObject.a0(obj, Integer.valueOf(0));
             uoa = a.a();
             a.o(uoa, p1);
             uod = uoa.b();
             uod.a("krn_warmup_result", jsonObject.toString());
          }
       }catch(java.lang.Exception e5){
          d.a(Log.f(e5));
       }
       return str;
    }
    public final String animateAssetWithPath(String p0,String p1){
       a uoa;
       d uod;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "url";
       a.p(p0, obj);
       String str = b.a(-1427269270).D(p0, p1);
       try{
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0(obj, p0);
          jsonObject.c0("sub_path", p1);
          p1 = "FaceMagicLoggerManager.get\(\)";
          obj = "error_code";
          if (str == null) {
             jsonObject.a0(obj, Integer.valueOf(1));
             uoa = a.a();
             a.o(uoa, p1);
             uod = uoa.b();
             uod.a("krn_warmup_result", jsonObject.toString());
          }else {
             jsonObject.a0(obj, Integer.valueOf(0));
             uoa = a.a();
             a.o(uoa, p1);
             uod = uoa.b();
             uod.a("krn_warmup_result", jsonObject.toString());
          }
       }catch(java.lang.Exception e5){
          d.a(Log.f(e5));
       }
       return str;
    }
    public final void cleanCache(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "9")) {
          return;
       }
       a.p(p0, "readableMap");
       a.p(p1, "promise");
       String str = "rootTag";
       if (!p0.hasKey(str)) {
          p1.reject("0", "rootTag is null");
          return;
       }else {
          c krnContext = this.getRNView(p0.getInt(str)).getKrnContext();
          Object obj = null;
          str = (krnContext != null)? krnContext.b(): obj;
          WritableMap writableMap = Arguments.createMap();
          String str1 = "/resourceDownload/";
          File uFile = new File(ResourceDir.a().getAbsolutePath()+str1+str);
          if (!uFile.exists()) {
             writableMap.putBoolean("result", true);
             p1.resolve(writableMap);
             return;
          }else {
             String str2 = "url";
             if (p0.hasKey(str2)) {
                String str3 = p0.getString(str2);
                try{
                   File[] uFileArray = uFile.listFiles();
                   int len = uFileArray.length;
                   int i = 0;
                   while (i < len) {
                      object oobject = uFileArray[i];
                      a.o(oobject, "file");
                      String name = oobject.getName();
                      a.o(name, "file.name");
                      String str4 = v.h(str3);
                      a.o(str4, "MD5Utils.md5\(url\)");
                      if (u.q2(name, str4, false, 2, obj)) {
                         b.q(oobject);
                         break ;
                      }
                      i = i + 1;
                   }
                   writableMap.putBoolean("result", true);
                   p1.resolve(writableMap);
                   return;
                }catch(java.lang.Exception e0){
                   writableMap.putBoolean("result", false);
                   p1.resolve(writableMap);
                   return;
                }
             }else {
                try{
                   b.p(new File(ResourceDir.a().getAbsolutePath()+str1+str));
                   writableMap.putBoolean("result", true);
                   p1.resolve(writableMap);
                   return;
                }catch(java.lang.Exception e0){
                   writableMap.putBoolean(v7, v9);
                   p1.resolve(writableMap);
                   return;
                }
             }
          }
       }
    }
    public final void dealMaterialInfo(MaterialDetailInfo p0,Promise p1,JsonObject p2,a p3,a p4,String p5){
       ResourceDownLoadBridge resourceDown = ResourceDownLoadBridge.class;
       if (PatchProxy.isSupport(resourceDown)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, resourceDown, "2")) {
             return;
          }
       }
       if (p0.getMaterialId() == null) {
          p2.c0("error_code", "3");
          p3 = a.a();
          a.o(p3, "FaceMagicLoggerManager.get\(\)");
          p3.b().a("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", p2.toString());
          p1.reject("3", "failed due to error materialId");
          return;
       }else {
          File uFile = ResourceSdk.f.f(p4.c(), p0);
          if (uFile.exists()) {
             WritableMap writableMap = Arguments.createMap();
             p2.a0("error_code", Integer.valueOf(1));
             p3 = a.a();
             a.o(p3, "FaceMagicLoggerManager.get\(\)");
             p3.b().a("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", p2.toString());
             writableMap.putString("resourceDirectory", uFile.getAbsolutePath());
             p1.resolve(writableMap);
             return;
          }else {
             p3.d(this.obtainConfig(p0, p4, p5), new ResourceDownLoadBridge$b(p2, p1));
             return;
          }
       }
    }
    public final DownloadTask$DownloadBizExtra getBizExtra(String p0){
       DownloadTask$DownloadBizExtra obj = PatchProxy.applyOneRefs(p0, this, ResourceDownLoadBridge.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DownloadTask$DownloadBizExtra();
       obj.setSubSolution(DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_KRN);
       obj.setUpBizFt(null);
       obj.setBundleId(p0);
       return obj;
    }
    public String getName(){
       return "AnimatedResource";
    }
    public final MaterialDetailInfo handleMaterialGroupInfo(Result p0,Promise p1,JsonObject p2,int p3){
       MaterialDetailInfo obj;
       int i;
       if (PatchProxy.isSupport(ResourceDownLoadBridge.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, ResourceDownLoadBridge.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       MaterialDetailInfo materialDeta = new MaterialDetailInfo(null, null, null, 0, null, null, null, null, 255, null);
       List list = p0.a();
       String str = (list == null || list.isEmpty())? 1: null;
       if (str) {
          p2.c0("error_code", "2");
          a uoa = a.a();
          a.o(uoa, "FaceMagicLoggerManager.get\(\)");
          uoa.b().a("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", p2.toString());
          p1.reject("2", "failed due to empty MaterialGroupInfo list");
          return obj;
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             MaterialGroupInfo materialGrou = iterator.next();
             List detailInfoLi = materialGrou.getDetailInfoList();
             MaterialDetailInfo boolean detailInfoLi1 = (detailInfoLi == null || detailInfoLi.isEmpty())? true: false;
             if (!detailInfoLi1) {
                List detailInfoLi2 = materialGrou.getDetailInfoList();
                a.m(detailInfoLi2);
                Iterator iterator1 = detailInfoLi2.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      detailInfoLi1 = iterator1.next();
                      String materialId = detailInfoLi1.getMaterialId();
                      if (materialId != null) {
                         if (Integer.parseInt(materialId) == p3) {
                            obj = detailInfoLi1;
                         }
                      }else {
                         i = p3;
                      }
                   }
                }
             }
             i = p3;
             continue ;
          }
          return obj;
       }
    }
    public final DownloadConfig obtainConfig(MaterialDetailInfo p0,a p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ResourceDownLoadBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ResourceDownLoadBridge$obtainConfig$1(this, p0, p2, p1);
    }
    public final void prefetch(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "6")) {
          return;
       }
       a.p(p0, "readableMap");
       a.p(p1, "promise");
       String str = "url";
       if (p0.hasKey(str)) {
          String str1 = "rootTag";
          if (p0.hasKey(str1)) {
             String str2 = "format";
             if (p0.hasKey(str2)) {
                String str3 = p0.getString(str);
                str2 = p0.getString(str2);
                int intx = p0.getInt(str1);
                String str4 = "highPriority";
                boolean booleanx = (p0.hasKey(str4))? p0.getBoolean(str4): false;
                m rNView = this.getRNView(intx);
                c krnContext = rNView.getKrnContext();
                String str5 = null;
                str4 = (krnContext != null)? krnContext.b(): str5;
                c krnContext1 = rNView.getKrnContext();
                if (krnContext1 != null) {
                   str5 = krnContext1.f();
                }
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                JsonObject jsonObject = new JsonObject();
                objectRef.element = jsonObject;
                jsonObject.c0("source", "JS");
                objectRef.element.c0(str, str3);
                objectRef.element.c0("bundleId", str4);
                objectRef.element.c0("componentName", str5);
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(str3);
                DownloadTask$DownloadBizExtra uDownloadBiz = new DownloadTask$DownloadBizExtra();
                uDownloadBiz.setBundleId(str4);
                uDownloadBiz.setSubSolution(DownloadTask$DownloadBizExtra$SubSolutionType.Dynamic_KRN);
                uDownloadReq.setBizInfo(":ks-features:ft-platform:krn-common-bridges", "dynamic_animate_bridge", uDownloadBiz);
                uDownloadReq.setDestinationDir(ResourceDir.a().getAbsolutePath()+"/resourceDownload/"+str4);
                uDownloadReq.setDestinationFileName(v.h(str3)+"."+str2);
                boolean b = true;
                uDownloadReq.setNeedCDNReport(b);
                uDownloadReq.setRetryTimes(2);
                uDownloadReq.setIsNotForceReDownload(b);
                if (booleanx) {
                   uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
                }
                b[] uobArray = new b[b];
                uobArray[0] = new ResourceDownLoadBridge$c(objectRef, p1, str4);
                DownloadManager.n().E(uDownloadReq, uobArray);
                return;
             }
          }
       }
       p1.reject("0", "url, rootTag or format are not allowed to be null ");
       return;
    }
    public final void prefetchFaceMagic(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "1")) {
          return;
       }
       a.p(p0, "readableMap");
       a.p(p1, "promise");
       String str = "faceMagicId";
       String str1 = "0";
       if (p0.hasKey(str)) {
          String str2 = "subBiz";
          if (p0.hasKey(str2)) {
             String str3 = "rootTag";
             if (p0.hasKey(str3)) {
                int intx = p0.getInt(str);
                str2 = p0.getString(str2);
                c krnContext = this.getRNView(p0.getInt(str3)).getKrnContext();
                a uoa = null;
                String str4 = (krnContext != null)? krnContext.b(): uoa;
                String str5 = 1;
                JsonObject jsonObject = (str2 == null || !str2.length())? 1: null;
                if (jsonObject || str4 == null) {
                   p1.reject(str1, "subBiz value or rootTag value or bundleId is null!");
                   return;
                }else {
                   Ref$ObjectRef objectRef = new Ref$ObjectRef();
                   jsonObject = new JsonObject();
                   objectRef.element = jsonObject;
                   jsonObject.a0("face_magic_id", Integer.valueOf(intx));
                   objectRef.element.c0("sub_biz", str2);
                   objectRef.element.c0("bundleId", str4);
                   a uoa1 = new a(str2, str5, Object.class);
                   ResourceSdk f = ResourceSdk.f;
                   b uob = ResourceSdk.d(f, uoa1, uoa, 2, uoa);
                   ReactApplicationContext reactApplica = this.getReactApplicationContext();
                   a.o(reactApplica, "reactApplicationContext");
                   a uoa2 = f.a(reactApplica, uoa1.c(), ":ks-features:ft-platform:krn-common-bridges", f.e().a());
                   t ot = uob.a(CachePolicy.NETWORK_ELSE_CACHE);
                   ResourceDownLoadBridge$e uoe = new ResourceDownLoadBridge$e(this, p1, objectRef, uoa2, uoa1, str4);
                   ot.subscribeOn(d.b).map(new ResourceDownLoadBridge$d(this, p1, objectRef, intx)).observeOn(d.a).subscribe(intx, new ResourceDownLoadBridge$f(objectRef, p1));
                   return;
                }
             }
          }
       }
       p1.reject(str1, "faceMagicId or subBiz or rootTag is null!");
       return;
    }
    public final void queryCache(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge.class, "7")) {
          return;
       }
       a.p(p0, "readableMap");
       a.p(p1, "promise");
       String str = "url";
       if (p0.hasKey(str)) {
          String str1 = "rootTag";
          if (p0.hasKey(str1)) {
             str = p0.getString(str);
             c krnContext = this.getRNView(p0.getInt(str1)).getKrnContext();
             Object obj = null;
             String str2 = (krnContext != null)? krnContext.b(): obj;
             File uFile = new File(ResourceDir.a().getAbsolutePath()+"/resourceDownload/"+str2);
             WritableMap writableMap = Arguments.createMap();
             if (uFile.exists()) {
                File[] uFileArray = uFile.listFiles();
                a.o(uFileArray, "file.listFiles\(\)");
                int len = uFileArray.length;
                int i = 0;
                while (true) {
                   if (i < len) {
                      object oobject = uFileArray[i];
                      String name = oobject.getName();
                      a.o(name, "file.name");
                      String str3 = v.h(str);
                      a.o(str3, "MD5Utils.md5\(url\)");
                      if (u.q2(name, str3, false, 2, obj)) {
                         str = oobject.getAbsolutePath();
                         a.o(str, "file.absolutePath");
                      label_00a4 :
                         if (!TextUtils.isEmpty(str)) {
                            writableMap.putString("filePath", str);
                            p1.resolve(writableMap);
                            break ;
                         }else {
                            writableMap.putString("filePath", "");
                            p1.resolve(writableMap);
                            break ;
                         }
                      }else {
                         i = i + 1;
                      }
                   }
                }
                return;
             }
             str = "";
             goto label_00a4 ;
          }
       }
       p1.reject("0", "url or rootTag are not allowed to be null!");
       return;
    }
}
