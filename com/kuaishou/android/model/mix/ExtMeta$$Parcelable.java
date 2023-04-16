package com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.ExtMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$$Parcelable;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$$Parcelable;

public class ExtMeta$$Parcelable implements Parcelable, d	// class@000c65
{
    public ExtMeta extMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ExtMeta$$Parcelable.CREATOR = new ExtMeta$$Parcelable$a();
    }
    public void ExtMeta$$Parcelable(ExtMeta p0){
       super();
       this.extMeta$$0 = p0;
    }
    public static ExtMeta read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ExtMeta uExtMeta = new ExtMeta();
          p1.f(p1.g(), uExtMeta);
          uExtMeta.mWidth = p0.readInt();
          uExtMeta.mHintText = p0.readString();
          uExtMeta.mLiveLikeCount = p0.readString();
          uExtMeta.mLiveAudienceCount = p0.readString();
          uExtMeta.karaokeTitle = p0.readString();
          uExtMeta.mVideoDuration = p0.readLong();
          uExtMeta.mLiveStreamIds = p0.readString();
          uExtMeta.mTkOffset = p0.readInt();
          uExtMeta.mStyle = p0.readInt();
          uExtMeta.mType = p0.readInt();
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          uExtMeta.mExtraLogoUrls = uCDNUrlArray;
          uExtMeta.mHeight = p0.readInt();
          uExtMeta.mTubeKoi = p0.readString();
          uExtMeta.mColor = p0.readInt();
          uExtMeta.mAtlas = ImageMeta$Atlas$$Parcelable.read(p0, p1);
          uExtMeta.mDelay = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          uExtMeta.isKaraokeEntry = b;
          uExtMeta.mColorStr = p0.readString();
          uExtMeta.mVideoViewCount = p0.readLong();
          uExtMeta.mSeenTime = p0.readLong();
          uExtMeta.mSinglePicture = ImageMeta$SinglePicture$$Parcelable.read(p0, p1);
          p1.f(i, uExtMeta);
          return uExtMeta;
       }
    }
    public static void write(ExtMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mWidth);
          p1.writeString(p0.mHintText);
          p1.writeString(p0.mLiveLikeCount);
          p1.writeString(p0.mLiveAudienceCount);
          p1.writeString(p0.karaokeTitle);
          p1.writeLong(p0.mVideoDuration);
          p1.writeString(p0.mLiveStreamIds);
          p1.writeInt(p0.mTkOffset);
          p1.writeInt(p0.mStyle);
          p1.writeInt(p0.mType);
          ExtMeta mExtraLogoUr = p0.mExtraLogoUrls;
          if (mExtraLogoUr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mExtraLogoUr.length);
             mExtraLogoUr = p0.mExtraLogoUrls;
             i1 = mExtraLogoUr.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mExtraLogoUr[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mHeight);
          p1.writeString(p0.mTubeKoi);
          p1.writeInt(p0.mColor);
          ImageMeta$Atlas$$Parcelable.write(p0.mAtlas, p1, p2, p3);
          p1.writeInt(p0.mDelay);
          p1.writeInt(p0.isKaraokeEntry);
          p1.writeString(p0.mColorStr);
          p1.writeLong(p0.mVideoViewCount);
          p1.writeLong(p0.mSeenTime);
          ImageMeta$SinglePicture$$Parcelable.write(p0.mSinglePicture, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ExtMeta getParcel(){
       return this.extMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ExtMeta$$Parcelable.write(this.extMeta$$0, p0, p1, new a());
    }
}
