package com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import android.net.Uri;
import org.parceler.a;

public class MerchantSlidePlayModel$$Parcelable implements Parcelable, d	// class@000eb8
{
    public MerchantSlidePlayModel merchantSlidePlayModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MerchantSlidePlayModel$$Parcelable.CREATOR = new MerchantSlidePlayModel$$Parcelable$a();
    }
    public void MerchantSlidePlayModel$$Parcelable(MerchantSlidePlayModel p0){
       super();
       this.merchantSlidePlayModel$$0 = p0;
    }
    public static MerchantSlidePlayModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MerchantSlidePlayModel merchantSlid = new MerchantSlidePlayModel();
          p1.f(p1.g(), merchantSlid);
          merchantSlid.mDataUrl = p0.readParcelable(MerchantSlidePlayModel$$Parcelable.class.getClassLoader());
          a.d(MerchantSlidePlayModel.class, merchantSlid, "mActionType", p0.readString());
          p1.f(i, merchantSlid);
          return merchantSlid;
       }
    }
    public static void write(MerchantSlidePlayModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeParcelable(p0.mDataUrl, p2);
          p1.writeString(a.b(String.class, MerchantSlidePlayModel.class, p0, "mActionType"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MerchantSlidePlayModel getParcel(){
       return this.merchantSlidePlayModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MerchantSlidePlayModel$$Parcelable.write(this.merchantSlidePlayModel$$0, p0, p1, new a());
    }
}
