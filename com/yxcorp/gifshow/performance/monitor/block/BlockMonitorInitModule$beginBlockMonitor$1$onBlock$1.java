package com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginBlockMonitor$1$onBlock$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Long;
import com.google.gson.JsonElement;

public final class BlockMonitorInitModule$beginBlockMonitor$1$onBlock$1 extends Lambda implements a	// class@000e5a
{
    public final long $blockWallTime;
    public final String $msg;

    public void BlockMonitorInitModule$beginBlockMonitor$1$onBlock$1(long p0,String p1){
       this.$blockWallTime = p0;
       this.$msg = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, BlockMonitorInitModule$beginBlockMonitor$1$onBlock$1.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null) {
          jsonObject.c0("currentActivity", uActivity.getClass().getSimpleName());
       }
       ClientEvent$UrlPackage urlPackage = u1.k();
       if (urlPackage != null) {
          jsonObject.a0("page", Integer.valueOf(urlPackage.page));
          jsonObject.c0("page2", urlPackage.page2);
       }
       jsonObject.H("reportStackTrace", Boolean.TRUE);
       jsonObject.a0("blockDuration", Long.valueOf(this.$blockWallTime));
       jsonObject.c0("blockMsg", this.$msg);
       u1.R("blockEvent", jsonObject.toString(), 19);
       return;
    }
}
