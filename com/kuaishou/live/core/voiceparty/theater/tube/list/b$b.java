package com.kuaishou.live.core.voiceparty.theater.tube.list.b$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import java.lang.CharSequence;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;

public class b$b extends m	// class@001a2f
{
    public final VoicePartyTheaterPhotoWithEpisode c;
    public final b d;

    public void b$b(b p0,VoicePartyTheaterPhotoWithEpisode p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b td = this.d;
       td.x.b(td.y.mTube, this.c, td.P8(null));
       return;
    }
}
