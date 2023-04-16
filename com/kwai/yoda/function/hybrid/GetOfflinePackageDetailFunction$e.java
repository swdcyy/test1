package com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$e;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import rb7.c;
import gz7.n0;
import com.kwai.yoda.bridge.YodaException;

public final class GetOfflinePackageDetailFunction$e implements o	// class@0011d7
{
    public static final GetOfflinePackageDetailFunction$e b;

    static {
       GetOfflinePackageDetailFunction$e.b = new GetOfflinePackageDetailFunction$e();
    }
    public void GetOfflinePackageDetailFunction$e(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, GetOfflinePackageDetailFunction$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          if (p0.booleanValue()) {
             ot = c.c.b(n0.class);
          }else {
             throw new YodaException(0x1e84f, "Call this bridge too frequently");
          }
       }
       return ot;
    }
}
