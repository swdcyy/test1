package com.kwai.performance.stability.hprof.dump.ForkJvmHeapDumper;
import xg7.b;
import java.lang.String;
import java.lang.StringBuilder;
import yf7.h;
import android.os.Build$VERSION;
import android.os.Debug;
import java.io.IOException;

public class ForkJvmHeapDumper extends b	// class@001227
{
    public final boolean waitPid;

    public void ForkJvmHeapDumper(){
       super(true);
    }
    public void ForkJvmHeapDumper(boolean p0){
       super();
       this.waitPid = p0;
       if (this.soLoaded != null) {
          this.init();
       }
       return;
    }
    public boolean dump(String p0){
       h.d("OOMMonitor_ForkJvmHeapDumper", "dump "+p0);
       boolean b = false;
       if (this.soLoaded == null) {
          h.b("OOMMonitor_ForkJvmHeapDumper", "dump failed caused by so not loaded!");
          return b;
       }else if(Build$VERSION.SDK_INT > 31){
          h.b("OOMMonitor_ForkJvmHeapDumper", "dump failed caused by version not supported!");
          return b;
       }else {
          try{
             h.d("OOMMonitor_ForkJvmHeapDumper", "before suspend and fork.");
             int i = this.suspendAndFork();
             if (!i) {
                Debug.dumpHprofData(p0);
                this.exitProcess();
             }else if(i > 0){
                boolean b1 = (this.waitPid != null)? this.resumeAndWait(i): this.resume();
                b = b1;
                h.d("OOMMonitor_ForkJvmHeapDumper", "notify from pid "+i);
             }
          }catch(java.io.IOException e5){
             h.b("OOMMonitor_ForkJvmHeapDumper", "dump failed caused by "+e5.toString());
             e5.printStackTrace();
          }
          return b;
       }
    }
    public native final void exitProcess();
    public native final void init();
    public native final boolean resume();
    public native final boolean resumeAndWait(int p0);
    public native final int suspendAndFork();
}
