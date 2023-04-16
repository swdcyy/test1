package com.kuaishou.live.core.show.quiz.manager.k;
import hoc.c;
import android.util.SparseArray;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.k$c;
import java.lang.String;
import com.kuaishou.live.core.show.quiz.manager.k$b;
import com.kuaishou.live.core.show.quiz.manager.k$d;
import com.kuaishou.live.core.show.quiz.manager.k$e;
import com.kuaishou.live.core.show.quiz.manager.k$f;
import hoc.b;
import android.os.Message;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dg2.d;
import dg2.r;
import java.lang.Runnable;
import ekd.k1;
import dg2.s;
import dg2.t;

public class k extends c	// class@000e20
{
    public final Object d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;
    public k$c i;
    public static final SparseArray j;

    static {
       SparseArray sparseArray = new SparseArray();
       k.j = sparseArray;
       sparseArray.put(1, "MSG_QUIZ_END");
       sparseArray.put(2, "MSG_QUIZ_FORCE_TO_QUESTIONING");
       sparseArray.put(3, "MSG_QUIZ_FORCE_TO_REVIEWED_FALSE");
       sparseArray.put(4, "MSG_QUIZ_FORCE_TO_REVIEWED_RIGHT");
    }
    public void k(k$c p0){
       super("LiveQuizAudienceStateMachine");
       this.d = new Object();
       k$b uob = new k$b(this);
       this.e = uob;
       k$d uod = new k$d(this);
       this.f = uod;
       k$e uoe = new k$e(this);
       this.g = uoe;
       k$f uof = new k$f(this);
       this.h = uof;
       this.i = p0;
       this.a(uob);
       this.a(uod);
       this.a(uoe);
       this.a(uof);
       this.n(uob);
       this.o();
    }
    public void q(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       p0 = p0.obj;
       if (p0 instanceof d) {
          k1.p(new r(this, p0), this.d);
       }
       return;
    }
    public void r(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       p0 = p0.obj;
       if (!p0 instanceof d) {
          return;
       }
       k1.p(new s(this, p0), this.d);
       return;
    }
    public void s(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       p0 = p0.obj;
       if (!p0 instanceof d) {
          return;
       }
       k1.p(new t(this, p0), this.d);
       return;
    }
}
