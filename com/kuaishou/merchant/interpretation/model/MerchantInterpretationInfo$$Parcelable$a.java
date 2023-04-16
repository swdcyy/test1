package com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;

public class MerchantInterpretationInfo$$Parcelable$a implements Parcelable$Creator	// class@001844
{

    public void MerchantInterpretationInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MerchantInterpretationInfo$$Parcelable(MerchantInterpretationInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MerchantInterpretationInfo$$Parcelable[] $ParcelableA = new MerchantInterpretationInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
