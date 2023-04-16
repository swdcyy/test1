package com.kuaishou.krn.bridges.kds.KdsErrorResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class KdsErrorResult implements Serializable	// class@00081b
{
    public final String errorMsg;
    public final int result;

    public void KdsErrorResult(int p0,String p1){
       super();
       this.result = p0;
       this.errorMsg = p1;
    }
    public final String getErrorMsg(){
       return this.errorMsg;
    }
    public final int getResult(){
       return this.result;
    }
}
