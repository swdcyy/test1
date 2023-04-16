package com.kuaishou.live.ad.social.t;
import java.lang.String;
import com.kuaishou.live.ad.social.t$a;
import java.lang.Object;
import com.kuaishou.live.ad.social.t$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class t	// class@000a24
{
    public final long a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public int g;

    public void t(long p0,boolean p1,String p2,String p3,String p4,long p5,int p6,t$a p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public static t$b a(){
       Object obj = PatchProxy.apply(null, null, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new t$b();
    }
}
