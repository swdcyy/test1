package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$b;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import er3.c;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er3.b;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.concurrent.ConcurrentHashMap;

public final class LiveMaterialResourceLocalFileManager	// class@00104b
{
    public c a;
    public ConcurrentHashMap b;
    public static final p c;
    public static final LiveMaterialResourceLocalFileManager$a d;

    static {
       LiveMaterialResourceLocalFileManager.d = new LiveMaterialResourceLocalFileManager$a(null);
       LiveMaterialResourceLocalFileManager.c = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveMaterialResourceLocalFileManager$Companion$instance$2.INSTANCE);
    }
    public void LiveMaterialResourceLocalFileManager(){
       super();
       this.a = c.b("live_material_resource_md5", new LiveMaterialResourceLocalFileManager$b().getType());
    }
    public final File a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceLocalFileManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.b(p0));
    }
    public final String b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceLocalFileManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.d();
       a.o(obj, "LiveMaterialResourceUtil¡­tResourceFileFolderPath\(\)");
       StringBuilder str = obj;
       return str+File.separator+p0;
    }
    public final String c(String p0){
       LiveMaterialResourceLocalFileManager obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceLocalFileManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resourceId");
       obj = this.b;
       p0 = (obj != null)? obj.get(p0): null;
       return p0;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceLocalFileManager.class, "9")) {
          return;
       }
       if (this.b != null) {
          this.a.c(this.b);
       }
       return;
    }
}
