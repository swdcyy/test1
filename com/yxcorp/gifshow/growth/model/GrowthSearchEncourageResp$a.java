package com.yxcorp.gifshow.growth.model.GrowthSearchEncourageResp$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.model.GrowthSearchEncourageResp;

public class GrowthSearchEncourageResp$a implements Parcelable$Creator	// class@001435
{

    public void GrowthSearchEncourageResp$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       GrowthSearchEncourageResp growthSearch = PatchProxy.applyOneRefs(p0, this, GrowthSearchEncourageResp$a.class, "1");
       if (growthSearch != PatchProxyResult.class) {
       }else {
          growthSearch = new GrowthSearchEncourageResp(p0);
       }
       return growthSearch;
    }
    public Object[] newArray(int p0){
       GrowthSearchEncourageResp[] growthSearch = new GrowthSearchEncourageResp[p0];
       return growthSearch;
    }
}
