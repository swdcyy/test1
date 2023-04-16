package com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$c;
import androidx.lifecycle.Observer;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup;
import java.lang.Object;
import com.kwai.live.gzone.competition.data.FetchStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k47.l;
import java.lang.Enum;
import android.widget.FrameLayout;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.live.gzone.competition.b;
import java.lang.CharSequence;
import android.view.View$OnClickListener;

public final class LiveGzoneCompetitionScheduleFilterPopup$c implements Observer	// class@000cbe
{
    public final LiveGzoneCompetitionScheduleFilterPopup b;

    public void LiveGzoneCompetitionScheduleFilterPopup$c(LiveGzoneCompetitionScheduleFilterPopup p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       b[] uobArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionScheduleFilterPopup$c.class, "1")) {
       }else {
          int i = 0;
          int i1 = 1;
          if (p0 != null) {
             int i2 = l.a[p0.ordinal()];
             if (i2 != i1) {
                if (i2 == 2) {
                   uobArray1 = new b[i1];
                   uobArray1[i] = b.d;
                   c.d(LiveGzoneCompetitionScheduleFilterPopup.o0(this.b), uobArray1);
                   c.f(LiveGzoneCompetitionScheduleFilterPopup.o0(this.b), "", new b(this));
                }
             }else {
                c.h(LiveGzoneCompetitionScheduleFilterPopup.o0(this.b), b.d);
             }
          }
          b[] uobArray = new b[i1];
          uobArray[i] = b.d;
          c.d(LiveGzoneCompetitionScheduleFilterPopup.o0(this.b), uobArray);
          uobArray1 = new b[i1];
          uobArray1[i] = b.g;
          c.d(LiveGzoneCompetitionScheduleFilterPopup.o0(this.b), uobArray1);
       }
       return;
    }
}
