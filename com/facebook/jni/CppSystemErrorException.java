package com.facebook.jni.CppSystemErrorException;
import com.facebook.jni.CppException;
import java.lang.String;

public class CppSystemErrorException extends CppException	// class@001158
{
    public int errorCode;

    public void CppSystemErrorException(String p0,int p1){
       super(p0);
       this.errorCode = p1;
    }
    public int getErrorCode(){
       return this.errorCode;
    }
}
