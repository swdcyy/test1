package com.kuaishou.merchant.home2.dynamic.container.model.HalfRnContainerParams$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.container.model.HalfRnContainerParams;

public class HalfRnContainerParams$a implements Parcelable$Creator	// class@001742
{

    public void HalfRnContainerParams$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       HalfRnContainerParams halfRnContai = PatchProxy.applyOneRefs(p0, this, HalfRnContainerParams$a.class, "1");
       if (halfRnContai != PatchProxyResult.class) {
       }else {
          halfRnContai = new HalfRnContainerParams(p0);
       }
       return halfRnContai;
    }
    public Object[] newArray(int p0){
       HalfRnContainerParams[] halfRnContai = new HalfRnContainerParams[p0];
       return halfRnContai;
    }
}
