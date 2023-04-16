package com.kwai.feature.api.social.moment.model.MomentVideoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo$$Parcelable$a;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.io.Serializable;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo$ExtParams;

public class MomentVideoInfo$$Parcelable implements Parcelable, d	// class@001192
{
    public MomentVideoInfo momentVideoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MomentVideoInfo$$Parcelable.CREATOR = new MomentVideoInfo$$Parcelable$a();
    }
    public void MomentVideoInfo$$Parcelable(MomentVideoInfo p0){
       super();
       this.momentVideoInfo$$0 = p0;
    }
    public static MomentVideoInfo read(Parcel p0,a p1){
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
          MomentVideoInfo momentVideoI = new MomentVideoInfo();
          p1.f(p1.g(), momentVideoI);
          momentVideoI.mHeight = p0.readInt();
          momentVideoI.mDuration = p0.readLong();
          momentVideoI.mWidth = p0.readInt();
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
          momentVideoI.mCoverUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          momentVideoI.mVideoUrls = uCDNUrlArray1;
          momentVideoI.mExtParams = p0.readSerializable();
          momentVideoI.mLocalPath = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          momentVideoI.mAdjusted = b;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          momentVideoI.mFFCoverThumbnailUrls = uCDNUrlArray;
          p1.f(i, momentVideoI);
          return momentVideoI;
       }
    }
    public static void write(MomentVideoInfo p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHeight);
          p1.writeLong(p0.mDuration);
          p1.writeInt(p0.mWidth);
          MomentVideoInfo mCoverUrls = p0.mCoverUrls;
          int i2 = 0;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.length);
             mCoverUrls = p0.mCoverUrls;
             len = mCoverUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mCoverUrls[i3], p1, p2, p3);
             }
          }
          mCoverUrls = p0.mVideoUrls;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.length);
             mCoverUrls = p0.mVideoUrls;
             len = mCoverUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mCoverUrls[i3], p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mExtParams);
          p1.writeString(p0.mLocalPath);
          p1.writeInt(p0.mAdjusted);
          mCoverUrls = p0.mFFCoverThumbnailUrls;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.length);
             p0 = p0.mFFCoverThumbnailUrls;
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
    public MomentVideoInfo getParcel(){
       return this.momentVideoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MomentVideoInfo$$Parcelable.write(this.momentVideoInfo$$0, p0, p1, new a());
    }
}
