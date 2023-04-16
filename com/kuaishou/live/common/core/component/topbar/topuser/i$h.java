package com.kuaishou.live.common.core.component.topbar.topuser.i$h;
import androidx.fragment.app.c$b;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$h extends c$b	// class@00178e
{
    public final i a;

    public void i$h(i p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$h.class, "2")) {
          return;
       }
       this.a.o9("onFragmentPaused");
       this.a.q9();
       p0.M = false;
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$h.class, "1")) {
          return;
       }
       p0.M = true;
       return;
    }
}
