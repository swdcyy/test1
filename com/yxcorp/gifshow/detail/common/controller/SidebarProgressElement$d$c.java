package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import qp7.x0;
import qp7.b;
import kq7.k;
import kotlin.jvm.internal.a;
import qp7.g;
import fq7.c;
import java.util.Objects;
import java.lang.Boolean;
import fq7.c$a;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;

public final class SidebarProgressElement$d$c implements g	// class@0013c7
{
    public final SidebarProgressElement$d b;

    public void SidebarProgressElement$d$c(SidebarProgressElement$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$d$c.class, "1")) {
       }else if(!this.b.b.w0() || !this.b.b.v0()){
          this.b.b.b0();
       }else {
          a.o(p0, "progress");
          this.b.b.E().g(p0.floatValue());
          this.b.b.y0();
          c uoc = this.b.b.D();
          float f = p0.floatValue();
          SidebarProgressElement$d b = this.b.b;
          SidebarProgressElement n = b.N;
          SidebarProgressElement m = b.M;
          Objects.requireNonNull(uoc);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f), Boolean.valueOf(n), Boolean.valueOf(m), Boolean.FALSE, uoc, c.class, "6")) {
             c$a uoa = new c$a();
             uoa.a = f;
             uoa.c = n;
             uoa.b = m;
             uoa.d = false;
             uoc.a.onNext(uoa);
          }
          if (p0.floatValue() - (float)1 < 0) {
             this.b.b.c0();
             this.b.b.E().j(1);
          }else {
             this.b.b.b0();
             this.b.b.E().j(false);
          }
       }
       return;
    }
}
