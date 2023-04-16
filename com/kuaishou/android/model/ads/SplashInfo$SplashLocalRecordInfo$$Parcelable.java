package com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashInfo$SplashLocalRecordInfo$$Parcelable implements Parcelable, d	// class@000aae
{
    public SplashInfo$SplashLocalRecordInfo splashLocalRecordInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$SplashLocalRecordInfo$$Parcelable.CREATOR = new SplashInfo$SplashLocalRecordInfo$$Parcelable$a();
    }
    public void SplashInfo$SplashLocalRecordInfo$$Parcelable(SplashInfo$SplashLocalRecordInfo p0){
       super();
       this.splashLocalRecordInfo$$0 = p0;
    }
    public static SplashInfo$SplashLocalRecordInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo$SplashLocalRecordInfo splashLocalR = new SplashInfo$SplashLocalRecordInfo();
          p1.f(p1.g(), splashLocalR);
          splashLocalR.mImpressionCount = p0.readInt();
          splashLocalR.mValidCarriedCount = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          splashLocalR.mClearMaterialAfterImpression = b;
          splashLocalR.mEndTime = p0.readLong();
          splashLocalR.mPreloadTime = p0.readLong();
          splashLocalR.mSplashIdList = p0.readString();
          splashLocalR.mRealtimeRequestTime = p0.readLong();
          splashLocalR.mStartTime = p0.readLong();
          p1.f(i, splashLocalR);
          return splashLocalR;
       }
    }
    public static void write(SplashInfo$SplashLocalRecordInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mImpressionCount);
          p1.writeInt(p0.mValidCarriedCount);
          p1.writeInt(p0.mClearMaterialAfterImpression);
          p1.writeLong(p0.mEndTime);
          p1.writeLong(p0.mPreloadTime);
          p1.writeString(p0.mSplashIdList);
          p1.writeLong(p0.mRealtimeRequestTime);
          p1.writeLong(p0.mStartTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$SplashLocalRecordInfo getParcel(){
       return this.splashLocalRecordInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$SplashLocalRecordInfo$$Parcelable.write(this.splashLocalRecordInfo$$0, p0, p1, new a());
    }
}
