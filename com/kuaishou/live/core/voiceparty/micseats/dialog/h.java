package com.kuaishou.live.core.voiceparty.micseats.dialog.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@0015a4
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, "LiveVoicePartyInvitationPanelFragment share IM failed", p0);
    }
}
