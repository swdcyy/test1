package com.kuaishou.live.core.show.screenrecord.LiveScreenRecordForegroundService$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import com.kuaishou.live.core.show.screenrecord.LiveScreenRecordForegroundService;
import android.content.Context;
import android.os.Parcelable;
import ij2.j0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.core.content.ContextCompat;

public final class LiveScreenRecordForegroundService$a	// class@000fda
{

    public void LiveScreenRecordForegroundService$a(){
       super();
    }
    public void LiveScreenRecordForegroundService$a(u p0){
       super();
    }
    public final Intent a(String p0,int p1,int p2,Intent p3){
       Intent obj;
       if (PatchProxy.isSupport(LiveScreenRecordForegroundService$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, LiveScreenRecordForegroundService$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activityName");
       a.p(p3, "mediaProjectionIntent");
       obj = new Intent(a.b(), LiveScreenRecordForegroundService.class);
       obj.putExtra(LiveScreenRecordForegroundService.f, p0);
       obj.putExtra(LiveScreenRecordForegroundService.h, p1);
       obj.putExtra(LiveScreenRecordForegroundService.i, p2);
       obj.putExtra(LiveScreenRecordForegroundService.g, p3);
       return obj;
    }
    public final void b(Context p0,Intent p1,j0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveScreenRecordForegroundService$a.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       a.p(p2, "callback");
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "start ScreenRecordForegroundService");
       LiveScreenRecordForegroundService.l = p2;
       ContextCompat.startForegroundService(p0, p1);
       return;
    }
}
