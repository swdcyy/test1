package com.kuaishou.live.core.show.pk.k$d;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.pk.k;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import pp.d;

public class k$d extends c$b	// class@000d90
{
    public final k a;

    public void k$d(k p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$d.class, "1")) {
          return;
       }
       k$d ta = this.a;
       ta.v.H2.i(LiveLogTag.PK, "onFragmentResumed", "isPking", Boolean.valueOf(ta.p));
       return;
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$d.class, "2")) {
          return;
       }
       this.a.v.H2.h(LiveLogTag.PK, "onFragmentViewDestroyed");
       this.a.W8();
       return;
    }
}
