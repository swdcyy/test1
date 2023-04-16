package com.kwai.sdk.eve.internal.datacenter.components.DataWarehouseKt;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import en7.s;
import com.kwai.sdk.eve.internal.datacenter.components.DataWarehouseKt$dataWarehouse$2;
import msd.l;
import nsd.u;
import com.kwai.sdk.eve.internal.datacenter.components.DataWarehouseKt$listenerLock$2;
import com.kwai.sdk.eve.internal.datacenter.components.DataWarehouseKt$logListener$2;
import zn7.a;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import en7.t;
import sm7.n;

public final class DataWarehouseKt	// class@0014be
{
    public static final n[] a;
    public static final s b;
    public static final s c;
    public static final s d;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(DataWarehouseKt.class, "dataWarehouse", "getDataWarehouse\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Lcom/google/common/collect/LinkedListMultimap;", 1)),m0.j(new MutablePropertyReference1Impl(DataWarehouseKt.class, "listenerLock", "getListenerLock\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Ljava/lang/Object;", 1)),m0.j(new MutablePropertyReference1Impl(DataWarehouseKt.class, "logListener", "getLogListener\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Lcom/kwai/sdk/eve/LogOpListener;", 1))};
       DataWarehouseKt.a = onArray;
       DataWarehouseKt.b = new s(0, DataWarehouseKt$dataWarehouse$2.INSTANCE, 1, null);
       DataWarehouseKt.c = new s(0, DataWarehouseKt$listenerLock$2.INSTANCE, 1, null);
       DataWarehouseKt.d = new s(0, DataWarehouseKt$logListener$2.INSTANCE, 1, null);
    }
    public static final LinkedListMultimap a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataWarehouseKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataWarehouseKt.b.c(p0, DataWarehouseKt.a[0]);
    }
    public static final n b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataWarehouseKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataWarehouseKt.d.c(p0, DataWarehouseKt.a[2]);
    }
}
