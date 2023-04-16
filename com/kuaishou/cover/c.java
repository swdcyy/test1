package com.kuaishou.cover.c;
import com.kuaishou.cover.c$a;
import java.lang.Object;
import java.util.Map;
import a30.b;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c	// class@0016d6
{
    public long a;
    public MaterialDataItem b;
    public String c;
    public Map d;
    public int e;
    public b f;
    public Window g;
    public e h;

    public void c(c$a p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
    }
    public Map a(){
       return this.d;
    }
    public b b(){
       return this.f;
    }
    public MaterialDataItem c(){
       return this.b;
    }
    public long d(){
       return this.a;
    }
    public String e(){
       return this.c;
    }
    public void f(int p0){
       this.e = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LinkLoaderParams{materialId="+this.a+", material="+this.b+", url=\'"+this.c+'''+", customMap="+this.d+'}';
    }
}
