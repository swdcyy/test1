package com.android.kwai.foundation.network.IRpcService$Builder$OpServiceClz;
import com.android.kwai.foundation.network.IRpcService$Builder;
import java.lang.Object;
import java.lang.Class;
import com.android.kwai.foundation.network.IRpcService$Builder$OpFinal;

public class IRpcService$Builder$OpServiceClz	// class@0003cc
{
    public IRpcService$Builder mBuilder;

    public void IRpcService$Builder$OpServiceClz(IRpcService$Builder p0){
       super();
       this.mBuilder = p0;
    }
    public IRpcService$Builder$OpFinal rpcService(Class p0){
       IRpcService$Builder$OpServiceClz tmBuilder = this.mBuilder;
       tmBuilder.mRpcClz = p0;
       return new IRpcService$Builder$OpFinal(tmBuilder);
    }
}
