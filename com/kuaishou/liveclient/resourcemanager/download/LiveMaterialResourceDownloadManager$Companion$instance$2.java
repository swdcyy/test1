package com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class LiveMaterialResourceDownloadManager$Companion$instance$2 extends Lambda implements a	// class@00106f
{
    public static final LiveMaterialResourceDownloadManager$Companion$instance$2 INSTANCE;

    static {
       LiveMaterialResourceDownloadManager$Companion$instance$2.INSTANCE = new LiveMaterialResourceDownloadManager$Companion$instance$2();
    }
    public void LiveMaterialResourceDownloadManager$Companion$instance$2(){
       super(0);
    }
    public final LiveMaterialResourceDownloadManager invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceDownloadManager$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMaterialResourceDownloadManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
