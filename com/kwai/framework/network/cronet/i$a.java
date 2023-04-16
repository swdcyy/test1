package com.kwai.framework.network.cronet.i$a;
import com.kuaishou.aegon.Aegon$b;
import com.kwai.framework.network.cronet.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.v0;

public class i$a extends Aegon$b	// class@000bfa
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void loadLibrary(String p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1");
       if (b) {
          return;
       }
       b.b(p0);
       return;
    }
}
