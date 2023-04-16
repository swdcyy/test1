package com.kwai.framework.plugin.PluginManager$mIncrementStore$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.incremental.IncrementStoreImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.PluginManager$f;
import ae6.f;

public final class PluginManager$mIncrementStore$2 extends Lambda implements a	// class@000c71
{
    public static final PluginManager$mIncrementStore$2 INSTANCE;

    static {
       PluginManager$mIncrementStore$2.INSTANCE = new PluginManager$mIncrementStore$2();
    }
    public void PluginManager$mIncrementStore$2(){
       super(0);
    }
    public final IncrementStoreImpl invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mIncrementStore$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IncrementStoreImpl(PluginManager.c(PluginManager.H));
    }
    public Object invoke(){
       return this.invoke();
    }
}
