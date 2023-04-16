package com.kuaishou.merchant.api.commercial.MerchantCardMore$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.commercial.MerchantCardMore$$Parcelable$a;
import com.kuaishou.merchant.api.commercial.MerchantCardMore;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MerchantCardMore$$Parcelable implements Parcelable, d	// class@0014f4
{
    public MerchantCardMore merchantCardMore$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MerchantCardMore$$Parcelable.CREATOR = new MerchantCardMore$$Parcelable$a();
    }
    public void MerchantCardMore$$Parcelable(MerchantCardMore p0){
       super();
       this.merchantCardMore$$0 = p0;
    }
    public static MerchantCardMore read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MerchantCardMore merchantCard = new MerchantCardMore();
          p1.f(p1.g(), merchantCard);
          merchantCard.mTopLabel = p0.readString();
          p1.f(i, merchantCard);
          return merchantCard;
       }
    }
    public static void write(MerchantCardMore p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTopLabel);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MerchantCardMore getParcel(){
       return this.merchantCardMore$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MerchantCardMore$$Parcelable.write(this.merchantCardMore$$0, p0, p1, new a());
    }
}
