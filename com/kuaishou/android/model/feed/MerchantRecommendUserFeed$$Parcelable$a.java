package com.kuaishou.android.model.feed.MerchantRecommendUserFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.MerchantRecommendUserFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.MerchantRecommendUserFeed;

public class MerchantRecommendUserFeed$$Parcelable$a implements Parcelable$Creator	// class@000b1d
{

    public void MerchantRecommendUserFeed$$Parcelable$a(){
       super();
    }
    public MerchantRecommendUserFeed$$Parcelable a(Parcel p0){
       return new MerchantRecommendUserFeed$$Parcelable(MerchantRecommendUserFeed$$Parcelable.read(p0, new a()));
    }
    public MerchantRecommendUserFeed$$Parcelable[] b(int p0){
       MerchantRecommendUserFeed$$Parcelable[] $ParcelableA = new MerchantRecommendUserFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}