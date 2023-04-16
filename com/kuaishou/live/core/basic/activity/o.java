package com.kuaishou.live.core.basic.activity.o;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$a;

public final class o implements Runnable	// class@00184a
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final void run(){
       LiveMaterialResourceManager.d.a().f(2);
    }
}
