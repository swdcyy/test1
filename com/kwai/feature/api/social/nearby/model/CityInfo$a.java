package com.kwai.feature.api.social.nearby.model.CityInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.nearby.model.CityInfo;

public class CityInfo$a implements Parcelable$Creator	// class@00119a
{

    public void CityInfo$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       CityInfo uCityInfo = PatchProxy.applyOneRefs(p0, this, CityInfo$a.class, "1");
       if (uCityInfo != PatchProxyResult.class) {
       }else {
          uCityInfo = new CityInfo(p0);
       }
       return uCityInfo;
    }
    public Object[] newArray(int p0){
       CityInfo[] uCityInfoArr = new CityInfo[p0];
       return uCityInfoArr;
    }
}
