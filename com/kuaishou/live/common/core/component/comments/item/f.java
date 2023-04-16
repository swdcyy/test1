package com.kuaishou.live.common.core.component.comments.item.f;
import k81.k;
import com.kuaishou.live.common.core.component.comments.item.f$a;
import java.lang.Object;
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
import com.kuaishou.live.common.core.component.comments.item.f$b;

public class f implements k	// class@0010a2
{
    public final f$a a;
    public final f$a b;

    public void f(f$a p0,f$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public h a(ViewGroup p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new f$b(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d0cd5, null, false), this.a, this.b);
    }
}
