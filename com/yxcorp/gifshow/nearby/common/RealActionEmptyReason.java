package com.yxcorp.gifshow.nearby.common.RealActionEmptyReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RealActionEmptyReason extends Enum	// class@0020e1
{
    public static final RealActionEmptyReason[] $VALUES;
    public static final RealActionEmptyReason DETAIL_CLEAR;
    public static final RealActionEmptyReason FEED_EMPTY;
    public static final RealActionEmptyReason FILTER_EMPTY;
    public static final RealActionEmptyReason HOME_CLEAR;
    public static final RealActionEmptyReason LOAD_MORE_EMPTY;
    public static final RealActionEmptyReason UNKNOWN;

    static {
       RealActionEmptyReason realActionEm = new RealActionEmptyReason("UNKNOWN", 0);
       RealActionEmptyReason.UNKNOWN = realActionEm;
       RealActionEmptyReason realActionEm1 = new RealActionEmptyReason("HOME_CLEAR", 1);
       RealActionEmptyReason.HOME_CLEAR = realActionEm1;
       RealActionEmptyReason realActionEm2 = new RealActionEmptyReason("DETAIL_CLEAR", 2);
       RealActionEmptyReason.DETAIL_CLEAR = realActionEm2;
       RealActionEmptyReason realActionEm3 = new RealActionEmptyReason("FEED_EMPTY", 3);
       RealActionEmptyReason.FEED_EMPTY = realActionEm3;
       RealActionEmptyReason realActionEm4 = new RealActionEmptyReason("FILTER_EMPTY", 4);
       RealActionEmptyReason.FILTER_EMPTY = realActionEm4;
       RealActionEmptyReason realActionEm5 = new RealActionEmptyReason("LOAD_MORE_EMPTY", 5);
       RealActionEmptyReason.LOAD_MORE_EMPTY = realActionEm5;
       RealActionEmptyReason[] realActionEm6 = new RealActionEmptyReason[]{realActionEm,realActionEm1,realActionEm2,realActionEm3,realActionEm4,realActionEm5};
       RealActionEmptyReason.$VALUES = realActionEm6;
    }
    public void RealActionEmptyReason(String p0,int p1){
       super(p0, p1);
    }
    public static RealActionEmptyReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RealActionEmptyReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RealActionEmptyReason.class, p0);
    }
    public static RealActionEmptyReason[] values(){
       Object obj = PatchProxy.apply(null, null, RealActionEmptyReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RealActionEmptyReason.$VALUES.clone();
    }
}
