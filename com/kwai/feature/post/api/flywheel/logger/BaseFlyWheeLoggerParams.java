package com.kwai.feature.post.api.flywheel.logger.BaseFlyWheeLoggerParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import o36.g;
import ok.x;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public abstract class BaseFlyWheeLoggerParams implements Serializable	// class@0013eb
{
    public String mConfigId;
    public boolean mIsShowSuccess;
    public int mTaskType;

    public void BaseFlyWheeLoggerParams(){
       super();
       this.mIsShowSuccess = this.isShowSuccess();
    }
    public BaseFlyWheeLoggerParams bindFlyWheelConfig(GrowthGuideItemConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFlyWheeLoggerParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mTaskType = p0.getTaskType();
          this.mConfigId = p0.getConfigId();
       }else {
          this.mTaskType = 0;
          this.mConfigId = "";
       }
       return this;
    }
    public String getJsonString(){
       Object obj = PatchProxy.apply(null, this, BaseFlyWheeLoggerParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
    public String getKey(){
       return "POST_CLIENT_FLYWHEEL_TASK";
    }
    public abstract boolean isShowSuccess();
    public void logEvent(){
       if (PatchProxy.applyVoid(null, this, BaseFlyWheeLoggerParams.class, "2")) {
          return;
       }
       String key = this.getKey();
       String jsonString = this.getJsonString();
       if (g.c.get().booleanValue()) {
          PostUtils.x(key, jsonString);
       }
       Object[] objArray = new Object[0];
       p3.D().w("FlyWheel", "logEvent, key: "+key+" params: "+jsonString, objArray);
       return;
    }
}
