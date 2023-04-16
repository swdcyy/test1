package com.kuaishou.android.security.base.perf.e$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class e$a extends Enum	// class@000efd
{
    public final int a;
    public static final e$a b;
    public static final e$a c;
    public static final e$a d;
    public static final e$a[] e;

    static {
       e$a uoa = new e$a("RATIO", 0, 0);
       e$a.b = uoa;
       e$a uoa1 = new e$a("FULL", 1, 1);
       e$a.c = uoa1;
       e$a uoa2 = new e$a("IGNORE", 2, 2);
       e$a.d = uoa2;
       e$a[] uoaArray = new e$a[]{uoa,uoa1,uoa2};
       e$a.e = uoaArray;
    }
    public void e$a(String p0,int p1,int p2){
       this.a = p2;
    }
    public static e$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(e$a.class, p0);
    }
    public static e$a[] values(){
       Object obj = PatchProxy.apply(null, null, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e$a.e.clone();
    }
    public int a(){
       return this.a;
    }
}
