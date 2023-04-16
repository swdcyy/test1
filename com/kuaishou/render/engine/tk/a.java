package com.kuaishou.render.engine.tk.a;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.render.engine.tk.TKContainerManager$1;
import com.kuaishou.render.engine.tk.a$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import nv.c;

public class a	// class@000ef4
{
    public Map a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public void a(TKContainerManager$1 p0){
       super();
       this.a = new HashMap();
    }
    public static a b(){
       return a$a.a;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       Map map = this.a.remove(p0);
       if (map == null) {
          return;
       }
       Iterator iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          c.f("-----clearPageContainer----"+uEntry.getKey()+uEntry.getValue());
       }
       return;
    }
}
