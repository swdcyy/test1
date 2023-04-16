package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$d;
import erd.o;
import erd.g;
import java.lang.Object;
import mxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class HbBaseProtocol$d implements o	// class@0014e5
{
    public final g b;

    public void HbBaseProtocol$d(g p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, HbBaseProtocol$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0.a(this.b);
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
