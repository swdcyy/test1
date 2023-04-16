package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$f;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import com.kwai.kds.facemagic.a;
import kotlin.jvm.internal.a;
import gs6.d;
import com.google.gson.JsonElement;

public final class ResourceDownLoadBridge$f implements g	// class@0015ce
{
    public final Ref$ObjectRef b;
    public final Promise c;

    public void ResourceDownLoadBridge$f(Ref$ObjectRef p0,Promise p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownLoadBridge$f.class, "1")) {
       }else {
          this.b.element.c0("error_code", "0");
          a uoa = a.a();
          a.o(uoa, "FaceMagicLoggerManager.get\(\)");
          uoa.b().a("KRN_ANIMATE_STATIC_RESOURCES_PREFETCH_EVENT", this.b.element.toString());
          a.o(p0, "it");
          this.c.reject("0", p0.getLocalizedMessage());
       }
       return;
    }
}
