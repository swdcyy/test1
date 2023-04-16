package com.kwai.sdk.eve.internal.datacenter.components.DataWarehouseKt$listenerLock$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import en7.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class DataWarehouseKt$listenerLock$2 extends Lambda implements l	// class@0014bc
{
    public static final DataWarehouseKt$listenerLock$2 INSTANCE;

    static {
       DataWarehouseKt$listenerLock$2.INSTANCE = new DataWarehouseKt$listenerLock$2();
    }
    public void DataWarehouseKt$listenerLock$2(){
       super(1);
    }
    public final Object invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DataWarehouseKt$listenerLock$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new Object();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
