package com.kuaishou.merchant.interpretation.log.InterpretationLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InterpretationLogBiz extends Enum implements a	// class@001843
{
    public final String mBiz;
    public static final InterpretationLogBiz[] $VALUES;
    public static final InterpretationLogBiz INTERPRETATION;

    static {
       InterpretationLogBiz interpretati = new InterpretationLogBiz("INTERPRETATION", 0, "MerchantInterpretation");
       InterpretationLogBiz.INTERPRETATION = interpretati;
       InterpretationLogBiz[] interpretati1 = new InterpretationLogBiz[]{interpretati};
       InterpretationLogBiz.$VALUES = interpretati1;
    }
    public void InterpretationLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static InterpretationLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InterpretationLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InterpretationLogBiz.class, p0);
    }
    public static InterpretationLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, InterpretationLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InterpretationLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
