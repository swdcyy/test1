package com.yxcorp.gifshow.tube.TubeEpisodeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.tube.TubeContentTag;

public class TubeEpisodeInfo$$Parcelable implements Parcelable, d	// class@001e12
{
    public TubeEpisodeInfo tubeEpisodeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeEpisodeInfo$$Parcelable.CREATOR = new TubeEpisodeInfo$$Parcelable$a();
    }
    public void TubeEpisodeInfo$$Parcelable(TubeEpisodeInfo p0){
       super();
       this.tubeEpisodeInfo$$0 = p0;
    }
    public static TubeEpisodeInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TubeEpisodeInfo tubeEpisodeI = new TubeEpisodeInfo();
          p1.f(p1.g(), tubeEpisodeI);
          tubeEpisodeI.mEpisodeNumber = p0.readLong();
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          boolean b = false;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          tubeEpisodeI.mOverrideCoverUrls = uCDNUrlArray1;
          tubeEpisodeI.lastSeenTime = p0.readLong();
          tubeEpisodeI.mEpisodeTag = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          tubeEpisodeI.mCoverUrls = uCDNUrlArray;
          tubeEpisodeI.mEpisodeName = p0.readString();
          tubeEpisodeI.mKoi = p0.readString();
          tubeEpisodeI.mEpisodeActionUrl = p0.readString();
          tubeEpisodeI.mPhotoId = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          tubeEpisodeI.isShowed = b;
          tubeEpisodeI.status = p0.readInt();
          p1.f(i, tubeEpisodeI);
          return tubeEpisodeI;
       }
    }
    public static void write(TubeEpisodeInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mEpisodeNumber);
          TubeEpisodeInfo mOverrideCov = p0.mOverrideCoverUrls;
          int i2 = 0;
          if (mOverrideCov == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mOverrideCov.length);
             mOverrideCov = p0.mOverrideCoverUrls;
             int len = mOverrideCov.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mOverrideCov[i3], p1, p2, p3);
             }
          }
          p1.writeLong(p0.lastSeenTime);
          p1.writeSerializable(p0.mEpisodeTag);
          mOverrideCov = p0.mCoverUrls;
          if (mOverrideCov == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mOverrideCov.length);
             mOverrideCov = p0.mCoverUrls;
             i1 = mOverrideCov.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mOverrideCov[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mEpisodeName);
          p1.writeString(p0.mKoi);
          p1.writeString(p0.mEpisodeActionUrl);
          p1.writeString(p0.mPhotoId);
          p1.writeInt(p0.isShowed);
          p1.writeInt(p0.status);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeEpisodeInfo getParcel(){
       return this.tubeEpisodeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeEpisodeInfo$$Parcelable.write(this.tubeEpisodeInfo$$0, p0, p1, new a());
    }
}
