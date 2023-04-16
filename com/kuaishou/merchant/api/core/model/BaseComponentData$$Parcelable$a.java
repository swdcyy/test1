package com.kuaishou.merchant.api.core.model.BaseComponentData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.core.model.BaseComponentData$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.core.model.BaseComponentData;

public class BaseComponentData$$Parcelable$a implements Parcelable$Creator	// class@00150c
{

    public void BaseComponentData$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BaseComponentData$$Parcelable(BaseComponentData$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BaseComponentData$$Parcelable[] $ParcelableA = new BaseComponentData$$Parcelable[p0];
       return $ParcelableA;
    }
}
