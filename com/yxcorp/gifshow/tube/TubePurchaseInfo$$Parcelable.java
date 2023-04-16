package com.yxcorp.gifshow.tube.TubePurchaseInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubePurchaseInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubePurchaseInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubePurchaseInfo$$Parcelable implements Parcelable, d	// class@001e1d
{
    public TubePurchaseInfo tubePurchaseInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubePurchaseInfo$$Parcelable.CREATOR = new TubePurchaseInfo$$Parcelable$a();
    }
    public void TubePurchaseInfo$$Parcelable(TubePurchaseInfo p0){
       super();
       this.tubePurchaseInfo$$0 = p0;
    }
    public static TubePurchaseInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TubePurchaseInfo tubePurchase = new TubePurchaseInfo();
          p1.f(p1.g(), tubePurchase);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          tubePurchase.allPurchased = b;
          tubePurchase.lastPurchaseTime = p0.readLong();
          tubePurchase.lastPurchaseEpisodeName = p0.readString();
          p1.f(i, tubePurchase);
          return tubePurchase;
       }
    }
    public static void write(TubePurchaseInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.allPurchased);
          p1.writeLong(p0.lastPurchaseTime);
          p1.writeString(p0.lastPurchaseEpisodeName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubePurchaseInfo getParcel(){
       return this.tubePurchaseInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubePurchaseInfo$$Parcelable.write(this.tubePurchaseInfo$$0, p0, p1, new a());
    }
}
