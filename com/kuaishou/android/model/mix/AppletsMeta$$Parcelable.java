package com.kuaishou.android.model.mix.AppletsMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.AppletsMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.AppletsMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class AppletsMeta$$Parcelable implements Parcelable, d	// class@000bc2
{
    public AppletsMeta appletsMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AppletsMeta$$Parcelable.CREATOR = new AppletsMeta$$Parcelable$a();
    }
    public void AppletsMeta$$Parcelable(AppletsMeta p0){
       super();
       this.appletsMeta$$0 = p0;
    }
    public static AppletsMeta read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       List list;
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
          AppletsMeta uAppletsMeta = new AppletsMeta();
          p1.f(p1.g(), uAppletsMeta);
          uAppletsMeta.mFeedType = p0.readInt();
          uAppletsMeta.mSubtitle = p0.readString();
          uAppletsMeta.mHeight = p0.readInt();
          uAppletsMeta.mCoverBottomRightText = p0.readString();
          uAppletsMeta.mThirdId = p0.readString();
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uAppletsMeta.mHorizonCoverUrl = uCDNUrlArray1;
          uAppletsMeta.mDuration = p0.readLong();
          uAppletsMeta.mFeedCategory = p0.readInt();
          uAppletsMeta.mLikeCount = p0.readInt();
          uAppletsMeta.mWidth = p0.readInt();
          uAppletsMeta.mSchema = p0.readString();
          uAppletsMeta.mEntrySource = p0.readString();
          uAppletsMeta.mIpType = p0.readString();
          uAppletsMeta.mScore = p0.readString();
          uAppletsMeta.mAppId = p0.readString();
          uAppletsMeta.mAppPage = p0.readString();
          uAppletsMeta.mId = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          uAppletsMeta.mTagList = list;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uAppletsMeta.mCover = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          uAppletsMeta.mActors = list;
          uAppletsMeta.mAuthorName = p0.readString();
          uAppletsMeta.mMiniAppSource = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uAppletsMeta.mAvatar = uCDNUrlArray;
          uAppletsMeta.mMiniAppServerParams = p0.readString();
          uAppletsMeta.mAuthorId = p0.readLong();
          uAppletsMeta.mSourceName = p0.readString();
          uAppletsMeta.mDesc = p0.readString();
          p1.f(i, uAppletsMeta);
          return uAppletsMeta;
       }
    }
    public static void write(AppletsMeta p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mFeedType);
          p1.writeString(p0.mSubtitle);
          p1.writeInt(p0.mHeight);
          p1.writeString(p0.mCoverBottomRightText);
          p1.writeString(p0.mThirdId);
          AppletsMeta mHorizonCove = p0.mHorizonCoverUrl;
          int i2 = 0;
          if (mHorizonCove == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHorizonCove.length);
             mHorizonCove = p0.mHorizonCoverUrl;
             len = mHorizonCove.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mHorizonCove[i3], p1, p2, p3);
             }
          }
          p1.writeLong(p0.mDuration);
          p1.writeInt(p0.mFeedCategory);
          p1.writeInt(p0.mLikeCount);
          p1.writeInt(p0.mWidth);
          p1.writeString(p0.mSchema);
          p1.writeString(p0.mEntrySource);
          p1.writeString(p0.mIpType);
          p1.writeString(p0.mScore);
          p1.writeString(p0.mAppId);
          p1.writeString(p0.mAppPage);
          p1.writeString(p0.mId);
          mHorizonCove = p0.mTagList;
          if (mHorizonCove == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHorizonCove.size());
             iterator = p0.mTagList.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          mHorizonCove = p0.mCover;
          if (mHorizonCove == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHorizonCove.length);
             mHorizonCove = p0.mCover;
             len = mHorizonCove.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mHorizonCove[i3], p1, p2, p3);
             }
          }
          mHorizonCove = p0.mActors;
          if (mHorizonCove == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHorizonCove.size());
             iterator = p0.mActors.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mAuthorName);
          p1.writeString(p0.mMiniAppSource);
          mHorizonCove = p0.mAvatar;
          if (mHorizonCove == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHorizonCove.length);
             mHorizonCove = p0.mAvatar;
             i1 = mHorizonCove.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mHorizonCove[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mMiniAppServerParams);
          p1.writeLong(p0.mAuthorId);
          p1.writeString(p0.mSourceName);
          p1.writeString(p0.mDesc);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public AppletsMeta getParcel(){
       return this.appletsMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AppletsMeta$$Parcelable.write(this.appletsMeta$$0, p0, p1, new a());
    }
}
