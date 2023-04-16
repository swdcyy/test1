package com.kwai.tokenshare.KwaiTokenInitModule$a;
import t7c.a;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import com.kwai.feature.api.qrcode.model.ScanParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.kwaitoken.KwaiToken;

public class KwaiTokenInitModule$a implements a	// class@001915
{
    public final KwaiTokenInitModule a;

    public void KwaiTokenInitModule$a(KwaiTokenInitModule p0){
       this.a = p0;
       super();
    }
    public boolean a(ScanParam p0){
       p0 = PatchProxy.applyOneRefs(p0, this, KwaiTokenInitModule$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       KwaiToken.k().H();
       return false;
    }
    public String b(){
       return "updateTokenRegex";
    }
}
