package com.kwai.feature.api.feed.detail.router.PhotoDetailParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam$$Parcelable;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam$$Parcelable;
import java.lang.Boolean;
import java.lang.Class;
import org.parceler.a;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig$$Parcelable;
import az6.a;

public class PhotoDetailParam$$Parcelable implements Parcelable, d	// class@000ea2
{
    public PhotoDetailParam photoDetailParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoDetailParam$$Parcelable.CREATOR = new PhotoDetailParam$$Parcelable$a();
    }
    public void PhotoDetailParam$$Parcelable(PhotoDetailParam p0){
       super();
       this.photoDetailParam$$0 = p0;
    }
    public static PhotoDetailParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoDetailParam photoDetailP = new PhotoDetailParam();
          p1.f(p1.g(), photoDetailP);
          photoDetailP.mDetailDanmakuParam = DetailDanmakuParam$$Parcelable.read(p0, p1);
          photoDetailP.mDetailCommonParam = DetailCommonParam$$Parcelable.read(p0, p1);
          photoDetailP.mBizType = p0.readInt();
          photoDetailP.mClickViewId = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          photoDetailP.isOverAllUseNasa = b1;
          b1 = (p0.readInt() == 1)? true: false;
          photoDetailP.showDanmkuSwitch = b1;
          PhotoDetailParam photoDetailP1 = PhotoDetailParam.class;
          boolean b2 = (p0.readInt() == 1)? true: false;
          a.d(photoDetailP1, photoDetailP, "mIsForceShowLeftSlideGuide", Boolean.valueOf(b2));
          photoDetailP.mDialogType = p0.readInt();
          photoDetailP.mStartEncodedUri = p0.readString();
          photoDetailP.mDetailPlayConfig = DetailPlayConfig$$Parcelable.read(p0, p1);
          a.d(PhotoDetailParam.class, photoDetailP, "mEntranceFeed", BaseFeed$$Parcelable.read(p0, p1));
          b1 = (p0.readInt() == 1)? true: false;
          photoDetailP.isForceNormalDetail = b1;
          photoDetailP1 = PhotoDetailParam.class;
          b2 = (p0.readInt() == 1)? true: false;
          a.d(photoDetailP1, photoDetailP, "mIsSearchEpisodeSerial", Boolean.valueOf(b2));
          b1 = (p0.readInt() == 1)? true: false;
          photoDetailP.isShowDanmakuView = b1;
          photoDetailP.mDetailLogParam = DetailLogParam$$Parcelable.read(p0, p1);
          photoDetailP1 = PhotoDetailParam.class;
          b2 = (p0.readInt() == 1)? true: false;
          a.d(photoDetailP1, photoDetailP, "mIsFromDomino", Boolean.valueOf(b2));
          photoDetailP1 = PhotoDetailParam.class;
          b2 = (p0.readInt() == 1)? true: false;
          a.d(photoDetailP1, photoDetailP, "mIsEpisodeSerial", Boolean.valueOf(b2));
          b1 = (p0.readInt() == 1)? true: false;
          photoDetailP.mEnableInsertPhotoToFetchList = b1;
          photoDetailP.mPhoto = QPhoto$$Parcelable.read(p0, p1);
          photoDetailP.mPhotoId = p0.readString();
          photoDetailP.mSlidePlayConfig = SlidePlayConfig$$Parcelable.read(p0, p1);
          photoDetailP.mPhotoIndexByLog = p0.readInt();
          photoDetailP.mSource = p0.readInt();
          photoDetailP.mSourceOfContainer = p0.readInt();
          photoDetailP.mPhotoIndex = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          photoDetailP.mIsFromNebulaThanosHotLive = b;
          photoDetailP.mSlidePlayId = p0.readString();
          photoDetailP.mFromNebulaThanosHotLiveLiveStreamId = p0.readString();
          photoDetailP.mFeedPosition = p0.readInt();
          p1.f(i, photoDetailP);
          return photoDetailP;
       }
    }
    public static void write(PhotoDetailParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          DetailDanmakuParam$$Parcelable.write(p0.mDetailDanmakuParam, p1, p2, p3);
          DetailCommonParam$$Parcelable.write(p0.mDetailCommonParam, p1, p2, p3);
          p1.writeInt(p0.mBizType);
          p1.writeString(p0.mClickViewId);
          p1.writeInt(p0.isOverAllUseNasa);
          p1.writeInt(p0.showDanmkuSwitch);
          Class tYPE = Boolean.TYPE;
          p1.writeInt(a.b(tYPE, PhotoDetailParam.class, p0, "mIsForceShowLeftSlideGuide").booleanValue());
          p1.writeInt(p0.mDialogType);
          p1.writeString(p0.mStartEncodedUri);
          DetailPlayConfig$$Parcelable.write(p0.mDetailPlayConfig, p1, p2, p3);
          BaseFeed$$Parcelable.write(a.b(BaseFeed.class, PhotoDetailParam.class, p0, "mEntranceFeed"), p1, p2, p3);
          p1.writeInt(p0.isForceNormalDetail);
          p1.writeInt(a.b(tYPE, PhotoDetailParam.class, p0, "mIsSearchEpisodeSerial").booleanValue());
          p1.writeInt(p0.isShowDanmakuView);
          DetailLogParam$$Parcelable.write(p0.mDetailLogParam, p1, p2, p3);
          p1.writeInt(a.b(tYPE, PhotoDetailParam.class, p0, "mIsFromDomino").booleanValue());
          p1.writeInt(a.b(tYPE, PhotoDetailParam.class, p0, "mIsEpisodeSerial").booleanValue());
          p1.writeInt(p0.mEnableInsertPhotoToFetchList);
          QPhoto$$Parcelable.write(p0.mPhoto, p1, p2, p3);
          p1.writeString(p0.mPhotoId);
          SlidePlayConfig$$Parcelable.write(p0.mSlidePlayConfig, p1, p2, p3);
          p1.writeInt(p0.mPhotoIndexByLog);
          p1.writeInt(p0.mSource);
          p1.writeInt(p0.mSourceOfContainer);
          p1.writeInt(p0.mPhotoIndex);
          p1.writeInt(p0.mIsFromNebulaThanosHotLive);
          p1.writeString(p0.mSlidePlayId);
          p1.writeString(p0.mFromNebulaThanosHotLiveLiveStreamId);
          p1.writeInt(p0.mFeedPosition);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoDetailParam getParcel(){
       return this.photoDetailParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoDetailParam$$Parcelable.write(this.photoDetailParam$$0, p0, p1, new a());
    }
}
