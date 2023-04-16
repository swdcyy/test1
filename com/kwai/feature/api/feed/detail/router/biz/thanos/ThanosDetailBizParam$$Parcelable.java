package com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel$$Parcelable;

public class ThanosDetailBizParam$$Parcelable implements Parcelable, d	// class@000ebb
{
    public ThanosDetailBizParam thanosDetailBizParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ThanosDetailBizParam$$Parcelable.CREATOR = new ThanosDetailBizParam$$Parcelable$a();
    }
    public void ThanosDetailBizParam$$Parcelable(ThanosDetailBizParam p0){
       super();
       this.thanosDetailBizParam$$0 = p0;
    }
    public static ThanosDetailBizParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ThanosDetailBizParam thanosDetail = new ThanosDetailBizParam();
          p1.f(p1.g(), thanosDetail);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mShowDistance = b1;
          thanosDetail.mChameleonActivityId = p0.readString();
          thanosDetail.mFansGuidePhotoId = p0.readString();
          thanosDetail.mCouponAccountId = p0.readString();
          thanosDetail.mAtlasPhotoIndex = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mHideProfileFeedTitleAndCount = b1;
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mShowThanosProfileSideLive = b1;
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mNeedReplaceFeedInThanos = b1;
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mEnableAtlasAutoPlay = b1;
          thanosDetail.mNearbyGuideParam = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mDisableSwipeProfileFeed = b1;
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mModifyOriginDataAlso = b1;
          thanosDetail.mPopSharePanelStyle = p0.readInt();
          thanosDetail.mAtlasPhotoOffset = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mShouldShowFloatWidget = b1;
          thanosDetail.mMerchantSlidePlayModel = MerchantSlidePlayModel$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          thanosDetail.mEnableExitShrink = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          thanosDetail.isCleanScreenWhenEnter = b;
          p1.f(i, thanosDetail);
          return thanosDetail;
       }
    }
    public static void write(ThanosDetailBizParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShowDistance);
          p1.writeString(p0.mChameleonActivityId);
          p1.writeString(p0.mFansGuidePhotoId);
          p1.writeString(p0.mCouponAccountId);
          p1.writeInt(p0.mAtlasPhotoIndex);
          p1.writeInt(p0.mHideProfileFeedTitleAndCount);
          p1.writeInt(p0.mShowThanosProfileSideLive);
          p1.writeInt(p0.mNeedReplaceFeedInThanos);
          p1.writeInt(p0.mEnableAtlasAutoPlay);
          p1.writeSerializable(p0.mNearbyGuideParam);
          p1.writeInt(p0.mDisableSwipeProfileFeed);
          p1.writeInt(p0.mModifyOriginDataAlso);
          p1.writeInt(p0.mPopSharePanelStyle);
          p1.writeInt(p0.mAtlasPhotoOffset);
          p1.writeInt(p0.mShouldShowFloatWidget);
          MerchantSlidePlayModel$$Parcelable.write(p0.mMerchantSlidePlayModel, p1, p2, p3);
          p1.writeInt(p0.mEnableExitShrink);
          p1.writeInt(p0.isCleanScreenWhenEnter);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ThanosDetailBizParam getParcel(){
       return this.thanosDetailBizParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ThanosDetailBizParam$$Parcelable.write(this.thanosDetailBizParam$$0, p0, p1, new a());
    }
}
