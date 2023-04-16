package com.kuaishou.android.model.mix.LiveMerchantFeedData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.LiveMerchantFeedData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;

public class LiveMerchantFeedData$$Parcelable$a implements Parcelable$Creator	// class@000cfd
{

    public void LiveMerchantFeedData$$Parcelable$a(){
       super();
    }
    public LiveMerchantFeedData$$Parcelable a(Parcel p0){
       return new LiveMerchantFeedData$$Parcelable(LiveMerchantFeedData$$Parcelable.read(p0, new a()));
    }
    public LiveMerchantFeedData$$Parcelable[] b(int p0){
       LiveMerchantFeedData$$Parcelable[] $ParcelableA = new LiveMerchantFeedData$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
