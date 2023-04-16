package com.kwai.performance.stability.hprof.dump.StripHprofHeapDumper;
import xg7.b;
import java.lang.String;
import java.lang.StringBuilder;
import yf7.h;
import android.os.Debug;
import java.io.IOException;

public class StripHprofHeapDumper extends b	// class@001229
{

    public void StripHprofHeapDumper(){
       super();
       if (this.soLoaded != null) {
          this.initStripDump();
       }
       return;
    }
    public boolean dump(String p0){
       h.d("StripHprofHeapDumper", "dump "+p0);
       boolean b = false;
       if (this.soLoaded == null) {
          h.b("StripHprofHeapDumper", "dump failed caused by so not loaded!");
          return b;
       }else {
          try{
             this.hprofName(p0);
             Debug.dumpHprofData(p0);
             b = this.isStripSuccess();
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }
          return b;
       }
    }
    public native void hprofName(String p0);
    public native void initStripDump();
    public native boolean isStripSuccess();
}
