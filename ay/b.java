package ay.b;
import erd.g;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import vq4.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import vq4.d;

public final class b implements g	// class@000220
{
    public final PlcEntryStyleInfo b;

    public void b(PlcEntryStyleInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       if (tb == null) {
       }else if(tb.mBizType == 23){
          PlcEntryStyleInfo mEventTrackD = tb.mEventTrackData;
          if (mEventTrackD != null) {
             PlcEntryStyleInfo$EventTrackData mAdEventTrac = mEventTrackD.mAdEventTrackData;
             if (mAdEventTrac != null) {
                p0.W = mAdEventTrac.mLiveReservationId;
                p0.X = mAdEventTrac.mLiveReservationAuthorId;
                p0.H = mAdEventTrac.mLiveStreamId;
                p0.Y = mAdEventTrac.mOrderSource;
                p0.Z = mAdEventTrac.mTrafficSource;
                p0 = p0.F;
                p0.p1 = mAdEventTrac.mLiveStatus;
                p0.q1 = mAdEventTrac.mLiveReservationStatus;
             }
          }
       }
       return;
    }
}
