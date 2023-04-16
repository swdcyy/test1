package com.kuaishou.live.lite.framework.root.LiveLiteJsBridgeServiceFactoryImpl;
import hb3.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import o63.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d93.c;
import lp3.e;
import hb3.e;
import za3.c;
import com.kuaishou.live.lite.framework.root.LiveLiteJsBridgeServiceFactoryImpl$createService$1;
import o63.r;

public final class LiveLiteJsBridgeServiceFactoryImpl implements d	// class@00096e
{
    public final a a;

    public void LiveLiteJsBridgeServiceFactoryImpl(a p0){
       a.p(p0, "serviceManagerProvider");
       super();
       this.a = p0;
    }
    public a a(LiveLiteModelManager p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteJsBridgeServiceFactoryImpl liveLiteJsBr = LiveLiteJsBridgeServiceFactoryImpl.class;
       c obj = PatchProxy.applyOneRefs(p0, this, liveLiteJsBr, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "modelManager");
       obj = this.a.invoke();
       e uoe = PatchProxy.applyTwoRefs(p0, obj, this, liveLiteJsBr, "2");
       if (uoe != patchProxyRe) {
       }else {
          uoe = new e(p0, obj);
       }
       return new c(new LiveLiteJsBridgeServiceFactoryImpl$createService$1(uoe), r.h);
    }
}
