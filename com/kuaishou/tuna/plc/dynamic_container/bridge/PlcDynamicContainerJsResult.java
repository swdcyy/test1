package com.kuaishou.tuna.plc.dynamic_container.bridge.PlcDynamicContainerJsResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class PlcDynamicContainerJsResult implements Serializable	// class@000fd6
{
    public int code;
    public Object data;
    public String message;
    public static final long serialVersionUID = 0x1f9f78e13438ebf7;

    public void PlcDynamicContainerJsResult(int p0,String p1,Object p2){
       super();
       this.code = p0;
       this.message = p1;
       this.data = p2;
    }
    public void setCode(int p0){
       this.code = p0;
    }
    public void setData(Object p0){
       this.data = p0;
    }
    public void setMessage(String p0){
       this.message = p0;
    }
}
