package com.kuaishou.android.model.mix.VideoMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.VideoMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.VideoMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.KMovieTemplate;
import com.yxcorp.gifshow.tube.TubePhotoPayInfo;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kuaishou.android.model.mix.FusionInfo;
import com.kuaishou.android.model.mix.FusionInfo$$Parcelable;

public class VideoMeta$$Parcelable implements Parcelable, d	// class@000e24
{
    public VideoMeta videoMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VideoMeta$$Parcelable.CREATOR = new VideoMeta$$Parcelable$a();
    }
    public void VideoMeta$$Parcelable(VideoMeta p0){
       super();
       this.videoMeta$$0 = p0;
    }
    public static VideoMeta read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          VideoMeta videoMeta = new VideoMeta();
          p1.f(p1.g(), videoMeta);
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          videoMeta.mIsLongVideo = b1;
          videoMeta.coronaRelatedRecoControlTime = p0.readInt();
          videoMeta.mFromSourceId = p0.readLong();
          videoMeta.mVpf = p0.readDouble();
          videoMeta.mLocalFileHdrState = p0.readInt();
          b1 = (p0.readInt() == b)? true: false;
          videoMeta.mSupportLandscapePlay = b1;
          videoMeta.mFlashPhotoTemplate = p0.readSerializable();
          b1 = (p0.readInt() == b)? true: false;
          videoMeta.mShowProgressWhenEnterDetail = b1;
          videoMeta.mLocalUrl = CDNUrl$$Parcelable.read(p0, p1);
          videoMeta.mContinuePlayStrategy = p0.readInt();
          videoMeta.kmovieTemplate = p0.readSerializable();
          b1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          videoMeta.mMockOriginUrls = uCDNUrlArray1;
          videoMeta.mVideoUrl = p0.readString();
          videoMeta.mDuration = p0.readLong();
          videoMeta.mMusicFeedName = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          videoMeta.mIsMusicFeed = b1;
          videoMeta.mTubePhotoPayInfo = p0.readSerializable();
          videoMeta.mGeminiAutoPlay = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          videoMeta.mSdUrls = uCDNUrlArray1;
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          videoMeta.mH265Urls = uCDNUrlArray1;
          videoMeta.mMediaManifest = p0.readSerializable();
          videoMeta.mFusionInfo = FusionInfo$$Parcelable.read(p0, p1);
          videoMeta.mWatchTime = p0.readLong();
          b1 = (p0.readInt() == b)? true: false;
          videoMeta.mIsHdrVideo = b1;
          if (p0.readInt() != b) {
             b = false;
          }
          videoMeta.mFullMovie = b;
          b1 = p0.readInt();
          if (b1 >= 0) {
             uCDNUrlArray = new CDNUrl[b1];
             for (; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          videoMeta.mVideoUrls = uCDNUrlArray;
          videoMeta.mHulianFeedId = p0.readString();
          videoMeta.mHorizontalManifest = p0.readSerializable();
          videoMeta.mSf21WarmupPercent = p0.readInt();
          videoMeta.mUserReplayTotalCount = p0.readInt();
          p1.f(i, videoMeta);
          return videoMeta;
       }
    }
    public static void write(VideoMeta p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsLongVideo);
          p1.writeInt(p0.coronaRelatedRecoControlTime);
          p1.writeLong(p0.mFromSourceId);
          p1.writeDouble(p0.mVpf);
          p1.writeInt(p0.mLocalFileHdrState);
          p1.writeInt(p0.mSupportLandscapePlay);
          p1.writeSerializable(p0.mFlashPhotoTemplate);
          p1.writeInt(p0.mShowProgressWhenEnterDetail);
          CDNUrl$$Parcelable.write(p0.mLocalUrl, p1, p2, p3);
          p1.writeInt(p0.mContinuePlayStrategy);
          p1.writeSerializable(p0.kmovieTemplate);
          VideoMeta mMockOriginU = p0.mMockOriginUrls;
          int i2 = 0;
          if (mMockOriginU == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMockOriginU.length);
             mMockOriginU = p0.mMockOriginUrls;
             len = mMockOriginU.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mMockOriginU[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mVideoUrl);
          p1.writeLong(p0.mDuration);
          p1.writeString(p0.mMusicFeedName);
          p1.writeInt(p0.mIsMusicFeed);
          p1.writeSerializable(p0.mTubePhotoPayInfo);
          p1.writeInt(p0.mGeminiAutoPlay);
          mMockOriginU = p0.mSdUrls;
          if (mMockOriginU == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMockOriginU.length);
             mMockOriginU = p0.mSdUrls;
             len = mMockOriginU.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mMockOriginU[i3], p1, p2, p3);
             }
          }
          mMockOriginU = p0.mH265Urls;
          if (mMockOriginU == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMockOriginU.length);
             mMockOriginU = p0.mH265Urls;
             len = mMockOriginU.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mMockOriginU[i3], p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mMediaManifest);
          FusionInfo$$Parcelable.write(p0.mFusionInfo, p1, p2, p3);
          p1.writeLong(p0.mWatchTime);
          p1.writeInt(p0.mIsHdrVideo);
          p1.writeInt(p0.mFullMovie);
          mMockOriginU = p0.mVideoUrls;
          if (mMockOriginU == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMockOriginU.length);
             mMockOriginU = p0.mVideoUrls;
             i1 = mMockOriginU.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mMockOriginU[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mHulianFeedId);
          p1.writeSerializable(p0.mHorizontalManifest);
          p1.writeInt(p0.mSf21WarmupPercent);
          p1.writeInt(p0.mUserReplayTotalCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VideoMeta getParcel(){
       return this.videoMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VideoMeta$$Parcelable.write(this.videoMeta$$0, p0, p1, new a());
    }
}
