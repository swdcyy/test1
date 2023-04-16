package com.kwai.framework.krn.init.preload.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.lang.reflect.Type;
import java.lang.String;
import java.util.ArrayList;
import el.a;
import com.kwai.sdk.switchconfig.a;
import java.util.Collections;
import c96.a;
import java.lang.Throwable;
import a96.i;
import io7.a;
import com.kwai.framework.krn.init.preload.b$a;
import com.kwai.framework.krn.init.preload.b$b;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.krn.init.preload.a;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import ekd.q;
import com.kwai.framework.krn.init.preload.b$c;
import com.kuaishou.krn.c;
import com.kuaishou.aegon.Aegon;

public final class b	// class@001600
{
    public ConcurrentHashMap a;
    public ConcurrentHashMap b;

    public void b(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       Type[] typeArray = new Type[]{String.class,ArrayList.class};
       Type type = a.getParameterized(Map.class, typeArray).getType();
       try{
          this.a.clear();
          this.a.putAll(a.t().getValue("KrnPreconnectConfigMapKey", type, Collections.emptyMap()));
       }catch(java.lang.Exception e2){
          a.D().C("KrnNetwork", e2);
       }
       a.t().p("KrnPreconnectConfigMapKey", new i(this, type));
       return;
    }
    public void b(b$a p0){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       Type[] typeArray = new Type[]{String.class,ArrayList.class};
       Type type = a.getParameterized(Map.class, typeArray).getType();
       try{
          this.a.clear();
          this.a.putAll(a.t().getValue("KrnPreconnectConfigMapKey", type, Collections.emptyMap()));
       }catch(java.lang.Exception e1){
          a.D().C("KrnNetwork", e1);
       }
       a.t().p("KrnPreconnectConfigMapKey", new i(this, type));
       return;
    }
    public static b a(){
       return b$b.a;
    }
    public void b(LaunchModel p0){
       Collection uCollection;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       String[] stringArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          a.M().c0(-1002, "total", "tryPreConnect model=null");
          Object[] objArray = new Object[i];
          a.D().t("KrnNetwork", "tryPreConnect model=null", objArray);
          return;
       }else {
          String str = p0.a();
          if (a.M().W(p0)) {
             p0 = PatchProxy.applyOneRefs(str, this, uob, "5");
             if (p0 != patchProxyRe) {
             }else {
                b ta = this.a;
                Map$Entry obj = PatchProxy.applyTwoRefs(str, ta, this, uob, "6");
                if (obj != patchProxyRe) {
                   uCollection = obj;
                }else {
                   try{
                      uArrayList = new ArrayList();
                      if (!TextUtils.x(str)) {
                         uArrayList1 = ta.get(str);
                         if (uArrayList1 != null) {
                            uArrayList.addAll(uArrayList1);
                         }
                      }else {
                         Iterator iterator = ta.entrySet().iterator();
                         while (iterator.hasNext()) {
                            obj = iterator.next();
                            Object[] objArray1 = new Object[i];
                            a.D().w("KrnNetwork", obj.getKey()+":"+obj.getValue(), objArray1);
                            uArrayList.addAll(obj.getValue());
                         }
                      }
                   }catch(java.lang.Exception e8){
                      a.D().C("KrnNetwork", e8);
                   }
                   uCollection = uArrayList;
                }
             }
             a.M().F("检测到需要优先使用KSwtich的预连接配置");
             if (q.f(p0)) {
                a.M().E("\x27\x02 KSwtich\x6c\x02\x67\x02\x98\x02\x8f\x02\x63\x02\x91\x02\x7f\x02\x00");
             }else {
                a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02KSwtich\x76\x02\x98\x02\x8f\x02\x63\x02\x91\x02\x7f\x02\x00");
             }
          }else {
             p0 = PatchProxy.applyOneRefs(str, this, uob, "4");
             if (p0 != patchProxyRe) {
             }else {
                try{
                   uArrayList1 = new ArrayList();
                   if (!TextUtils.x(str)) {
                      b$c uoc = this.b.get(str);
                      if (uoc != null && a.M().T(uoc.c, uoc.b)) {
                         uoc = uoc.a;
                         if (uoc != null) {
                            uArrayList1.addAll(uoc);
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                   a.D().C("KrnNetwork", e0);
                }
             }
          }
       label_01aa :
          return;
       }
    }
}
