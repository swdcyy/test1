package com.kwai.sharelib.KsShareDataEngine$c;
import erd.o;
import com.kwai.sharelib.KsShareDataEngine;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import uo7.q;

public final class KsShareDataEngine$c implements o	// class@001698
{
    public final KsShareDataEngine b;

    public void KsShareDataEngine$c(KsShareDataEngine p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ShareAnyResponse shareAnyResp = PatchProxy.applyOneRefs(p0, this, KsShareDataEngine$c.class, "1");
       if (shareAnyResp != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          q oq = this.b.a();
          if (oq != null) {
             shareAnyResp = oq.b(p0);
             if (shareAnyResp != null) {
                p0 = shareAnyResp;
             }
          }
          shareAnyResp = p0;
       }
       return shareAnyResp;
    }
}
