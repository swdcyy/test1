package com.yxcorp.gifshow.tube.TubeRankInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeRankInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeRankInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeRankInfo$$Parcelable implements Parcelable, d	// class@001e21
{
    public TubeRankInfo tubeRankInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeRankInfo$$Parcelable.CREATOR = new TubeRankInfo$$Parcelable$a();
    }
    public void TubeRankInfo$$Parcelable(TubeRankInfo p0){
       super();
       this.tubeRankInfo$$0 = p0;
    }
    public static TubeRankInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TubeRankInfo tubeRankInfo = new TubeRankInfo();
          p1.f(p1.g(), tubeRankInfo);
          tubeRankInfo.coverUrl = p0.readString();
          tubeRankInfo.rankId = p0.readString();
          tubeRankInfo.rankNum = p0.readString();
          tubeRankInfo.rankName = p0.readString();
          tubeRankInfo.updateTime = p0.readLong();
          tubeRankInfo.ruleUrl = p0.readString();
          tubeRankInfo.totalSubscribeCount = p0.readLong();
          p1.f(i, tubeRankInfo);
          return tubeRankInfo;
       }
    }
    public static void write(TubeRankInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.coverUrl);
          p1.writeString(p0.rankId);
          p1.writeString(p0.rankNum);
          p1.writeString(p0.rankName);
          p1.writeLong(p0.updateTime);
          p1.writeString(p0.ruleUrl);
          p1.writeLong(p0.totalSubscribeCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeRankInfo getParcel(){
       return this.tubeRankInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeRankInfo$$Parcelable.write(this.tubeRankInfo$$0, p0, p1, new a());
    }
}
