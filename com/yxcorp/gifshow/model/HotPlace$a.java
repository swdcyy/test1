package com.yxcorp.gifshow.model.HotPlace$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.HotPlace;

public class HotPlace$a implements Parcelable$Creator	// class@001e21
{

    public void HotPlace$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       HotPlace hotPlace = PatchProxy.applyOneRefs(p0, this, HotPlace$a.class, "1");
       if (hotPlace != PatchProxyResult.class) {
       }else {
          hotPlace = new HotPlace(p0);
       }
       return hotPlace;
    }
    public Object[] newArray(int p0){
       HotPlace[] hotPlaceArra = new HotPlace[p0];
       return hotPlaceArra;
    }
}
