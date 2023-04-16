package com.kuaishou.android.model.music.Music$BeatInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.music.Music$BeatInfo$$Parcelable$a;
import com.kuaishou.android.model.music.Music$BeatInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class Music$BeatInfo$$Parcelable implements Parcelable, d	// class@000e52
{
    public Music$BeatInfo beatInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Music$BeatInfo$$Parcelable.CREATOR = new Music$BeatInfo$$Parcelable$a();
    }
    public void Music$BeatInfo$$Parcelable(Music$BeatInfo p0){
       super();
       this.beatInfo$$0 = p0;
    }
    public static Music$BeatInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Music$BeatInfo uBeatInfo = new Music$BeatInfo();
          p1.f(p1.g(), uBeatInfo);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          uBeatInfo.mBeatFileUrls = uCDNUrlArray;
          uBeatInfo.mBeatFileUrl = p0.readString();
          p1.f(i, uBeatInfo);
          return uBeatInfo;
       }
    }
    public static void write(Music$BeatInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          Music$BeatInfo mBeatFileUrl = p0.mBeatFileUrls;
          if (mBeatFileUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBeatFileUrl.length);
             mBeatFileUrl = p0.mBeatFileUrls;
             i1 = mBeatFileUrl.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mBeatFileUrl[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mBeatFileUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Music$BeatInfo getParcel(){
       return this.beatInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Music$BeatInfo$$Parcelable.write(this.beatInfo$$0, p0, p1, new a());
    }
}
