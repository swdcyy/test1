package com.kuaishou.live.ad.social.t$b;
import java.lang.Object;
import com.kuaishou.live.ad.social.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.ad.social.t$a;

public class t$b	// class@000a23
{
    public long a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public long f;
    public int g;

    public void t$b(){
       super();
       this.c = "";
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, t$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = new t(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
       return obj;
    }
    public t$b b(String p0){
       this.d = p0;
       return this;
    }
    public t$b c(long p0){
       this.a = p0;
       return this;
    }
    public t$b d(String p0){
       this.e = p0;
       return this;
    }
    public t$b e(boolean p0){
       this.b = p0;
       return this;
    }
    public t$b f(String p0){
       this.c = p0;
       return this;
    }
    public t$b g(long p0){
       this.f = p0;
       return this;
    }
}
