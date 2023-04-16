package com.kuaishou.live.core.voiceparty.theater.player.sync.audience.TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.TheaterSyncCommandDispatcherManager;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xw2.d;

public final class TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1 extends Lambda implements p	// class@0019c1
{
    public final TheaterSyncCommandDispatcherManager this$0;

    public void TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1(TheaterSyncCommandDispatcherManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(ProgressSource p0,VoicePartyTheaterSyncCommand p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "command");
       this.this$0.b(p0, p1);
       PatchProxy.onMethodExit(TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1.class, "1");
       return;
    }
}
