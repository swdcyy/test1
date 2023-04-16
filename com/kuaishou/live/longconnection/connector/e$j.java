package com.kuaishou.live.longconnection.connector.e$j;
import erd.g;
import com.kuaishou.live.longconnection.connector.e;
import com.kuaishou.android.live.model.Round;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.SystemClock;
import java.lang.StringBuilder;
import mf3.b;

public class e$j implements g	// class@000c69
{
    public final Round b;
    public final l c;
    public final e d;

    public void e$j(e p0,Round p1,l p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$j.class, "1")) {
       }else {
          this.d.j = p0;
          p0.mStartTime = System.currentTimeMillis();
          p0.mStartRealTime = SystemClock.elapsedRealtime();
          Object[] objArray = new Object[0];
          b.a(this.d.s(), "createRaceObservable onSubscribe, liveStreamId: "+this.c.f(), objArray);
       }
       return;
    }
}
