package com.kuaishou.live.core.show.profilecard.statistics.e;
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
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import sf2.i;
import java.lang.Runnable;
import sf2.n;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;
import sf2.g;
import sf2.j;

public final class e implements a	// class@000dfa
{
    public final f a;

    public void e(f p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, ta, uof, "13")) {
       }else {
          ta.z.r(p0.mStatisticReportType);
          ta.F.setText(p0.mStatisticInfoPrompt);
          ta.J.setText(p0.mStatisticCount);
       }
       if (!TextUtils.x(p0.mClickDesKwaiLink)) {
          ta.K.setVisibility(0);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, uof, "7")) {
             if (!PatchProxy.applyVoid(null, ta, uof, "8")) {
                ta.K.post(new i(ta));
             }
             m1.a(ta.x, new n(ta, p0), R.id.live_profile_statistics_get_gift_introduction_view);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uof, "9")) {
          m1.a(ta.x, new g(ta, p0), R.id.live_profile_statistics_get_gift_description_view);
          m1.a(ta.x, new j(ta, p0), R.id.live_profile_statistics_get_gift_number_view);
       }
       return;
    }
}
