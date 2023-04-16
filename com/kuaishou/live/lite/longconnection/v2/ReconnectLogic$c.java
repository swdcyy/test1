package com.kuaishou.live.lite.longconnection.v2.ReconnectLogic$c;
import lf3.b;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic;
import com.kuaishou.live.longconnection.exception.ClientException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.longconnection.exception.EnterRoomTimeOutException;
import com.kuaishou.live.longconnection.exception.BootstrapClientException;
import com.kuaishou.live.longconnection.exception.HeartBeatInterruptException;
import com.kuaishou.live.longconnection.exception.HorseRaceFailedException;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.Throwable;
import d61.m;
import hf3.a;
import mf3.a;
import ekd.r0;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import ac3.o;
import java.lang.Runnable;
import java.lang.Boolean;
import msd.l;
import com.kuaishou.live.longconnection.exception.LiveLongConnectionServerException;
import com.yxcorp.gifshow.exception.ServerException;
import qf3.a;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.longconnection.exception.ChannelException;
import d61.g;

public final class ReconnectLogic$c extends b	// class@000a2c
{
    public final ReconnectLogic a;

    public void ReconnectLogic$c(ReconnectLogic p0){
       this.a = p0;
       super();
    }
    public void a(ClientException p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, ReconnectLogic$c.class, "3")) {
          return;
       }
       a.p(p0, "e");
       if (!p0 instanceof EnterRoomTimeOutException && (!p0 instanceof BootstrapClientException && (p0 instanceof HeartBeatInterruptException || p0 instanceof HorseRaceFailedException))) {
          c uoc = a.a();
          String str = "AppEnv.get\(\)";
          a.o(uoc, str);
          m.c(uoc.a(), p0);
          this.a.h.w0();
          if (p0 instanceof HorseRaceFailedException) {
             a uoa = this.a.h.A0();
             a.o(uoa, "liveLongConnection.connectionStatistics");
             if (uoa.a() > 3) {
                c uoc1 = a.a();
                a.o(uoc1, str);
                if (r0.d(uoc1.a())) {
                   ReconnectLogic$c ta = this.a;
                   Objects.requireNonNull(ta);
                   ReconnectLogic reconnectLog = ReconnectLogic.class;
                   if (!PatchProxy.applyVoid(null, ta, reconnectLog, "4")) {
                      ReconnectLogic c = ta.c;
                      if (c <= 20) {
                         if (PatchProxy.isSupport(reconnectLog)) {
                            Object obj = PatchProxy.applyOneRefs(Integer.valueOf(c), ta, reconnectLog, "5");
                            if (obj != PatchProxyResult.class) {
                               l = obj.longValue();
                            }else if(c == null){
                               l = 0;
                            }else {
                               double d = -0.00f;
                               l = (1 <= c && d >= c)? (long)Math.pow(2.00f, (double)c) * (long)1000: 0x3e80;
                            }
                         }else {
                            goto label_009a ;
                         }
                         b.c0(LiveLogTag.LIVE_SOCKET, "ReconnectLogic retryRequestNewRaceInfo", "delayTimeMs", Long.valueOf(l));
                         k1.n(ta);
                         k1.s(new o(ta), ta, l);
                      }
                   }
                }
             }
          }
          this.a.f.invoke(Boolean.FALSE);
       }else {
          p0.d = false;
       }
       return;
    }
    public void b(String p0,long p1){
       p0.c = 0;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ReconnectLogic$c.class, "1")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SOCKET, "ReconnectLogic onConnectionInterrupt", "shouldRetry", Boolean.valueOf(this.a.d));
       ReconnectLogic$c ta = this.a;
       if (ta.d != null) {
          ta.f.invoke(Boolean.FALSE);
       }
       return;
    }
    public void e(LiveLongConnectionServerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReconnectLogic$c.class, "2")) {
          return;
       }
       a.p(p0, "e");
       if (a.b(p0.errorCode) || a.a(p0.errorCode)) {
          this.a.d = false;
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          m.c(uoc.a(), p0);
       }
       this.a.e.onNext(p0);
       return;
    }
    public void j(ChannelException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReconnectLogic$c.class, "4")) {
          return;
       }
       a.p(p0, "e");
       b.c0(LiveLogTag.LIVE_SOCKET, "ReconnectLogic onChannelException", "exception", g.e(p0));
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       m.c(uoc.a(), p0);
       return;
    }
}
