package com.android.kwai.platform.notification.core.config.RemoteConfigRecognizer;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;
import java.lang.Object;
import android.net.Uri;
import com.android.kwai.platform.notification.core.a;

public final class RemoteConfigRecognizer implements ILogicRecognize	// class@000410
{

    public void RemoteConfigRecognizer(){
       super();
    }
    public boolean recognize(Uri p0,a p1,int p2){
       boolean b = false;
       if (p1 != null && p1.c() == 1) {
          b = true;
       }
       return b;
    }
    public boolean recognize(Uri p0,Object p1,int p2){
       return this.recognize(p0, p1, p2);
    }
}
