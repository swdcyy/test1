package com.kwai.feature.api.tuna.BusinessJsBridgeResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class BusinessJsBridgeResult implements Serializable	// class@0011ca
{
    public final Serializable mData;
    public final String mErrorMsg;
    public final int mResult;
    public static final long serialVersionUID = 0x96dd8b8190eeb4da;

    public void BusinessJsBridgeResult(int p0){
       super(p0, "", "");
    }
    public void BusinessJsBridgeResult(int p0,String p1){
       super(p0, p1, "");
    }
    public void BusinessJsBridgeResult(int p0,String p1,Serializable p2){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mData = p2;
    }
    public Serializable getData(){
       return this.mData;
    }
    public String getErrorMsg(){
       return this.mErrorMsg;
    }
    public int getResult(){
       return this.mResult;
    }
}
