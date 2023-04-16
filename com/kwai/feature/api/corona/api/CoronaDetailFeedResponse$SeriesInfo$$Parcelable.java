package com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$SeriesInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$SeriesInfo$$Parcelable$a;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$SeriesInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;

public class CoronaDetailFeedResponse$SeriesInfo$$Parcelable implements Parcelable, d	// class@000ddc
{
    public CoronaDetailFeedResponse$SeriesInfo seriesInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaDetailFeedResponse$SeriesInfo$$Parcelable.CREATOR = new CoronaDetailFeedResponse$SeriesInfo$$Parcelable$a();
    }
    public void CoronaDetailFeedResponse$SeriesInfo$$Parcelable(CoronaDetailFeedResponse$SeriesInfo p0){
       super();
       this.seriesInfo$$0 = p0;
    }
    public static CoronaDetailFeedResponse$SeriesInfo read(Parcel p0,a p1){
       Boolean uBoolean;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaDetailFeedResponse$SeriesInfo seriesInfo = new CoronaDetailFeedResponse$SeriesInfo();
          p1.f(p1.g(), seriesInfo);
          seriesInfo.mSerialType = p0.readInt();
          seriesInfo.mId = p0.readString();
          if (p0.readInt() < 0) {
             uBoolean = null;
          }else {
             boolean b = true;
             if (p0.readInt() != b) {
                b = false;
             }
             uBoolean = Boolean.valueOf(b);
          }
          seriesInfo.mIsCollected = uBoolean;
          p1.f(i, seriesInfo);
          return seriesInfo;
       }
    }
    public static void write(CoronaDetailFeedResponse$SeriesInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSerialType);
          p1.writeString(p0.mId);
          if (p0.mIsCollected == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mIsCollected.booleanValue());
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaDetailFeedResponse$SeriesInfo getParcel(){
       return this.seriesInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaDetailFeedResponse$SeriesInfo$$Parcelable.write(this.seriesInfo$$0, p0, p1, new a());
    }
}
