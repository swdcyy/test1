package h4a.f;
import erd.g;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import vq4.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import vq4.d;

public final class f implements g	// class@002561
{
    public final PlcEntryStyleInfo b;

    public void f(PlcEntryStyleInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (tb != null) {
          PlcEntryStyleInfo mEventTrackD = tb.mEventTrackData;
          if (mEventTrackD != null) {
             PlcEntryStyleInfo$EventTrackData mAdEventTrac = mEventTrackD.mAdEventTrackData;
             if (mAdEventTrac != null) {
                p0.E = mAdEventTrac.mReportTrackInfoTime;
             }
          }
       }
       return;
    }
}
