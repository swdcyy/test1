package com.kuaishou.live.core.voiceparty.micseats.dialog.a;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ys2.c;
import java.lang.Runnable;
import ekd.k1;

public final class a implements g	// class@00159d
{
    public final LiveVoicePartyActionPanelFragment b;

    public void a(LiveVoicePartyActionPanelFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveVoicePartyActionPanelFragment.class, "16")) {
       }else {
          k1.o(new c(tb, p0));
       }
       return;
    }
}
