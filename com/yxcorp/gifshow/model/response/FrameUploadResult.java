package com.yxcorp.gifshow.model.response.FrameUploadResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class FrameUploadResult implements Serializable	// class@001f36
{
    public String mEditSessionId;
    public String mErrorMessage;
    public long mMusicRecoDelayMs;
    public int mResult;
    public static final long serialVersionUID = 0x50caaa14c7f09e8;

    public void FrameUploadResult(){
       super();
    }
    public String getEditSessionId(){
       return this.mEditSessionId;
    }
    public String getErrorMessage(){
       return this.mErrorMessage;
    }
    public long getMusicRecoDelayMs(){
       return this.mMusicRecoDelayMs;
    }
    public int getResult(){
       return this.mResult;
    }
    public void setEditSessionId(String p0){
       this.mEditSessionId = p0;
    }
    public void setErrorMessage(String p0){
       this.mErrorMessage = p0;
    }
    public void setMusicRecoDelayMs(long p0){
       this.mMusicRecoDelayMs = p0;
    }
    public void setResult(int p0){
       this.mResult = p0;
    }
}
