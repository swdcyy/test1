package com.kuaishou.pagedy.request.d;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.pagedy.request.PreReqInfo;
import java.util.Objects;
import com.kuaishou.pagedy.request.a;
import com.kuaishou.pagedy.util.PageDyUtil;
import java.util.Set;
import java.util.Iterator;

public class d	// class@000a9c
{
    public Map a;
    public Map b;
    public static final d c;

    static {
       d.c = new d();
    }
    public void d(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public static d a(){
       return d.c;
    }
    public final boolean b(String p0,Map p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       PreReqInfo preReqInfo = this.a.get(p0);
       boolean b = true;
       if (preReqInfo != null) {
          preReqInfo = preReqInfo.a;
          Objects.requireNonNull(preReqInfo);
          String obj1 = PatchProxy.applyOneRefs(p1, preReqInfo, a.class, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(preReqInfo.i == null){
             Map map = PageDyUtil.b(preReqInfo.h);
             p1 = PageDyUtil.b(p1);
             Iterator iterator = map.keySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (p1.containsKey(obj1) && !(p1.get(obj1)).equalsIgnoreCase(map.get(obj1))) {
                      b1 = false;
                      break ;
                   }
                }
             }
          }
          b1 = true;
          if (b1) {
          label_0076 :
             return b;
          }
       }
       b = false;
       goto label_0076 ;
    }
}
