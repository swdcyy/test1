package com.kwai.framework.plugin.PluginManager$mCleaner$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import cd6.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import rd6.d;
import rd6.e;
import com.kwai.framework.plugin.incremental.IncrementStoreImpl;
import kd6.f;

public final class PluginManager$mCleaner$2 extends Lambda implements a	// class@000c6e
{
    public static final PluginManager$mCleaner$2 INSTANCE;

    static {
       PluginManager$mCleaner$2.INSTANCE = new PluginManager$mCleaner$2();
    }
    public void PluginManager$mCleaner$2(){
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mCleaner$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PluginManager h = PluginManager.H;
       d uod = h.t();
       e uoe = h.x();
       return new c(uod, uoe, h.n());
    }
    public Object invoke(){
       return this.invoke();
    }
}
