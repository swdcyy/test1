package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$d;
import java.lang.Runnable;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import zq3.b;
import hr3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveMaterialResourceManager$d implements Runnable	// class@001050
{
    public final LiveMaterialResourceManager b;
    public final b c;
    public final a d;

    public void LiveMaterialResourceManager$d(LiveMaterialResourceManager p0,b p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceManager$d.class, "1")) {
          return;
       }
       this.c.b(this.d);
       this.b.g(this.c.c());
       return;
    }
}
