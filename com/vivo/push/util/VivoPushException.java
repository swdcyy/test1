package com.vivo.push.util.VivoPushException;
import java.lang.Exception;
import java.lang.String;

public class VivoPushException extends Exception	// class@0010ae
{
    public int mReasonCode;

    public void VivoPushException(int p0,String p1){
       super(p1);
       this.mReasonCode = p0;
    }
    public void VivoPushException(String p0){
       super(0x2710, p0);
    }
    public int getCode(){
       return this.mReasonCode;
    }
}
