package com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;

public class HttpRequestInfo	// class@0009af
{
    public int mHttpCode;
    public String mMessage;
    public NetworkUtils$NetErrorCode mNetErrorCode;
    public String mResponseBody;
    public long mTimeCost;
    public String mTokenID;
    public boolean mUseExternalEndPoints;

    public void HttpRequestInfo(){
       super();
    }
    public int getHttpCode(){
       return this.mHttpCode;
    }
    public String getMessage(){
       return this.mMessage;
    }
    public NetworkUtils$NetErrorCode getNetErrorCode(){
       return this.mNetErrorCode;
    }
    public String getResponseBody(){
       return this.mResponseBody;
    }
    public long getTimeCost(){
       return this.mTimeCost;
    }
    public String getTokenID(){
       return this.mTokenID;
    }
    public boolean getUseExternalEndPoints(){
       return this.mUseExternalEndPoints;
    }
    public void setHttpCode(int p0){
       this.mHttpCode = p0;
    }
    public void setMessage(String p0){
       this.mMessage = p0;
    }
    public void setNetErrorCode(NetworkUtils$NetErrorCode p0){
       this.mNetErrorCode = p0;
    }
    public void setResponseBody(String p0){
       this.mResponseBody = p0;
    }
    public void setTimeCost(long p0){
       this.mTimeCost = p0;
    }
    public void setTokenID(String p0){
       this.mTokenID = p0;
    }
    public void setUseExternalEndPoints(boolean p0){
       this.mUseExternalEndPoints = p0;
    }
}
