package com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;
import java.lang.String;

public class YodaException extends Exception	// class@001186
{
    public String mMessage;
    public int mResult;
    public static final long serialVersionUID = 0x97286c325a9132c7;

    public void YodaException(int p0,String p1){
       super(p1);
       this.mResult = p0;
       this.mMessage = p1;
    }
    public String getMessage(){
       return this.mMessage;
    }
    public int getResult(){
       return this.mResult;
    }
}
