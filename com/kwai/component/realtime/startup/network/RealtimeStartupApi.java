package com.kwai.component.realtime.startup.network.RealtimeStartupApi;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import ig5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Thread;
import java.lang.CharSequence;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import t45.d;
import o56.d;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.log.h;
import cjd.e;
import erd.o;

public final class RealtimeStartupApi	// class@000b12
{
    public static AtomicBoolean mIsCodeStart;

    public void RealtimeStartupApi(){
       super();
    }
    public static t createRealtimeStartupRequest(Map p0,RequestTiming p1,boolean p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(RealtimeStartupApi.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, RealtimeStartupApi.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean andSet = RealtimeStartupApi.getIsCodeStart().getAndSet(false);
       int i = -1961311520;
       uoa = ((Thread.currentThread().getName()).contains("rtf-api"))? e.b(b.a(i).a(RouteType.API, null), uoa): e.b(b.a(i).a(RouteType.API, d.b), uoa);
       a uoa1 = uoa;
       uoa = 1;
       int i1 = -1343064608;
       if (p2) {
          if (!andSet || !d.d) {
             uoa = 0;
          }
          return uoa1.b(andSet, uoa, b.a(i1).b(), b.a(0x4b316083).getSessionId(), p0, p1).map(new e());
       }else if(andSet && d.d){
          uoa = 0;
       }
       return uoa1.a(andSet, uoa, b.a(i1).b(), b.a(0x4b316083).getSessionId(), p0, p1).map(new e());
    }
    public static synchronized AtomicBoolean getIsCodeStart(){
       _monitor_enter(RealtimeStartupApi.class);
       Object obj = PatchProxy.apply(null, null, RealtimeStartupApi.class, "2");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(RealtimeStartupApi.class);
          return obj;
       }else if(RealtimeStartupApi.mIsCodeStart == null){
          RealtimeStartupApi.mIsCodeStart = new AtomicBoolean(RealtimeStartupApi.isColdStartUp());
       }
       _monitor_exit(RealtimeStartupApi.class);
       return RealtimeStartupApi.mIsCodeStart;
    }
    public static boolean isColdStartUp(){
       boolean b;
       w obj = PatchProxy.apply(null, null, RealtimeStartupApi.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-1343064608);
       b = (obj != null && obj.isColdStart())? true: false;
       return b;
    }
}
