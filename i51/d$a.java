package i51.d$a;
import lf3.b;
import i51.d;
import com.kuaishou.live.longconnection.exception.ClientException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Throwable;
import d61.g;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.longconnection.exception.EnterRoomTimeOutException;
import com.kuaishou.live.longconnection.exception.BootstrapClientException;
import com.kuaishou.live.longconnection.exception.HeartBeatInterruptException;
import com.kuaishou.live.longconnection.exception.HorseRaceFailedException;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import d61.m;
import hf3.a;
import mf3.a;
import ekd.p0;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Long;
import ekd.k1;
import i51.c;
import java.lang.Runnable;
import java.lang.Boolean;
import i51.f;
import com.kuaishou.live.longconnection.exception.LiveLongConnectionServerException;
import android.util.Log;
import com.yxcorp.gifshow.exception.ServerException;
import qf3.a;
import com.kuaishou.live.longconnection.exception.ChannelException;

public class d$a extends b	// class@002823
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(ClientException p0){
       long l;
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, str)) {
          return;
       }
       LiveLogTag lIVE_SOCKET = LiveLogTag.LIVE_SOCKET;
       b.c0(lIVE_SOCKET, "socketError onClientException", "exception", g.e(p0));
       if (!this.a.c()) {
          return;
       }
       if (!p0 instanceof EnterRoomTimeOutException && (!p0 instanceof BootstrapClientException && (p0 instanceof HeartBeatInterruptException || p0 instanceof HorseRaceFailedException))) {
          m.c(a.a().a(), p0);
          if (!this.a.a.D0()) {
             this.a.a.w0();
             if (p0 instanceof HorseRaceFailedException && (this.a.a.A0().a() > 3 && p0.C(a.a().a()))) {
                d$a ta = this.a;
                Objects.requireNonNull(ta);
                d uod = d.class;
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, ta, uod, str)) {
                   if (ta.f > 20) {
                      b.Z(lIVE_SOCKET, "tryGetNewRace exceed max retry count, ignore");
                   }else {
                      d obj = PatchProxy.apply(objArray, ta, uod, "7");
                      if (obj != PatchProxyResult.class) {
                         l = obj.longValue();
                      }else {
                         obj = ta.f;
                         if (obj == null) {
                            l = 0;
                         }else if(obj > null && obj < 5){
                            l = (long)Math.pow(2.00f, (double)obj);
                         }else {
                            l = 16;
                         }
                      }
                      l = l * 1000;
                      b.c0(lIVE_SOCKET, "tryGetNewRace", "delayTimeMs", Long.valueOf(l));
                      k1.n(ta);
                      k1.s(new c(ta), ta, l);
                   }
                }
             }else {
                this.a.a.z0();
             }
          }
       }else {
          p0.d = false;
       }
       return;
    }
    public void b(String p0,long p1){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, d$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SOCKET, "onConnectionHorseRaceSuccess");
       p0.f = 0;
       return;
    }
    public void c(){
       d$a ta;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "2")) {
          return;
       }
       LiveLogTag lIVE_SOCKET = LiveLogTag.LIVE_SOCKET;
       b.d0(lIVE_SOCKET, "socketError onConnectionInterrupt", "hasExit", Boolean.valueOf(this.a.a.D0()), "shouldRetry", Boolean.valueOf(this.a.d));
       if (this.a.b.e()) {
          if (!this.a.c()) {
             b.Z(lIVE_SOCKET, "socketError onConnectionInterrupt, don\'t reconnect");
             return;
          }
       }else if(this.a.c()){
          d$a ta1 = this.a;
          Objects.requireNonNull(ta1);
          Object obj = PatchProxy.apply(objArray, ta1, d.class, "3");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): ta1.b.i();
          if (b) {
          label_006d :
             if (this.a.b.e()) {
                ta = this.a;
                if (ta.d != null && (!ta.a.D0() && !this.a.a.x0())) {
                   this.a.a.w0();
                   this.a.a.z0();
                }
             }else {
                ta = this.a;
                if (ta.d != null && !ta.a.D0()) {
                   this.a.a.w0();
                   this.a.a.z0();
                }
             }
             return;
          }
       }
       b.Z(lIVE_SOCKET, "socketError onConnectionInterrupt, don\'t reconnect");
       return;
    }
    public void e(LiveLongConnectionServerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SOCKET, "socketError onServerException", "exception", Log.getStackTraceString(p0));
       if (!this.a.c()) {
          return;
       }
       if (a.b(p0.errorCode) || a.a(p0.errorCode)) {
          this.a.d = false;
       }else {
          m.c(a.a().a(), p0);
       }
       this.a.b.b(p0);
       return;
    }
    public void j(ChannelException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "4")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SOCKET, "socketError onChannelException", "exception", g.e(p0));
       if (!this.a.c()) {
          return;
       }
       m.c(a.a().a(), p0);
       return;
    }
}
