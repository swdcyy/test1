package com.yxcorp.gifshow.log.model.response.UploadLogResponse;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.log.policy.LogPolicy;

public class UploadLogResponse implements Serializable	// class@001b1e
{
    public LogPolicy mLogPolicy;
    public long mNextRequestPeriodInMs;
    public static final long serialVersionUID = 0xeba2fe38799e81d1;

    public void UploadLogResponse(){
       super();
       this.mLogPolicy = LogPolicy.NORMAL;
    }
}
