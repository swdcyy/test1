package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import rs2.d;

public final class MicSeatVideoController$onCreate$1 extends Lambda implements l	// class@00170c
{
    public static final MicSeatVideoController$onCreate$1 INSTANCE;

    static {
       MicSeatVideoController$onCreate$1.INSTANCE = new MicSeatVideoController$onCreate$1();
    }
    public void MicSeatVideoController$onCreate$1(){
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatVideoController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new d();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
