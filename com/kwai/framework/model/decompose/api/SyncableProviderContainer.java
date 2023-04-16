package com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.e;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public abstract class SyncableProviderContainer extends SyncableProvider implements e	// class@000bb0
{
    public final Map dataMap;

    public void SyncableProviderContainer(){
       super();
       this.dataMap = new HashMap();
    }
    public final Map getDataMap$framework_model_release(){
       return this.dataMap;
    }
    public Object getPartData(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SyncableProviderContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return this.dataMap.get(p0);
    }
    public final void setPartData(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SyncableProviderContainer.class, "2")) {
          return;
       }
       a.p(p0, "key");
       this.dataMap.put(p0, p1);
       return;
    }
}
