package com.kwai.framework.initmodule.AzerothInitModule$a;
import n97.a;
import com.kwai.framework.initmodule.AzerothInitModule;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.v0;

public class AzerothInitModule$a extends a	// class@000b6f
{
    public final AzerothInitModule a;

    public void AzerothInitModule$a(AzerothInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0,Context p1,String p2){
       Object obj = p0;
       if (PatchProxy.applyVoidThreeRefs(obj, p1, p2, this, AzerothInitModule$a.class, "1")) {
          return;
       }
       obj.b(p0);
       return;
    }
}
