package com.kuaishou.commercial.splash.playable.j$a;
import androidx.fragment.app.c$b;
import com.kuaishou.commercial.splash.playable.j;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yx.j0;
import com.kwai.framework.player.core.b;

public class j$a extends c$b	// class@0015c2
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void d(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$a.class, "3")) {
          return;
       }
       this.a.R8();
       return;
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$a.class, "1")) {
          return;
       }
       j$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, j.class, "12")) {
          Object[] objArray = new Object[0];
          j0.f("SplashPlayablePopupVideoPre", "pausePlayer", objArray);
          ta.A = true;
          j z = ta.z;
          if (z != null) {
             z.pause();
          }
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$a.class, "2")) {
          return;
       }
       this.a.V8();
       return;
    }
}
