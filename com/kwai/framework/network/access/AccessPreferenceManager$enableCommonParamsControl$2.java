package com.kwai.framework.network.access.AccessPreferenceManager$enableCommonParamsControl$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.access.AccessPreferenceManager;
import android.content.SharedPreferences;

public final class AccessPreferenceManager$enableCommonParamsControl$2 extends Lambda implements a	// class@001790
{
    public static final AccessPreferenceManager$enableCommonParamsControl$2 INSTANCE;

    static {
       AccessPreferenceManager$enableCommonParamsControl$2.INSTANCE = new AccessPreferenceManager$enableCommonParamsControl$2();
    }
    public void AccessPreferenceManager$enableCommonParamsControl$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, AccessPreferenceManager$enableCommonParamsControl$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AccessPreferenceManager.b(AccessPreferenceManager.d).getBoolean("enableCommonParamsControl", false);
    }
}
