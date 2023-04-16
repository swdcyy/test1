package com.kuaishou.live.core.show.quiz.manager.d;
import com.kuaishou.live.core.show.quiz.manager.d$a;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.live.core.show.quiz.manager.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.live.core.show.quiz.manager.b;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.quiz.manager.a$a;
import com.kuaishou.live.core.show.quiz.manager.c;

public class d	// class@000e12
{
    public Map a;
    public Map b;
    public d$a c;

    public void d(d$a p0){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = p0;
    }
    public a a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.a.containsKey(Integer.valueOf(p0))) {
          this.a.put(Integer.valueOf(p0), new a(new b(this), false, "current questionNumber ="+p0+", "));
       }
       return this.a.get(Integer.valueOf(p0));
    }
    public a b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.b.containsKey(Integer.valueOf(p0))) {
          this.b.put(Integer.valueOf(p0), new a(new c(this), false, "current questionNumber ="+p0+", "));
       }
       return this.b.get(Integer.valueOf(p0));
    }
}
