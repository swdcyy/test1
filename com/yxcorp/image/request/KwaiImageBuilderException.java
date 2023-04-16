package com.yxcorp.image.request.KwaiImageBuilderException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class KwaiImageBuilderException extends RuntimeException	// class@001a22
{

    public void KwaiImageBuilderException(String p0){
       super("Invalid kwai request builder: "+p0);
    }
    public void KwaiImageBuilderException(String p0,Throwable p1){
       super("Invalid kwai request builder: "+p0, p1);
    }
}
