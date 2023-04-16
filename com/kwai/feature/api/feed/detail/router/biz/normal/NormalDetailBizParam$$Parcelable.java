package com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam$$Parcelable;
import java.lang.Integer;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam$$Parcelable;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import java.lang.Class;
import java.lang.Enum;

public class NormalDetailBizParam$$Parcelable implements Parcelable, d	// class@000eab
{
    public NormalDetailBizParam normalDetailBizParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NormalDetailBizParam$$Parcelable.CREATOR = new NormalDetailBizParam$$Parcelable$a();
    }
    public void NormalDetailBizParam$$Parcelable(NormalDetailBizParam p0){
       super();
       this.normalDetailBizParam$$0 = p0;
    }
    public static NormalDetailBizParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NormalDetailBizParam normalDetail = new NormalDetailBizParam();
          p1.f(p1.g(), normalDetail);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mShowEditor = b1;
          normalDetail.mFansGuidePhotoId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mDisableAutoReply = b1;
          normalDetail.mReplaceFragmentParam = ReplaceFragmentParam$$Parcelable.read(p0, p1);
          normalDetail.mImageTotalOffset = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mDetailImageAnimaOpt = b1;
          normalDetail.mShrinkTypeOut = p0.readInt();
          ToProfilePlan toProfilePla = null;
          Integer integer = (p0.readInt() < 0)? toProfilePla: Integer.valueOf(p0.readInt());
          normalDetail.mKeyOfAtlasViewedCounts = integer;
          normalDetail.mPopSharePanelStyle = p0.readInt();
          normalDetail.mNonslideLandscapeParam = NonslideLandscapeParam$$Parcelable.read(p0, p1);
          normalDetail.mCouponAccountId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mFromSlidePlayPhotoClick = b1;
          normalDetail.mImageContainerHeight = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mDisableFeedBack = b1;
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mFromCoronaChannelFeed = b1;
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mAnchorToCommentItemTopWithOffset = b1;
          normalDetail.mShrinkTypeIn = p0.readInt();
          normalDetail.mStartImageIndex = p0.readInt();
          String str = p0.readString();
          if (str != null) {
             toProfilePla = Enum.valueOf(ToProfilePlan.class, str);
          }
          normalDetail.mToProfilePlan = toProfilePla;
          normalDetail.mStartImageOffset = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mScrollToComment = b1;
          normalDetail.mDetailImageContainerHeight = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mFromCaptionOrCommentClick = b1;
          b1 = (p0.readInt() == 1)? true: false;
          normalDetail.mEnableLastFrame = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          normalDetail.mIsLongAtlas = b;
          p1.f(i, normalDetail);
          return normalDetail;
       }
    }
    public static void write(NormalDetailBizParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShowEditor);
          p1.writeString(p0.mFansGuidePhotoId);
          p1.writeInt(p0.mDisableAutoReply);
          ReplaceFragmentParam$$Parcelable.write(p0.mReplaceFragmentParam, p1, p2, p3);
          p1.writeInt(p0.mImageTotalOffset);
          p1.writeInt(p0.mDetailImageAnimaOpt);
          p1.writeInt(p0.mShrinkTypeOut);
          if (p0.mKeyOfAtlasViewedCounts == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mKeyOfAtlasViewedCounts.intValue());
          }
          p1.writeInt(p0.mPopSharePanelStyle);
          NonslideLandscapeParam$$Parcelable.write(p0.mNonslideLandscapeParam, p1, p2, p3);
          p1.writeString(p0.mCouponAccountId);
          p1.writeInt(p0.mFromSlidePlayPhotoClick);
          p1.writeInt(p0.mImageContainerHeight);
          p1.writeInt(p0.mDisableFeedBack);
          p1.writeInt(p0.mFromCoronaChannelFeed);
          p1.writeInt(p0.mAnchorToCommentItemTopWithOffset);
          p1.writeInt(p0.mShrinkTypeIn);
          p1.writeInt(p0.mStartImageIndex);
          NormalDetailBizParam mToProfilePl = p0.mToProfilePlan;
          String str = (mToProfilePl == null)? null: mToProfilePl.name();
          p1.writeString(str);
          p1.writeInt(p0.mStartImageOffset);
          p1.writeInt(p0.mScrollToComment);
          p1.writeInt(p0.mDetailImageContainerHeight);
          p1.writeInt(p0.mFromCaptionOrCommentClick);
          p1.writeInt(p0.mEnableLastFrame);
          p1.writeInt(p0.mIsLongAtlas);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NormalDetailBizParam getParcel(){
       return this.normalDetailBizParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NormalDetailBizParam$$Parcelable.write(this.normalDetailBizParam$$0, p0, p1, new a());
    }
}
