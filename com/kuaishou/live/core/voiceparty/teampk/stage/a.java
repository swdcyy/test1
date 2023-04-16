package com.kuaishou.live.core.voiceparty.teampk.stage.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@00193b
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveVoicePartyLogTag.TEAM_PK_ANCHOR, "startCountDown failed", p0);
    }
}
