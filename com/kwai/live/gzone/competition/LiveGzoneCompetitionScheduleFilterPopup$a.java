package com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup$a;
import androidx.lifecycle.Observer;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionScheduleFilterPopup;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.live.gzone.competition.bean.FilterCompetition;
import lnc.a1;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.Button;

public final class LiveGzoneCompetitionScheduleFilterPopup$a implements Observer	// class@000cbc
{
    public final LiveGzoneCompetitionScheduleFilterPopup b;

    public void LiveGzoneCompetitionScheduleFilterPopup$a(LiveGzoneCompetitionScheduleFilterPopup p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionScheduleFilterPopup$a.class, "1")) {
       }else {
          a.o(p0, "it");
          ArrayList uArrayList = new ArrayList();
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             Object obj1 = (obj.mCompetitionId != -1)? 1: null;
             if (obj1) {
                uArrayList.add(obj);
             }
          }
          int i = uArrayList.size();
          LiveGzoneCompetitionScheduleFilterPopup c = this.b.C;
          if (c == null) {
             a.S("mConfirmBtn");
          }
          int i1 = 0x7f1013f1;
          i = (!i)? a1.p(i1): a1.p(i1)+a1.r(0x7f1013dd, String.valueOf(i));
          c.setText(i);
       }
       return;
    }
}
