package com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;

public final class KLinkHttp$KlinkHttpPayload$Method$b implements Internal$EnumVerifier	// class@0015f1
{
    public static final Internal$EnumVerifier a;

    static {
       KLinkHttp$KlinkHttpPayload$Method$b.a = new KLinkHttp$KlinkHttpPayload$Method$b();
    }
    public void KLinkHttp$KlinkHttpPayload$Method$b(){
       super();
    }
    public boolean isInRange(int p0){
       KLinkHttp$KlinkHttpPayload$Method$b klinkHttpPay = KLinkHttp$KlinkHttpPayload$Method$b.class;
       if (PatchProxy.isSupport(klinkHttpPay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, klinkHttpPay, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (KLinkHttp$KlinkHttpPayload$Method.forNumber(p0) != null)? true: false;
       return b;
    }
}
