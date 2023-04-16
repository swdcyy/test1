package com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$d;
import androidx.lifecycle.Observer;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k47.j;
import m47.g;
import kotlin.jvm.internal.a;
import g9c.a;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;

public final class LiveGzoneCompetitionScheduleFilterPopup$d implements Observer	// class@000cbf
{
    public final LiveGzoneCompetitionScheduleFilterPopup b;

    public void LiveGzoneCompetitionScheduleFilterPopup$d(LiveGzoneCompetitionScheduleFilterPopup p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionScheduleFilterPopup$d.class, "1")) {
       }else {
          LiveGzoneCompetitionScheduleFilterPopup$d tb = this.b;
          LiveGzoneCompetitionScheduleFilterPopup f = tb.F;
          if (f == null) {
             g og = this.b.p0();
             a.o(og, "mViewModel");
             j oj = new j(og);
             oj.W0(p0);
             tb.F = oj;
             p0 = this.b.A;
             if (p0 == null) {
                a.S("mDetailRecyclerView");
             }
             p0.setAdapter(this.b.F);
          }else {
             a.o(p0, "it");
             if (!PatchProxy.applyVoidOneRefs(p0, f, j.class, "3")) {
                a.p(p0, "newList");
                f.Q0().clear();
                f.Q0().addAll(p0);
             }
             f.k0();
          }
       }
       return;
    }
}
