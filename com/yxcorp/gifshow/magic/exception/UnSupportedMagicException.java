package com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class UnSupportedMagicException extends IllegalArgumentException	// class@001ba1
{
    public final String mUnSupportReason;

    public void UnSupportedMagicException(String p0){
       super(p0, "");
    }
    public void UnSupportedMagicException(String p0,String p1){
       super(p0);
       this.mUnSupportReason = p1;
    }
}
