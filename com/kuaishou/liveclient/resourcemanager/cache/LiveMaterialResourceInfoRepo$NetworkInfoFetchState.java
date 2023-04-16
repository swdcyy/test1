package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$NetworkInfoFetchState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMaterialResourceInfoRepo$NetworkInfoFetchState extends Enum	// class@001061
{
    public static final LiveMaterialResourceInfoRepo$NetworkInfoFetchState[] $VALUES;
    public static final LiveMaterialResourceInfoRepo$NetworkInfoFetchState Complete;
    public static final LiveMaterialResourceInfoRepo$NetworkInfoFetchState Failed;
    public static final LiveMaterialResourceInfoRepo$NetworkInfoFetchState Fetching;
    public static final LiveMaterialResourceInfoRepo$NetworkInfoFetchState Init;

    static {
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState networkInfoF1;
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState[] networkInfoF = new LiveMaterialResourceInfoRepo$NetworkInfoFetchState[]{networkInfoF1,networkInfoF1,networkInfoF1,networkInfoF1};
       networkInfoF1 = new LiveMaterialResourceInfoRepo$NetworkInfoFetchState("Init", 0);
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Init = networkInfoF1;
       networkInfoF1 = new LiveMaterialResourceInfoRepo$NetworkInfoFetchState("Fetching", 1);
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Fetching = networkInfoF1;
       networkInfoF1 = new LiveMaterialResourceInfoRepo$NetworkInfoFetchState("Complete", 2);
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Complete = networkInfoF1;
       networkInfoF1 = new LiveMaterialResourceInfoRepo$NetworkInfoFetchState("Failed", 3);
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Failed = networkInfoF1;
       LiveMaterialResourceInfoRepo$NetworkInfoFetchState.$VALUES = networkInfoF;
    }
    public void LiveMaterialResourceInfoRepo$NetworkInfoFetchState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMaterialResourceInfoRepo$NetworkInfoFetchState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMaterialResourceInfoRepo$NetworkInfoFetchState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMaterialResourceInfoRepo$NetworkInfoFetchState.class, p0);
    }
    public static LiveMaterialResourceInfoRepo$NetworkInfoFetchState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMaterialResourceInfoRepo$NetworkInfoFetchState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMaterialResourceInfoRepo$NetworkInfoFetchState.$VALUES.clone();
    }
}
