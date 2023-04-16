package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$$Parcelable;

public class PhotoAdvertisement$PopARInfo$$Parcelable implements Parcelable, d	// class@0009c8
{
    public PhotoAdvertisement$PopARInfo popARInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PopARInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PopARInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PopARInfo$$Parcelable(PhotoAdvertisement$PopARInfo p0){
       super();
       this.popARInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PopARInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$PopARInfo popARInfo = new PhotoAdvertisement$PopARInfo();
          p1.f(p1.g(), popARInfo);
          popARInfo.mPopARRuleInfo = PhotoAdvertisement$PopARRuleInfo$$Parcelable.read(p0, p1);
          popARInfo.mPopARWinInfo = PhotoAdvertisement$PopARWinInfo$$Parcelable.read(p0, p1);
          popARInfo.mLoadingImageUrl = p0.readString();
          popARInfo.magicFaceId = p0.readString();
          p1.f(i, popARInfo);
          return popARInfo;
       }
    }
    public static void write(PhotoAdvertisement$PopARInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$PopARRuleInfo$$Parcelable.write(p0.mPopARRuleInfo, p1, p2, p3);
          PhotoAdvertisement$PopARWinInfo$$Parcelable.write(p0.mPopARWinInfo, p1, p2, p3);
          p1.writeString(p0.mLoadingImageUrl);
          p1.writeString(p0.magicFaceId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PopARInfo getParcel(){
       return this.popARInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PopARInfo$$Parcelable.write(this.popARInfo$$0, p0, p1, new a());
    }
}
