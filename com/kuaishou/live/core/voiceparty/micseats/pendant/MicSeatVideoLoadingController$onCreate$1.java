package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoLoadingController$onCreate$1;
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
import it2.j1;

public final class MicSeatVideoLoadingController$onCreate$1 extends Lambda implements l	// class@001714
{
    public static final MicSeatVideoLoadingController$onCreate$1 INSTANCE;

    static {
       MicSeatVideoLoadingController$onCreate$1.INSTANCE = new MicSeatVideoLoadingController$onCreate$1();
    }
    public void MicSeatVideoLoadingController$onCreate$1(){
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatVideoLoadingController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new j1();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
