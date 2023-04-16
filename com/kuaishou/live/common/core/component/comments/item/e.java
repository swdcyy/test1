package com.kuaishou.live.common.core.component.comments.item.e;
import k81.k;
import com.kwai.framework.model.user.User;
import z1.k;
import com.kuaishou.live.common.core.component.comments.item.e$b;
import java.lang.Object;
import ne1.k;
import r81.c$f;
import r81.c$a;
import o81.g;
import r81.c;
import android.view.ViewGroup;
import g81.a;
import k81.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import com.kuaishou.live.common.core.component.comments.item.e$a;

public class e implements k	// class@00109f
{
    public final User a;
    public final e$b b;
    public final boolean c;
    public final g d;

    public void e(User p0,k p1,boolean p2,boolean p3,e$b p4){
       super();
       this.a = p0;
       this.b = p4;
       this.c = p2;
       c$f uof = (k.b())? new c$f(): new c$a();
       g og = new g();
       og.v(true);
       g og1 = og.u(uof);
       og1.D(p1);
       og1.B(k.b());
       og1.t(p3);
       og1.A(k.c());
       this.d = og1;
       return;
    }
    public h a(ViewGroup p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new e$a(this, a.c(LayoutInflater.from(p0.getContext()), 0x7f0d0aba, null, false));
    }
}
