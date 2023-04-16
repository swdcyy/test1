package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1;
import ut7.c;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic;
import com.kwai.robust.PatchProxyResult;
import hf3.a;
import ac3.m;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$1;
import brd.t;
import msd.a;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1;
import ac3.n;
import msd.l;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2;
import java.util.Iterator;
import wa1.i;
import ac3.l;
import crd.a;
import ekd.k1;
import lf3.a;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$e;
import java.lang.Iterable;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$ConnectionInterrupted;
import java.lang.Boolean;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$Login;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$requestNewRaceInfo$1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$requestNewRaceInfo$2;

public final class LiveBaseLongConnectionManager$connectState$1 extends c	// class@000a12
{
    public ReconnectLogic f;
    public b g;
    public final LiveBaseLongConnectionManager h;

    public void LiveBaseLongConnectionManager$connectState$1(LiveBaseLongConnectionManager p0,String p1){
       this.h = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       LiveBaseLongConnectionManager$connectState$1 uoconnectSta = LiveBaseLongConnectionManager$connectState$1.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoconnectSta, str)) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p0 = ReconnectLogic.class;
          ReconnectLogic reconnectLog = PatchProxy.apply(null, this, uoconnectSta, "6");
          if (reconnectLog != PatchProxyResult.class) {
          }else {
             reconnectLog = new ReconnectLogic(this.h.u(), this.h.i.a, new LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$1(this));
             LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1 uoconnectSta1 = new LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1(this);
             if (!PatchProxy.applyVoidOneRefs(uoconnectSta1, reconnectLog, p0, str)) {
                a.p(uoconnectSta1, "handler");
                reconnectLog.e.subscribe(new n(uoconnectSta1));
             }
             LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2 uoconnectSta2 = new LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2(this);
             if (!PatchProxy.applyVoidOneRefs(uoconnectSta2, reconnectLog, p0, "2")) {
                a.p(uoconnectSta2, "handler");
                reconnectLog.f = uoconnectSta2;
             }
          }
          this.f = reconnectLog;
          this.h.t1().resume();
          p0 = this.h.j.iterator();
          while (p0.hasNext()) {
             p0.next().a();
          }
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$connectState$1.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       LiveBaseLongConnectionManager$connectState$1 tf = this.f;
       if (tf != null && !PatchProxy.applyVoid(null, tf, ReconnectLogic.class, "3")) {
          tf.a.dispose();
          ReconnectLogic b = tf.b;
          if (b != null) {
             b.dispose();
          }
          k1.n(tf);
          tf.h.F0(tf.g);
       }
       tf = this.g;
       if (tf != null) {
          tf.dispose();
       }
       this.g = null;
       if (p0 instanceof LiveBaseLongConnectionManager$e) {
          this.h.t1().disconnect();
       }else {
          this.h.t1().a();
       }
       Iterator iterator = this.h.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDisconnect();
       }
       return;
    }
    public final boolean h(LiveBaseLongConnectionManager$ConnectionInterrupted p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBaseLongConnectionManager$connectState$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       if (p0.a != null) {
          this.h.t1().resume();
       }else {
          this.h.t1().z0();
       }
       return true;
    }
    public final boolean j(LiveBaseLongConnectionManager$Login p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBaseLongConnectionManager$connectState$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       LiveBaseLongConnectionManager$connectState$1 tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       this.g = this.k();
       return true;
    }
    public final b k(){
       Object obj = PatchProxy.apply(null, this, LiveBaseLongConnectionManager$connectState$1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.C1(new LiveBaseLongConnectionManager$connectState$1$requestNewRaceInfo$1(this), new LiveBaseLongConnectionManager$connectState$1$requestNewRaceInfo$2(this));
    }
}
