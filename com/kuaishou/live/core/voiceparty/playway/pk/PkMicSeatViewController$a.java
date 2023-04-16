package com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController$teamInfoDisposable$1$1;
import androidx.lifecycle.MutableLiveData;

public final class PkMicSeatViewController$a implements g	// class@001865
{
    public final PkMicSeatViewController b;

    public void PkMicSeatViewController$a(PkMicSeatViewController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PkMicSeatViewController$a.class, "1")) {
       }else if(p0.isEmpty()){
          b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("MicSeatPk"), "¸üÐÂTeamFilter "+p0);
          this.b.j.setValue(new PkMicSeatViewController$teamInfoDisposable$1$1(p0));
       }
       return;
    }
}
