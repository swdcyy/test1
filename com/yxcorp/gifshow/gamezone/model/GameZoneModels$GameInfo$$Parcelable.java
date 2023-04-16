package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo$$Parcelable$a;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$SubscribeStatus;
import java.lang.Class;
import java.lang.Enum;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneCompetitionCorner;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneCompetitionCorner$$Parcelable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.io.Serializable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import org.parceler.a;
import org.parceler.a$c;

public class GameZoneModels$GameInfo$$Parcelable implements Parcelable, d	// class@0012bf
{
    public GameZoneModels$GameInfo gameInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GameZoneModels$GameInfo$$Parcelable.CREATOR = new GameZoneModels$GameInfo$$Parcelable$a();
    }
    public void GameZoneModels$GameInfo$$Parcelable(GameZoneModels$GameInfo p0){
       super();
       this.gameInfo$$0 = p0;
    }
    public static GameZoneModels$GameInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GameZoneModels$GameInfo gameInfo = new GameZoneModels$GameInfo();
          p1.f(p1.g(), gameInfo);
          gameInfo.mCoverUrl = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          gameInfo.mEnterLiveFeedPage = b;
          gameInfo.mGameId = p0.readString();
          gameInfo.mGameDescription = p0.readString();
          gameInfo.mDefaultTab = p0.readInt();
          gameInfo.mHeroName = p0.readString();
          gameInfo.mWatchingCount = p0.readString();
          gameInfo.mKill = p0.readInt();
          gameInfo.mDeath = p0.readInt();
          String str = p0.readString();
          GameZoneModels$SubscribeStatus subscribeSta = (str == null)? null: Enum.valueOf(GameZoneModels$SubscribeStatus.class, str);
          gameInfo.mSubscribeStatus = subscribeSta;
          gameInfo.mCategoryName = p0.readString();
          gameInfo.mRoomCount = p0.readString();
          gameInfo.mGameName = p0.readString();
          gameInfo.mPhotoCount = p0.readString();
          gameInfo.mShortDescription = p0.readString();
          gameInfo.mInitialedHeroName = p0.readString();
          gameInfo.mSubscribedCount = p0.readLong();
          gameInfo.mShortGameName = p0.readString();
          gameInfo.mCompetitionCorner = GameZoneModels$GzoneCompetitionCorner$$Parcelable.read(p0, p1);
          gameInfo.mSurvival = p0.readInt();
          gameInfo.mCategoryId = p0.readString();
          a.d(DefaultObservableAndSyncable.class, gameInfo, "mDefaultObservable", p0.readSerializable());
          p1.f(i, gameInfo);
          return gameInfo;
       }
    }
    public static void write(GameZoneModels$GameInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCoverUrl);
          p1.writeInt(p0.mEnterLiveFeedPage);
          p1.writeString(p0.mGameId);
          p1.writeString(p0.mGameDescription);
          p1.writeInt(p0.mDefaultTab);
          p1.writeString(p0.mHeroName);
          p1.writeString(p0.mWatchingCount);
          p1.writeInt(p0.mKill);
          p1.writeInt(p0.mDeath);
          GameZoneModels$GameInfo mSubscribeSt = p0.mSubscribeStatus;
          String str = (mSubscribeSt == null)? null: mSubscribeSt.name();
          p1.writeString(str);
          p1.writeString(p0.mCategoryName);
          p1.writeString(p0.mRoomCount);
          p1.writeString(p0.mGameName);
          p1.writeString(p0.mPhotoCount);
          p1.writeString(p0.mShortDescription);
          p1.writeString(p0.mInitialedHeroName);
          p1.writeLong(p0.mSubscribedCount);
          p1.writeString(p0.mShortGameName);
          GameZoneModels$GzoneCompetitionCorner$$Parcelable.write(p0.mCompetitionCorner, p1, p2, p3);
          p1.writeInt(p0.mSurvival);
          p1.writeString(p0.mCategoryId);
          p1.writeSerializable(a.c(new a$c(), DefaultObservableAndSyncable.class, p0, "mDefaultObservable"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GameZoneModels$GameInfo getParcel(){
       return this.gameInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GameZoneModels$GameInfo$$Parcelable.write(this.gameInfo$$0, p0, p1, new a());
    }
}
