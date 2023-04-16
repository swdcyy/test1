package com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ba2.e;
import lnc.i3;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import k2b.u1;

public class LiveHourlyRankListDialogPresenter$1 implements DefaultLifecycleObserver	// class@000c21
{
    public final LiveHourlyRankListDialogPresenter b;

    public void LiveHourlyRankListDialogPresenter$1(LiveHourlyRankListDialogPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankListDialogPresenter$1.class, "1")) {
          return;
       }
       LiveHourlyRankListDialogPresenter$1 tb = this.b;
       if (tb.F == null) {
          tb.F = true;
          if (!PatchProxy.applyVoid(null, null, e.class, "2")) {
             i3 oi3 = i3.f();
             oi3.c("open_hourly_rank_panel_time_cost_ms", Long.valueOf((System.currentTimeMillis() - e.a)));
             u1.Q("LIVE_HOURLY_RANK_LIST_PANEL", oi3.e());
          }
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
