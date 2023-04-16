package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$e;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class HbBaseProtocol$e implements g	// class@0014e6
{
    public final int b;
    public final int c;
    public final g d;

    public void HbBaseProtocol$e(int p0,int p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HbBaseProtocol$e.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          c f = p0.F;
          f.b = this.b;
          f.w1 = this.c;
          HbBaseProtocol$e td = this.d;
          if (td != null) {
             td.accept(p0);
          }
       }
       return;
    }
}
