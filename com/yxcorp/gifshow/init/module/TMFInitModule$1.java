package com.yxcorp.gifshow.init.module.TMFInitModule$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.TMFInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.kstmf.KSTMFConfig;

public class TMFInitModule$1 implements Runnable	// class@0019a3
{
    public final TMFInitModule b;

    public void TMFInitModule$1(TMFInitModule p0){
       this.b = p0;
       super();
    }
    public void run(){
       String str = "TMF";
       if (PatchProxy.applyVoidWithListener(null, this, TMFInitModule$1.class, "1")) {
          return;
       }
       Log.n(str, "ImageManagerInitModule execute");
       KSTMFConfig.init(a.b());
       PatchProxy.onMethodExit(TMFInitModule$1.class, "1");
       return;
    }
}
