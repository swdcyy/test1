package com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$SecondNeoInfo$$Parcelable implements Parcelable, d	// class@000a14
{
    public PhotoAdvertisement$SecondNeoInfo secondNeoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$SecondNeoInfo$$Parcelable.CREATOR = new PhotoAdvertisement$SecondNeoInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$SecondNeoInfo$$Parcelable(PhotoAdvertisement$SecondNeoInfo p0){
       super();
       this.secondNeoInfo$$0 = p0;
    }
    public static PhotoAdvertisement$SecondNeoInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$SecondNeoInfo secondNeoInf = new PhotoAdvertisement$SecondNeoInfo();
          p1.f(p1.g(), secondNeoInf);
          secondNeoInf.mExtraNeoValue = p0.readInt();
          secondNeoInf.mDialogTitle = p0.readString();
          secondNeoInf.mDialogActionBar = p0.readString();
          secondNeoInf.mWebWidgetToast = p0.readString();
          secondNeoInf.mOrderToast = p0.readString();
          secondNeoInf.mBottomRightText = p0.readString();
          secondNeoInf.mActionType = p0.readInt();
          p1.f(i, secondNeoInf);
          return secondNeoInf;
       }
    }
    public static void write(PhotoAdvertisement$SecondNeoInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mExtraNeoValue);
          p1.writeString(p0.mDialogTitle);
          p1.writeString(p0.mDialogActionBar);
          p1.writeString(p0.mWebWidgetToast);
          p1.writeString(p0.mOrderToast);
          p1.writeString(p0.mBottomRightText);
          p1.writeInt(p0.mActionType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$SecondNeoInfo getParcel(){
       return this.secondNeoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$SecondNeoInfo$$Parcelable.write(this.secondNeoInfo$$0, p0, p1, new a());
    }
}
