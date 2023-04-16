package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$$Parcelable;

public class PhotoAdvertisement$ItemClickUrl$$Parcelable implements Parcelable, d	// class@00097b
{
    public PhotoAdvertisement$ItemClickUrl itemClickUrl$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ItemClickUrl$$Parcelable.CREATOR = new PhotoAdvertisement$ItemClickUrl$$Parcelable$a();
    }
    public void PhotoAdvertisement$ItemClickUrl$$Parcelable(PhotoAdvertisement$ItemClickUrl p0){
       super();
       this.itemClickUrl$$0 = p0;
    }
    public static PhotoAdvertisement$ItemClickUrl read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$ItemClickUrl itemClickUrl = new PhotoAdvertisement$ItemClickUrl();
          p1.f(p1.g(), itemClickUrl);
          itemClickUrl.mUrl = p0.readString();
          itemClickUrl.mJumpLiveInfo = PhotoAdvertisement$JumpLiveInfo$$Parcelable.read(p0, p1);
          itemClickUrl.mNormalActionInfo = PhotoAdvertisement$ItemClickActionInfo$$Parcelable.read(p0, p1);
          itemClickUrl.mAppLink = p0.readString();
          p1.f(i, itemClickUrl);
          return itemClickUrl;
       }
    }
    public static void write(PhotoAdvertisement$ItemClickUrl p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          PhotoAdvertisement$JumpLiveInfo$$Parcelable.write(p0.mJumpLiveInfo, p1, p2, p3);
          PhotoAdvertisement$ItemClickActionInfo$$Parcelable.write(p0.mNormalActionInfo, p1, p2, p3);
          p1.writeString(p0.mAppLink);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ItemClickUrl getParcel(){
       return this.itemClickUrl$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ItemClickUrl$$Parcelable.write(this.itemClickUrl$$0, p0, p1, new a());
    }
}
