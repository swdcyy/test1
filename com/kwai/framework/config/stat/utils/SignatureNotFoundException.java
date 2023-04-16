package com.kwai.framework.config.stat.utils.SignatureNotFoundException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class SignatureNotFoundException extends Exception	// class@00150c
{
    public static final long serialVersionUID = 0x29b014e0e31bbb14;

    public void SignatureNotFoundException(String p0){
       super(p0);
    }
    public void SignatureNotFoundException(String p0,Throwable p1){
       super(p0, p1);
    }
}
