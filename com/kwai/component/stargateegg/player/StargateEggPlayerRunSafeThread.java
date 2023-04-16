package com.kwai.component.stargateegg.player.StargateEggPlayerRunSafeThread;
import com.kwai.component.stargateegg.player.StargateEggPlayerRunSafeThread$mMainHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.os.Handler;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class StargateEggPlayerRunSafeThread	// class@000b43
{
    public static final p a;
    public static final StargateEggPlayerRunSafeThread b;

    static {
       StargateEggPlayerRunSafeThread.b = new StargateEggPlayerRunSafeThread();
       StargateEggPlayerRunSafeThread.a = s.c(StargateEggPlayerRunSafeThread$mMainHandler$2.INSTANCE);
    }
    public void StargateEggPlayerRunSafeThread(){
       super();
    }
    public static final Handler a(){
       Object obj = PatchProxy.apply(null, null, StargateEggPlayerRunSafeThread.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StargateEggPlayerRunSafeThread.a.getValue();
    }
    public static final Object b(a p0,l p1){
       Object obj1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StargateEggPlayerRunSafeThread.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a.p(p0, "action");
          obj1 = p0.invoke();
       }catch(java.lang.Exception e3){
          if (p1) {
             p1.invoke(e3);
          }
       }
       return obj1;
    }
}
