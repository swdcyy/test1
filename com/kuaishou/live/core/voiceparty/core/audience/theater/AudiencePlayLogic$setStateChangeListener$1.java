package com.kuaishou.live.core.voiceparty.core.audience.theater.AudiencePlayLogic$setStateChangeListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AudiencePlayLogic$setStateChangeListener$1 extends Lambda implements l	// class@0013c5
{
    public final l $stateChangeListener;

    public void AudiencePlayLogic$setStateChangeListener$1(l p0){
       this.$stateChangeListener = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TheaterPlayer$State p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudiencePlayLogic$setStateChangeListener$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.$stateChangeListener.invoke(p0);
       return;
    }
}
