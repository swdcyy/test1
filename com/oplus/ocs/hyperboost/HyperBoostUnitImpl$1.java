package com.oplus.ocs.hyperboost.HyperBoostUnitImpl$1;
import android.content.ServiceConnection;
import com.oplus.ocs.hyperboost.HyperBoostUnitImpl;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import com.coloros.gamespace.gamesdk.IHyperBoostService;
import com.coloros.gamespace.gamesdk.IHyperBoostService$a;

public final class HyperBoostUnitImpl$1 implements ServiceConnection	// class@000b2c
{
    public final HyperBoostUnitImpl a;

    public void HyperBoostUnitImpl$1(HyperBoostUnitImpl p0){
       this.a = p0;
       super();
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       p0.mHyperBoostServiceBinder = IHyperBoostService$a.a(p1);
    }
    public final void onServiceDisconnected(ComponentName p0){
       p0.mHyperBoostServiceBinder = null;
    }
}
