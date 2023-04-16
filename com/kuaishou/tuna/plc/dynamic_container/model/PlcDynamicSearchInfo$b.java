package com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo;
import java.util.ArrayList;
import java.util.List;

public final class PlcDynamicSearchInfo$b implements Parcelable$Creator	// class@000fed
{

    public void PlcDynamicSearchInfo$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicSearchInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new PlcDynamicSearchInfo(p0.readString(), p0.createStringArrayList(), p0.readString());
    }
    public final Object[] newArray(int p0){
       PlcDynamicSearchInfo[] plcDynamicSe = new PlcDynamicSearchInfo[p0];
       return plcDynamicSe;
    }
}
