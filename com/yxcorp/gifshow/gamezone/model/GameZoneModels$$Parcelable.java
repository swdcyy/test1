package com.yxcorp.gifshow.gamezone.model.GameZoneModels$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$$Parcelable$a;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarker;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarker$$Parcelable;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class GameZoneModels$$Parcelable implements Parcelable, d	// class@0012bd
{
    public GameZoneModels gameZoneModels$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GameZoneModels$$Parcelable.CREATOR = new GameZoneModels$$Parcelable$a();
    }
    public void GameZoneModels$$Parcelable(GameZoneModels p0){
       super();
       this.gameZoneModels$$0 = p0;
    }
    public static GameZoneModels read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GameZoneModels gameZoneMode = new GameZoneModels();
          p1.f(p1.g(), gameZoneMode);
          gameZoneMode.mCornerMarker = GameZoneModels$GzoneLiveCornerMarker$$Parcelable.read(p0, p1);
          gameZoneMode.mTopRightCornerMark = p0.readString();
          gameZoneMode.mAutoPlayPriority = p0.readInt();
          gameZoneMode.mGameInfo = GameZoneModels$GameInfo$$Parcelable.read(p0, p1);
          gameZoneMode.mMMUCornerMark = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          gameZoneMode.mRevenueRankWinnerIcon = uCDNUrlArray;
          p1.f(i, gameZoneMode);
          return gameZoneMode;
       }
    }
    public static void write(GameZoneModels p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          GameZoneModels$GzoneLiveCornerMarker$$Parcelable.write(p0.mCornerMarker, p1, p2, p3);
          p1.writeString(p0.mTopRightCornerMark);
          p1.writeInt(p0.mAutoPlayPriority);
          GameZoneModels$GameInfo$$Parcelable.write(p0.mGameInfo, p1, p2, p3);
          p1.writeInt(p0.mMMUCornerMark);
          GameZoneModels mRevenueRank = p0.mRevenueRankWinnerIcon;
          if (mRevenueRank == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRevenueRank.length);
             p0 = p0.mRevenueRankWinnerIcon;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GameZoneModels getParcel(){
       return this.gameZoneModels$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GameZoneModels$$Parcelable.write(this.gameZoneModels$$0, p0, p1, new a());
    }
}
