package com.kuaishou.live.core.show.quiz.manager.k$a;
import hoc.b;
import com.kuaishou.live.core.show.quiz.manager.k;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hoc.a;
import hoc.c;
import java.util.Objects;
import java.lang.Integer;
import dg2.q;
import java.lang.Runnable;
import ekd.k1;

public class k$a extends b	// class@000e1a
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public boolean c(Message p0){
       k$a ta;
       Message obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != true) {
          if (obj != 2) {
             if (obj != 3) {
                if (obj != 4) {
                   return false;
                }else {
                   ta = this.a;
                   ta.p(ta.h);
                   this.a.s(p0);
                   return true;
                }
             }else {
                ta = this.a;
                ta.p(ta.g);
                this.a.r(p0);
                return true;
             }
          }else {
             ta = this.a;
             ta.p(ta.f);
             this.a.q(p0);
             return true;
          }
       }else {
          ta = this.a;
          ta.p(ta.e);
          p0 = p0.arg2;
          ta = this.a;
          Objects.requireNonNull(ta);
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, ok, "2")) {
             k1.p(new q(ta, p0), ta.d);
          }
          return true;
       }
    }
}
