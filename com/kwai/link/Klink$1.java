package com.kwai.link.Klink$1;
import com.kuaishou.aegon.Aegon$b;
import com.kwai.link.Klink;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class Klink$1 extends Aegon$b	// class@000ad8
{
    public final Klink this$0;

    public void Klink$1(Klink p0){
       this.this$0 = p0;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink$1.class, "1")) {
          return;
       }
       Klink.safelyLoadLibrary(p0);
       return;
    }
}
