package com.kuaishou.live.longconnection.horserace.c$b;
import erd.o;
import com.kuaishou.live.longconnection.horserace.c;
import java.lang.Object;
import com.kuaishou.live.longconnection.connector.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemClock;
import com.kuaishou.android.live.model.Horse;

public class c$b implements o	// class@000c8a
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c$b.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b;
          if (p0.d == null) {
             p0.mCost = SystemClock.elapsedRealtime() - this.b.a.mStartRealTime;
          }
          p0 = this.b;
       }
       return p0;
    }
}
