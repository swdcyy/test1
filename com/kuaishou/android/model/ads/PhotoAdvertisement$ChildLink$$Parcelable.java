package com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ChildLink$$Parcelable implements Parcelable, d	// class@0008d5
{
    public PhotoAdvertisement$ChildLink childLink$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ChildLink$$Parcelable.CREATOR = new PhotoAdvertisement$ChildLink$$Parcelable$a();
    }
    public void PhotoAdvertisement$ChildLink$$Parcelable(PhotoAdvertisement$ChildLink p0){
       super();
       this.childLink$$0 = p0;
    }
    public static PhotoAdvertisement$ChildLink read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$ChildLink uChildLink = new PhotoAdvertisement$ChildLink();
          p1.f(p1.g(), uChildLink);
          uChildLink.mImgUrl = p0.readString();
          uChildLink.mSubtitle = p0.readString();
          uChildLink.mTitle = p0.readString();
          uChildLink.mDeepLinkUrl = p0.readString();
          uChildLink.mLinkUrl = p0.readString();
          p1.f(i, uChildLink);
          return uChildLink;
       }
    }
    public static void write(PhotoAdvertisement$ChildLink p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mImgUrl);
          p1.writeString(p0.mSubtitle);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mDeepLinkUrl);
          p1.writeString(p0.mLinkUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ChildLink getParcel(){
       return this.childLink$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ChildLink$$Parcelable.write(this.childLink$$0, p0, p1, new a());
    }
}