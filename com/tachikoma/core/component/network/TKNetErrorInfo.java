package com.tachikoma.core.component.network.TKNetErrorInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class TKNetErrorInfo implements Serializable	// class@000d82
{
    public TKNetErrorInfo$SubErrorInfo apiErrorInfo;
    public int code;
    public String message;

    public void TKNetErrorInfo(int p0,String p1){
       super();
       this.code = p0;
       this.message = p1;
    }
}
