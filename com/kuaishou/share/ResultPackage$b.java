package com.kuaishou.share.ResultPackage$b;
import iw4.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.share.ResultPackage;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.share.ResultPackage$a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.share.ElementPackage;
import com.kuaishou.share.SDKConfigPackage;

public final class ResultPackage$b extends GeneratedMessageLite$Builder implements a	// class@000f22
{

    public void ResultPackage$b(){
       super(ResultPackage.DEFAULT_INSTANCE);
    }
    public void ResultPackage$b(ResultPackage$a p0){
       super(ResultPackage.DEFAULT_INSTANCE);
    }
    public String getAppInfo(){
       return this.instance.getAppInfo();
    }
    public ByteString getAppInfoBytes(){
       return this.instance.getAppInfoBytes();
    }
    public String getClientTimeStamp(){
       return this.instance.getClientTimeStamp();
    }
    public ByteString getClientTimeStampBytes(){
       return this.instance.getClientTimeStampBytes();
    }
    public String getSessionId(){
       return this.instance.getSessionId();
    }
    public ByteString getSessionIdBytes(){
       return this.instance.getSessionIdBytes();
    }
    public ElementPackage getShareElementPackage(){
       return this.instance.getShareElementPackage();
    }
    public SDKConfigPackage getShareSDKConfigPackage(){
       return this.instance.getShareSDKConfigPackage();
    }
    public String getUserId(){
       return this.instance.getUserId();
    }
    public ByteString getUserIdBytes(){
       return this.instance.getUserIdBytes();
    }
    public boolean hasShareElementPackage(){
       return this.instance.hasShareElementPackage();
    }
    public boolean hasShareSDKConfigPackage(){
       return this.instance.hasShareSDKConfigPackage();
    }
}
