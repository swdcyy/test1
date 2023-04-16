package com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding$bindViewModel$3;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AbstractVoicePartyInviteButtonDataBinding$bindViewModel$3 implements LifecycleEventObserver	// class@001513
{
    public final AbstractVoicePartyInviteButtonDataBinding b;

    public void AbstractVoicePartyInviteButtonDataBinding$bindViewModel$3(AbstractVoicePartyInviteButtonDataBinding p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbstractVoicePartyInviteButtonDataBinding$bindViewModel$3.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.e();
       }
       return;
    }
}
