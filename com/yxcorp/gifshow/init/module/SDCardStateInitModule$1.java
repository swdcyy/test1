package com.yxcorp.gifshow.init.module.SDCardStateInitModule$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.SDCardStateInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.utility.receiver.SDCardStateReceiver;
import o56.a;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import l06.b;
import java.lang.Throwable;
import q87.c;

public class SDCardStateInitModule$1 implements Runnable	// class@00199e
{
    public final SDCardStateInitModule b;

    public void SDCardStateInitModule$1(SDCardStateInitModule p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, SDCardStateInitModule$1.class, "1")) {
          return;
       }
       UniversalReceiver.e(a.B, new SDCardStateReceiver(), SDCardStateReceiver.a());
       PatchProxy.onMethodExit(SDCardStateInitModule$1.class, "1");
       return;
    }
}
