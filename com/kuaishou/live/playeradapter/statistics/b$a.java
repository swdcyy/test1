package com.kuaishou.live.playeradapter.statistics.b$a;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kuaishou.live.playeradapter.statistics.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tj3.r;
import tj3.n;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.StringBuilder;
import java.lang.System;
import q2b.h$b;
import k2b.u1;

public class b$a implements LivePlayerErrorListener	// class@000d5d
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public boolean onError(int p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       long l = this.a.c.m();
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(l), null, n.class, "5")) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.code = p0;
          resultPackag.message = "what:"+p0+" extra:"+p1;
          resultPackag.domain = 5;
          resultPackag.timeCost = System.currentTimeMillis() - l;
          h$b uob = h$b.d(8, 13);
          uob.q(resultPackag);
          u1.r0(uob);
       }
       return false;
    }
}
