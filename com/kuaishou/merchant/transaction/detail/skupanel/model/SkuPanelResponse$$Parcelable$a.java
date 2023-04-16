package com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse;

public class SkuPanelResponse$$Parcelable$a implements Parcelable$Creator	// class@000784
{

    public void SkuPanelResponse$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SkuPanelResponse$$Parcelable(SkuPanelResponse$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SkuPanelResponse$$Parcelable[] $ParcelableA = new SkuPanelResponse$$Parcelable[p0];
       return $ParcelableA;
    }
}
