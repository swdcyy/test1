package com.kuaishou.merchant.api.core.LiveMerchantBaseContext$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$$Parcelable$a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$b;

public class LiveMerchantBaseContext$$Parcelable implements Parcelable, d	// class@0014fd
{
    public LiveMerchantBaseContext liveMerchantBaseContext$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveMerchantBaseContext$$Parcelable.CREATOR = new LiveMerchantBaseContext$$Parcelable$a();
    }
    public void LiveMerchantBaseContext$$Parcelable(LiveMerchantBaseContext p0){
       super();
       this.liveMerchantBaseContext$$0 = p0;
    }
    public static LiveMerchantBaseContext read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveMerchantBaseContext liveMerchant = new LiveMerchantBaseContext$b().c(p0);
          p1.f(i, liveMerchant);
          return liveMerchant;
       }
    }
    public static void write(LiveMerchantBaseContext p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          new LiveMerchantBaseContext$b().d(p0, p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveMerchantBaseContext getParcel(){
       return this.liveMerchantBaseContext$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveMerchantBaseContext$$Parcelable.write(this.liveMerchantBaseContext$$0, p0, p1, new a());
    }
}
