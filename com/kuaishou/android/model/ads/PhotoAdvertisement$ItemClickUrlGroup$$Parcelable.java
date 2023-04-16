package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable;

public class PhotoAdvertisement$ItemClickUrlGroup$$Parcelable implements Parcelable, d	// class@00097f
{
    public PhotoAdvertisement$ItemClickUrlGroup itemClickUrlGroup$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ItemClickUrlGroup$$Parcelable.CREATOR = new PhotoAdvertisement$ItemClickUrlGroup$$Parcelable$a();
    }
    public void PhotoAdvertisement$ItemClickUrlGroup$$Parcelable(PhotoAdvertisement$ItemClickUrlGroup p0){
       super();
       this.itemClickUrlGroup$$0 = p0;
    }
    public static PhotoAdvertisement$ItemClickUrlGroup read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$ItemClickUrlGroup itemClickUrl = new PhotoAdvertisement$ItemClickUrlGroup();
          p1.f(p1.g(), itemClickUrl);
          itemClickUrl.mAvatarOnlyClickUrls = PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, p1);
          itemClickUrl.mLeftSlideClickUrls = PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, p1);
          itemClickUrl.mActionbarClickUrl = PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, p1);
          itemClickUrl.mUserInfoClickUrls = PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, p1);
          p1.f(i, itemClickUrl);
          return itemClickUrl;
       }
    }
    public static void write(PhotoAdvertisement$ItemClickUrlGroup p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$ItemClickUrl$$Parcelable.write(p0.mAvatarOnlyClickUrls, p1, p2, p3);
          PhotoAdvertisement$ItemClickUrl$$Parcelable.write(p0.mLeftSlideClickUrls, p1, p2, p3);
          PhotoAdvertisement$ItemClickUrl$$Parcelable.write(p0.mActionbarClickUrl, p1, p2, p3);
          PhotoAdvertisement$ItemClickUrl$$Parcelable.write(p0.mUserInfoClickUrls, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ItemClickUrlGroup getParcel(){
       return this.itemClickUrlGroup$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ItemClickUrlGroup$$Parcelable.write(this.itemClickUrlGroup$$0, p0, p1, new a());
    }
}
