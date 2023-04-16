package com.kwai.feature.api.live.base.model.LivePrivateAutoCheckParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.StringBuilder;

public class LivePrivateAutoCheckParams implements Serializable	// class@000f8e
{
    public String mBizMap;
    public int mBizType;
    public static final long serialVersionUID = 0xe08e0e39a90e5a9c;

    public void LivePrivateAutoCheckParams(){
       super();
    }
    public static LivePrivateAutoCheckParams createForGroupChat(String p0){
       LivePrivateAutoCheckParams obj = PatchProxy.applyOneRefs(p0, null, LivePrivateAutoCheckParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePrivateAutoCheckParams();
       obj.mBizType = 1;
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("groupId", p0);
       obj.mBizMap = jsonObject.toString();
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePrivateAutoCheckParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePrivateAutoCheckParams{mBizType="+this.mBizType+", mBizMap=\'"+this.mBizMap+'''+'}';
    }
}
