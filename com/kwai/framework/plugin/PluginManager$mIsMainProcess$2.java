package com.kwai.framework.plugin.PluginManager$mIsMainProcess$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;

public final class PluginManager$mIsMainProcess$2 extends Lambda implements a	// class@000c73
{
    public static final PluginManager$mIsMainProcess$2 INSTANCE;

    static {
       PluginManager$mIsMainProcess$2.INSTANCE = new PluginManager$mIsMainProcess$2();
    }
    public void PluginManager$mIsMainProcess$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$mIsMainProcess$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SystemUtil.L(PluginManager.a(PluginManager.H));
    }
}
