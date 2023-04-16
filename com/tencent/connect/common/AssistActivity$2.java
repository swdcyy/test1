package com.tencent.connect.common.AssistActivity$2;
import java.lang.Runnable;
import com.tencent.connect.common.AssistActivity;
import java.lang.Object;
import java.lang.String;
import com.tencent.open.log.SLog;
import android.app.Activity;

public class AssistActivity$2 implements Runnable	// class@000e40
{
    public final AssistActivity a;

    public void AssistActivity$2(AssistActivity p0){
       this.a = p0;
       super();
    }
    public void run(){
       SLog.i("openSDK_LOG.AssistActivity", "onActivityResult finish delay");
       this.a.finish();
    }
}
