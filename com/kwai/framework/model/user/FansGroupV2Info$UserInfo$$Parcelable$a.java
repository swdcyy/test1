package com.kwai.framework.model.user.FansGroupV2Info$UserInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo;

public class FansGroupV2Info$UserInfo$$Parcelable$a implements Parcelable$Creator	// class@0016f1
{

    public void FansGroupV2Info$UserInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FansGroupV2Info$UserInfo$$Parcelable(FansGroupV2Info$UserInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FansGroupV2Info$UserInfo$$Parcelable[] userInfo$$Pa = new FansGroupV2Info$UserInfo$$Parcelable[p0];
       return userInfo$$Pa;
    }
}
