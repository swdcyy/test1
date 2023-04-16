package com.kuaishou.live.core.basic.activity.u;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.System;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import m02.k1;
import t02.g;
import java.lang.Long;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import pp.d;
import com.kwai.feature.api.live.base.event.LiveLifecycleEvent;
import io.reactivex.subjects.PublishSubject;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import m02.u;
import java.lang.Runnable;
import m02.v;
import m02.x;
import m02.y;
import m02.z;
import mq5.b;
import m02.b0;
import m02.c0;

public final class u implements LivePlayLoader$e	// class@001854
{
    public final LivePlayFragment a;

    public void u(LivePlayFragment p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       u ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LivePlayFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, LivePlayFragment.class, "39")) {
          long l = System.currentTimeMillis();
          ta.T.a(LivePlayStage.BIZ_COMPONENT_LOADED, l);
          ta.J.H.g(LivePlayFragment.K1, "onBizComponentLoaded", ImmutableMap.of("isOnBizComponentLoadedScatter", Boolean.valueOf(ta.Q), "bindCostTimeMs", Long.valueOf((l - ta.o1))));
          ta.U0.onNext(LiveLifecycleEvent.PRESENTERS_BIND_FINISHED);
          if (p0) {
             if (e.s(ta.getActivity())) {
                ta.Ah("notifyPageShow", new u(ta));
             }
             ta.Ah("notifyFragmentResumed", new v(ta));
             ta.Ah("notifyLayoutChanged", new x(ta));
             ta.Ah("notifyConfigUpdatedOrError", new y(ta));
             ta.Ah("notifyBindFinish", new z(ta));
          }
          LivePlayFragment j = ta.J;
          if (j != null) {
             g i = j.i;
             if (i != null && i.U0()) {
                ta.Ah("notifyLiveStopped", new b0(ta));
             }
          }
          ta.Ah("bindFinish", new c0(ta));
       }
       return;
    }
}
