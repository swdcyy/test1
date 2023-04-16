package com.kuaishou.live.audience.component.push.k;
import erd.g;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import qs5.d;
import java.lang.System;
import crd.b;
import lnc.b9;
import android.app.Activity;
import brd.t;
import t45.d;
import brd.z;
import v21.n;

public final class k implements g	// class@000bd6
{
    public final LiveAudiencePushFragment b;
    public final View c;

    public void k(LiveAudiencePushFragment p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && !PatchProxy.applyVoidOneRefs(tc, tb, LiveAudiencePushFragment.class, "4")) {
          String str = "LiveAudiencePushFragment";
          if (tb.getActivity() == null) {
             b.P(LiveLogTag.LIVE_ENTRY.appendTag(str), "getActivity\(\) == null");
          }else {
             p0 = "live_anchor_plugin";
             if (d.d(p0)) {
                b.P(LiveLogTag.LIVE_ENTRY.appendTag(str), "isLoaded...");
                tb.Vg(tc);
             }else {
                tb.o = System.currentTimeMillis();
                tb.p = d.c(p0);
                b9.a(tb.n);
                tb.n = d.b(tb.getActivity(), p0).observeOn(d.a).subscribe(new n(tb, tc));
             }
          }
       }
       return;
    }
}
