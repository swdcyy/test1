package com.kwai.framework.network.access.control.CommonParamsControlManager$enableHostCollection$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.access.AccessPreferenceManager;

public final class CommonParamsControlManager$enableHostCollection$2 extends Lambda implements a	// class@001794
{
    public static final CommonParamsControlManager$enableHostCollection$2 INSTANCE;

    static {
       CommonParamsControlManager$enableHostCollection$2.INSTANCE = new CommonParamsControlManager$enableHostCollection$2();
    }
    public void CommonParamsControlManager$enableHostCollection$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, CommonParamsControlManager$enableHostCollection$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AccessPreferenceManager.d.d();
    }
}
