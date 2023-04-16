package com.kuaishou.pagedy.request.a$a;
import java.lang.Object;
import com.kuaishou.pagedy.request.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.pagedy.request.a$b;

public final class a$a	// class@000a97
{
    public long a;
    public long b;
    public String c;
    public String d;
    public Map e;
    public boolean f;
    public a$b g;
    public long h;
    public boolean i;

    public void a$a(){
       super();
       this.a = -1;
       this.b = -1;
       this.d = "";
       this.f = false;
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public a$a b(long p0){
       this.h = p0;
       return this;
    }
    public a$a c(long p0){
       this.a = p0;
       return this;
    }
    public a$a d(boolean p0){
       this.i = p0;
       return this;
    }
    public a$a e(String p0){
       this.d = p0;
       return this;
    }
    public a$a f(Map p0){
       this.e = p0;
       return this;
    }
    public a$a g(String p0){
       this.c = p0;
       return this;
    }
    public a$a h(a$b p0){
       this.g = p0;
       return this;
    }
    public a$a i(boolean p0){
       this.f = p0;
       return this;
    }
}
