package com.kuaishou.live.core.show.robotV2.message.LiveRobotMMUFunctionSlot;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import java.lang.StringBuilder;

public class LiveRobotMMUFunctionSlot implements Serializable	// class@000fcc
{
    public int mFunctionId;
    public String mFunctionParam;
    public String mTargetId;
    public String mTargetName;
    public static final long serialVersionUID = 0x57d3fcd20cef6572;

    public void LiveRobotMMUFunctionSlot(){
       super();
    }
    public static LiveRobotMMUFunctionSlot fromJson(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRobotMMUFunctionSlot.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson().h(p0, LiveRobotMMUFunctionSlot.class);
    }
    public int getFunctionId(){
       return this.mFunctionId;
    }
    public String getFunctionParam(){
       return this.mFunctionParam;
    }
    public String getTargetId(){
       return this.mTargetId;
    }
    public String getTargetName(){
       return this.mTargetName;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRobotMMUFunctionSlot.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRobotMMUSlot2{mFunctionId="+this.mFunctionId+", mTargetName=\'"+this.mTargetName+'''+", mTargetId=\'"+this.mTargetId+'''+'}';
    }
}
