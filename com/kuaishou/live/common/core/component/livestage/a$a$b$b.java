package com.kuaishou.live.common.core.component.livestage.a$a$b$b;
import x71.c;
import com.kuaishou.live.common.core.component.livestage.a$a$b;
import je3.l;
import java.lang.Object;
import u71.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import je3.m;
import fe3.c;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.common.core.component.livestage.a$b;

public final class a$a$b$b implements c	// class@0014ad
{
    public final a$a$b a;
    public final l b;

    public void a$a$b$b(a$a$b p0,l p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void c6(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$b$b.class, "1")) {
          return;
       }
       a.p(p0, "videoFrame");
       m om = new m(p0, p0.getWidth(), p0.getHeight(), this.a.k(), this.a.j());
       this.b.a(v7);
       return;
    }
}
