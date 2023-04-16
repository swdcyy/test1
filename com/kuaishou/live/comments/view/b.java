package com.kuaishou.live.comments.view.b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.comments.view.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.n;
import java.util.Set;
import java.util.Iterator;
import p81.d;
import java.util.Objects;
import p81.f;
import java.lang.Runnable;
import ekd.k1;

public class b extends RecyclerView$r	// class@000e4d
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p1) {
          b = n.J(p0, true);
          if (!this.a.m.isEmpty()) {
             Iterator iterator = this.a.m.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(b);
             }
          }
          if (!b) {
             b ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, c.class, "28")) {
                k1.s(new f(ta), ta, 5000);
             }
          }
       }else {
          this.a.r();
       }
       return;
    }
}
