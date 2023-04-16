package com.kuaishou.android.model.mix.MerchantComment$Card$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.MerchantComment$Card$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.MerchantComment$Card;

public class MerchantComment$Card$$Parcelable$a implements Parcelable$Creator	// class@000d1c
{

    public void MerchantComment$Card$$Parcelable$a(){
       super();
    }
    public MerchantComment$Card$$Parcelable a(Parcel p0){
       return new MerchantComment$Card$$Parcelable(MerchantComment$Card$$Parcelable.read(p0, new a()));
    }
    public MerchantComment$Card$$Parcelable[] b(int p0){
       MerchantComment$Card$$Parcelable[] uCard$$Parce = new MerchantComment$Card$$Parcelable[p0];
       return uCard$$Parce;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
