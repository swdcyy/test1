package com.yxcorp.gifshow.freetraffic.FreeTrafficManager$NetworkChangeReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kka.t;
import java.lang.Runnable;
import ekd.s1;

public class FreeTrafficManager$NetworkChangeReceiver extends BroadcastReceiver	// class@001291
{
    public final FreeTrafficManager a;

    public void FreeTrafficManager$NetworkChangeReceiver(FreeTrafficManager p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FreeTrafficManager$NetworkChangeReceiver.class, "1")) {
          return;
       }
       s1.d(new t(this));
       return;
    }
}
