package com.kuaishou.mmu.common.Result$ResultCode$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.mmu.common.Result$ResultCode;

public final class Result$ResultCode$b implements Internal$EnumVerifier	// class@000a0a
{
    public static final Internal$EnumVerifier a;

    static {
       Result$ResultCode$b.a = new Result$ResultCode$b();
    }
    public void Result$ResultCode$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Result$ResultCode.forNumber(p0) != null)? true: false;
       return b;
    }
}
