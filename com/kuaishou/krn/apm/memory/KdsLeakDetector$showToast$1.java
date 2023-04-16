package com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1$timer$1;
import android.os.CountDownTimer;

public final class KdsLeakDetector$showToast$1 extends Lambda implements a	// class@0007e4
{
    public final long $duration;
    public final String $text;

    public void KdsLeakDetector$showToast$1(String p0,long p1){
       this.$text = p0;
       this.$duration = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KdsLeakDetector$showToast$1.class, "1")) {
          return;
       }
       KdsLeakDetector$showToast$1$timer$1 oshowToast$1 = new KdsLeakDetector$showToast$1$timer$1(this, this.$duration, 3000);
       v0.start();
       return;
    }
}
