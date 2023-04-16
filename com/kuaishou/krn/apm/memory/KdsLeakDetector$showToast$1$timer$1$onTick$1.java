package com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1$timer$1$onTick$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1$timer$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kuaishou.krn.apm.memory.KdsLeakDetector$showToast$1;
import java.lang.CharSequence;
import android.widget.Toast;

public final class KdsLeakDetector$showToast$1$timer$1$onTick$1 extends Lambda implements a	// class@0007e2
{
    public final KdsLeakDetector$showToast$1$timer$1 this$0;

    public void KdsLeakDetector$showToast$1$timer$1$onTick$1(KdsLeakDetector$showToast$1$timer$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KdsLeakDetector$showToast$1$timer$1$onTick$1.class, "1")) {
          return;
       }
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       Toast.makeText(uoc.d(), this.this$0.a.$text, 1).show();
       return;
    }
}
