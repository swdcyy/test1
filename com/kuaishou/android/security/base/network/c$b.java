package com.kuaishou.android.security.base.network.c$b;
import javax.net.ssl.HostnameVerifier;
import java.lang.Object;
import java.lang.String;
import javax.net.ssl.SSLSession;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class c$b implements HostnameVerifier	// class@000eee
{

    public void c$b(){
       super();
    }
    public boolean verify(String p0,SSLSession p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c$b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       if (("zt-drm.test.gifshow.com").equals(p0) || ("zt-basic-drm.kuaishou.com").equals(p0)) {
          return true;
       }
       return false;
    }
}
