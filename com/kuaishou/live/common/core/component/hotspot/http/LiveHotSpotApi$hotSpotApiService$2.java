package com.kuaishou.live.common.core.component.hotspot.http.LiveHotSpotApi$hotSpotApiService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import xn1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.http.LiveHotSpotApi;
import java.util.Objects;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import retrofit2.q;
import com.yxcorp.retrofit.e;
import retrofit2.q$b;

public final class LiveHotSpotApi$hotSpotApiService$2 extends Lambda implements a	// class@001428
{
    public static final LiveHotSpotApi$hotSpotApiService$2 INSTANCE;

    static {
       LiveHotSpotApi$hotSpotApiService$2.INSTANCE = new LiveHotSpotApi$hotSpotApiService$2();
    }
    public void LiveHotSpotApi$hotSpotApiService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       LiveHotSpotApi obj = PatchProxy.apply(null, this, LiveHotSpotApi$hotSpotApiService$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveHotSpotApi.b;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.applyOneRefs(a.class, obj, LiveHotSpotApi.class, str);
       if (uoa == patchProxyRe) {
          uoa = e.a(b.a(-1961311520).a(RouteType.LIVE, d.b)).c().d().a(a.class);
       }
       return uoa;
    }
}
