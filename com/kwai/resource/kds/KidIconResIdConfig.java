package com.kwai.resource.kds.KidIconResIdConfig;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import java.lang.Integer;
import java.lang.Exception;
import ul7.a;

public final class KidIconResIdConfig extends Enum	// class@0013cf
{
    public final Map configCache;
    public static final KidIconResIdConfig[] $VALUES;
    public static final KidIconResIdConfig INSTANCE;

    static {
       KidIconResIdConfig kidIconResId = new KidIconResIdConfig("INSTANCE", 0);
       KidIconResIdConfig.INSTANCE = kidIconResId;
       KidIconResIdConfig[] kidIconResId1 = new KidIconResIdConfig[]{kidIconResId};
       KidIconResIdConfig.$VALUES = kidIconResId1;
    }
    public void KidIconResIdConfig(String p0,int p1){
       super(p0, p1);
       this.configCache = new ConcurrentHashMap(500);
    }
    public static KidIconResIdConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KidIconResIdConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KidIconResIdConfig.class, p0);
    }
    public static KidIconResIdConfig[] values(){
       Object obj = PatchProxy.apply(null, null, KidIconResIdConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KidIconResIdConfig.$VALUES.clone();
    }
    public int findIconResId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KidIconResIdConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          if (p0 == null || (!("").equals(p0.trim()) && (this.configCache.containsKey(p0) && this.configCache.get(p0) != null))) {
             return this.configCache.get(p0).intValue();
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
    label_0044 :
       return 0;
    }
    public void registerIconResource(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KidIconResIdConfig.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.a(this.configCache);
       }
       return;
    }
}
