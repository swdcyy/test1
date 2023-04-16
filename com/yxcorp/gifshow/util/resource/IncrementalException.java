package com.yxcorp.gifshow.util.resource.IncrementalException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class IncrementalException extends RuntimeException	// class@000ccb
{

    public void IncrementalException(String p0){
       super(p0);
    }
    public void IncrementalException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void IncrementalException(Throwable p0){
       super(p0);
    }
}
