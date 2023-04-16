package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$c;
import java.lang.Runnable;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import zq3.b;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveMaterialResourceManager$c implements Runnable	// class@00104f
{
    public final LiveMaterialResourceManager b;
    public final b c;
    public final String d;
    public final Throwable e;

    public void LiveMaterialResourceManager$c(LiveMaterialResourceManager p0,b p1,String p2,Throwable p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceManager$c.class, "1")) {
          return;
       }
       this.c.a(this.d, this.e);
       this.b.g(this.c.c());
       return;
    }
}
