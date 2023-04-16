package com.kuaishou.live.core.show.profilecard.statistics.c;
import z1.a;
import com.kuaishou.live.core.show.profilecard.statistics.f;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.http.LiveStatisticsInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ne2.k;
import java.lang.CharSequence;
import android.widget.TextView;
import sf2.l;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public final class c implements a	// class@000df8
{
    public final f a;

    public void c(f p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, f.class, "11")) {
       }else {
          ta.z.r(p0.mStatisticReportType);
          ta.D.setText(p0.mStatisticInfoPrompt);
          ta.H.setText(p0.mStatisticCount);
       }
       m1.a(ta.x, new l(ta, p0), R.id.live_profile_statistics_info_group_2_container);
       return;
    }
}
