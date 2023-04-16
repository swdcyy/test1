package com.kuaishou.android.model.feed.VideoFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.VideoFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.VideoFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoMeta$$Parcelable;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoronaModelMeta;
import com.kuaishou.android.model.mix.CoronaModelMeta$$Parcelable;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import com.kuaishou.android.model.paycourse.PayVideoMeta$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable;
import com.kuaishou.android.model.mix.ColumnMeta;
import com.kuaishou.android.model.mix.ColumnMeta$$Parcelable;
import com.kuaishou.android.model.mix.TubeMeta;
import com.kuaishou.android.model.mix.TubeMeta$$Parcelable;
import com.kwai.framework.model.user.UserStatusExt;
import com.kwai.framework.model.user.UserStatusExt$$Parcelable;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder$a;
import tl8.f;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kuaishou.android.model.mix.VideoMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommentMeta;
import com.kuaishou.android.model.mix.CommentMeta$$Parcelable;
import com.kwai.framework.model.ExtendableModelMap;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import com.kuaishou.android.model.recruit.RecruitCardInfoModel;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class VideoFeed$$Parcelable implements Parcelable, d	// class@000b79
{
    public VideoFeed videoFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VideoFeed$$Parcelable.CREATOR = new VideoFeed$$Parcelable$a();
    }
    public void VideoFeed$$Parcelable(VideoFeed p0){
       super();
       this.videoFeed$$0 = p0;
    }
    public static VideoFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          VideoFeed videoFeed = new VideoFeed();
          p1.f(p1.g(), videoFeed);
          videoFeed.mPhotoMeta = PhotoMeta$$Parcelable.read(p0, p1);
          videoFeed.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          videoFeed.mCoronaModelMeta = CoronaModelMeta$$Parcelable.read(p0, p1);
          videoFeed.mPayVideoModel = PayVideoMeta$$Parcelable.read(p0, p1);
          videoFeed.mLivePlaybackMeta = p0.readSerializable();
          videoFeed.mCoverPicRecommendedCropWindow = CoverPicRecommendedCropWindow$$Parcelable.read(p0, p1);
          videoFeed.mColumnMeta = ColumnMeta$$Parcelable.read(p0, p1);
          videoFeed.mTubeModel = TubeMeta$$Parcelable.read(p0, p1);
          videoFeed.mUserStatusExt = UserStatusExt$$Parcelable.read(p0, p1);
          videoFeed.mUser = new a().c(p0);
          videoFeed.mAd = new PhotoAdvertisementPlaceHolder$a().a(p0);
          videoFeed.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          videoFeed.mVideoModel = VideoMeta$$Parcelable.read(p0, p1);
          videoFeed.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          videoFeed.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          videoFeed.mCommentMeta = CommentMeta$$Parcelable.read(p0, p1);
          videoFeed.mExtraMap = ExtendableModelMap$$Parcelable.read(p0, p1);
          videoFeed.mRecruitCardInfoModel = p0.readSerializable();
          a.d(BaseFeed.class, videoFeed, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, videoFeed, "dataMap", new c().d(p0));
          p1.f(i, videoFeed);
          return videoFeed;
       }
    }
    public static void write(VideoFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoMeta$$Parcelable.write(p0.mPhotoMeta, p1, p2, p3);
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CoronaModelMeta$$Parcelable.write(p0.mCoronaModelMeta, p1, p2, p3);
          PayVideoMeta$$Parcelable.write(p0.mPayVideoModel, p1, p2, p3);
          p1.writeSerializable(p0.mLivePlaybackMeta);
          CoverPicRecommendedCropWindow$$Parcelable.write(p0.mCoverPicRecommendedCropWindow, p1, p2, p3);
          ColumnMeta$$Parcelable.write(p0.mColumnMeta, p1, p2, p3);
          TubeMeta$$Parcelable.write(p0.mTubeModel, p1, p2, p3);
          UserStatusExt$$Parcelable.write(p0.mUserStatusExt, p1, p2, p3);
          new a().d(p0.mUser, p1);
          new PhotoAdvertisementPlaceHolder$a().b(p0.mAd, p1);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          VideoMeta$$Parcelable.write(p0.mVideoModel, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          CommentMeta$$Parcelable.write(p0.mCommentMeta, p1, p2, p3);
          ExtendableModelMap$$Parcelable.write(p0.mExtraMap, p1, p2, p3);
          p1.writeSerializable(p0.mRecruitCardInfoModel);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VideoFeed getParcel(){
       return this.videoFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VideoFeed$$Parcelable.write(this.videoFeed$$0, p0, p1, new a());
    }
}
