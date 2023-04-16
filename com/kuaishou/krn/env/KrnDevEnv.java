package com.kuaishou.krn.env.KrnDevEnv;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnDevEnv extends Enum	// class@000867
{
    public static final KrnDevEnv[] $VALUES;
    public static final KrnDevEnv online;
    public static final KrnDevEnv pre;
    public static final KrnDevEnv staging;
    public static final KrnDevEnv test;

    static {
       KrnDevEnv krnDevEnv;
       KrnDevEnv[] krnDevEnvArr = new KrnDevEnv[]{krnDevEnv,krnDevEnv,krnDevEnv,krnDevEnv};
       krnDevEnv = new KrnDevEnv("online", 0);
       KrnDevEnv.online = krnDevEnv;
       krnDevEnv = new KrnDevEnv("pre", 1);
       KrnDevEnv.pre = krnDevEnv;
       krnDevEnv = new KrnDevEnv("test", 2);
       KrnDevEnv.test = krnDevEnv;
       krnDevEnv = new KrnDevEnv("staging", 3);
       KrnDevEnv.staging = krnDevEnv;
       KrnDevEnv.$VALUES = krnDevEnvArr;
    }
    public void KrnDevEnv(String p0,int p1){
       super(p0, p1);
    }
    public static KrnDevEnv valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnDevEnv.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KrnDevEnv.class, p0);
    }
    public static KrnDevEnv[] values(){
       Object obj = PatchProxy.apply(null, null, KrnDevEnv.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnDevEnv.$VALUES.clone();
    }
}
