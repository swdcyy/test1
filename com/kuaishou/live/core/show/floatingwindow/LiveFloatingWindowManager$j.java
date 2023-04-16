package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$j;
import java.lang.Runnable;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.app.ActivityManager;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class LiveFloatingWindowManager$j implements Runnable	// class@000b6a
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$j(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager$j.class, "1")) {
          return;
       }
       try{
          Activity uActivity = ActivityContext.g().e();
          if (uActivity == null) {
             return;
          }else {
             uActivity.getSystemService("activity").moveTaskToFront(uActivity.getTaskId(), 2);
             if (!ActivityContext.g().h()) {
                k1.r(this.b.V, 500);
             }
          }
       }catch(java.lang.Exception e0){
          b.I(LiveLogTag.FLOATING_WINDOW, "mMoveTaskToFrontRunnable", e0);
       }
       return;
    }
}
