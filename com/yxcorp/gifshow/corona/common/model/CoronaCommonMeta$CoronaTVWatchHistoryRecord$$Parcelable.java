package com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable implements Parcelable, d	// class@001206
{
    public CoronaCommonMeta$CoronaTVWatchHistoryRecord coronaTVWatchHistoryRecord$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable.CREATOR = new CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable$a();
    }
    public void CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable(CoronaCommonMeta$CoronaTVWatchHistoryRecord p0){
       super();
       this.coronaTVWatchHistoryRecord$$0 = p0;
    }
    public static CoronaCommonMeta$CoronaTVWatchHistoryRecord read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaCommonMeta$CoronaTVWatchHistoryRecord uCoronaTVWat = new CoronaCommonMeta$CoronaTVWatchHistoryRecord();
          p1.f(p1.g(), uCoronaTVWat);
          uCoronaTVWat.mTimeStap = p0.readLong();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCoronaTVWat.mIsHistory = b;
          uCoronaTVWat.mPlayProgress = p0.readLong();
          uCoronaTVWat.mClusterId = p0.readString();
          p1.f(i, uCoronaTVWat);
          return uCoronaTVWat;
       }
    }
    public static void write(CoronaCommonMeta$CoronaTVWatchHistoryRecord p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mTimeStap);
          p1.writeInt(p0.mIsHistory);
          p1.writeLong(p0.mPlayProgress);
          p1.writeString(p0.mClusterId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaCommonMeta$CoronaTVWatchHistoryRecord getParcel(){
       return this.coronaTVWatchHistoryRecord$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable.write(this.coronaTVWatchHistoryRecord$$0, p0, p1, new a());
    }
}
