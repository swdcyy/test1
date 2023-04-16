package com.kwai.sharelib.a$n;
import erd.a;
import com.kwai.sharelib.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uo7.k;
import uo7.d0;
import com.kwai.sharelib.KsShareApi;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.HashSet;

public final class a$n implements a	// class@0016b1
{
    public final a b;
    public final String c;

    public void a$n(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$n.class, "1")) {
          return;
       }
       a$n tb = this.b;
       tb.g.J = objArray;
       tb.a.a();
       KsShareApi s = KsShareApi.s;
       a$n tc = this.c;
       Objects.requireNonNull(s);
       Object obj = PatchProxy.applyOneRefs(tc, s, KsShareApi.class, "23");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else {
          a.p(tc, "scene");
          s.l().remove(tc);
       }
       return;
    }
}
