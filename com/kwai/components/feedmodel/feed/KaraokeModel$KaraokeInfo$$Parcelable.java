package com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo$$Parcelable$a;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable;

public class KaraokeModel$KaraokeInfo$$Parcelable implements Parcelable, d	// class@000c4c
{
    public KaraokeModel$KaraokeInfo karaokeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KaraokeModel$KaraokeInfo$$Parcelable.CREATOR = new KaraokeModel$KaraokeInfo$$Parcelable$a();
    }
    public void KaraokeModel$KaraokeInfo$$Parcelable(KaraokeModel$KaraokeInfo p0){
       super();
       this.karaokeInfo$$0 = p0;
    }
    public static KaraokeModel$KaraokeInfo read(Parcel p0,a p1){
       ImageMeta$CDNInfo[] uCDNInfoArra;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          KaraokeModel$KaraokeInfo karaokeInfo = new KaraokeModel$KaraokeInfo();
          p1.f(p1.g(), karaokeInfo);
          karaokeInfo.mLrc = p0.readString();
          karaokeInfo.mRealDuration = p0.readLong();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNInfoArra = null;
          }else {
             ImageMeta$CDNInfo[] uCDNInfoArra1 = new ImageMeta$CDNInfo[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNInfoArra1[i2] = ImageMeta$CDNInfo$$Parcelable.read(p0, p1);
             }
             uCDNInfoArra = uCDNInfoArra1;
          }
          karaokeInfo.mCdnList = uCDNInfoArra;
          karaokeInfo.mMusic = p0.readString();
          p1.f(i, karaokeInfo);
          return karaokeInfo;
       }
    }
    public static void write(KaraokeModel$KaraokeInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLrc);
          p1.writeLong(p0.mRealDuration);
          KaraokeModel$KaraokeInfo mCdnList = p0.mCdnList;
          if (mCdnList == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCdnList.length);
             mCdnList = p0.mCdnList;
             i1 = mCdnList.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                ImageMeta$CDNInfo$$Parcelable.write(mCdnList[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mMusic);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KaraokeModel$KaraokeInfo getParcel(){
       return this.karaokeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KaraokeModel$KaraokeInfo$$Parcelable.write(this.karaokeInfo$$0, p0, p1, new a());
    }
}
