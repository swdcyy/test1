package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$b;
import vb3.h;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteLayoutManager$b implements h	// class@000912
{
    public final LiveLiteLayoutManager a;

    public void LiveLiteLayoutManager$b(LiveLiteLayoutManager p0){
       this.a = p0;
       super();
    }
    public t a(){
       t obj = PatchProxy.apply(null, this, LiveLiteLayoutManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.u.hide();
       a.o(obj, "_playerViewLocation.hide\(\)");
       return obj;
    }
}
