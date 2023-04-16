package com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1$timer$1;
import android.os.CountDownTimer;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1$timer$1$onTick$1;
import msd.a;
import ev6.f;

public final class KdsLeakDetector$showToast$1$timer$1 extends CountDownTimer	// class@0007e3
{
    public final KdsLeakDetector$showToast$1 a;

    public void KdsLeakDetector$showToast$1$timer$1(KdsLeakDetector$showToast$1 p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(KdsLeakDetector$showToast$1$timer$1.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, KdsLeakDetector$showToast$1$timer$1.class, "1")) {
          return;
       }
       f.c(new KdsLeakDetector$showToast$1$timer$1$onTick$1(this));
       return;
    }
}
