package com.yxcorp.login.http.response.PreUidRefreshResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class PreUidRefreshResponse implements Serializable	// class@001ad2
{
    public String mPUid;
    public long mRefreshTimeInterval;
    public int mResult;
    public static final long serialVersionUID = 0x6cad28934045f4ad;

    public void PreUidRefreshResponse(){
       super();
    }
    public String getPUid(){
       return this.mPUid;
    }
    public long getRefreshTimeInterval(){
       return this.mRefreshTimeInterval;
    }
    public int getResult(){
       return this.mResult;
    }
    public void setPUid(String p0){
       this.mPUid = p0;
    }
    public void setRefreshTimeInterval(long p0){
       this.mRefreshTimeInterval = p0;
    }
    public void setResult(int p0){
       this.mResult = p0;
    }
}
