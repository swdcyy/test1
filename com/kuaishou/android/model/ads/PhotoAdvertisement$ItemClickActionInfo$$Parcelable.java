package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ItemClickActionInfo$$Parcelable implements Parcelable, d	// class@000973
{
    public PhotoAdvertisement$ItemClickActionInfo itemClickActionInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ItemClickActionInfo$$Parcelable.CREATOR = new PhotoAdvertisement$ItemClickActionInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$ItemClickActionInfo$$Parcelable(PhotoAdvertisement$ItemClickActionInfo p0){
       super();
       this.itemClickActionInfo$$0 = p0;
    }
    public static PhotoAdvertisement$ItemClickActionInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$ItemClickActionInfo itemClickAct = new PhotoAdvertisement$ItemClickActionInfo();
          p1.f(p1.g(), itemClickAct);
          itemClickAct.mConversionAreaType = p0.readInt();
          itemClickAct.mWebViewType = p0.readInt();
          itemClickAct.mType = p0.readInt();
          itemClickAct.mSubConversionType = p0.readInt();
          p1.f(i, itemClickAct);
          return itemClickAct;
       }
    }
    public static void write(PhotoAdvertisement$ItemClickActionInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mConversionAreaType);
          p1.writeInt(p0.mWebViewType);
          p1.writeInt(p0.mType);
          p1.writeInt(p0.mSubConversionType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ItemClickActionInfo getParcel(){
       return this.itemClickActionInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ItemClickActionInfo$$Parcelable.write(this.itemClickActionInfo$$0, p0, p1, new a());
    }
}
