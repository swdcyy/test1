package com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo$$Parcelable$a;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.mix.LiveReservationInfo;

public class FollowingUserBannerFeed$UserBannerInfo$$Parcelable implements Parcelable, d	// class@001055
{
    public FollowingUserBannerFeed$UserBannerInfo userBannerInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowingUserBannerFeed$UserBannerInfo$$Parcelable.CREATOR = new FollowingUserBannerFeed$UserBannerInfo$$Parcelable$a();
    }
    public void FollowingUserBannerFeed$UserBannerInfo$$Parcelable(FollowingUserBannerFeed$UserBannerInfo p0){
       super();
       this.userBannerInfo$$0 = p0;
    }
    public static FollowingUserBannerFeed$UserBannerInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FollowingUserBannerFeed$UserBannerInfo userBannerIn = new FollowingUserBannerFeed$UserBannerInfo();
          p1.f(p1.g(), userBannerIn);
          userBannerIn.mUser = new a().c(p0);
          userBannerIn.mAvatarInfo = FeedUserAvatarInfo$$Parcelable.read(p0, p1);
          userBannerIn.mLastUnreadPhotoId = p0.readString();
          userBannerIn.mIntimateType = p0.readInt();
          userBannerIn.mLiveToastRank = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          userBannerIn.mShowFeedTopTitle = b;
          userBannerIn.mLiveReservationInfo = p0.readSerializable();
          userBannerIn.mRelationType = p0.readInt();
          userBannerIn.mNotifyInfo = p0.readString();
          p1.f(i, userBannerIn);
          return userBannerIn;
       }
    }
    public static void write(FollowingUserBannerFeed$UserBannerInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          new a().d(p0.mUser, p1);
          FeedUserAvatarInfo$$Parcelable.write(p0.mAvatarInfo, p1, p2, p3);
          p1.writeString(p0.mLastUnreadPhotoId);
          p1.writeInt(p0.mIntimateType);
          p1.writeInt(p0.mLiveToastRank);
          p1.writeInt(p0.mShowFeedTopTitle);
          p1.writeSerializable(p0.mLiveReservationInfo);
          p1.writeInt(p0.mRelationType);
          p1.writeString(p0.mNotifyInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowingUserBannerFeed$UserBannerInfo getParcel(){
       return this.userBannerInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowingUserBannerFeed$UserBannerInfo$$Parcelable.write(this.userBannerInfo$$0, p0, p1, new a());
    }
}
