package com.kwai.live.gzone.competition.b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup;

public final class b implements View$OnClickListener	// class@000cc3
{
    public final LiveGzoneCompetitionScheduleFilterPopup$c b;

    public void b(LiveGzoneCompetitionScheduleFilterPopup$c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.b.q0();
       return;
    }
}
