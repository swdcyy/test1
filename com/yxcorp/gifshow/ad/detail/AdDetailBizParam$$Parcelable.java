package com.yxcorp.gifshow.ad.detail.AdDetailBizParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.ad.detail.AdDetailBizParam$$Parcelable$a;
import com.yxcorp.gifshow.ad.detail.AdDetailBizParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class AdDetailBizParam$$Parcelable implements Parcelable, d	// class@001539
{
    public AdDetailBizParam adDetailBizParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AdDetailBizParam$$Parcelable.CREATOR = new AdDetailBizParam$$Parcelable$a();
    }
    public void AdDetailBizParam$$Parcelable(AdDetailBizParam p0){
       super();
       this.adDetailBizParam$$0 = p0;
    }
    public static AdDetailBizParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          AdDetailBizParam uAdDetailBiz = new AdDetailBizParam();
          p1.f(p1.g(), uAdDetailBiz);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uAdDetailBiz.mIsSameMerchantItem = b;
          p1.f(i, uAdDetailBiz);
          return uAdDetailBiz;
       }
    }
    public static void write(AdDetailBizParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsSameMerchantItem);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public AdDetailBizParam getParcel(){
       return this.adDetailBizParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AdDetailBizParam$$Parcelable.write(this.adDetailBizParam$$0, p0, p1, new a());
    }
}
