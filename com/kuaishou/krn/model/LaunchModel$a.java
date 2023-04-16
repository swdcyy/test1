package com.kuaishou.krn.model.LaunchModel$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.LaunchModel;

public class LaunchModel$a implements Parcelable$Creator	// class@000901
{

    public void LaunchModel$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       LaunchModel launchModel = PatchProxy.applyOneRefs(p0, this, LaunchModel$a.class, "1");
       if (launchModel != PatchProxyResult.class) {
       }else {
          launchModel = new LaunchModel(p0);
       }
       return launchModel;
    }
    public Object[] newArray(int p0){
       LaunchModel[] launchModelA = new LaunchModel[p0];
       return launchModelA;
    }
}
