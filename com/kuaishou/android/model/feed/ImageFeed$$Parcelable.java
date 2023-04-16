package com.kuaishou.android.model.feed.ImageFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.ImageFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.ImageFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder$a;
import tl8.f;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoMeta$$Parcelable;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommentMeta;
import com.kuaishou.android.model.mix.CommentMeta$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.recruit.RecruitCardInfoModel;
import com.kwai.framework.model.ExtendableModelMap;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class ImageFeed$$Parcelable implements Parcelable, d	// class@000af0
{
    public ImageFeed imageFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ImageFeed$$Parcelable.CREATOR = new ImageFeed$$Parcelable$a();
    }
    public void ImageFeed$$Parcelable(ImageFeed p0){
       super();
       this.imageFeed$$0 = p0;
    }
    public static ImageFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ImageFeed imageFeed = new ImageFeed();
          p1.f(p1.g(), imageFeed);
          imageFeed.mUser = new a().c(p0);
          imageFeed.mAd = new PhotoAdvertisementPlaceHolder$a().a(p0);
          imageFeed.mPhotoMeta = PhotoMeta$$Parcelable.read(p0, p1);
          imageFeed.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          imageFeed.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          imageFeed.mCoverPicRecommendedCropWindow = CoverPicRecommendedCropWindow$$Parcelable.read(p0, p1);
          imageFeed.mImageModel = ImageMeta$$Parcelable.read(p0, p1);
          imageFeed.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          imageFeed.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          imageFeed.mCommentMeta = CommentMeta$$Parcelable.read(p0, p1);
          imageFeed.mRecruitCardInfoModel = p0.readSerializable();
          imageFeed.mExtraMap = ExtendableModelMap$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, imageFeed, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, imageFeed, "dataMap", new c().d(p0));
          p1.f(i, imageFeed);
          return imageFeed;
       }
    }
    public static void write(ImageFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          new a().d(p0.mUser, p1);
          new PhotoAdvertisementPlaceHolder$a().b(p0.mAd, p1);
          PhotoMeta$$Parcelable.write(p0.mPhotoMeta, p1, p2, p3);
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoverPicRecommendedCropWindow$$Parcelable.write(p0.mCoverPicRecommendedCropWindow, p1, p2, p3);
          ImageMeta$$Parcelable.write(p0.mImageModel, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          CommentMeta$$Parcelable.write(p0.mCommentMeta, p1, p2, p3);
          p1.writeSerializable(p0.mRecruitCardInfoModel);
          ExtendableModelMap$$Parcelable.write(p0.mExtraMap, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ImageFeed getParcel(){
       return this.imageFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ImageFeed$$Parcelable.write(this.imageFeed$$0, p0, p1, new a());
    }
}
