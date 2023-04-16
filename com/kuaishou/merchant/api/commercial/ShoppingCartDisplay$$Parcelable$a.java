package com.kuaishou.merchant.api.commercial.ShoppingCartDisplay$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.commercial.ShoppingCartDisplay$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.commercial.ShoppingCartDisplay;

public class ShoppingCartDisplay$$Parcelable$a implements Parcelable$Creator	// class@0014f6
{

    public void ShoppingCartDisplay$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShoppingCartDisplay$$Parcelable(ShoppingCartDisplay$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShoppingCartDisplay$$Parcelable[] $ParcelableA = new ShoppingCartDisplay$$Parcelable[p0];
       return $ParcelableA;
    }
}
