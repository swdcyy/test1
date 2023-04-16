package com.kwai.components.feedmodel.feed.KaraokeScoreInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$$Parcelable$a;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable;

public class KaraokeScoreInfo$$Parcelable implements Parcelable, d	// class@000c50
{
    public KaraokeScoreInfo karaokeScoreInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KaraokeScoreInfo$$Parcelable.CREATOR = new KaraokeScoreInfo$$Parcelable$a();
    }
    public void KaraokeScoreInfo$$Parcelable(KaraokeScoreInfo p0){
       super();
       this.karaokeScoreInfo$$0 = p0;
    }
    public static KaraokeScoreInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          KaraokeScoreInfo karaokeScore = new KaraokeScoreInfo();
          p1.f(p1.g(), karaokeScore);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          karaokeScore.mShouldDisPlay = b;
          karaokeScore.mTotalSegment = p0.readInt();
          karaokeScore.mLevel = p0.readString();
          karaokeScore.mValidSegment = p0.readInt();
          karaokeScore.mRankInfo = KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable.read(p0, p1);
          karaokeScore.mTotalScore = p0.readInt();
          p1.f(i, karaokeScore);
          return karaokeScore;
       }
    }
    public static void write(KaraokeScoreInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShouldDisPlay);
          p1.writeInt(p0.mTotalSegment);
          p1.writeString(p0.mLevel);
          p1.writeInt(p0.mValidSegment);
          KaraokeScoreInfo$KtvScoreRankInfo$$Parcelable.write(p0.mRankInfo, p1, p2, p3);
          p1.writeInt(p0.mTotalScore);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KaraokeScoreInfo getParcel(){
       return this.karaokeScoreInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KaraokeScoreInfo$$Parcelable.write(this.karaokeScoreInfo$$0, p0, p1, new a());
    }
}
