package com.yxcorp.gifshow.init.module.DFPInitModule$2;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import com.yxcorp.gifshow.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kuaishou.android.security.base.util.KSecurityTrack$LEVEL;
import java.lang.Throwable;
import com.yxcorp.gifshow.init.module.DFPInitModule$5;
import java.lang.Enum;
import pxa.e;
import q87.c;
import k2b.u1;

public class DFPInitModule$2 implements KSecurityTrack$IKSecurityTrackCallback	// class@001969
{
    public final w a;
    public final DFPInitModule b;

    public void DFPInitModule$2(DFPInitModule p0,w p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public long getAppStartTime(){
       DFPInitModule$2 u2 = DFPInitModule$2.class;
       DFPInitModule$2 obj = PatchProxy.applyWithListener(null, this, u2, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a;
       if (obj == null) {
          PatchProxy.onMethodExit(u2, "3");
          return -1;
       }else {
          PatchProxy.onMethodExit(u2, "3");
          return obj.getAppStartTime();
       }
    }
    public long getHomeStartTime(){
       DFPInitModule$2 u2 = DFPInitModule$2.class;
       DFPInitModule$2 obj = PatchProxy.applyWithListener(null, this, u2, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a;
       if (obj == null) {
          PatchProxy.onMethodExit(u2, "4");
          return -1;
       }else {
          PatchProxy.onMethodExit(u2, "4");
          return obj.getHomeStartTime();
       }
    }
    public int getLaunchSource(){
       DFPInitModule$2 u2 = DFPInitModule$2.class;
       DFPInitModule$2 obj = PatchProxy.applyWithListener(null, this, u2, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == null) {
          PatchProxy.onMethodExit(u2, "5");
          return -1;
       }else {
          PatchProxy.onMethodExit(u2, "5");
          return obj.getLaunchSource();
       }
    }
    public String getSessionId(){
       Object obj = PatchProxy.applyWithListener(null, this, DFPInitModule$2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(DFPInitModule$2.class, "6");
       return b.a(0x4b316083).getSessionId();
    }
    public boolean isAppOnForeground(){
       DFPInitModule$2 u2 = DFPInitModule$2.class;
       Object obj = PatchProxy.applyWithListener(null, this, u2, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(u2, "7");
       return ActivityContext.g().h();
    }
    public boolean isColdStart(){
       DFPInitModule$2 u2 = DFPInitModule$2.class;
       DFPInitModule$2 obj = PatchProxy.applyWithListener(null, this, u2, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null) {
          PatchProxy.onMethodExit(u2, "2");
          return false;
       }else {
          PatchProxy.onMethodExit(u2, "2");
          return obj.isColdStart();
       }
    }
    public void log(KSecurityTrack$LEVEL p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, DFPInitModule$2.class, "1")) {
          return;
       }
       int i = DFPInitModule$5.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i != 5) {
                      e.C().v(p1, p2, p3);
                   }else {
                      e.C().e(p1, p2, p3);
                   }
                }else {
                   e.C().z(p1, p2, p3);
                }
             }else {
                e.C().v(p1, p2, p3);
             }
          }else {
             e.C().r(p1, p2, p3);
          }
       }else {
          e.C().x(p1, p2, p3);
       }
       PatchProxy.onMethodExit(DFPInitModule$2.class, "1");
       return;
    }
    public void logsdkReport(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, DFPInitModule$2.class, "8")) {
          return;
       }
       u1.Q(p0, p1);
       PatchProxy.onMethodExit(DFPInitModule$2.class, "8");
       return;
    }
}
