package com.android.kwai.foundation.network.IRpcService$Builder$OpHost;
import com.android.kwai.foundation.network.IRpcService$Builder;
import java.lang.Object;
import java.lang.String;
import com.android.kwai.foundation.network.IRpcService$Builder$OpServiceClz;

public class IRpcService$Builder$OpHost	// class@0003cb
{
    public IRpcService$Builder mBuilder;

    public void IRpcService$Builder$OpHost(IRpcService$Builder p0){
       super();
       this.mBuilder = p0;
    }
    public IRpcService$Builder$OpServiceClz host(String p0){
       IRpcService$Builder$OpHost tmBuilder = this.mBuilder;
       tmBuilder.mHost = p0;
       return new IRpcService$Builder$OpServiceClz(tmBuilder);
    }
}
