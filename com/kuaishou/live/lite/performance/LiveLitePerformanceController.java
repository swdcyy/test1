package com.kuaishou.live.lite.performance.LiveLitePerformanceController;
import android.app.Activity;
import com.kuaishou.live.lite.LiveLiteParam;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.lite.performance.LiveLitePerformanceController$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n66.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.util.HashMap;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import com.kwai.performance.monitor.base.Monitor;
import n66.f;

public class LiveLitePerformanceController	// class@000a37
{
    public boolean a;
    public final Activity b;
    public final LiveLiteParam c;
    public boolean d;
    public boolean e;
    public boolean f;
    public static boolean g = true;

    public void LiveLitePerformanceController(Activity p0,LiveLiteParam p1,LifecycleOwner p2){
       super();
       this.a = false;
       this.d = false;
       this.e = false;
       this.f = false;
       this.b = p0;
       this.c = p1;
       p2.getLifecycle().addObserver(new LiveLitePerformanceController$1(this, p2));
       boolean g = LiveLitePerformanceController.g;
       this.a = g;
       if (g) {
          LiveLitePerformanceController.g = false;
       }
       return;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePerformanceController.class, "3")) {
          return;
       }
       c.b(p0, "live_lite_page", this.c.getPage());
       c.b(p0, "live_lite_stream_id", this.c.getLiveStreamFeed().getId());
       c.b(p0, "live_lite_pattern_type", Integer.valueOf(this.c.getQLivePlayConfig().mPatternType));
       c.b(p0, "is_first_enter", Boolean.valueOf(this.a));
       FpsMonitor.stopSection(p0, this.b);
       c.c(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveLitePerformanceController.class, "2")) {
          return;
       }
       e.p().remove("live_style");
       this.a("live_lite");
       if (this.d == null) {
          this.a("live_lite_in_three_sec_section");
       }
       if (this.e == null) {
          this.a("live_lite_in_two_sec_section");
       }
       if (this.f == null) {
          this.a("live_lite_in_one_sec_section");
       }
       MemoryMonitor iNSTANCE = MemoryMonitor.INSTANCE;
       if (iNSTANCE.isInitialized()) {
          f.a("live_lite_page", this.c.getPage());
          f.a("live_lite_pattern_type", Integer.valueOf(this.c.getQLivePlayConfig().mPatternType));
          this.c.getLiveStreamFeed().getId();
          iNSTANCE.stopSection("live_lite");
          f.b("live_lite_page");
          f.b("live_lite_pattern_type");
       }
       return;
    }
}
