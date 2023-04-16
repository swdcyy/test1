package com.kwai.framework.initmodule.ResourceManagerInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import za7.a;
import d76.p;
import java.util.Objects;
import kotlin.jvm.internal.a;
import o56.c;
import o56.a;
import xf6.h;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class ResourceManagerInitModule extends a	// class@001579
{

    public void ResourceManagerInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 2;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ResourceManagerInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{SwitchConfigInitModule.class};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ResourceManagerInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ResourceManagerInitModule.class, "2")) {
          ResourceSdk f = ResourceSdk.f;
          p op = PatchProxy.apply(objArray, this, ResourceManagerInitModule.class, "4");
          if (op != PatchProxyResult.class) {
          }else {
             op = new p();
          }
          Objects.requireNonNull(f);
          a.p(op, "resourceSdkConfig");
          if (!ResourceSdk.a) {
             ResourceSdk.d = op;
             ResourceSdk.a = true;
          }
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             if (h.p()) {
                ResourceSdk.c = true;
             }
             Host host = d.a().c("zhongtai");
             if (host != null && !TextUtils.x(host.toString())) {
                ResourceSdk.b = host.toString();
             }
          }
       }
    label_0072 :
       return;
    }
}
