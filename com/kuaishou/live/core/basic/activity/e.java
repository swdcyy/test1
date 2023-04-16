package com.kuaishou.live.core.basic.activity.e;
import com.kuaishou.live.core.basic.activity.e$b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.d;
import com.kuaishou.live.core.basic.activity.e$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import n66.c;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.app.Activity;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;

public class e	// class@001836
{
    public final c a;
    public final e$b b;
    public final QLivePlayConfig c;
    public int d;
    public final boolean e;
    public long f;
    public long g;
    public final Runnable h;
    public static boolean i;

    public void e(e$b p0,QLivePlayConfig p1,int p2,boolean p3){
       super();
       this.a = d.b;
       this.f = 0;
       this.g = 0;
       this.h = new e$a(this);
       this.b = p0;
       this.c = p1;
       this.e = p3;
       this.d = p2;
    }
    public final void a(String p0,long p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoe, "9")) {
          return;
       }
       c.b(p0, "live_stream_id", this.c.getLiveStreamId());
       c.b(p0, "is_first_enter", Boolean.valueOf(this.e));
       c.b(p0, "is_slide_in", Boolean.valueOf(this.b.U1()));
       c.b(p0, "is_multi_tab_style", Boolean.valueOf(this.b.l()));
       c.b(p0, "stream_pattern_type", Integer.valueOf(this.c.mPatternType));
       c.b(p0, "stream_type", Integer.valueOf(this.c.mStreamType));
       c.b(p0, "source_type", Integer.valueOf(this.d));
       c.b(p0, "interactive_biz_type", Integer.valueOf(this.b.Fb()));
       if (p1 - null > 0) {
          c.b(p0, "duration", Long.valueOf(p1));
       }
       if (p0.equals("detail_live_play_enter")) {
          boolean b = (p1 - 3000 >= 0)? true: false;
          c.b(p0, "is_normal_duration", Boolean.valueOf(b));
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       c.b(p0, "live_stream_id", this.c.getLiveStreamId());
       c.b(p0, "live_degrade_params", j.c());
       return;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       c.d(p0, "live_stream_id");
       c.d(p0, "is_first_enter");
       c.d(p0, "is_slide_in");
       c.d(p0, "is_multi_tab_style");
       c.d(p0, "stream_pattern_type");
       c.d(p0, "stream_type");
       c.d(p0, "source_type");
       c.d(p0, "interactive_biz_type");
       c.d(p0, "duration");
       c.d(p0, "is_normal_duration");
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "12")) {
          return;
       }
       c.d(p0, "live_stream_id");
       c.d(p0, "live_degrade_params");
       return;
    }
    public final void e(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       if (e.i) {
          b.c0(this.a, "startSectionForDetailLiveEnterScene fail", "liveStreamId", this.c.getLiveStreamId());
          return;
       }else {
          e.i = true;
          if (!this.g - null) {
             this.g = System.currentTimeMillis();
          }
          c.a("detail_live_play_enter");
          FpsMonitor.startSection("detail_live_play_enter", p0);
          b.d0(this.a, "startSectionForDetailLiveEnterScene", "startTime", Long.valueOf(this.g), "liveStreamId", this.c.getLiveStreamId());
          return;
       }
    }
    public final void f(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       if (!this.f - null) {
          this.f = System.currentTimeMillis();
       }
       FpsMonitor.startSection("detail_live_play", p0);
       b.d0(this.a, "startSectionForDetailLiveScene", "startTime", Long.valueOf(this.f), "liveStreamId", this.c.getLiveStreamId());
       return;
    }
    public void g(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "16")) {
          return;
       }
       long l = 0;
       if (!this.g - l) {
          return;
       }
       long l1 = System.currentTimeMillis() - this.g;
       this.g = l;
       this.a("detail_live_play_enter", l1);
       FpsMonitor.stopSection("detail_live_play_enter", p0);
       this.c("detail_live_play_enter");
       c.c("detail_live_play_enter");
       e.i = false;
       b.d0(this.a, "stopSectionForDetailLiveEnterScene", "duration", Long.valueOf(l1), "liveStreamId", this.c.getLiveStreamId());
       return;
    }
    public final void h(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "14")) {
          return;
       }
       long l = 0;
       if (this.f - l) {
          this.f = l;
          l = System.currentTimeMillis() - this.f;
       }
       this.a("detail_live_play", l);
       FpsMonitor.stopSection("detail_live_play", p0);
       this.c("detail_live_play");
       b.d0(this.a, "stopSectionForDetailLiveScene", "duration", Long.valueOf(l), "liveStreamId", this.c.getLiveStreamId());
       return;
    }
    public final void i(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "20")) {
          return;
       }
       FpsMonitor.stopSection("LivePlayFragment_ENTER", p0);
       this.d("LivePlayFragment_ENTER");
       c.c("LivePlayFragment_ENTER");
       return;
    }
}
