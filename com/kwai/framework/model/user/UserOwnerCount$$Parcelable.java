package com.kwai.framework.model.user.UserOwnerCount$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserOwnerCount$$Parcelable$a;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserOwnerCount$$Parcelable implements Parcelable, d	// class@001761
{
    public UserOwnerCount userOwnerCount$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserOwnerCount$$Parcelable.CREATOR = new UserOwnerCount$$Parcelable$a();
    }
    public void UserOwnerCount$$Parcelable(UserOwnerCount p0){
       super();
       this.userOwnerCount$$0 = p0;
    }
    public static UserOwnerCount read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserOwnerCount userOwnerCou = new UserOwnerCount();
          p1.f(p1.g(), userOwnerCou);
          userOwnerCou.mLike = p0.readInt();
          userOwnerCou.mNews = p0.readInt();
          userOwnerCou.mSong = p0.readInt();
          userOwnerCou.mCollection = p0.readInt();
          userOwnerCou.mPublicPhoto = p0.readInt();
          userOwnerCou.mArticlePublic = p0.readInt();
          userOwnerCou.mLivePlayBack = p0.readInt();
          userOwnerCou.mAcFun = p0.readInt();
          userOwnerCou.mCreation = p0.readInt();
          userOwnerCou.mFan = p0.readInt();
          userOwnerCou.mDesignerMagic = p0.readInt();
          userOwnerCou.mTotalPhotoLike = p0.readLong();
          userOwnerCou.mMoment = p0.readInt();
          userOwnerCou.mFansCountText = p0.readString();
          userOwnerCou.mFollow = p0.readInt();
          userOwnerCou.mentionedMeWorksCount = p0.readInt();
          userOwnerCou.mPrivatePhoto = p0.readInt();
          userOwnerCou.mPhoto = p0.readInt();
          p1.f(i, userOwnerCou);
          return userOwnerCou;
       }
    }
    public static void write(UserOwnerCount p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mLike);
          p1.writeInt(p0.mNews);
          p1.writeInt(p0.mSong);
          p1.writeInt(p0.mCollection);
          p1.writeInt(p0.mPublicPhoto);
          p1.writeInt(p0.mArticlePublic);
          p1.writeInt(p0.mLivePlayBack);
          p1.writeInt(p0.mAcFun);
          p1.writeInt(p0.mCreation);
          p1.writeInt(p0.mFan);
          p1.writeInt(p0.mDesignerMagic);
          p1.writeLong(p0.mTotalPhotoLike);
          p1.writeInt(p0.mMoment);
          p1.writeString(p0.mFansCountText);
          p1.writeInt(p0.mFollow);
          p1.writeInt(p0.mentionedMeWorksCount);
          p1.writeInt(p0.mPrivatePhoto);
          p1.writeInt(p0.mPhoto);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserOwnerCount getParcel(){
       return this.userOwnerCount$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserOwnerCount$$Parcelable.write(this.userOwnerCount$$0, p0, p1, new a());
    }
}
