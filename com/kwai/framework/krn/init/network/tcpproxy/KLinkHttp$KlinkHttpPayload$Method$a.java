package com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method$a;
import com.google.protobuf.Internal$EnumLiteMap;
import java.lang.Object;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;

public class KLinkHttp$KlinkHttpPayload$Method$a implements Internal$EnumLiteMap	// class@0015f0
{

    public void KLinkHttp$KlinkHttpPayload$Method$a(){
       super();
    }
    public Internal$EnumLite findValueByNumber(int p0){
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay1;
       KLinkHttp$KlinkHttpPayload$Method$a klinkHttpPay = KLinkHttp$KlinkHttpPayload$Method$a.class;
       if (PatchProxy.isSupport(klinkHttpPay)) {
          klinkHttpPay1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, klinkHttpPay, "1");
          if (klinkHttpPay1 != PatchProxyResult.class) {
          label_001d :
             return klinkHttpPay1;
          }
       }
       klinkHttpPay1 = KLinkHttp$KlinkHttpPayload$Method.forNumber(p0);
       goto label_001d ;
    }
}
