package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import java.util.ArrayList;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import java.util.List;

public final class PlcDynamicTitleConfig$b implements Parcelable$Creator	// class@001020
{

    public void PlcDynamicTitleConfig$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicTitleConfig$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = (p0.readInt())? 1: 0;
       int i1 = p0.readInt();
       String str = p0.readString();
       String str1 = p0.readString();
       String str2 = p0.readString();
       int i2 = p0.readInt();
       ArrayList uArrayList = new ArrayList(i2);
       for (; i2; i2 = i2 - 1) {
          uArrayList.add(PlcDynamicTitleIconInfo.CREATOR.createFromParcel(p0));
       }
       i2 = p0.readInt();
       ArrayList uArrayList1 = new ArrayList(i2);
       for (; i2; i2 = i2 - 1) {
          uArrayList1.add(PlcDynamicTitleIconInfo.CREATOR.createFromParcel(p0));
       }
       int i3 = (p0.readInt())? 1: 0;
       PlcDynamicTitleConfig plcDynamicTi = new PlcDynamicTitleConfig(i, i1, str, str1, str2, uArrayList, uArrayList1, i3, p0.createStringArrayList());
       return obj;
    }
    public final Object[] newArray(int p0){
       PlcDynamicTitleConfig[] plcDynamicTi = new PlcDynamicTitleConfig[p0];
       return plcDynamicTi;
    }
}
