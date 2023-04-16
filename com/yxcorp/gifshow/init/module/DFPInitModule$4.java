package com.yxcorp.gifshow.init.module.DFPInitModule$4;
import java.lang.Thread;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;

public class DFPInitModule$4 extends Thread	// class@00196b
{
    public final DFPInitModule b;

    public void DFPInitModule$4(DFPInitModule p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, DFPInitModule$4.class, "1")) {
          return;
       }
       Process.setThreadPriority(10);
       DFPInitModule.l0();
       PatchProxy.onMethodExit(DFPInitModule$4.class, "1");
       return;
    }
}
