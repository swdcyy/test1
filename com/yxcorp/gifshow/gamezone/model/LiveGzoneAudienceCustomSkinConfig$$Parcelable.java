package com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$$Parcelable$a;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$FollowButtonConfig;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$SubTabBarConfig;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$TabBarConfig;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$ExtensionConfig;

public class LiveGzoneAudienceCustomSkinConfig$$Parcelable implements Parcelable, d	// class@0012cb
{
    public LiveGzoneAudienceCustomSkinConfig liveGzoneAudienceCustomSkinConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveGzoneAudienceCustomSkinConfig$$Parcelable.CREATOR = new LiveGzoneAudienceCustomSkinConfig$$Parcelable$a();
    }
    public void LiveGzoneAudienceCustomSkinConfig$$Parcelable(LiveGzoneAudienceCustomSkinConfig p0){
       super();
       this.liveGzoneAudienceCustomSkinConfig$$0 = p0;
    }
    public static LiveGzoneAudienceCustomSkinConfig read(Parcel p0,a p1){
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
          LiveGzoneAudienceCustomSkinConfig liveGzoneAud = new LiveGzoneAudienceCustomSkinConfig();
          p1.f(p1.g(), liveGzoneAud);
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
          liveGzoneAud.mCustomSkinBackgroundCDNUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveGzoneAud.mCompetitionTopPicUrls = uCDNUrlArray1;
          liveGzoneAud.mFollowButtonConfig = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveGzoneAud.mTopPicUrls = uCDNUrlArray1;
          liveGzoneAud.mSubTabBarConfig = p0.readSerializable();
          liveGzoneAud.mTabBarConfig = p0.readSerializable();
          liveGzoneAud.mExtensionConfig = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveGzoneAud.mBottomPicUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveGzoneAud.mBottomBgPicUrls = uCDNUrlArray;
          p1.f(i, liveGzoneAud);
          return liveGzoneAud;
       }
    }
    public static void write(LiveGzoneAudienceCustomSkinConfig p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveGzoneAudienceCustomSkinConfig mCustomSkinB = p0.mCustomSkinBackgroundCDNUrls;
          int i2 = 0;
          if (mCustomSkinB == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCustomSkinB.length);
             mCustomSkinB = p0.mCustomSkinBackgroundCDNUrls;
             len = mCustomSkinB.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mCustomSkinB[i3], p1, p2, p3);
             }
          }
          mCustomSkinB = p0.mCompetitionTopPicUrls;
          if (mCustomSkinB == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCustomSkinB.length);
             mCustomSkinB = p0.mCompetitionTopPicUrls;
             len = mCustomSkinB.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mCustomSkinB[i3], p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mFollowButtonConfig);
          mCustomSkinB = p0.mTopPicUrls;
          if (mCustomSkinB == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCustomSkinB.length);
             mCustomSkinB = p0.mTopPicUrls;
             len = mCustomSkinB.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mCustomSkinB[i3], p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mSubTabBarConfig);
          p1.writeSerializable(p0.mTabBarConfig);
          p1.writeSerializable(p0.mExtensionConfig);
          mCustomSkinB = p0.mBottomPicUrls;
          if (mCustomSkinB == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCustomSkinB.length);
             mCustomSkinB = p0.mBottomPicUrls;
             len = mCustomSkinB.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mCustomSkinB[i3], p1, p2, p3);
             }
          }
          mCustomSkinB = p0.mBottomBgPicUrls;
          if (mCustomSkinB == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCustomSkinB.length);
             p0 = p0.mBottomBgPicUrls;
             i = p0.length;
             for (; i2 < i; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(p0[i2], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveGzoneAudienceCustomSkinConfig getParcel(){
       return this.liveGzoneAudienceCustomSkinConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveGzoneAudienceCustomSkinConfig$$Parcelable.write(this.liveGzoneAudienceCustomSkinConfig$$0, p0, p1, new a());
    }
}
