package com.kuaishou.android.security.base.perf.d$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class d$b extends Enum	// class@000efb
{
    public static final d$b a;
    public static final d$b b;
    public static final d$b c;
    public static final d$b d;
    public static final d$b e;
    public static final d$b f;
    public static final d$b[] g;

    static {
       d$b uob = new d$b("ALL", 0);
       d$b.a = uob;
       d$b uob1 = new d$b("CBACK_REPORT", 1);
       d$b.b = uob1;
       d$b uob2 = new d$b("CBACK_ONERROR", 2);
       d$b.c = uob2;
       d$b uob3 = new d$b("CBACK_R_E", 3);
       d$b.d = uob3;
       d$b uob4 = new d$b("S_PERF", 4);
       d$b.e = uob4;
       d$b uob5 = new d$b("S_PERF_LITE", 5);
       d$b.f = uob5;
       d$b[] uobArray = new d$b[]{uob,uob1,uob2,uob3,uob4,uob5};
       d$b.g = uobArray;
    }
    public void d$b(String p0,int p1){
       super(p0, p1);
    }
    public static d$b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(d$b.class, p0);
    }
    public static d$b[] values(){
       Object obj = PatchProxy.apply(null, null, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d$b.g.clone();
    }
}
