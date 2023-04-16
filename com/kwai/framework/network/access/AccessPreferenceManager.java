package com.kwai.framework.network.access.AccessPreferenceManager;
import ia0.d;
import java.lang.String;
import java.lang.Object;
import km8.b;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import com.kwai.framework.network.access.AccessPreferenceManager$enableCommonParamsControl$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.network.access.AccessPreferenceManager$enableHostCollection$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class AccessPreferenceManager implements d	// class@001792
{
    public static final SharedPreferences a;
    public static final p b;
    public static final p c;
    public static final AccessPreferenceManager d;

    static {
       AccessPreferenceManager.d = new AccessPreferenceManager();
       Object obj = b.b("SpAccessManager");
       a.o(obj, "PreferenceContext.get\(\"SpAccessManager\"\)");
       AccessPreferenceManager.a = obj;
       AccessPreferenceManager.b = s.c(AccessPreferenceManager$enableCommonParamsControl$2.INSTANCE);
       AccessPreferenceManager.c = s.c(AccessPreferenceManager$enableHostCollection$2.INSTANCE);
    }
    public void AccessPreferenceManager(){
       super();
    }
    public static final SharedPreferences b(AccessPreferenceManager p0){
       return AccessPreferenceManager.a;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, AccessPreferenceManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.g("CommonParamsControlManager", "开启域名管控："+this.c()+"，开启域名采集："+this.d());
       boolean b = (this.c() || this.d())? true: false;
       return b;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, AccessPreferenceManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = AccessPreferenceManager.b.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, AccessPreferenceManager.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = AccessPreferenceManager.c.getValue();
       }
       return obj.booleanValue();
    }
}
