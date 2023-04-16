package com.kuaishou.animation.AnimatorException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class AnimatorException extends Exception	// class@000f8b
{
    public String mErrorReason;
    public int mErrorType;

    public void AnimatorException(int p0,String p1){
       super(p1);
       this.mErrorType = p0;
       this.mErrorReason = p1;
    }
    public void AnimatorException(Throwable p0){
       super(p0);
       this.mErrorType = 0;
       this.mErrorReason = "unknown";
    }
}
