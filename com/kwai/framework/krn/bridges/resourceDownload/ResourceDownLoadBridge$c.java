package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$c;
import com.yxcorp.download.k;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.facebook.react.bridge.Promise;
import java.lang.String;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import bk0.j;
import com.google.gson.JsonElement;
import com.yxcorp.download.DownloadManager;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.kds.krn.api.resource.ResourceDir;
import qkd.b;
import java.lang.Long;
import ek0.d;
import java.lang.Throwable;

public final class ResourceDownLoadBridge$c extends k	// class@0015cb
{
    public final Ref$ObjectRef c;
    public final Promise d;
    public final String e;

    public void ResourceDownLoadBridge$c(Ref$ObjectRef p0,Promise p1,String p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownLoadBridge$c.class, "5")) {
          return;
       }
       a.p(p0, "task");
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("status", 2);
       this.c.element.a0("result", Integer.valueOf(2));
       String str = this.c.element.toString();
       a.o(str, "reportParams.toString\(\)");
       j.b.b("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", str);
       DownloadManager.n().e(p0.getId());
       this.d.resolve(writableMap);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownLoadBridge$c.class, "4")) {
          return;
       }
       a.p(p0, "task");
       long l = b.n0(new File(ResourceDir.a().getAbsolutePath()+"/resourceDownload/"+this.e));
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("filePath", p0.getTargetFilePath());
       writableMap.putInt("status", 1);
       this.c.element.a0("result", Integer.valueOf(1));
       this.c.element.a0("cacheSize", Long.valueOf(l));
       String str = this.c.element.toString();
       a.o(str, "reportParams.toString\(\)");
       j.b.b("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", str);
       d.e("ResourceDownLoadBridge, bundleId : "+this.e+",cacheSize:"+l);
       DownloadManager.n().e(p0.getId());
       this.d.resolve(writableMap);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge$c.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "e");
       d.a("download.onFailed, taskId : "+p0.getId()+"e:"+p1);
       this.c.element.a0("result", Integer.valueOf(0));
       String str = this.c.element.toString();
       a.o(str, "reportParams.toString\(\)");
       j.b.b("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", str);
       this.d.reject("4", p1.getLocalizedMessage());
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(ResourceDownLoadBridge$c.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, ResourceDownLoadBridge$c.class, "2")) {
          return;
       }
       a.p(p0, "task");
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownLoadBridge$c.class, "1")) {
          return;
       }
       a.p(p0, "task");
       return;
    }
}
