package com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable$a;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable implements Parcelable, d	// class@000c52
{
    public KaraokeScoreInfo$KtvScoreRankInfo ktvScoreRankInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable.CREATOR = new KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable$a();
    }
    public void KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable(KaraokeScoreInfo$KtvScoreRankInfo p0){
       super();
       this.ktvScoreRankInfo$$0 = p0;
    }
    public static KaraokeScoreInfo$KtvScoreRankInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          KaraokeScoreInfo$KtvScoreRankInfo ktvScoreRank = new KaraokeScoreInfo$KtvScoreRankInfo();
          p1.f(p1.g(), ktvScoreRank);
          ktvScoreRank.mDaily = p0.readInt();
          ktvScoreRank.mWeekly = p0.readInt();
          ktvScoreRank.mDuet = p0.readInt();
          p1.f(i, ktvScoreRank);
          return ktvScoreRank;
       }
    }
    public static void write(KaraokeScoreInfo$KtvScoreRankInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mDaily);
          p1.writeInt(p0.mWeekly);
          p1.writeInt(p0.mDuet);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KaraokeScoreInfo$KtvScoreRankInfo getParcel(){
       return this.ktvScoreRankInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable.write(this.ktvScoreRankInfo$$0, p0, p1, new a());
    }
}
