package com.kuaishou.tuna.plc.dynamic_container.exception.PlcDynamicException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class PlcDynamicException extends Exception	// class@000fdf
{

    public void PlcDynamicException(String p0){
       super(p0);
    }
    public void PlcDynamicException(String p0,Throwable p1){
       super(p0, p1);
    }
}
