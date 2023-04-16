package com.kwai.yoda.model.RunTimeState;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class RunTimeState implements Serializable	// class@0012c6
{
    public String mBizId;
    public String mStatusBarPosition;
    public static final long serialVersionUID = 0x7dff9ab91117bb13;

    public void RunTimeState(){
       super();
    }
    public String getBizId(){
       return this.mBizId;
    }
    public String getStatusBarPosition(){
       return this.mStatusBarPosition;
    }
    public void setBizId(String p0){
       this.mBizId = p0;
    }
    public void setStatusBarPosition(String p0){
       this.mStatusBarPosition = p0;
    }
}
