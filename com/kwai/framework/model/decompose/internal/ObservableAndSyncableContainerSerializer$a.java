package com.kwai.framework.model.decompose.internal.ObservableAndSyncableContainerSerializer$a;
import zk.a;
import java.lang.Object;
import java.lang.Class;
import zk.b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class ObservableAndSyncableContainerSerializer$a implements a	// class@0016a1
{

    public void ObservableAndSyncableContainerSerializer$a(){
       super();
    }
    public boolean shouldSkipClass(Class p0){
       return false;
    }
    public boolean shouldSkipField(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ObservableAndSyncableContainerSerializer$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "f");
       return a.g("dataMap", p0.b());
    }
}
