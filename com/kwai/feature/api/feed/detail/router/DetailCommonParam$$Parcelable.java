package com.kwai.feature.api.feed.detail.router.DetailCommonParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.channel.HotChannel;
import com.kwai.framework.model.channel.HotChannel$$Parcelable;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.android.model.mix.QComment$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.DetailCoverInfo;

public class DetailCommonParam$$Parcelable implements Parcelable, d	// class@000e94
{
    public DetailCommonParam detailCommonParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailCommonParam$$Parcelable.CREATOR = new DetailCommonParam$$Parcelable$a();
    }
    public void DetailCommonParam$$Parcelable(DetailCommonParam p0){
       super();
       this.detailCommonParam$$0 = p0;
    }
    public static DetailCommonParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DetailCommonParam uDetailCommo = new DetailCommonParam();
          p1.f(p1.g(), uDetailCommo);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mIsFromProfile = b1;
          uDetailCommo.mHotChannel = HotChannel$$Parcelable.read(p0, p1);
          uDetailCommo.mMessageSenderName = p0.readString();
          uDetailCommo.mPreInfo = QPreInfo$$Parcelable.read(p0, p1);
          uDetailCommo.mComment = QComment$$Parcelable.read(p0, p1);
          uDetailCommo.mDetailCoverInfo = p0.readSerializable();
          uDetailCommo.mRankFetcherId = p0.readInt();
          uDetailCommo.mUnserializableBundleId = p0.readInt();
          uDetailCommo.mSourceFlagType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mIsFromShareTask = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mSlidePlayDetailDifferentFollowRefer = b1;
          uDetailCommo.mShareUid = p0.readString();
          uDetailCommo.mSourceFlag = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mFromCommentAt = b1;
          uDetailCommo.mDynamicPrefetcherId = p0.readInt();
          uDetailCommo.mMessageFromType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mCommentPushFirst = b1;
          uDetailCommo.mSourcePage = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mDisallowScreenShot = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mIsMyFollowFriendEntrance = b1;
          uDetailCommo.sourcePage2 = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailCommo.mFromCommentPush = b1;
          uDetailCommo.mOpendTimeStamp = p0.readLong();
          if (p0.readInt() == 1) {
             b = true;
          }
          uDetailCommo.mIsWindowTranslucent = b;
          uDetailCommo.mFromChannel = p0.readString();
          p1.f(i, uDetailCommo);
          return uDetailCommo;
       }
    }
    public static void write(DetailCommonParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsFromProfile);
          HotChannel$$Parcelable.write(p0.mHotChannel, p1, p2, p3);
          p1.writeString(p0.mMessageSenderName);
          QPreInfo$$Parcelable.write(p0.mPreInfo, p1, p2, p3);
          QComment$$Parcelable.write(p0.mComment, p1, p2, p3);
          p1.writeSerializable(p0.mDetailCoverInfo);
          p1.writeInt(p0.mRankFetcherId);
          p1.writeInt(p0.mUnserializableBundleId);
          p1.writeInt(p0.mSourceFlagType);
          p1.writeInt(p0.mIsFromShareTask);
          p1.writeInt(p0.mSlidePlayDetailDifferentFollowRefer);
          p1.writeString(p0.mShareUid);
          p1.writeString(p0.mSourceFlag);
          p1.writeInt(p0.mFromCommentAt);
          p1.writeInt(p0.mDynamicPrefetcherId);
          p1.writeInt(p0.mMessageFromType);
          p1.writeInt(p0.mCommentPushFirst);
          p1.writeInt(p0.mSourcePage);
          p1.writeInt(p0.mDisallowScreenShot);
          p1.writeInt(p0.mIsMyFollowFriendEntrance);
          p1.writeString(p0.sourcePage2);
          p1.writeInt(p0.mFromCommentPush);
          p1.writeLong(p0.mOpendTimeStamp);
          p1.writeInt(p0.mIsWindowTranslucent);
          p1.writeString(p0.mFromChannel);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailCommonParam getParcel(){
       return this.detailCommonParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailCommonParam$$Parcelable.write(this.detailCommonParam$$0, p0, p1, new a());
    }
}
