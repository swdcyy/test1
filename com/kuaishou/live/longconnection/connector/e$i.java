package com.kuaishou.live.longconnection.connector.e$i;
import erd.o;
import com.kuaishou.live.longconnection.connector.e;
import com.kuaishou.android.live.model.Round;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import android.os.SystemClock;
import java.lang.StringBuilder;
import android.util.Log;
import mf3.b;
import com.kuaishou.android.live.model.Race;
import java.util.List;
import brd.a0;

public class e$i implements o	// class@000c68
{
    public final Round b;
    public final l c;
    public final e d;

    public void e$i(e p0,Round p1,l p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, e$i.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          this.b.mCost = SystemClock.elapsedRealtime() - this.b.mStartRealTime;
          Object[] objArray = new Object[]{Log.getStackTraceString(p0)};
          b.a(this.d.s(), "onErrorResumeNext, liveStreamId: "+this.c.f(), objArray);
          int i = this.d.b.mRounds.indexOf(this.b);
          if (i < (this.d.b.mRounds.size() - 1)) {
             p0 = this.d;
             uoa0 = p0.q(p0.b.mRounds.get((i + 1)), this.c);
          }else {
             uoa0 = a0.s(p0);
          }
       }
       return uoa0;
    }
}
