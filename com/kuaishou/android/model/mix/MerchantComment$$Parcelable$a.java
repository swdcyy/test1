package com.kuaishou.android.model.mix.MerchantComment$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.MerchantComment$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.MerchantComment;

public class MerchantComment$$Parcelable$a implements Parcelable$Creator	// class@000d1a
{

    public void MerchantComment$$Parcelable$a(){
       super();
    }
    public MerchantComment$$Parcelable a(Parcel p0){
       return new MerchantComment$$Parcelable(MerchantComment$$Parcelable.read(p0, new a()));
    }
    public MerchantComment$$Parcelable[] b(int p0){
       MerchantComment$$Parcelable[] $ParcelableA = new MerchantComment$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
