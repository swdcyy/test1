package com.kwai.live.gzone.accompanyplay.anchor.z$b;
import oq5.c;
import com.kwai.live.gzone.accompanyplay.anchor.z;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class z$b implements c	// class@000b47
{
    public final z b;

    public void z$b(z p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$b.class, "1")) {
          return;
       }
       z$b tb = this.b;
       z w = tb.w;
       p0 = p0.orientation;
       boolean b = true;
       int i = (p0 == 2)? 1: 0;
       if (w != i) {
          if (p0 != 2) {
             b = false;
          }
          tb.w = b;
          tb.b0(b);
       }
       return;
    }
}
