package com.kwai.roampanel.model.RoamCityResponse$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.roampanel.model.RoamCityResponse;

public class RoamCityResponse$a implements Parcelable$Creator	// class@0013d2
{

    public void RoamCityResponse$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       RoamCityResponse roamCityResp = PatchProxy.applyOneRefs(p0, this, RoamCityResponse$a.class, "1");
       if (roamCityResp != PatchProxyResult.class) {
       }else {
          roamCityResp = new RoamCityResponse(p0);
       }
       return roamCityResp;
    }
    public Object[] newArray(int p0){
       RoamCityResponse[] roamCityResp = new RoamCityResponse[p0];
       return roamCityResp;
    }
}
