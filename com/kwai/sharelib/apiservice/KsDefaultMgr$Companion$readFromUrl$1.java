package com.kwai.sharelib.apiservice.KsDefaultMgr$Companion$readFromUrl$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.io.InputStream;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.net.URL;

public final class KsDefaultMgr$Companion$readFromUrl$1 extends Lambda implements a	// class@0016b7
{
    public final String $url;

    public void KsDefaultMgr$Companion$readFromUrl$1(String p0){
       this.$url = p0;
       super(0);
    }
    public final InputStream invoke(){
       Object obj = PatchProxy.apply(null, this, KsDefaultMgr$Companion$readFromUrl$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new URL(this.$url).openStream();
    }
    public Object invoke(){
       return this.invoke();
    }
}
