package com.kuaishou.live.lite.square.notice.b$a;
import lnc.o;
import com.kuaishou.live.lite.square.notice.b;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kd3.f$c;
import kd3.f;
import com.kuaishou.live.lite.square.notice.g;

public class b$a extends o	// class@000b6e
{
    public final View b;
    public final b c;

    public void b$a(b p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void b(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "11")) {
          b a = tc.a;
          if (a != null) {
             a.v0(new f$c());
          }
       }
       return;
    }
}
