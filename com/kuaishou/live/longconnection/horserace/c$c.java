package com.kuaishou.live.longconnection.horserace.c$c;
import erd.g;
import com.kuaishou.live.longconnection.horserace.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kuaishou.android.live.model.Horse;
import java.lang.StringBuilder;
import com.kuaishou.live.longconnection.connector.l;
import android.util.Log;
import mf3.b;

public class c$c implements g	// class@000c8b
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else {
          c$c tb = this.b;
          if (tb.d == null) {
             c a = this.b.a;
             tb.a.mCost = SystemClock.elapsedRealtime() - a.mStartRealTime;
             a.mErrorDescription = c.a(p0);
          }
          Object[] objArray = new Object[0];
          b.a("HorseRunner", "onError, hasStop: "+this.b.d+", liveStreamId: "+this.b.c.f()+", mHorse: "+this.b.a+", errorDescription: "+Log.getStackTraceString(p0), objArray);
       }
       return;
    }
}
