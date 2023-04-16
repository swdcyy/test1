package com.facebook.react.modules.network.h;
import okio.g;
import qe.g;
import okio.n;
import okio.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import okhttp3.ResponseBody;
import qe.f;

public class h extends g	// class@0012d8
{
    public final g b;

    public void h(g p0,n p1){
       this.b = p0;
       super(p1);
    }
    public long read(b p0,long p1){
       g obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, h.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = super.read(p0, p1);
       h tb = this.b;
       obj = tb.e;
       long l1 = (v4 = l - -1)? l: 0;
       long l2 = obj + l1;
       tb.e = l2;
       g c = tb.c;
       long l3 = tb.b.contentLength();
       boolean b = (!v4)? true: false;
       c.a(l2, l3, b);
       return l;
    }
}
