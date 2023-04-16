package com.kuaishou.merchant.base.rmc.RMCLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RMCLogBiz extends Enum implements a	// class@00157e
{
    public final String mBiz;
    public static final RMCLogBiz[] $VALUES;
    public static final RMCLogBiz RMC;

    static {
       RMCLogBiz rMCLogBiz = new RMCLogBiz("RMC", 0, "RMC");
       RMCLogBiz.RMC = rMCLogBiz;
       RMCLogBiz[] rMCLogBizArr = new RMCLogBiz[]{rMCLogBiz};
       RMCLogBiz.$VALUES = rMCLogBizArr;
    }
    public void RMCLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static RMCLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RMCLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RMCLogBiz.class, p0);
    }
    public static RMCLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, RMCLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RMCLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
