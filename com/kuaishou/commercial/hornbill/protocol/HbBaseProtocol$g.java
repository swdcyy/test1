package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class HbBaseProtocol$g implements g	// class@0014e9
{
    public static final HbBaseProtocol$g b;

    static {
       HbBaseProtocol$g.b = new HbBaseProtocol$g();
    }
    public void HbBaseProtocol$g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HbBaseProtocol$g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.c("ad_hornbill", "performInject by "+p0.getMessage(), objArray);
       }
       return;
    }
}
