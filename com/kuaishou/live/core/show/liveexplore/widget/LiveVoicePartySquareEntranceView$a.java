package com.kuaishou.live.core.show.liveexplore.widget.LiveVoicePartySquareEntranceView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.liveexplore.widget.LiveVoicePartySquareEntranceView;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$LiveSquareEntrance;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.liveexplore.widget.LiveVoicePartySquareEntranceView$b;

public class LiveVoicePartySquareEntranceView$a extends m	// class@000c7e
{
    public final LiveVoicePartyCommonConfig$LiveSquareEntrance c;
    public final int d;
    public final LiveVoicePartySquareEntranceView e;

    public void LiveVoicePartySquareEntranceView$a(LiveVoicePartySquareEntranceView p0,LiveVoicePartyCommonConfig$LiveSquareEntrance p1,int p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySquareEntranceView$a.class, "1")) {
          return;
       }
       LiveVoicePartySquareEntranceView e = this.e.e;
       if (e != null) {
          e.a(this.c, this.d);
       }
       return;
    }
}
