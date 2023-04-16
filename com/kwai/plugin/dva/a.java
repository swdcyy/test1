package com.kwai.plugin.dva.a;
import qj7.c;
import mj7.a;
import mj7.c;
import com.kwai.plugin.dva.install.remote.download.c;
import oj7.d;
import com.kwai.plugin.dva.a$a;
import java.lang.Object;
import com.kwai.plugin.dva.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a	// class@000e57
{
    public c a;
    public a b;
    public c c;
    public c d;
    public d e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;

    public void a(c p0,a p1,c p2,c p3,d p4,long p5,boolean p6,boolean p7,boolean p8,a$a p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public static a$b a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b(null);
    }
}
