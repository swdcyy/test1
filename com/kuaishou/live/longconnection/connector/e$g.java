package com.kuaishou.live.longconnection.connector.e$g;
import brd.d0;
import com.kuaishou.live.longconnection.connector.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.live.longconnection.connector.b;
import android.util.Log;
import mf3.b;
import java.util.Iterator;
import java.util.List;
import java.lang.Runnable;
import android.os.SystemClock;
import com.kuaishou.android.live.model.Race;
import lf3.a;
import com.kuaishou.live.longconnection.exception.HorseRaceFailedException;
import com.kuaishou.live.longconnection.exception.ClientException;
import crd.b;
import com.kuaishou.live.longconnection.horserace.c;
import kf3.a;
import lf3.i;
import lf3.g;
import lf3.d;
import com.kuaishou.android.live.model.Horse;
import com.kuaishou.live.longconnection.connector.l$c;

public class e$g implements d0	// class@000c66
{
    public final e b;

    public void e$g(e p0){
       this.b = p0;
       super();
    }
    public void onError(Throwable p0){
       e f;
       e b;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$g.class, "3")) {
          return;
       }
       Object[] objArray = new Object[]{Log.getStackTraceString(p0)};
       b.a(this.b.s(), "raceAndConnect Error, liveStreamId: "+this.b.c.h()+", mHasStopped: "+this.b.g+", LiveFeedConnection: "+this.b.c.a, objArray);
       e$g tb = this.b;
       if (tb.g != null) {
          Iterator iterator = tb.d.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
             iterator.remove();
          }
       }else {
          e$g tb1 = this.b;
          b = tb1.b;
          tb.b.mCost = SystemClock.elapsedRealtime() - b.mStartRealTime;
          b.mSuccess = false;
          f = tb1.f;
          if (f != null) {
             f.k(b.mCost);
          }
       }
       tb = this.b;
       tb.e = false;
       f = tb.f;
       if (f != null) {
          f.a(new HorseRaceFailedException(p0));
       }
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$g.class, "1")) {
          return;
       }
       e$g tb = this.b;
       tb.i = p0;
       if (tb.g == null) {
          e f = tb.f;
          if (f != null) {
             f.m();
          }
       }
       return;
    }
    public void onSuccess(Object p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$g.class, "2")) {
       }else {
          e c = this.b.c;
          if (c != null) {
             c.f();
          }
          e$g tb = this.b;
          boolean b = false;
          tb.e = b;
          tb.k.c();
          tb = this.b;
          c b1 = p0.b;
          tb.c = b1;
          b1.t(tb.o);
          tb = this.b;
          tb.c.s(tb.p);
          c = this.b.c;
          if (c != null) {
             c.d();
          }
          tb = this.b;
          e c1 = tb.c;
          if (c1 != null && tb.g == null) {
             c1.u(tb.f);
             iterator = this.b.l.iterator();
             while (iterator.hasNext()) {
                i oi = iterator.next();
                this.b.c.p(oi.a, oi.b, oi.c, oi.d);
             }
             iterator = this.b.m.iterator();
             while (iterator.hasNext()) {
                this.b.c.a(iterator.next());
             }
          }
          tb = this.b;
          if (tb.g == null) {
             e$g tb1 = this.b;
             e b2 = tb1.b;
             tb.b.mCost = SystemClock.elapsedRealtime() - b2.mStartRealTime;
             b2.mSuccess = true;
             c = tb1.f;
             if (c != null) {
                c.b(p0.a.mHostAndPort, b2.mCost);
             }
          }
          iterator = this.b.d.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
             iterator.remove();
          }
          tb = this.b;
          if (tb.c != null) {
             Object[] objArray = new Object[b];
             b.a(tb.s(), "raceAndConnect Success, liveStreamId: "+this.b.c.h()+", LiveFeedConnection: "+this.b.c.a+", winnerHorseRunner: "+p0.a+", currentServerUriInfo: "+this.b.c.g(), objArray);
          }
       }
       return;
    }
}
