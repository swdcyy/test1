package com.yxcorp.gifshow.upload.UploadCoverResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class UploadCoverResult implements Serializable	// class@001e56
{
    public String mCoverKey;
    public String mErrorMessage;
    public int mResult;

    public void UploadCoverResult(){
       super();
    }
    public String getCoverKey(){
       return this.mCoverKey;
    }
    public String getErrorMessage(){
       return this.mErrorMessage;
    }
    public int getResult(){
       return this.mResult;
    }
}
