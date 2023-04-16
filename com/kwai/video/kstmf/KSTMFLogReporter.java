package com.kwai.video.kstmf.KSTMFLogReporter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import c97.d;
import r97.a0;
import com.kwai.video.kstmf.KSTMFCustomEvent;
import r97.p;

public class KSTMFLogReporter	// class@00093d
{

    public void KSTMFLogReporter(){
       super();
    }
    public static void report(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSTMFLogReporter.class, "1")) {
          return;
       }
       d.a().g().H(new KSTMFCustomEvent(p0));
       return;
    }
}
