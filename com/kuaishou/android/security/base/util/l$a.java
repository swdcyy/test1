package com.kuaishou.android.security.base.util.l$a;
import java.lang.reflect.InvocationHandler;
import com.kuaishou.android.security.base.util.l;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class l$a implements InvocationHandler	// class@000f26
{
    public final boolean a;
    public final l b;

    public void l$a(l p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, l$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = p1.getName();
       try{
          return l.a(l.a(this.b)).a(p0, p2).c();
       }catch(com.kuaishou.android.security.base.util.l$c e8){
          if (this.a != null) {
             Map map = l.a(this.b);
             String str = (p2 == null)? null: p2.length;
             if (!str && p0.startsWith("get")) {
                return map.get(l.a(p0.substring(3)));
             }else if(!str && p0.startsWith("is")){
                return map.get(l.a(p0.substring(2)));
             }else if(str == 1 && p0.startsWith("set")){
                map.put(l.a(p0.substring(3)), p2[0]);
                return null;
             }
          }
       label_0085 :
          throw e8;
       }
    }
}
