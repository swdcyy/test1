package com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams;

public class CustomerServiceTransactionParams$$Parcelable$a implements Parcelable$Creator	// class@00155d
{

    public void CustomerServiceTransactionParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CustomerServiceTransactionParams$$Parcelable(CustomerServiceTransactionParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CustomerServiceTransactionParams$$Parcelable[] $ParcelableA = new CustomerServiceTransactionParams$$Parcelable[p0];
       return $ParcelableA;
    }
}
