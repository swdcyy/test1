package com.kuaishou.live.core.voiceparty.micseats.dialog.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ys2.b;
import java.lang.Runnable;
import ekd.k1;

public final class b implements g	// class@00159e
{
    public final LiveVoicePartyActionPanelFragment b;

    public void b(LiveVoicePartyActionPanelFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveVoicePartyActionPanelFragment.class, "17")) {
       }else {
          k1.o(new b(tb));
       }
       return;
    }
}
