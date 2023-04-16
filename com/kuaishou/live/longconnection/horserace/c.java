package com.kuaishou.live.longconnection.horserace.c;
import com.kuaishou.android.live.model.Horse;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Log;
import brd.t;
import java.lang.StringBuilder;
import mf3.b;
import java.lang.System;
import android.os.SystemClock;
import com.kuaishou.live.longconnection.connector.b;
import java.util.Objects;
import com.kuaishou.live.longconnection.connector.a;
import io.reactivex.g;
import com.kuaishou.live.longconnection.horserace.c$c;
import erd.g;
import com.kuaishou.live.longconnection.horserace.c$b;
import erd.o;
import com.kuaishou.live.longconnection.horserace.c$a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CSRaceLose;
import of3.j;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.socket.nano.SocketMessages$SocketMessage;
import v00.g;
import com.kuaishou.live.longconnection.connector.k;
import java.lang.Runnable;

public class c	// class@000c8c
{
    public final Horse a;
    public b b;
    public final l c;
    public boolean d;

    public void c(Horse p0,l p1){
       super();
       this.a = p0;
       this.c = p1.a();
    }
    public static String a(Throwable p0){
       String obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getMessage();
       if (TextUtils.isEmpty(obj) || ("null").equals(obj)) {
          obj = Log.getStackTraceString(p0);
       }
       return obj;
    }
    public t b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       b.a("HorseRunner", "race, liveStreamId: "+this.c.f()+", mHorse: "+this.a, objArray);
       this.a.mStartTime = System.currentTimeMillis();
       this.a.mStartRealTime = SystemClock.elapsedRealtime();
       obj = new b();
       this.b = obj;
       obj.t(this.c.k());
       c tb = this.b;
       c tc = this.c;
       c ta = this.a;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyTwoRefs(tc, ta, tb, b.class, "9");
       if (ot != patchProxyRe) {
       }else {
          ot = t.create(new a(tb, tc, ta));
       }
       return ot.doOnError(new c$c(this)).map(new c$b(this)).doOnNext(new c$a(this));
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.d = true;
       c ta = this.a;
       if (!ta.mCost - null) {
          ta.mCost = SystemClock.elapsedRealtime() - this.a.mStartRealTime;
       }
       if (TextUtils.isEmpty(this.a.mErrorDescription)) {
          this.a.mErrorDescription = p0;
       }
       Object[] objArray = new Object[0];
       b.a("HorseRunner", "HorseRunner stop, liveStreamId: "+this.c.f()+", mHorse: "+this.a, objArray);
       c tb = this.b;
       if (tb != null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, b.class, "10")) {
             LiveStreamMessages$CSRaceLose uCSRaceLose = new LiveStreamMessages$CSRaceLose();
             uCSRaceLose.time = System.currentTimeMillis();
             b e = tb.e;
             e.u(new j(e, g.a(uCSRaceLose, 205)));
          }
          this.b.f();
       }
       return;
    }
}
