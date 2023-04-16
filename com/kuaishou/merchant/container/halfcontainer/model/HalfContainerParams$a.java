package com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;

public class HalfContainerParams$a implements Parcelable$Creator	// class@001631
{

    public void HalfContainerParams$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       HalfContainerParams halfContaine = PatchProxy.applyOneRefs(p0, this, HalfContainerParams$a.class, "1");
       if (halfContaine != PatchProxyResult.class) {
       }else {
          halfContaine = new HalfContainerParams(p0);
       }
       return halfContaine;
    }
    public Object[] newArray(int p0){
       HalfContainerParams[] halfContaine = new HalfContainerParams[p0];
       return halfContaine;
    }
}
