package com.kwai.sharelib.apiservice.KsDefaultMgr$Companion$readFromJsonStr$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.io.InputStream;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.ByteArrayInputStream;
import zsd.d;
import java.util.Objects;
import java.nio.charset.Charset;
import kotlin.jvm.internal.a;

public final class KsDefaultMgr$Companion$readFromJsonStr$1 extends Lambda implements a	// class@0016b6
{
    public final String $json;

    public void KsDefaultMgr$Companion$readFromJsonStr$1(String p0){
       this.$json = p0;
       super(0);
    }
    public final InputStream invoke(){
       Object obj = PatchProxy.apply(null, this, KsDefaultMgr$Companion$readFromJsonStr$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KsDefaultMgr$Companion$readFromJsonStr$1 t$json = this.$json;
       Objects.requireNonNull(t$json, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = t$json.getBytes(d.a);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return new ByteArrayInputStream(bytes);
    }
    public Object invoke(){
       return this.invoke();
    }
}
