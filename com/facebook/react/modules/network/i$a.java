package com.facebook.react.modules.network.i$a;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import java.io.InputStream;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import okio.c;
import okio.n;
import okio.l;
import java.io.Closeable;
import okhttp3.internal.Util;

public final class i$a extends RequestBody	// class@0012d9
{
    public final MediaType a;
    public final InputStream b;

    public void i$a(MediaType p0,InputStream p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public long contentLength(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return (long)this.b.available();
       }catch(java.io.IOException e0){
          return 0;
       }
    }
    public MediaType contentType(){
       return this.a;
    }
    public void writeTo(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       n on = l.k(this.b);
       p0.x1(on);
       Util.closeQuietly(on);
       return;
    }
}
