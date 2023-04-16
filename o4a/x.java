package o4a.x;
import erd.g;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import vq4.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import vq4.d;

public final class x implements g	// class@003298
{
    public final PlcEntryStyleInfo b;

    public void x(PlcEntryStyleInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
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
