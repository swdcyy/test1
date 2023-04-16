package com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo$$Parcelable$a;
import com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ExcellentCommodityInfo$$Parcelable implements Parcelable, d	// class@0019ea
{
    public ExcellentCommodityInfo excellentCommodityInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ExcellentCommodityInfo$$Parcelable.CREATOR = new ExcellentCommodityInfo$$Parcelable$a();
    }
    public void ExcellentCommodityInfo$$Parcelable(ExcellentCommodityInfo p0){
       super();
       this.excellentCommodityInfo$$0 = p0;
    }
    public static ExcellentCommodityInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ExcellentCommodityInfo uExcellentCo = new ExcellentCommodityInfo();
          p1.f(p1.g(), uExcellentCo);
          uExcellentCo.mModuleType = p0.readString();
          uExcellentCo.mBrandUserId = p0.readString();
          uExcellentCo.mType = p0.readString();
          p1.f(i, uExcellentCo);
          return uExcellentCo;
       }
    }
    public static void write(ExcellentCommodityInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mModuleType);
          p1.writeString(p0.mBrandUserId);
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ExcellentCommodityInfo getParcel(){
       return this.excellentCommodityInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ExcellentCommodityInfo$$Parcelable.write(this.excellentCommodityInfo$$0, p0, p1, new a());
    }
}
