package com.kuaishou.krn.log.model.KrnPageFunnelError;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class KrnPageFunnelError implements Serializable	// class@0008e1
{
    public String msg;
    public String type;

    public void KrnPageFunnelError(){
       super();
    }
    public final String getMsg(){
       return this.msg;
    }
    public final String getType(){
       return this.type;
    }
    public final void setMsg(String p0){
       this.msg = p0;
    }
    public final void setType(String p0){
       this.type = p0;
    }
}
