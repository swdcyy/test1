package com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4;
import androidx.lifecycle.LifecycleEventObserver;
import eo2.g;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ekd.k1;
import x61.c;

public final class VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4 implements LifecycleEventObserver	// class@00131f
{
    public final g b;

    public void VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4(g p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          VoicePartyAudienceMicApplyButtonDataBinding$bindViewModel$4 tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, g.class, "3")) {
             k1.n(tb);
             tb.d.O0(2001);
          }
       }
       return;
    }
}
