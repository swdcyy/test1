package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$b;
import gb7.c;
import com.google.gson.JsonObject;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import ek0.d;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.kds.facemagic.a;
import gs6.d;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import java.lang.Long;

public final class ResourceDownLoadBridge$b implements c	// class@0015ca
{
    public final JsonObject a;
    public final Promise b;

    public void ResourceDownLoadBridge$b(JsonObject p0,Promise p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResourceDownLoadBridge$b.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       d.e("download.onCancel: id: "+p0);
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ResourceDownLoadBridge$b.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       d.e("download.onCompleted: id: "+p0+", path: "+p1);
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("resourceDirectory", p1);
       this.a.a0("error_code", Integer.valueOf(1));
       a uoa = a.a();
       a.o(uoa, "FaceMagicLoggerManager.get\(\)");
       uoa.b().a("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", this.a.toString());
       this.b.resolve(writableMap);
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ResourceDownLoadBridge$b.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "e");
       d.a("download.onFailed: id: "+p0+", e: "+p1);
       this.a.a0("error_code", Integer.valueOf(0));
       a uoa = a.a();
       a.o(uoa, "FaceMagicLoggerManager.get\(\)");
       uoa.b().a("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", this.a.toString());
       this.b.reject("0", p1.getLocalizedMessage());
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(ResourceDownLoadBridge$b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, ResourceDownLoadBridge$b.class, "4")) {
          return;
       }
       a.p(p0, "id");
       d.e("download.onProgress: id:");
       return;
    }
}
