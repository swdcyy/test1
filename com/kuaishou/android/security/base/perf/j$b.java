package com.kuaishou.android.security.base.perf.j$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class j$b extends Enum	// class@000f07
{
    public static final j$b a;
    public static final j$b b;
    public static final j$b[] c;

    static {
       j$b uob = new j$b("SPLIT", 0);
       j$b.a = uob;
       j$b uob1 = new j$b("UNSPLIT", 1);
       j$b.b = uob1;
       j$b[] uobArray = new j$b[]{uob,uob1};
       j$b.c = uobArray;
    }
    public void j$b(String p0,int p1){
       super(p0, p1);
    }
    public static j$b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(j$b.class, p0);
    }
    public static j$b[] values(){
       Object obj = PatchProxy.apply(null, null, j$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j$b.c.clone();
    }
}
