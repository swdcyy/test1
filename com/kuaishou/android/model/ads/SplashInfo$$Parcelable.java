package com.kuaishou.android.model.ads.SplashInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import com.kuaishou.android.model.ads.FallingEggsInfo;
import com.kuaishou.android.model.ads.FallingEggsInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$$Parcelable;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$$Parcelable;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo$$Parcelable;

public class SplashInfo$$Parcelable implements Parcelable, d	// class@000a7e
{
    public SplashInfo splashInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$$Parcelable.CREATOR = new SplashInfo$$Parcelable$a();
    }
    public void SplashInfo$$Parcelable(SplashInfo p0){
       super();
       this.splashInfo$$0 = p0;
    }
    public static SplashInfo read(Parcel p0,a p1){
       String[] stringArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo splashInfo = new SplashInfo();
          p1.f(p1.g(), splashInfo);
          splashInfo.mActionBarInfo = SplashInfo$SplashActionBarInfo$$Parcelable.read(p0, p1);
          splashInfo.mRealtimeInfo = p0.readString();
          splashInfo.mSkipInfo = SplashInfo$SplashSkipInfo$$Parcelable.read(p0, p1);
          splashInfo.mSplashClickUrlInfo = PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, p1);
          splashInfo.mPlayableInfo = SplashInfo$SplashPlayableInfo$$Parcelable.read(p0, p1);
          splashInfo.mInteractionInfo = p0.readSerializable();
          boolean i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             stringArray = null;
          }else {
             String[] stringArray1 = new String[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                stringArray1[i2] = p0.readString();
             }
             stringArray = stringArray1;
          }
          splashInfo.mImageUrls = stringArray;
          splashInfo.mFallingEggsInfo = FallingEggsInfo$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mIsRealTimePic = i1;
          splashInfo.mSplashAdDuration = p0.readInt();
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mEnablePhotoBackupImage = i1;
          splashInfo.mSplashShowControl = p0.readInt();
          splashInfo.mServerExpTag = p0.readString();
          splashInfo.mLabelInfo = SplashInfo$SplashLableInfo$$Parcelable.read(p0, p1);
          splashInfo.mMaterialHeight = p0.readInt();
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mForceDownloadMaterial = i1;
          splashInfo.mPreloadLlsid = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mIsBirthday = i1;
          splashInfo.mSplashBaseInfo = SplashBaseInfo$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mClearMaterialAfterImpression = i1;
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mShowAvatarIcon = i1;
          splashInfo.mClickButtonInfo = SplashInfo$ClickButtonInfo$$Parcelable.read(p0, p1);
          splashInfo.mSplashAdDisplayStyle = p0.readInt();
          splashInfo.mCoinToken = p0.readString();
          splashInfo.mSplashAdFeedActionBarContent = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mShowInformation = i1;
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mAudioButtonVisible = i1;
          splashInfo.mFloatingCardInfo = p0.readSerializable();
          splashInfo.mLocalRecordedInfo = SplashInfo$SplashLocalRecordInfo$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mforceDisplayNormalSplashForEyemax = i1;
          splashInfo.mPreviewMaterialType = p0.readInt();
          splashInfo.mSplashAdType = p0.readInt();
          splashInfo.mBubbleInfo = p0.readSerializable();
          i1 = (p0.readInt() == 1)? true: false;
          splashInfo.mIsFakeSplash = i1;
          splashInfo.mShareSuffixDesc = p0.readString();
          splashInfo.mSplashTouchControl = p0.readString();
          splashInfo.mPreloadInfo = SplashInfo$SplashPreloadInfo$$Parcelable.read(p0, p1);
          splashInfo.mPreviewEndTime = p0.readLong();
          splashInfo.mMaterialWidth = p0.readInt();
          splashInfo.mCallBackStr = p0.readString();
          splashInfo.mShadowInfo = SplashInfo$ShadowInfo$$Parcelable.read(p0, p1);
          splashInfo.mSharePrefixDesc = p0.readString();
          splashInfo.mSplashMaterialDisplayType = p0.readInt();
          splashInfo.mSplashLogoInfo = SplashInfo$SplashLogoInfo$$Parcelable.read(p0, p1);
          splashInfo.mSplashInformationType = p0.readInt();
          splashInfo.mChargeInfo = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          splashInfo.mEnableStayWhenVideoFinish = b;
          splashInfo.mPreloadDurMs = p0.readInt();
          splashInfo.mSplashAdMaterialType = p0.readInt();
          splashInfo.mAnimationInfo = SplashInfo$AnimationInfo$$Parcelable.read(p0, p1);
          p1.f(i, splashInfo);
          return splashInfo;
       }
    }
    public static void write(SplashInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SplashInfo$SplashActionBarInfo$$Parcelable.write(p0.mActionBarInfo, p1, p2, p3);
          p1.writeString(p0.mRealtimeInfo);
          SplashInfo$SplashSkipInfo$$Parcelable.write(p0.mSkipInfo, p1, p2, p3);
          PhotoAdvertisement$ItemClickUrl$$Parcelable.write(p0.mSplashClickUrlInfo, p1, p2, p3);
          SplashInfo$SplashPlayableInfo$$Parcelable.write(p0.mPlayableInfo, p1, p2, p3);
          p1.writeSerializable(p0.mInteractionInfo);
          SplashInfo mImageUrls = p0.mImageUrls;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.length);
             mImageUrls = p0.mImageUrls;
             i1 = mImageUrls.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                p1.writeString(mImageUrls[i2]);
             }
          }
          FallingEggsInfo$$Parcelable.write(p0.mFallingEggsInfo, p1, p2, p3);
          p1.writeInt(p0.mIsRealTimePic);
          p1.writeInt(p0.mSplashAdDuration);
          p1.writeInt(p0.mEnablePhotoBackupImage);
          p1.writeInt(p0.mSplashShowControl);
          p1.writeString(p0.mServerExpTag);
          SplashInfo$SplashLableInfo$$Parcelable.write(p0.mLabelInfo, p1, p2, p3);
          p1.writeInt(p0.mMaterialHeight);
          p1.writeInt(p0.mForceDownloadMaterial);
          p1.writeString(p0.mPreloadLlsid);
          p1.writeInt(p0.mIsBirthday);
          SplashBaseInfo$$Parcelable.write(p0.mSplashBaseInfo, p1, p2, p3);
          p1.writeInt(p0.mClearMaterialAfterImpression);
          p1.writeInt(p0.mShowAvatarIcon);
          SplashInfo$ClickButtonInfo$$Parcelable.write(p0.mClickButtonInfo, p1, p2, p3);
          p1.writeInt(p0.mSplashAdDisplayStyle);
          p1.writeString(p0.mCoinToken);
          p1.writeString(p0.mSplashAdFeedActionBarContent);
          p1.writeInt(p0.mShowInformation);
          p1.writeInt(p0.mAudioButtonVisible);
          p1.writeSerializable(p0.mFloatingCardInfo);
          SplashInfo$SplashLocalRecordInfo$$Parcelable.write(p0.mLocalRecordedInfo, p1, p2, p3);
          p1.writeInt(p0.mforceDisplayNormalSplashForEyemax);
          p1.writeInt(p0.mPreviewMaterialType);
          p1.writeInt(p0.mSplashAdType);
          p1.writeSerializable(p0.mBubbleInfo);
          p1.writeInt(p0.mIsFakeSplash);
          p1.writeString(p0.mShareSuffixDesc);
          p1.writeString(p0.mSplashTouchControl);
          SplashInfo$SplashPreloadInfo$$Parcelable.write(p0.mPreloadInfo, p1, p2, p3);
          p1.writeLong(p0.mPreviewEndTime);
          p1.writeInt(p0.mMaterialWidth);
          p1.writeString(p0.mCallBackStr);
          SplashInfo$ShadowInfo$$Parcelable.write(p0.mShadowInfo, p1, p2, p3);
          p1.writeString(p0.mSharePrefixDesc);
          p1.writeInt(p0.mSplashMaterialDisplayType);
          SplashInfo$SplashLogoInfo$$Parcelable.write(p0.mSplashLogoInfo, p1, p2, p3);
          p1.writeInt(p0.mSplashInformationType);
          p1.writeString(p0.mChargeInfo);
          p1.writeInt(p0.mEnableStayWhenVideoFinish);
          p1.writeInt(p0.mPreloadDurMs);
          p1.writeInt(p0.mSplashAdMaterialType);
          SplashInfo$AnimationInfo$$Parcelable.write(p0.mAnimationInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo getParcel(){
       return this.splashInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$$Parcelable.write(this.splashInfo$$0, p0, p1, new a());
    }
}
