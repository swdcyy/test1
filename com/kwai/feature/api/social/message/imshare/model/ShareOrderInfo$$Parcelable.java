package com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo$$Parcelable$a;
import com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ShareOrderInfo$$Parcelable implements Parcelable, d	// class@001166
{
    public ShareOrderInfo shareOrderInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareOrderInfo$$Parcelable.CREATOR = new ShareOrderInfo$$Parcelable$a();
    }
    public void ShareOrderInfo$$Parcelable(ShareOrderInfo p0){
       super();
       this.shareOrderInfo$$0 = p0;
    }
    public static ShareOrderInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ShareOrderInfo shareOrderIn = new ShareOrderInfo();
          p1.f(p1.g(), shareOrderIn);
          shareOrderIn.mPriority = p0.readInt();
          shareOrderIn.mLastShareTime = p0.readLong();
          shareOrderIn.mUpdateTime = p0.readLong();
          shareOrderIn.mShareCount = p0.readInt();
          p1.f(i, shareOrderIn);
          return shareOrderIn;
       }
    }
    public static void write(ShareOrderInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPriority);
          p1.writeLong(p0.mLastShareTime);
          p1.writeLong(p0.mUpdateTime);
          p1.writeInt(p0.mShareCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareOrderInfo getParcel(){
       return this.shareOrderInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareOrderInfo$$Parcelable.write(this.shareOrderInfo$$0, p0, p1, new a());
    }
}
