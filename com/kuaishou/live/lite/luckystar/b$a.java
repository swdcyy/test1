package com.kuaishou.live.lite.luckystar.b$a;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b$a	// class@000a32
{
    public int a;
    public CDNUrl[] b;
    public CDNUrl[] c;
    public long d;
    public String e;

    public void b$a(String p0,int p1,CDNUrl[] p2,CDNUrl[] p3,long p4){
       super();
       this.a = 0;
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public static b$a a(){
       Object obj = PatchProxy.apply(null, null, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b$a uoa = new b$a("", 0, null, null, 0);
       return obj;
    }
}
