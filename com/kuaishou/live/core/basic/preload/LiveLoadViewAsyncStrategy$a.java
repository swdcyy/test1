package com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import w51.a;
import java.lang.Number;
import xf6.l;
import java.util.List;
import z1.e;
import c12.o;
import java.util.Map;

public final class LiveLoadViewAsyncStrategy$a	// class@0008c3
{

    public void LiveLoadViewAsyncStrategy$a(){
       super();
    }
    public void LiveLoadViewAsyncStrategy$a(u p0){
       super();
    }
    public final LiveLoadViewAsyncStrategy a(){
       int i;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLoadViewAsyncStrategy$a uoa = LiveLoadViewAsyncStrategy$a.class;
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, uoa, "3");
       if (obj != patchProxyRe) {
       }else {
          int i1 = 0;
          if (LiveLoadViewAsyncStrategy.serverStrategy == null) {
             LiveLoadViewAsyncStrategy.serverStrategy = Integer.valueOf(a.t().a("liveViewLoadingStrategy", i1));
             b.c0(LiveLogTag.LIVE_PRELOAD, "liveViewLoadingStrategy", "server", LiveLoadViewAsyncStrategy.serverStrategy);
          }
          if (!SystemUtil.I()) {
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             if (!uoc.c()) {
             label_008a :
                obj = LiveLoadViewAsyncStrategy.serverStrategy;
             }
          }
          Object obj2 = PatchProxy.apply(objArray, objArray, a.class, "49");
          if (obj2 != patchProxyRe) {
             i = obj2.intValue();
          }else {
             i = l.e("liveViewLoadingStrategy", i1);
             if (i >= 0 && i <= a.c.size()) {
                i1 = i;
             }
             i = a.c.get(i1).b.intValue();
          }
          if (i != -1) {
             obj = Integer.valueOf(i);
          }else {
             goto label_008a ;
          }
       }
       if (obj != null) {
          i = obj.intValue();
          if (!o.d()) {
             return LiveLoadViewAsyncStrategy.DISABLE;
          }else if(PatchProxy.isSupport(uoa)){
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoa, "2");
             if (obj1 != patchProxyRe) {
             label_00bd :
                if (obj1 != null) {
                   return obj1;
                }else {
                   return LiveLoadViewAsyncStrategy.DISABLE;
                }
             }
          }
          obj1 = LiveLoadViewAsyncStrategy.mapping.get(Integer.valueOf(i));
          goto label_00bd ;
       }else {
          return LiveLoadViewAsyncStrategy.DISABLE;
       }
    }
}
