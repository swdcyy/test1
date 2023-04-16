package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$c;
import erd.g;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vq4.d;

public final class HbBaseProtocol$c implements g	// class@0014e4
{
    public final HbBaseProtocol b;
    public final Integer c;
    public final g d;
    public final BaseFeed e;
    public final String f;

    public void HbBaseProtocol$c(HbBaseProtocol p0,Integer p1,g p2,BaseFeed p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HbBaseProtocol$c.class, "1")) {
       }else {
          c f = p0.F;
          HbBaseProtocol$c tc = this.c;
          int i = (tc != null)? tc.intValue(): 0;
          f.w1 = i;
          HbBaseProtocol$c td = this.d;
          if (td != null) {
             td.accept(p0);
          }
          PatchProxy.onMethodExit(HbBaseProtocol$c.class, "1");
       }
       return;
    }
}
