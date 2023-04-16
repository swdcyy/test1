package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class LiveMaterialResourceCleaner$Companion$instance$2 extends Lambda implements a	// class@001043
{
    public static final LiveMaterialResourceCleaner$Companion$instance$2 INSTANCE;

    static {
       LiveMaterialResourceCleaner$Companion$instance$2.INSTANCE = new LiveMaterialResourceCleaner$Companion$instance$2();
    }
    public void LiveMaterialResourceCleaner$Companion$instance$2(){
       super(0);
    }
    public final LiveMaterialResourceCleaner invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceCleaner$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMaterialResourceCleaner(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
