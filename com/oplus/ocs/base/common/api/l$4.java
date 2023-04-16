package com.oplus.ocs.base.common.api.l$4;
import android.os.Handler;
import com.oplus.ocs.base.common.api.l;
import android.os.Looper;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import android.os.Message;

public final class l$4 extends Handler	// class@000af2
{
    public final OnConnectionSucceedListener a;
    public final l b;

    public void l$4(l p0,Looper p1,OnConnectionSucceedListener p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public final void handleMessage(Message p0){
       super.handleMessage(p0);
       l$4 ta = this.a;
       if (ta != null) {
          ta.onConnectionSucceed();
       }
       return;
    }
}
