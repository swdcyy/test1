package com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;

public final class MalformedJsonException extends IOException	// class@0005bb
{
    public static final long serialVersionUID = 0x1;

    public void MalformedJsonException(String p0){
       super(p0);
    }
    public void MalformedJsonException(String p0,Throwable p1){
       super(p0);
       this.initCause(p1);
    }
    public void MalformedJsonException(Throwable p0){
       super();
       this.initCause(p0);
    }
}
