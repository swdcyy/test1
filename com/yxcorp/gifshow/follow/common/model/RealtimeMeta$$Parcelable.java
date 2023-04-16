package com.yxcorp.gifshow.follow.common.model.RealtimeMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$$Parcelable$a;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$$Parcelable;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$PymkParams;
import java.util.List;
import java.util.Iterator;

public class RealtimeMeta$$Parcelable implements Parcelable, d	// class@001063
{
    public RealtimeMeta realtimeMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RealtimeMeta$$Parcelable.CREATOR = new RealtimeMeta$$Parcelable$a();
    }
    public void RealtimeMeta$$Parcelable(RealtimeMeta p0){
       super();
       this.realtimeMeta$$0 = p0;
    }
    public static RealtimeMeta read(Parcel p0,a p1){
       List list;
       CDNUrl[] uCDNUrlArray1;
       User[] userArray;
       ArrayList uArrayList;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RealtimeMeta realtimeMeta = new RealtimeMeta();
          p1.f(p1.g(), realtimeMeta);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          realtimeMeta.mRecommendUsers = list;
          realtimeMeta.mContent = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          realtimeMeta.mCdnList = uCDNUrlArray1;
          realtimeMeta.mTheme = p0.readInt();
          realtimeMeta.mLinkUrl = p0.readString();
          realtimeMeta.mSubTitle = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          realtimeMeta.mRightIconUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             userArray = uCDNUrlArray;
          }else {
             userArray = new User[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                userArray[i3] = User$$Parcelable.read(p0, p1);
             }
          }
          realtimeMeta.mUserAvatars = userArray;
          i1 = p0.readInt();
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(BaseFeed$$Parcelable.read(p0, p1));
             }
          }
          realtimeMeta.mPhotos = list;
          realtimeMeta.mLogParams = RealtimeMeta$LogParams$$Parcelable.read(p0, p1);
          realtimeMeta.mTitle = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          realtimeMeta.mCoverThumbnailUrls = uCDNUrlArray;
          realtimeMeta.mContentType = p0.readInt();
          realtimeMeta.mFeedId = p0.readString();
          realtimeMeta.mPymkExtParams = p0.readSerializable();
          p1.f(i, realtimeMeta);
          return realtimeMeta;
       }
    }
    public static void write(RealtimeMeta p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          RealtimeMeta mRecommendUs = p0.mRecommendUsers;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.size());
             iterator = p0.mRecommendUsers.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeString(p0.mContent);
          mRecommendUs = p0.mCdnList;
          int i2 = 0;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.length);
             mRecommendUs = p0.mCdnList;
             len = mRecommendUs.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mRecommendUs[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mTheme);
          p1.writeString(p0.mLinkUrl);
          p1.writeString(p0.mSubTitle);
          mRecommendUs = p0.mRightIconUrls;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.length);
             mRecommendUs = p0.mRightIconUrls;
             len = mRecommendUs.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mRecommendUs[i3], p1, p2, p3);
             }
          }
          mRecommendUs = p0.mUserAvatars;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.length);
             mRecommendUs = p0.mUserAvatars;
             len = mRecommendUs.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                User$$Parcelable.write(mRecommendUs[i3], p1, p2, p3);
             }
          }
          mRecommendUs = p0.mPhotos;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.size());
             iterator = p0.mPhotos.iterator();
             while (iterator.hasNext()) {
                BaseFeed$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          RealtimeMeta$LogParams$$Parcelable.write(p0.mLogParams, p1, p2, p3);
          p1.writeString(p0.mTitle);
          mRecommendUs = p0.mCoverThumbnailUrls;
          if (mRecommendUs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRecommendUs.length);
             mRecommendUs = p0.mCoverThumbnailUrls;
             i1 = mRecommendUs.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mRecommendUs[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mContentType);
          p1.writeString(p0.mFeedId);
          p1.writeSerializable(p0.mPymkExtParams);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RealtimeMeta getParcel(){
       return this.realtimeMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RealtimeMeta$$Parcelable.write(this.realtimeMeta$$0, p0, p1, new a());
    }
}
