package com.kuaishou.live.common.core.component.comments.fluency.quick.c;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j;
import java.util.List;
import java.lang.Iterable;
import qk.m;
import java.util.Objects;
import gf1.a;
import ok.h;
import ok.o;
import com.google.common.base.Predicates;
import com.kuaishou.live.common.core.component.comments.fluency.quick.b;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a$a;
import java.lang.Integer;
import lp3.e;
import lp3.c;
import lp3.b;
import z1.i;

public class c implements a	// class@00108a
{
    public final SparseArray b;
    public a$a c;

    public void c(){
       super();
       this.b = new SparseArray();
       this.c = null;
    }
    public boolean Bc(int[] p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (j.g(p0)) {
          return true;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       return m.s(j.b(p0)).F(new a(obj)).p(Predicates.h()).b(b.b);
    }
    public void Eg(a$a p0){
       this.c = p0;
    }
    public void be(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.b.clear();
       return;
    }
    public void ee(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void l8(int p0,i p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       this.b.put(p0, p1);
       return;
    }
}
