package com.kuaishou.android.model.merchant.MerchantEnhanceDisplay$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;

public class MerchantEnhanceDisplay$$Parcelable$a implements Parcelable$Creator	// class@000ba8
{

    public void MerchantEnhanceDisplay$$Parcelable$a(){
       super();
    }
    public MerchantEnhanceDisplay$$Parcelable a(Parcel p0){
       return new MerchantEnhanceDisplay$$Parcelable(MerchantEnhanceDisplay$$Parcelable.read(p0, new a()));
    }
    public MerchantEnhanceDisplay$$Parcelable[] b(int p0){
       MerchantEnhanceDisplay$$Parcelable[] $ParcelableA = new MerchantEnhanceDisplay$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
