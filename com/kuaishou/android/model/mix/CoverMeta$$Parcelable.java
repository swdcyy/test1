package com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.CoverMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.CoverSize;
import com.kuaishou.android.model.mix.CoverSize$$Parcelable;
import com.kuaishou.android.model.mix.PhotoCoverStyle;
import com.kuaishou.android.model.mix.PhotoCoverStyle$$Parcelable;
import com.kuaishou.android.model.mix.CoverImageType;
import com.kuaishou.android.model.mix.CoverImageType$$Parcelable;
import com.kwai.framework.model.ExtendableModelMap;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;

public class CoverMeta$$Parcelable implements Parcelable, d	// class@000c3c
{
    public CoverMeta coverMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoverMeta$$Parcelable.CREATOR = new CoverMeta$$Parcelable$a();
    }
    public void CoverMeta$$Parcelable(CoverMeta p0){
       super();
       this.coverMeta$$0 = p0;
    }
    public static CoverMeta read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoverMeta uCoverMeta = new CoverMeta();
          p1.f(p1.g(), uCoverMeta);
          uCoverMeta.mCoverUrl = p0.readString();
          uCoverMeta.mWidth = p0.readInt();
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
          uCoverMeta.mBackgroundImageUrls = uCDNUrlArray1;
          uCoverMeta.mPhotoLiveId = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mOverrideCoverThumbnailUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mWebpGifUrls = uCDNUrlArray1;
          uCoverMeta.mAnchorPath = p0.readString();
          uCoverMeta.mOverrideCoverSize = CoverSize$$Parcelable.read(p0, p1);
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mFFCoverThumbnailUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mSfStarCoverUrls = uCDNUrlArray1;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCoverMeta.mCoverPrefetched = b;
          uCoverMeta.mHeight = p0.readInt();
          uCoverMeta.mCoverStyle = PhotoCoverStyle$$Parcelable.read(p0, p1);
          uCoverMeta.mColor = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mCoverUrls = uCDNUrlArray1;
          uCoverMeta.mFFCoverThumbnailUrl = p0.readString();
          uCoverMeta.mCoverImageType = CoverImageType$$Parcelable.read(p0, p1);
          uCoverMeta.mCoverThumbnailUrl = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mCoverThumbnailUrls = uCDNUrlArray1;
          uCoverMeta.mCoverId = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoverMeta.mProfileAnimatedCoverUrls = uCDNUrlArray;
          uCoverMeta.mOverrideCoverThumbnailType = p0.readInt();
          uCoverMeta.mExtraMap = ExtendableModelMap$$Parcelable.read(p0, p1);
          p1.f(i, uCoverMeta);
          return uCoverMeta;
       }
    }
    public static void write(CoverMeta p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCoverUrl);
          p1.writeInt(p0.mWidth);
          CoverMeta mBackgroundI = p0.mBackgroundImageUrls;
          int i2 = 0;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mBackgroundImageUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mPhotoLiveId);
          mBackgroundI = p0.mOverrideCoverThumbnailUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mOverrideCoverThumbnailUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          mBackgroundI = p0.mWebpGifUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mWebpGifUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mAnchorPath);
          CoverSize$$Parcelable.write(p0.mOverrideCoverSize, p1, p2, p3);
          mBackgroundI = p0.mFFCoverThumbnailUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mFFCoverThumbnailUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          mBackgroundI = p0.mSfStarCoverUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mSfStarCoverUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mCoverPrefetched);
          p1.writeInt(p0.mHeight);
          PhotoCoverStyle$$Parcelable.write(p0.mCoverStyle, p1, p2, p3);
          p1.writeInt(p0.mColor);
          mBackgroundI = p0.mCoverUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mCoverUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mFFCoverThumbnailUrl);
          CoverImageType$$Parcelable.write(p0.mCoverImageType, p1, p2, p3);
          p1.writeString(p0.mCoverThumbnailUrl);
          mBackgroundI = p0.mCoverThumbnailUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mCoverThumbnailUrls;
             len = mBackgroundI.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mCoverId);
          mBackgroundI = p0.mProfileAnimatedCoverUrls;
          if (mBackgroundI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundI.length);
             mBackgroundI = p0.mProfileAnimatedCoverUrls;
             i1 = mBackgroundI.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundI[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mOverrideCoverThumbnailType);
          ExtendableModelMap$$Parcelable.write(p0.mExtraMap, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoverMeta getParcel(){
       return this.coverMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoverMeta$$Parcelable.write(this.coverMeta$$0, p0, p1, new a());
    }
}
