package com.kuaishou.android.security.base.perf.e$b;
import java.lang.Enum;
import com.kuaishou.android.security.base.perf.e$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class e$b extends Enum	// class@000efe
{
    public final int a;
    public final e$a b;
    public static final e$b c;
    public static final e$b d;
    public static final e$b e;
    public static final e$b f;
    public static final e$b g;
    public static final e$b h;
    public static final e$b[] i;

    static {
       e$a c = e$a.c;
       e$b uob = new e$b("KSG_INITFAILURE", 0, 0, c);
       e$b.c = uob;
       e$b uob1 = new e$b("KSG_INITSUCCESS", 1, 1);
       e$b.d = uob1;
       e$b uob2 = new e$b("KSG_PREFWATCH", 2, 2, e$a.b);
       e$b.e = uob2;
       e$b uob3 = new e$b("KSG_EXCEPTION", 3, 3, c);
       e$b.f = uob3;
       e$b uob4 = new e$b("KSG_LOADSOFAIL", 4, 4, c);
       e$b.g = uob4;
       e$b uob5 = new e$b("KSG_LITE", 5, 5, c);
       e$b.h = uob5;
       e$b[] uobArray = new e$b[]{uob,uob1,uob2,uob3,uob4,uob5};
       e$b.i = uobArray;
    }
    public void e$b(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
       this.b = e$a.d;
    }
    public void e$b(String p0,int p1,int p2,e$a p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static e$b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(e$b.class, p0);
    }
    public static e$b[] values(){
       Object obj = PatchProxy.apply(null, null, e$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e$b.i.clone();
    }
    public e$a a(){
       return this.b;
    }
    public int b(){
       return this.a;
    }
}
