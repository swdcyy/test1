package w2b.f;
import java.lang.Runnable;
import w2b.g;
import java.lang.String;
import com.kuaishou.android.vader.Channel;
import ar.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HeartBeatEvent;
import w2b.d;
import t45.c;
import k2b.b3;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import xj8.c;
import bw.a$b;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;

public final class f implements Runnable	// class@002714
{
    public final g b;
    public final String c;
    public final byte[] d;
    public final Channel e;
    public final b f;

    public void f(g p0,String p1,byte[] p2,Channel p3,b p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       b uob;
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       f tf = this.f;
       Objects.requireNonNull(tb);
       g og = g.class;
       if (("kwai").equals(tc)) {
          if (!PatchProxy.applyVoidTwoRefs(td, te, tb, og, "12")) {
             try{
                ClientLog$ReportEvent reportEvent = MessageNano.mergeFrom(new ClientLog$ReportEvent(), td);
                reportEvent.sessionId = tb.k;
                reportEvent.processName = tb.l;
                uob = tb.t();
                if (uob != null) {
                   ClientLog$ReportEvent statPackage = reportEvent.statPackage;
                   if (statPackage != null) {
                      ClientStat$StatPackage heartBeatEve = statPackage.heartBeatEvent;
                      if (heartBeatEve != null && heartBeatEve.type != 1) {
                         c.a(new d(reportEvent, uob));
                      }
                   }
                   uob.b(reportEvent, te, b3.l(reportEvent));
                }
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                Log.h("LogOperatorImpl", "Invalid client log content", e0);
             }
          }
       }else if(("mp").equals(tc)){
          if (!PatchProxy.applyVoidTwoRefs(td, te, tb, og, "14")) {
             try{
                c uoc = MessageNano.mergeFrom(new c(), td);
                uoc.c = tb.k;
                uoc.i = tb.l;
                uob = tb.o();
                if (uob != null) {
                   uob.b(uoc, te, b3.m(uoc));
                }
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                Log.h("LogOperatorImpl", "Invalid mini_program log content", e0);
             }
          }
       }else if(("real").equals(tc)){
          if (!PatchProxy.applyVoidTwoRefs(td, te, tb, og, "16")) {
             try{
                MessageNano messageNano = tb.q(td, te);
                uob = tb.r();
                if (uob != null && messageNano != null) {
                   uob.b(messageNano, te, b3.k(messageNano));
                }
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                Log.h("LogOperatorImpl", "Invalid mini_program log content", e0);
             }
          }
       }else if(("userTrack").equals(tc)){
          if (!PatchProxy.applyVoidThreeRefs(td, te, tf, tb, g.class, "17")) {
             try{
                a$b uob1 = MessageNano.mergeFrom(new a$b(), td);
                uob = tb.s();
                if (uob != null && uob1 != null) {
                   uob.c(uob1, te, b3.k(uob1), tf);
                }
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                Log.h("LogOperatorImpl", "Invalid userTrack log content", e0);
             }
          }
       }else {
          throw new UnsupportedOperationException("Unsupported log type: "+tc);
       }
    }
}
