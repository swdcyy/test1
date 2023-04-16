package com.yxcorp.gifshow.model.MagicEmoji$MagicFace$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace$$Parcelable$a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType;
import java.lang.Class;
import java.lang.Enum;
import java.io.Serializable;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.Music$$Parcelable;
import com.yxcorp.gifshow.model.MagicGuideParams;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.FileMd5Info;
import java.lang.Integer;
import com.yxcorp.gifshow.model.ChildMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.List;
import java.util.Iterator;

public class MagicEmoji$MagicFace$$Parcelable implements Parcelable, d	// class@001e4a
{
    public MagicEmoji$MagicFace magicFace$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MagicEmoji$MagicFace$$Parcelable.CREATOR = new MagicEmoji$MagicFace$$Parcelable$a();
    }
    public void MagicEmoji$MagicFace$$Parcelable(MagicEmoji$MagicFace p0){
       super();
       this.magicFace$$0 = p0;
    }
    public static MagicEmoji$MagicFace read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       List list1;
       List list2;
       CDNUrl[] uCDNUrlArray1;
       int i3;
       ArrayList uArrayList;
       List list3;
       Integer integer;
       int i4;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MagicEmoji$MagicFace magicFace = new MagicEmoji$MagicFace();
          p1.f(p1.g(), magicFace);
          magicFace.mGifShowEndTime = p0.readLong();
          String str = p0.readString();
          List list = null;
          MagicEmoji$MagicFaceType magicFaceTyp = (str == null)? list: Enum.valueOf(MagicEmoji$MagicFaceType.class, str);
          magicFace.mMagicFaceType = magicFaceTyp;
          magicFace.mExtraParams = p0.readSerializable();
          magicFace.mFrontTips = p0.readString();
          magicFace.mDefaultDuration = p0.readInt();
          magicFace.mBackTips = p0.readString();
          boolean i1 = p0.readInt();
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          magicFace.mGifIconUrls = uCDNUrlArray;
          magicFace.mMagicFaceIconTipMsg = p0.readSerializable();
          magicFace.mPlatformEffect = p0.readString();
          magicFace.mMusic = Music$$Parcelable.read(p0, p1);
          magicFace.mMagicUserInfo = p0.readString();
          magicFace.mRequestId = p0.readString();
          magicFace.mMagicGuideParams = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                list1.add(p0.readSerializable());
             }
          }
          magicFace.mFileMd5CheckList = list1;
          boolean b = true;
          i1 = (p0.readInt() == b)? true: false;
          magicFace.mIsSameTips = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                list3 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list3);
             }
          }
          magicFace.mDisableBeautylist = list2;
          magicFace.mTopic = p0.readString();
          magicFace.mGifShowStartTime = p0.readLong();
          magicFace.mGifMaxShowCount = p0.readInt();
          i1 = (p0.readInt() == b)? true: false;
          magicFace.mHasMusic = i1;
          magicFace.mTimelineColor = p0.readString();
          magicFace.mChildMagicFace = p0.readSerializable();
          i1 = (p0.readInt() == b)? true: false;
          magicFace.mSwitchable = i1;
          magicFace.mResource = p0.readString();
          magicFace.mPassThroughParams = p0.readSerializable();
          magicFace.mChecksum = p0.readLong();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                list3 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list3);
             }
          }
          magicFace.mFonts = list2;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = list;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          magicFace.mResources = uCDNUrlArray1;
          magicFace.mTag = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          magicFace.mDependSo = list2;
          magicFace.mUnSupportReason = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = list;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          magicFace.mImages = uCDNUrlArray1;
          magicFace.mVersion = p0.readInt();
          if (p0.readInt() != b) {
             b = false;
          }
          magicFace.mIsOffline = b;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          magicFace.mHdImageUrls = list;
          magicFace.magicFacePlayCount = p0.readLong();
          magicFace.mId = p0.readString();
          magicFace.mChildId = p0.readString();
          magicFace.mImage = p0.readString();
          magicFace.mResourceType = p0.readInt();
          magicFace.mName = p0.readString();
          p1.f(i, magicFace);
          return magicFace;
       }
    }
    public static void write(MagicEmoji$MagicFace p0,Parcel p1,int p2,a p3){
       int i3;
       Iterator iterator;
       int i4;
       Integer integer;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mGifShowEndTime);
          MagicEmoji$MagicFace mMagicFaceTy = p0.mMagicFaceType;
          String str = (mMagicFaceTy == null)? null: mMagicFaceTy.name();
          p1.writeString(str);
          p1.writeSerializable(p0.mExtraParams);
          p1.writeString(p0.mFrontTips);
          p1.writeInt(p0.mDefaultDuration);
          p1.writeString(p0.mBackTips);
          mMagicFaceTy = p0.mGifIconUrls;
          int i2 = 0;
          if (mMagicFaceTy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMagicFaceTy.length);
             mMagicFaceTy = p0.mGifIconUrls;
             i3 = mMagicFaceTy.length;
             for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                CDNUrl$$Parcelable.write(mMagicFaceTy[i4], p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mMagicFaceIconTipMsg);
          p1.writeString(p0.mPlatformEffect);
          Music$$Parcelable.write(p0.mMusic, p1, p2, p3);
          p1.writeString(p0.mMagicUserInfo);
          p1.writeString(p0.mRequestId);
          p1.writeSerializable(p0.mMagicGuideParams);
          mMagicFaceTy = p0.mFileMd5CheckList;
          if (mMagicFaceTy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMagicFaceTy.size());
             iterator = p0.mFileMd5CheckList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mIsSameTips);
          mMagicFaceTy = p0.mDisableBeautylist;
          i3 = 1;
          if (mMagicFaceTy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMagicFaceTy.size());
             iterator = p0.mDisableBeautylist.iterator();
             while (iterator.hasNext()) {
                integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(i1);
                }else {
                   p1.writeInt(i3);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          p1.writeString(p0.mTopic);
          p1.writeLong(p0.mGifShowStartTime);
          p1.writeInt(p0.mGifMaxShowCount);
          p1.writeInt(p0.mHasMusic);
          p1.writeString(p0.mTimelineColor);
          p1.writeSerializable(p0.mChildMagicFace);
          p1.writeInt(p0.mSwitchable);
          p1.writeString(p0.mResource);
          p1.writeSerializable(p0.mPassThroughParams);
          p1.writeLong(p0.mChecksum);
          MagicBaseConfig mFonts = p0.mFonts;
          if (mFonts == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFonts.size());
             iterator = p0.mFonts.iterator();
             while (iterator.hasNext()) {
                integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(i1);
                }else {
                   p1.writeInt(i3);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          mFonts = p0.mResources;
          if (mFonts == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFonts.length);
             mFonts = p0.mResources;
             i3 = mFonts.length;
             for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                CDNUrl$$Parcelable.write(mFonts[i4], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTag);
          mFonts = p0.mDependSo;
          if (mFonts == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFonts.size());
             iterator = p0.mDependSo.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mUnSupportReason);
          SimpleMagicFace mImages = p0.mImages;
          if (mImages == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImages.length);
             mImages = p0.mImages;
             i3 = mImages.length;
             for (; i2 < i3; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mImages[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mVersion);
          p1.writeInt(p0.mIsOffline);
          mImages = p0.mHdImageUrls;
          if (mImages == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImages.size());
             iterator = p0.mHdImageUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.magicFacePlayCount);
          p1.writeString(p0.mId);
          p1.writeString(p0.mChildId);
          p1.writeString(p0.mImage);
          p1.writeInt(p0.mResourceType);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MagicEmoji$MagicFace getParcel(){
       return this.magicFace$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MagicEmoji$MagicFace$$Parcelable.write(this.magicFace$$0, p0, p1, new a());
    }
}
