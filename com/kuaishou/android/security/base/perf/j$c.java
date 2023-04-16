package com.kuaishou.android.security.base.perf.j$c;
import java.lang.Enum;
import com.kuaishou.android.security.base.perf.j$c$a;
import java.lang.String;
import com.kuaishou.android.security.base.perf.j$c$b;
import com.kuaishou.android.security.base.perf.j$c$c;
import com.kuaishou.android.security.base.perf.j$c$d;
import com.kuaishou.android.security.base.perf.j$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class j$c extends Enum	// class@000f0c
{
    public static final j$c a;
    public static final j$c b;
    public static final j$c c;
    public static final j$c d;
    public static final j$c[] e;

    static {
       j$c$a uoc$a = new j$c$a("UNSTARTED", 0);
       j$c.a = uoc$a;
       j$c$b uoc$b = new j$c$b("RUNNING", 1);
       j$c.b = uoc$b;
       j$c$c uoc$c = new j$c$c("STOPPED", 2);
       j$c.c = uoc$c;
       j$c$d uoc$d = new j$c$d("SUSPENDED", 3);
       j$c.d = uoc$d;
       j$c[] uocArray = new j$c[]{uoc$a,uoc$b,uoc$c,uoc$d};
       j$c.e = uocArray;
    }
    public void j$c(String p0,int p1){
       super(p0, p1);
    }
    public void j$c(String p0,int p1,j$a p2){
       super(p0, p1);
    }
    public static j$c a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(j$c.class, p0);
    }
    public static j$c[] values(){
       Object obj = PatchProxy.apply(null, null, j$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j$c.e.clone();
    }
    public abstract boolean a();
    public abstract boolean b();
    public abstract boolean c();
}
