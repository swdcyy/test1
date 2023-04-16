package com.kwai.framework.model.user.FansGroupV2Info$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.FansGroupV2Info$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.FansGroupV2Info;

public class FansGroupV2Info$$Parcelable$a implements Parcelable$Creator	// class@0016ef
{

    public void FansGroupV2Info$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FansGroupV2Info$$Parcelable(FansGroupV2Info$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FansGroupV2Info$$Parcelable[] $ParcelableA = new FansGroupV2Info$$Parcelable[p0];
       return $ParcelableA;
    }
}
