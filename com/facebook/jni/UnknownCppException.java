package com.facebook.jni.UnknownCppException;
import com.facebook.jni.CppException;
import java.lang.String;

public class UnknownCppException extends CppException	// class@001160
{

    public void UnknownCppException(){
       super("Unknown");
    }
    public void UnknownCppException(String p0){
       super(p0);
    }
}
