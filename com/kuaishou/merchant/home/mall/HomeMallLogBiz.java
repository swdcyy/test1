package com.kuaishou.merchant.home.mall.HomeMallLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HomeMallLogBiz extends Enum implements a	// class@0016d8
{
    public final String biz;
    public static final HomeMallLogBiz[] $VALUES;
    public static final HomeMallLogBiz Mall;

    static {
       HomeMallLogBiz homeMallLogB = new HomeMallLogBiz("Mall", 0, "mall");
       HomeMallLogBiz.Mall = homeMallLogB;
       HomeMallLogBiz[] homeMallLogB1 = new HomeMallLogBiz[]{homeMallLogB};
       HomeMallLogBiz.$VALUES = homeMallLogB1;
    }
    public void HomeMallLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.biz = p2;
    }
    public static HomeMallLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeMallLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HomeMallLogBiz.class, p0);
    }
    public static HomeMallLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, HomeMallLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomeMallLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.biz;
    }
}
