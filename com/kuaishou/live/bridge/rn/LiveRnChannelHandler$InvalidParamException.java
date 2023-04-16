package com.kuaishou.live.bridge.rn.LiveRnChannelHandler$InvalidParamException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class LiveRnChannelHandler$InvalidParamException extends Exception	// class@000e2e
{
    public final String paramName;

    public void LiveRnChannelHandler$InvalidParamException(String p0){
       a.p(p0, "paramName");
       super("param "+p0+" is invalid");
       this.paramName = p0;
    }
    public final String getParamName(){
       return this.paramName;
    }
}
