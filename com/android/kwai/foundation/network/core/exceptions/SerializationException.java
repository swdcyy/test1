package com.android.kwai.foundation.network.core.exceptions.SerializationException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class SerializationException extends RuntimeException	// class@000eec
{

    public void SerializationException(){
       super();
    }
    public void SerializationException(String p0){
       super(p0);
    }
    public void SerializationException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void SerializationException(String p0,Throwable p1,boolean p2,boolean p3){
       super(p0, p1, p2, p3);
    }
    public void SerializationException(Throwable p0){
       super(p0);
    }
}
