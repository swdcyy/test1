package com.kwai.feature.post.api.flywheel.logger.FlyWheelSuccessLoggerParams;
import com.kwai.feature.post.api.flywheel.logger.BaseFlyWheeLoggerParams;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class FlyWheelSuccessLoggerParams extends BaseFlyWheeLoggerParams	// class@0013ed
{
    public long mCostTime;

    public void FlyWheelSuccessLoggerParams(){
       super();
    }
    public BaseFlyWheeLoggerParams bindFlyWheelConfig(GrowthGuideItemConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FlyWheelSuccessLoggerParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long startExecute = (p0 != null)? p0.getStartExecuteTimeStamp(): 0;
       this.mCostTime = a1.k() - startExecute;
       return super.bindFlyWheelConfig(p0);
    }
    public boolean isShowSuccess(){
       return true;
    }
}
