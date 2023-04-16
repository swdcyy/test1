package com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicyManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicyManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicy;
import java.lang.reflect.Type;

public final class PreloadPolicyManager$Companion$instance$2 extends Lambda implements a	// class@001091
{
    public static final PreloadPolicyManager$Companion$instance$2 INSTANCE;

    static {
       PreloadPolicyManager$Companion$instance$2.INSTANCE = new PreloadPolicyManager$Companion$instance$2();
    }
    public void PreloadPolicyManager$Companion$instance$2(){
       super(0);
    }
    public final PreloadPolicyManager invoke(){
       Object[] objArray = null;
       String str = "1";
       PreloadPolicyManager obj = PatchProxy.apply(objArray, this, PreloadPolicyManager$Companion$instance$2.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PreloadPolicyManager(objArray);
       if (!PatchProxy.applyVoid(objArray, obj, PreloadPolicyManager.class, str)) {
          PreloadPolicy value = a.t().u("SOURCE_LIVE").getValue("liveMaterialResourceDownloadPolicy", PreloadPolicy.class, objArray);
          if (value != null) {
             obj.a = value;
          }
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
