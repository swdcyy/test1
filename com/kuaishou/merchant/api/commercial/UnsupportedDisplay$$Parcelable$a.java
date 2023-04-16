package com.kuaishou.merchant.api.commercial.UnsupportedDisplay$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.commercial.UnsupportedDisplay$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.commercial.UnsupportedDisplay;

public class UnsupportedDisplay$$Parcelable$a implements Parcelable$Creator	// class@0014f9
{

    public void UnsupportedDisplay$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UnsupportedDisplay$$Parcelable(UnsupportedDisplay$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UnsupportedDisplay$$Parcelable[] $ParcelableA = new UnsupportedDisplay$$Parcelable[p0];
       return $ParcelableA;
    }
}
