package com.kuaishou.android.model.mix.CoronaLive$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoronaLive$$Parcelable$a;
import com.kuaishou.android.model.mix.CoronaLive;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class CoronaLive$$Parcelable implements Parcelable, d	// class@000c14
{
    public CoronaLive coronaLive$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaLive$$Parcelable.CREATOR = new CoronaLive$$Parcelable$a();
    }
    public void CoronaLive$$Parcelable(CoronaLive p0){
       super();
       this.coronaLive$$0 = p0;
    }
    public static CoronaLive read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaLive uCoronaLive = new CoronaLive();
          p1.f(p1.g(), uCoronaLive);
          uCoronaLive.mColor = p0.readString();
          uCoronaLive.mMainTitle = p0.readString();
          uCoronaLive.mOnlineCount = p0.readString();
          uCoronaLive.mRecommendWord = p0.readString();
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
          uCoronaLive.mLandscapeCover = uCDNUrlArray;
          uCoronaLive.mSubTitle = p0.readString();
          p1.f(i, uCoronaLive);
          return uCoronaLive;
       }
    }
    public static void write(CoronaLive p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mColor);
          p1.writeString(p0.mMainTitle);
          p1.writeString(p0.mOnlineCount);
          p1.writeString(p0.mRecommendWord);
          CoronaLive mLandscapeCo = p0.mLandscapeCover;
          if (mLandscapeCo == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLandscapeCo.length);
             mLandscapeCo = p0.mLandscapeCover;
             i1 = mLandscapeCo.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mLandscapeCo[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaLive getParcel(){
       return this.coronaLive$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaLive$$Parcelable.write(this.coronaLive$$0, p0, p1, new a());
    }
}
