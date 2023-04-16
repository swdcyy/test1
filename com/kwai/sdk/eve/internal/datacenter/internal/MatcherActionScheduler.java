package com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler;
import java.util.LinkedHashMap;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.eve.packageinfo.model.MatcherSchedule;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$a;
import java.lang.Runnable;
import java.util.Map;
import java.util.Timer;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$timerTask$1;
import java.util.TimerTask;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$2;

public final class MatcherActionScheduler	// class@0014c3
{
    public static final Map a;
    public static final Handler b;
    public static final MatcherActionScheduler c;

    static {
       MatcherActionScheduler.c = new MatcherActionScheduler();
       MatcherActionScheduler.a = new LinkedHashMap();
       MatcherActionScheduler.b = new Handler(Looper.getMainLooper());
    }
    public void MatcherActionScheduler(){
       super();
    }
    public final void a(String p0,MatcherSchedule p1,a p2){
       MatcherSchedule a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MatcherActionScheduler.class, "1")) {
          return;
       }
       a.p(p0, "scheduleKey");
       a.p(p1, "schedule");
       a.p(p2, "actionFunc");
       a = p1.a;
       int i = a.hashCode();
       if (i != -934531685) {
          if (i != 0x341e81) {
             if (i == 0x5b0b983 && a.equals("delay")) {
                MatcherActionScheduler.b.postDelayed(new MatcherActionScheduler$a(p2), p1.a());
             }
          }else if(a.equals("once")){
             p2.invoke();
          }
       }else if(a.equals("repeat")){
          Map a1 = MatcherActionScheduler.a;
          if (!a1.containsKey(p0)) {
             Timer timer = new Timer();
             timer.schedule(super(p1, p0, timer, p2), 0, p1.a());
             a1.put(p0, timer);
          }else {
             EveLog.INSTANCE.i(new MatcherActionScheduler$schedule$2(p0));
          }
       }
       return;
    }
}
