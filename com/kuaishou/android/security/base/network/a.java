package com.kuaishou.android.security.base.network.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a extends Enum	// class@000eea
{
    public String a;
    public static final a b;
    public static final a c;
    public static final a[] d;

    static {
       a uoa = new a("POST", 0, "POST");
       a.b = uoa;
       a uoa1 = new a("GET", 1, "GET");
       a.c = uoa1;
       a[] uoaArray = new a[]{uoa,uoa1};
       a.d = uoaArray;
    }
    public void a(String p0,int p1,String p2){
       this.a = p2;
    }
    public static a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(a.class, p0);
    }
    public static a[] values(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d.clone();
    }
    public String a(){
       return this.a;
    }
}
