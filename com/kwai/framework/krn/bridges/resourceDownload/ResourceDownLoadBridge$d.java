package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$d;
import erd.o;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;

public final class ResourceDownLoadBridge$d implements o	// class@0015cc
{
    public final ResourceDownLoadBridge b;
    public final Promise c;
    public final Ref$ObjectRef d;
    public final int e;

    public void ResourceDownLoadBridge$d(ResourceDownLoadBridge p0,Promise p1,Ref$ObjectRef p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       MaterialDetailInfo materialDeta = PatchProxy.applyOneRefs(p0, this, ResourceDownLoadBridge$d.class, "1");
       if (materialDeta != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          materialDeta = this.b.handleMaterialGroupInfo(p0, this.c, this.d.element, this.e);
       }
       return materialDeta;
    }
}
