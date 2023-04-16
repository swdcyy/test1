package com.facebook.react.modules.network.g;
import okhttp3.RequestBody;
import qe.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import okhttp3.MediaType;
import okio.c;
import okio.m;
import com.facebook.react.modules.network.f;
import java.io.OutputStream;
import okio.l;
import cud.j;

public class g extends RequestBody	// class@0012d7
{
    public final RequestBody a;
    public final f b;
    public long c;

    public void g(RequestBody p0,f p1){
       super();
       this.c = 0;
       this.a = p0;
       this.b = p1;
    }
    public long contentLength(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.c) {
          this.c = this.a.contentLength();
       }
       return this.c;
    }
    public MediaType contentType(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.contentType();
    }
    public void writeTo(c p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "3")) {
          return;
       }
       m om = PatchProxy.applyOneRefs(p0, this, og, "4");
       if (om != PatchProxyResult.class) {
       }else {
          om = l.g(new f(this, p0.outputStream()));
       }
       p0 = l.c(om);
       this.contentLength();
       this.a.writeTo(p0);
       p0.flush();
       return;
    }
}
