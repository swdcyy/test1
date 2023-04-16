package com.kwai.feature.post.api.flywheel.logger.FlyWheeFailedLoggerParams;
import com.kwai.feature.post.api.flywheel.logger.BaseFlyWheeLoggerParams;
import java.lang.String;

public class FlyWheeFailedLoggerParams extends BaseFlyWheeLoggerParams	// class@0013ec
{
    public boolean mExecuteSuccess;
    public String mFailedReason;

    public void FlyWheeFailedLoggerParams(){
       super();
    }
    public boolean isShowSuccess(){
       return false;
    }
    public FlyWheeFailedLoggerParams setFailedReason(boolean p0,String p1){
       if (p1 != null) {
       }else {
          p1 = "";
       }
       this.mFailedReason = p1;
       this.mExecuteSuccess = p0;
       return this;
    }
}
