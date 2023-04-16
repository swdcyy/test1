package com.tencent.connect.common.AssistActivity$1;
import android.os.Handler;
import com.tencent.connect.common.AssistActivity;
import android.os.Message;
import android.app.Activity;
import java.lang.String;
import com.tencent.open.log.SLog;

public class AssistActivity$1 extends Handler	// class@000e3f
{
    public final AssistActivity a;

    public void AssistActivity$1(AssistActivity p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (p0.what != null) {
       }else if(!this.a.isFinishing()){
          SLog.w("openSDK_LOG.AssistActivity", "-->finish by timeout");
          this.a.finish();
       }
       return;
    }
}
