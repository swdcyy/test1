package com.yxcorp.gifshow.exception.ServerException;
import java.lang.Exception;
import java.lang.String;

public class ServerException extends Exception	// class@000e8d
{
    public final int errorCode;
    public final String errorMessage;
    public final int subCode;

    public void ServerException(int p0,int p1,String p2){
       super();
       this.errorCode = p0;
       this.subCode = p1;
       this.errorMessage = p2;
    }
}
