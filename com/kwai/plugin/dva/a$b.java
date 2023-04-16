package com.kwai.plugin.dva.a$b;
import java.lang.Object;
import com.kwai.plugin.dva.a$a;
import com.kwai.plugin.dva.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qj7.c;
import mj7.a;
import mj7.c;
import com.kwai.plugin.dva.install.remote.download.c;
import oj7.d;

public final class a$b	// class@000e56
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

    public void a$b(){
       super();
       this.g = true;
       this.h = true;
       this.i = true;
    }
    public void a$b(a$a p0){
       super();
       this.g = true;
       this.h = true;
       this.i = true;
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
       return obj;
    }
    public a$b b(boolean p0){
       this.h = p0;
       return this;
    }
    public a$b c(boolean p0){
       this.g = p0;
       return this;
    }
    public a$b d(boolean p0){
       this.i = p0;
       return this;
    }
    public a$b e(c p0){
       this.d = p0;
       return this;
    }
    public a$b f(a p0){
       this.b = p0;
       return this;
    }
    public a$b g(c p0){
       this.c = p0;
       return this;
    }
    public a$b h(c p0){
       this.a = p0;
       return this;
    }
    public a$b i(d p0){
       this.e = p0;
       return this;
    }
}
