package com.kwai.component.stargateegg.player.StargateEggPlayerRunSafeThread$mMainHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class StargateEggPlayerRunSafeThread$mMainHandler$2 extends Lambda implements a	// class@000b42
{
    public static final StargateEggPlayerRunSafeThread$mMainHandler$2 INSTANCE;

    static {
       StargateEggPlayerRunSafeThread$mMainHandler$2.INSTANCE = new StargateEggPlayerRunSafeThread$mMainHandler$2();
    }
    public void StargateEggPlayerRunSafeThread$mMainHandler$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, StargateEggPlayerRunSafeThread$mMainHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
