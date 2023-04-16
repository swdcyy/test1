package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$e;
import erd.g;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.internal.Ref$ObjectRef;
import ob7.a;
import jb7.a;
import java.lang.String;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;

public final class ResourceDownLoadBridge$e implements g	// class@0015cd
{
    public final ResourceDownLoadBridge b;
    public final Promise c;
    public final Ref$ObjectRef d;
    public final a e;
    public final a f;
    public final String g;

    public void ResourceDownLoadBridge$e(ResourceDownLoadBridge p0,Promise p1,Ref$ObjectRef p2,a p3,a p4,String p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ResourceDownLoadBridge$e.class, "1")) {
       }else {
          a.o(obj, "result");
          this.b.dealMaterialInfo(obj, this.c, this.d.element, this.e, this.f, this.g);
       }
       return;
    }
}
