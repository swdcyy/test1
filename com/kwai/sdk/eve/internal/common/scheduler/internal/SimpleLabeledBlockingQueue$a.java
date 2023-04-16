package com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue$a;
import com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue;
import dn7.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SimpleLabeledBlockingQueue$a	// class@001492
{
    public g a;
    public g b;
    public int c;
    public final SimpleLabeledBlockingQueue d;

    public void SimpleLabeledBlockingQueue$a(SimpleLabeledBlockingQueue p0,g p1,g p2,int p3){
       this.d = p0;
       super();
       this.b = p2;
       this.c = p3;
       this.a = p1;
    }
    public final void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleLabeledBlockingQueue$a.class, "1")) {
          return;
       }
       a.p(p0, "node");
       if (a.g(this.b, p0)) {
          this.b = this.a;
       }
       return;
    }
    public final int b(){
       return this.c;
    }
    public final g c(){
       return this.a;
    }
    public final g d(){
       return this.b;
    }
    public final void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleLabeledBlockingQueue$a.class, "2")) {
          return;
       }
       a.p(p0, "node");
       SimpleLabeledBlockingQueue$a tb = this.b;
       a.m(tb);
       g og = tb.a();
       if (og != null) {
          og.e(p0);
       }
       tb = this.b;
       a.m(tb);
       p0.d(tb.a());
       tb = this.b;
       a.m(tb);
       tb.d(p0);
       p0.e(this.b);
       this.b = p0;
       this.c = this.c + 1;
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, SimpleLabeledBlockingQueue$a.class, "3")) {
          return;
       }
       this.h(this.d.p());
       this.b = this.d.p();
       this.c = 0;
       return;
    }
    public final void g(int p0){
       this.c = p0;
    }
    public final void h(g p0){
       if (this.a == this.b) {
          this.b = p0;
       }
       this.a = p0;
       return;
    }
    public final void i(g p0){
       this.b = p0;
    }
}
