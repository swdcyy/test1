package com.kwai.framework.network.regions.RegionSchedulerImpl$NetworkChangeReceiver;
import android.content.BroadcastReceiver;
import com.kwai.framework.network.regions.RegionSchedulerImpl;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wb6.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class RegionSchedulerImpl$NetworkChangeReceiver extends BroadcastReceiver	// class@00180d
{
    public final RegionSchedulerImpl a;
    public static final int b;

    public void RegionSchedulerImpl$NetworkChangeReceiver(RegionSchedulerImpl p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RegionSchedulerImpl$NetworkChangeReceiver.class, "1")) {
          return;
       }
       c.k(new e(this, p0));
       return;
    }
}
