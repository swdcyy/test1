package com.kwai.feature.api.social.moment.model.MomentModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.moment.model.MomentModel$$Parcelable$a;
import com.kwai.feature.api.social.moment.model.MomentModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.io.Serializable;
import com.kwai.feature.api.social.moment.MomentTopicResponse$MomentTagModel;
import com.kwai.feature.api.social.moment.model.MomentPictureInfo;
import com.kwai.feature.api.social.moment.model.MomentSimpleMediaObject;
import com.kuaishou.android.model.mix.Location;
import com.kuaishou.android.model.mix.Location$$Parcelable;
import com.kwai.feature.api.social.moment.model.MomentComment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.kwai.feature.api.social.moment.model.MomentRecommend;
import com.kwai.feature.api.social.moment.model.MomentRecommend$$Parcelable;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo$$Parcelable;
import com.kwai.feature.api.social.moment.model.MomentForwardObject;
import com.kwai.framework.model.user.UserStatus;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Class;
import org.parceler.a;
import java.util.List;
import java.util.Iterator;
import org.parceler.a$c;

public class MomentModel$$Parcelable implements Parcelable, d	// class@001189
{
    public MomentModel momentModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MomentModel$$Parcelable.CREATOR = new MomentModel$$Parcelable$a();
    }
    public void MomentModel$$Parcelable(MomentModel p0){
       super();
       this.momentModel$$0 = p0;
    }
    public static MomentModel read(Parcel p0,a p1){
       List list1;
       List list2;
       ArrayList uArrayList;
       int i3;
       ArrayList uArrayList1;
       int i4;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MomentModel momentModel = new MomentModel();
          p1.f(p1.g(), momentModel);
          boolean i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
          }
          momentModel.mFollowUsers = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          momentModel.mTags = list1;
          momentModel.mContent = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
          }
          momentModel.mLastCommentUsers = list1;
          boolean b = true;
          i1 = (p0.readInt() == b)? true: false;
          momentModel.mForwardClosed = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(p0.readSerializable());
             }
          }
          momentModel.mLocalPictures = list2;
          momentModel.mCommentCount = p0.readLong();
          i1 = (p0.readInt() == b)? true: false;
          momentModel.mCommentClosed = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(p0.readSerializable());
             }
          }
          momentModel.mMediaObjects = list2;
          momentModel.mLocation = Location$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == b)? true: false;
          momentModel.mIsLiked = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(User$$Parcelable.read(p0, p1));
             }
          }
          momentModel.mLikers = list2;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(p0.readSerializable());
             }
          }
          momentModel.mComments = list2;
          momentModel.mViewCount = p0.readLong();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(p0.readString());
             }
          }
          momentModel.mBackgroundColors = list2;
          momentModel.mPublishState = p0.readInt();
          momentModel.mCacheId = p0.readLong();
          momentModel.mCommentCursor = p0.readString();
          momentModel.mMomentForwardId = p0.readString();
          momentModel.mMomentUser = User$$Parcelable.read(p0, p1);
          momentModel.mLikeCount = p0.readInt();
          momentModel.mPublishTime = p0.readLong();
          momentModel.mRecommendReason = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          momentModel.mLikePhotos = list2;
          momentModel.mResourceId = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          momentModel.mViewed = i1;
          momentModel.mVisibleStatus = p0.readInt();
          momentModel.mMomentRecommend = MomentRecommend$$Parcelable.read(p0, p1);
          if (p0.readInt() != b) {
             b = false;
          }
          momentModel.mExpired = b;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          momentModel.mThumbnails = list1;
          momentModel.mVideoInfo = MomentVideoInfo$$Parcelable.read(p0, p1);
          momentModel.mMomentForwardObject = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readSerializable());
             }
          }
          momentModel.mPictures = list;
          momentModel.mMomentId = p0.readString();
          momentModel.mCommentPinnedInfo = p0.readString();
          momentModel.mMomentType = p0.readInt();
          momentModel.mZtPhotoId = p0.readLong();
          momentModel.mUserStatusMeta = p0.readSerializable();
          a.d(DefaultObservableAndSyncable.class, momentModel, "mDefaultObservable", p0.readSerializable());
          p1.f(i, momentModel);
          return momentModel;
       }
    }
    public static void write(MomentModel p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MomentModel mFollowUsers = p0.mFollowUsers;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mFollowUsers.iterator();
             while (iterator1.hasNext()) {
                User$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mFollowUsers = p0.mTags;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mTags.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeString(p0.mContent);
          mFollowUsers = p0.mLastCommentUsers;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mLastCommentUsers.iterator();
             while (iterator1.hasNext()) {
                User$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mForwardClosed);
          mFollowUsers = p0.mLocalPictures;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mLocalPictures.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeLong(p0.mCommentCount);
          p1.writeInt(p0.mCommentClosed);
          mFollowUsers = p0.mMediaObjects;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mMediaObjects.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          Location$$Parcelable.write(p0.mLocation, p1, p2, p3);
          p1.writeInt(p0.mIsLiked);
          mFollowUsers = p0.mLikers;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mLikers.iterator();
             while (iterator1.hasNext()) {
                User$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mFollowUsers = p0.mComments;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mComments.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeLong(p0.mViewCount);
          mFollowUsers = p0.mBackgroundColors;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mBackgroundColors.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeInt(p0.mPublishState);
          p1.writeLong(p0.mCacheId);
          p1.writeString(p0.mCommentCursor);
          p1.writeString(p0.mMomentForwardId);
          User$$Parcelable.write(p0.mMomentUser, p1, p2, p3);
          p1.writeInt(p0.mLikeCount);
          p1.writeLong(p0.mPublishTime);
          p1.writeString(p0.mRecommendReason);
          mFollowUsers = p0.mLikePhotos;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mLikePhotos.iterator();
             while (iterator1.hasNext()) {
                QPhoto$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mResourceId);
          p1.writeInt(p0.mViewed);
          p1.writeInt(p0.mVisibleStatus);
          MomentRecommend$$Parcelable.write(p0.mMomentRecommend, p1, p2, p3);
          p1.writeInt(p0.mExpired);
          mFollowUsers = p0.mThumbnails;
          if (mFollowUsers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowUsers.size());
             iterator1 = p0.mThumbnails.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          MomentVideoInfo$$Parcelable.write(p0.mVideoInfo, p1, p2, p3);
          p1.writeSerializable(p0.mMomentForwardObject);
          MomentModel mPictures = p0.mPictures;
          if (mPictures == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mPictures.size());
             Iterator iterator = p0.mPictures.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeString(p0.mMomentId);
          p1.writeString(p0.mCommentPinnedInfo);
          p1.writeInt(p0.mMomentType);
          p1.writeLong(p0.mZtPhotoId);
          p1.writeSerializable(p0.mUserStatusMeta);
          p1.writeSerializable(a.c(new a$c(), DefaultObservableAndSyncable.class, p0, "mDefaultObservable"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MomentModel getParcel(){
       return this.momentModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MomentModel$$Parcelable.write(this.momentModel$$0, p0, p1, new a());
    }
}
