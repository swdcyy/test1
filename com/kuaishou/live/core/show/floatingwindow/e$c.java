package com.kuaishou.live.core.show.floatingwindow.e$c;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.floatingwindow.e;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d92.p;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import com.kuaishou.live.core.basic.activity.x;

public class e$c extends c$b	// class@000b7d
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$c.class, "1")) {
          return;
       }
       if (this.a.C.c()) {
          this.a.P.c(1);
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$c.class, "2")) {
          return;
       }
       if (this.a.z.a()) {
          this.a.S8();
       }
       return;
    }
}
