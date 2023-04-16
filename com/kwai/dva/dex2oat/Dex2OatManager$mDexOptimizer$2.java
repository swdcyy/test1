package com.kwai.dva.dex2oat.Dex2OatManager$mDexOptimizer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.dva.dex2oat.opt.DexOptimizerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.dva.dex2oat.Dex2OatManager;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class Dex2OatManager$mDexOptimizer$2 extends Lambda implements a	// class@000ad7
{
    public static final Dex2OatManager$mDexOptimizer$2 INSTANCE;

    static {
       Dex2OatManager$mDexOptimizer$2.INSTANCE = new Dex2OatManager$mDexOptimizer$2();
    }
    public void Dex2OatManager$mDexOptimizer$2(){
       super(0);
    }
    public final DexOptimizerImpl invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, Dex2OatManager$mDexOptimizer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context b = Dex2OatManager.b;
       if (b == null) {
          a.S("mContext");
       }else {
          objArray = b;
       }
       return new DexOptimizerImpl(objArray);
    }
    public Object invoke(){
       return this.invoke();
    }
}
