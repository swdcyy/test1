package com.kuaishou.android.security.base.network.d$b;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.kuaishou.android.security.base.network.d;
import com.kuaishou.android.security.base.network.d$a;

public class d$b	// class@000ef2
{
    public String a;
    public Map b;

    public void d$b(String p0){
       this.a = p0;
    }
    public void d$b(String p0,Map p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public d$b a(String p0){
       this.a = p0;
       return this;
    }
    public d$b a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new HashMap();
       }
       this.b.put(p0, p1);
       return this;
    }
    public d$b a(Map p0){
       this.b = p0;
       return this;
    }
    public d a(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d(objArray);
       d.a(obj, this.a);
       d.a(obj, this.b);
       return obj;
    }
}
