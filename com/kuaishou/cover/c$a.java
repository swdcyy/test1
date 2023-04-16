package com.kuaishou.cover.c$a;
import java.lang.Object;
import com.kuaishou.cover.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import a30.b;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;

public final class c$a	// class@0016d5
{
    public long a;
    public MaterialDataItem b;
    public String c;
    public Map d;
    public int e;
    public b f;
    public Window g;
    public e h;

    public void c$a(){
       super();
    }
    public c a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public c$a b(Map p0){
       this.d = p0;
       return this;
    }
    public c$a c(b p0){
       this.f = p0;
       return this;
    }
    public c$a d(MaterialDataItem p0){
       this.b = p0;
       return this;
    }
    public c$a e(long p0){
       this.a = p0;
       return this;
    }
    public c$a f(String p0){
       this.c = p0;
       return this;
    }
}
