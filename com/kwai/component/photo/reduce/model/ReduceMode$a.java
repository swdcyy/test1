package com.kwai.component.photo.reduce.model.ReduceMode$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.photo.reduce.model.ReduceMode;

public class ReduceMode$a implements Parcelable$Creator	// class@000af8
{

    public void ReduceMode$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ReduceMode reduceMode = PatchProxy.applyOneRefs(p0, this, ReduceMode$a.class, "1");
       if (reduceMode != PatchProxyResult.class) {
       }else {
          reduceMode = new ReduceMode(p0);
       }
       return reduceMode;
    }
    public Object[] newArray(int p0){
       ReduceMode[] reduceModeAr = new ReduceMode[p0];
       return reduceModeAr;
    }
}
