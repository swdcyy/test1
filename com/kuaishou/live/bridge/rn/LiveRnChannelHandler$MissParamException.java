package com.kuaishou.live.bridge.rn.LiveRnChannelHandler$MissParamException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class LiveRnChannelHandler$MissParamException extends Exception	// class@000e2f
{
    public final String paramName;

    public void LiveRnChannelHandler$MissParamException(String p0){
       a.p(p0, "paramName");
       super("param "+p0+" is required");
       this.paramName = p0;
    }
    public final String getParamName(){
       return this.paramName;
    }
}
