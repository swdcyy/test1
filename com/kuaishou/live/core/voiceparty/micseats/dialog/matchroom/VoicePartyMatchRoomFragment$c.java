package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$c;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zs2.x;
import qu2.a;
import co2.f2;
import w02.g;

public final class VoicePartyMatchRoomFragment$c implements ViewModelProvider$Factory	// class@0015aa
{
    public final VoicePartyMatchRoomFragment a;

    public void VoicePartyMatchRoomFragment$c(VoicePartyMatchRoomFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       VoicePartyMatchRoomFragment$c obj = PatchProxy.applyOneRefs(p0, this, VoicePartyMatchRoomFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       obj = this.a;
       VoicePartyMatchRoomFragment b = obj.B;
       x ox = new x(obj.E, obj.D, b, obj.H, obj.C, b);
       return p0;
    }
}
