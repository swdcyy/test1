package com.kwai.sdk.eve.internal.datacenter.components.DataWarehouseKt$dataWarehouse$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import en7.t;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class DataWarehouseKt$dataWarehouse$2 extends Lambda implements l	// class@0014bb
{
    public static final DataWarehouseKt$dataWarehouse$2 INSTANCE;

    static {
       DataWarehouseKt$dataWarehouse$2.INSTANCE = new DataWarehouseKt$dataWarehouse$2();
    }
    public void DataWarehouseKt$dataWarehouse$2(){
       super(1);
    }
    public final LinkedListMultimap invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DataWarehouseKt$dataWarehouse$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return LinkedListMultimap.create();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
