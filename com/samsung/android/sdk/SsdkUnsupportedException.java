package com.samsung.android.sdk.SsdkUnsupportedException;
import java.lang.Exception;
import java.lang.String;

public class SsdkUnsupportedException extends Exception	// class@000b74
{
    public int mErrorType;

    public void SsdkUnsupportedException(String p0,int p1){
       super(p0);
       this.mErrorType = 0;
       this.mErrorType = p1;
    }
    public int getType(){
       return this.mErrorType;
    }
}
