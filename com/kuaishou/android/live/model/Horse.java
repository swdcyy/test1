package com.kuaishou.android.live.model.Horse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.Horse;
import java.lang.StringBuilder;

public class Horse implements Serializable	// class@0007e0
{
    public boolean mChosen;
    public long mCost;
    public String mErrorDescription;
    public String mHostAndPort;
    public long mStartRealTime;
    public long mStartTime;
    public boolean mSuccess;
    public String mTag;

    public void Horse(){
       super();
       this.mTag = "";
       this.mErrorDescription = "";
    }
    public void clearState(){
       this.mSuccess = false;
       this.mChosen = false;
       this.mStartTime = 0;
       this.mStartRealTime = 0;
       this.mCost = 0;
       this.mErrorDescription = "";
    }
    public Horse copyHorse(){
       Horse obj = PatchProxy.apply(null, this, Horse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Horse();
       obj.mHostAndPort = this.mHostAndPort;
       obj.mTag = this.mTag;
       obj.mSuccess = this.mSuccess;
       obj.mChosen = this.mChosen;
       obj.mStartTime = this.mStartTime;
       obj.mStartRealTime = this.mStartRealTime;
       obj.mCost = this.mCost;
       obj.mErrorDescription = this.mErrorDescription;
       return obj;
    }
    public Horse toProto(){
       Horse obj = PatchProxy.apply(null, this, Horse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Horse();
       obj.tag = this.mTag;
       obj.hostAndPort = this.mHostAndPort;
       obj.success = this.mSuccess;
       obj.chosen = this.mChosen;
       obj.cost = this.mCost;
       obj.startTime = this.mStartTime;
       obj.errorDescription = this.mErrorDescription;
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Horse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ("Horse{"+"mHostAndPort=\'"+this.mHostAndPort+'''+", mTag=\'"+this.mTag+'''+", mSuccess="+this.mSuccess+", mChosen="+this.mChosen+", mStartTime="+this.mStartTime+", mStartRealTime="+this.mStartRealTime+", mCost="+this.mCost+", mErrorDescription=\'"+this.mErrorDescription+'''+'}').substring(0);
    }
}
