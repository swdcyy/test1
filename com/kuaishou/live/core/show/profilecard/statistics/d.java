package com.kuaishou.live.core.show.profilecard.statistics.d;
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
import sf2.m;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public final class d implements a	// class@000df9
{
    public final f a;

    public void d(f p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, f.class, "12")) {
       }else {
          ta.z.r(p0.mStatisticReportType);
          ta.E.setText(p0.mStatisticInfoPrompt);
          ta.I.setText(p0.mStatisticCount);
       }
       m1.a(ta.x, new m(ta, p0), R.id.live_profile_statistics_info_group_3_container);
       return;
    }
}
