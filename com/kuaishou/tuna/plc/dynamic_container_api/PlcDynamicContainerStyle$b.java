package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;

public final class PlcDynamicContainerStyle$b implements Parcelable$Creator	// class@00101d
{

    public void PlcDynamicContainerStyle$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerStyle$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = (p0.readInt())? 1: 0;
       float f = p0.readFloat();
       float f1 = p0.readFloat();
       String str = p0.readString();
       String str1 = p0.readString();
       int i1 = p0.readInt();
       int i2 = (p0.readInt())? 1: 0;
       int i3 = (p0.readInt())? 1: 0;
       PlcDynamicContainerStyle plcDynamicCo = new PlcDynamicContainerStyle(i, f, f1, str, str1, i1, i2, i3, p0.readString());
       return obj;
    }
    public final Object[] newArray(int p0){
       PlcDynamicContainerStyle[] plcDynamicCo = new PlcDynamicContainerStyle[p0];
       return plcDynamicCo;
    }
}
