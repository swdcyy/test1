package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;

public final class PlcDynamicTitleIconInfo$b implements Parcelable$Creator	// class@001023
{

    public void PlcDynamicTitleIconInfo$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicTitleIconInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new PlcDynamicTitleIconInfo(p0.readString(), p0.readString(), p0.readInt());
    }
    public final Object[] newArray(int p0){
       PlcDynamicTitleIconInfo[] plcDynamicTi = new PlcDynamicTitleIconInfo[p0];
       return plcDynamicTi;
    }
}
