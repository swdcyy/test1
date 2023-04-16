package com.kwai.framework.network.access.control.CommonParamsControlManager$enableParamsControl$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.access.AccessPreferenceManager;

public final class CommonParamsControlManager$enableParamsControl$2 extends Lambda implements a	// class@001795
{
    public static final CommonParamsControlManager$enableParamsControl$2 INSTANCE;

    static {
       CommonParamsControlManager$enableParamsControl$2.INSTANCE = new CommonParamsControlManager$enableParamsControl$2();
    }
    public void CommonParamsControlManager$enableParamsControl$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, CommonParamsControlManager$enableParamsControl$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AccessPreferenceManager.d.c();
    }
}
