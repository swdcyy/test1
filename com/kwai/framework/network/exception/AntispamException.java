package com.kwai.framework.network.exception.AntispamException;
import java.lang.Exception;

public class AntispamException extends Exception	// class@0017c7
{
    public final int resultCode;

    public void AntispamException(int p0){
       super();
       this.resultCode = p0;
    }
    public int getResultCode(){
       return this.resultCode;
    }
}
