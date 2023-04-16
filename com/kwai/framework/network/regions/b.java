package com.kwai.framework.network.regions.b;
import erd.o;
import java.lang.Object;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$UrlRequestStatus;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.System;
import k2b.e0;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kwai.framework.network.regions.a;

public class b implements o	// class@001810
{
    public int b;

    public void b(){
       super();
    }
    public final void a(ClientStat$UrlRequestStatus p0,long p1,ClientStat$StatPackage p2,Throwable p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), p2, p3, this, b.class, "5")) {
          return;
       }
       p0.success = false;
       p0.costMs = (int)(System.currentTimeMillis() - p1);
       p0.failReason = p3.getMessage();
       u1.o0("", null, p2, true, null);
       return;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new a(this));
       }
       return ot;
    }
    public final void b(ClientStat$UrlRequestStatus p0,long p1,ClientStat$StatPackage p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, b.class, "4")) {
          return;
       }
       p0.success = true;
       p0.costMs = (int)(System.currentTimeMillis() - p1);
       u1.o0("", null, p2, true, null);
       return;
    }
}
