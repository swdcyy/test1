package com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl$1;
import android.content.ServiceConnection;
import com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService$a;

public final class OplusHyperBoostUnitImpl$1 implements ServiceConnection	// class@000b31
{
    public final OplusHyperBoostUnitImpl a;

    public void OplusHyperBoostUnitImpl$1(OplusHyperBoostUnitImpl p0){
       this.a = p0;
       super();
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       p0.mHyperBoostServiceBinder = IOplusHyperBoostService$a.a(p1);
    }
    public final void onServiceDisconnected(ComponentName p0){
       p0.mHyperBoostServiceBinder = null;
    }
}
