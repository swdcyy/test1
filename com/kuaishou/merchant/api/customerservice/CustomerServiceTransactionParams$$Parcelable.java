package com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams$$Parcelable$a;
import com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CustomerServiceTransactionParams$$Parcelable implements Parcelable, d	// class@00155e
{
    public CustomerServiceTransactionParams customerServiceTransactionParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CustomerServiceTransactionParams$$Parcelable.CREATOR = new CustomerServiceTransactionParams$$Parcelable$a();
    }
    public void CustomerServiceTransactionParams$$Parcelable(CustomerServiceTransactionParams p0){
       super();
       this.customerServiceTransactionParams$$0 = p0;
    }
    public static CustomerServiceTransactionParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CustomerServiceTransactionParams uCustomerSer = new CustomerServiceTransactionParams();
          p1.f(p1.g(), uCustomerSer);
          uCustomerSer.mSubbizId = p0.readString();
          uCustomerSer.mLogParams = p0.readString();
          uCustomerSer.mCategory = p0.readInt();
          uCustomerSer.mTargetId = p0.readString();
          p1.f(i, uCustomerSer);
          return uCustomerSer;
       }
    }
    public static void write(CustomerServiceTransactionParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSubbizId);
          p1.writeString(p0.mLogParams);
          p1.writeInt(p0.mCategory);
          p1.writeString(p0.mTargetId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CustomerServiceTransactionParams getParcel(){
       return this.customerServiceTransactionParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CustomerServiceTransactionParams$$Parcelable.write(this.customerServiceTransactionParams$$0, p0, p1, new a());
    }
}
