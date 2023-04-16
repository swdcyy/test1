package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$SearchBigvLive$$Parcelable implements Parcelable, d	// class@000a04
{
    public PhotoAdvertisement$SearchBigvLive searchBigvLive$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$SearchBigvLive$$Parcelable.CREATOR = new PhotoAdvertisement$SearchBigvLive$$Parcelable$a();
    }
    public void PhotoAdvertisement$SearchBigvLive$$Parcelable(PhotoAdvertisement$SearchBigvLive p0){
       super();
       this.searchBigvLive$$0 = p0;
    }
    public static PhotoAdvertisement$SearchBigvLive read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$SearchBigvLive searchBigvLi = new PhotoAdvertisement$SearchBigvLive();
          p1.f(p1.g(), searchBigvLi);
          searchBigvLi.mTitleIconText = p0.readString();
          searchBigvLi.mTitle = p0.readString();
          searchBigvLi.mTitleIconLinkUrl = p0.readString();
          searchBigvLi.mTitleIconUrl = p0.readString();
          p1.f(i, searchBigvLi);
          return searchBigvLi;
       }
    }
    public static void write(PhotoAdvertisement$SearchBigvLive p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTitleIconText);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mTitleIconLinkUrl);
          p1.writeString(p0.mTitleIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$SearchBigvLive getParcel(){
       return this.searchBigvLive$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$SearchBigvLive$$Parcelable.write(this.searchBigvLive$$0, p0, p1, new a());
    }
}
