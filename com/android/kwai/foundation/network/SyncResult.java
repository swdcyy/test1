package com.android.kwai.foundation.network.SyncResult;
import java.lang.Object;
import java.lang.Exception;

public class SyncResult	// class@0003d2
{
    public boolean isSuccess;
    public Exception mException;
    public Object mResult;

    public void SyncResult(){
       super();
    }
    public Exception getException(){
       return this.mException;
    }
    public Object getResult(){
       return this.mResult;
    }
    public boolean isSuccess(){
       return this.isSuccess;
    }
    public void setException(Exception p0){
       this.mException = p0;
    }
    public void setResult(Object p0){
       this.mResult = p0;
    }
    public void setSuccess(boolean p0){
       this.isSuccess = p0;
    }
}
