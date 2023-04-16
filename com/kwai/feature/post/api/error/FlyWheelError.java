package com.kwai.feature.post.api.error.FlyWheelError;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class FlyWheelError extends Exception	// class@001318
{
    public final String mFailedReason;

    public void FlyWheelError(String p0,String p1){
       super(p0);
       this.mFailedReason = p1;
    }
    public void FlyWheelError(String p0,Throwable p1,String p2){
       super(p0, p1);
       this.mFailedReason = p2;
    }
}
