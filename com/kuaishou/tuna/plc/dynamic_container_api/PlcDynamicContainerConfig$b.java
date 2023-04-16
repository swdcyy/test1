package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;

public final class PlcDynamicContainerConfig$b implements Parcelable$Creator	// class@00101a
{

    public void PlcDynamicContainerConfig$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerConfig$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = p0.readInt();
       String str = p0.readString();
       String str1 = p0.readString();
       int i1 = p0.readInt();
       String str2 = p0.readString();
       String str3 = p0.readString();
       int i2 = 0;
       PlcDynamicTitleConfig plcDynamicTi = (p0.readInt())? PlcDynamicTitleConfig.CREATOR.createFromParcel(p0): i2;
       PlcDynamicContainerStyle plcDynamicCo = (p0.readInt())? PlcDynamicContainerStyle.CREATOR.createFromParcel(p0): i2;
       String str4 = p0.readString();
       int i3 = (p0.readInt())? 1: 0;
       PlcDynamicContainerConfig plcDynamicCo1 = new PlcDynamicContainerConfig(i, str, str1, i1, str2, str3, plcDynamicTi, plcDynamicCo, str4, i3);
       return obj;
    }
    public final Object[] newArray(int p0){
       PlcDynamicContainerConfig[] plcDynamicCo = new PlcDynamicContainerConfig[p0];
       return plcDynamicCo;
    }
}
