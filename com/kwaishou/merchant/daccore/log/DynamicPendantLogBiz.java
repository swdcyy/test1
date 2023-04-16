package com.kwaishou.merchant.daccore.log.DynamicPendantLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DynamicPendantLogBiz extends Enum implements a	// class@001321
{
    public final String mBiz;
    public static final DynamicPendantLogBiz[] $VALUES;
    public static final DynamicPendantLogBiz DYNAMIC_PENDANT;

    static {
       DynamicPendantLogBiz uDynamicPend = new DynamicPendantLogBiz("DYNAMIC_PENDANT", 0, "MerchantDynamicPendant");
       DynamicPendantLogBiz.DYNAMIC_PENDANT = uDynamicPend;
       DynamicPendantLogBiz[] uDynamicPend1 = new DynamicPendantLogBiz[]{uDynamicPend};
       DynamicPendantLogBiz.$VALUES = uDynamicPend1;
    }
    public void DynamicPendantLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static DynamicPendantLogBiz valueOf(String p0){
       return Enum.valueOf(DynamicPendantLogBiz.class, p0);
    }
    public static DynamicPendantLogBiz[] values(){
       return DynamicPendantLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
