package com.kuaishou.live.core.voiceparty.theater.tube.b$b;
import com.kuaishou.live.core.voiceparty.theater.tube.b;
import androidx.lifecycle.ViewModel;
import java.util.LinkedHashSet;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.theater.tube.b$a;

public final class b$b extends ViewModel implements b	// class@001a01
{
    public final Set b;
    public final Set c;

    public void b$b(){
       super();
       this.b = new LinkedHashSet();
       this.c = new LinkedHashSet();
    }
    public void W(int p0,a p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       a.p(p1, "logger");
       if (!this.b.contains(Integer.valueOf(p0))) {
          this.b.add(Integer.valueOf(p0));
          p1.invoke();
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "3")) {
          return;
       }
       super.onCleared();
       this.b.clear();
       this.c.clear();
       b$a h0 = b.h0;
       Objects.requireNonNull(h0);
       if (!PatchProxy.applyVoidOneRefs(this, h0, b$a.class, "2") && a.g(b$a.a, this)) {
          b$a.a = null;
       }
       return;
    }
    public void p(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "2")) {
          return;
       }
       a.p(p0, "tubeId");
       a.p(p1, "logger");
       if (!this.c.contains(p0)) {
          this.c.add(p0);
          p1.invoke();
       }
       return;
    }
}
