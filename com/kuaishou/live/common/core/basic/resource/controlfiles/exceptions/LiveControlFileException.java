package com.kuaishou.live.common.core.basic.resource.controlfiles.exceptions.LiveControlFileException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveControlFileException extends Exception	// class@000ec4
{
    public String bizType;
    public String errorType;

    public void LiveControlFileException(String p0,String p1){
       a.p(p0, "errorType");
       super();
       this.errorType = p0;
       this.bizType = p1;
    }
    public final String getBizType(){
       return this.bizType;
    }
    public final String getErrorType(){
       return this.errorType;
    }
    public final void setBizType(String p0){
       this.bizType = p0;
    }
    public final void setErrorType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveControlFileException.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.errorType = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.errorType+" on bizType "+this.bizType;
    }
}
