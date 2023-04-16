package com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$b;
import androidx.lifecycle.Observer;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k47.h;
import m47.g;
import g9c.a;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import l47.a;

public final class LiveGzoneCompetitionScheduleFilterPopup$b implements Observer	// class@000cbd
{
    public final LiveGzoneCompetitionScheduleFilterPopup b;

    public void LiveGzoneCompetitionScheduleFilterPopup$b(LiveGzoneCompetitionScheduleFilterPopup p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionScheduleFilterPopup$b.class, "1")) {
       }else {
          LiveGzoneCompetitionScheduleFilterPopup z = this.b.z;
          if (z == null) {
             a.S("mGameRecyclerView");
          }
          g og = this.b.p0();
          a.o(og, "mViewModel");
          h oh = new h(og);
          oh.W0(p0);
          z.setAdapter(oh);
          a.o(p0, "it");
          if (p0.isEmpty() ^ 0x01) {
             this.b.p0().y0(p0.get(0));
          }
       }
       return;
    }
}
