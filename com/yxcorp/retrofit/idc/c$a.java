package com.yxcorp.retrofit.idc.c$a;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCStorage$DefaultHostsReader;
import com.yxcorp.retrofit.idc.c;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import jjd.a;
import java.lang.StringBuilder;
import mjd.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import jjd.b;
import java.util.Collections;

public class c$a implements KwaiDefaultIDCStorage$DefaultHostsReader	// class@0013d2
{
    public HashMap a;
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public Map readDefaultHosts(){
       String str1;
       List list;
       c$a tb = this.b;
       this.a = new HashMap();
       Iterator iterator = this.b.e.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          a uoa = this.b.e.get(str);
          str1 = "IDCDefaultHostsReader";
          if (uoa == null) {
             a.b(str1, "routeType model is null, name =  "+str);
          }else {
             list = uoa.b();
             if (q.f(list)) {
                continue ;
             }else {
                this.a.put(str, list);
                String str2 = uoa.d();
                if (!str2.equals(str)) {
                   a.b(str1, "serializeName doesn\'t match routerName. serializeName: "+str2+", routeName: "+str);
                   this.a.put(str2, list);
                }
             }
          }
       }
       c$a ta = this.a;
       Objects.requireNonNull(tb);
       HashMap hashMap = new HashMap();
       Iterator iterator1 = ta.keySet().iterator();
       while (iterator1.hasNext()) {
          str1 = iterator1.next();
          a uoa1 = tb.e.get(str1);
          boolean b = (uoa1 != null && uoa1.c().isDefaultHttps())? true: false;
          list = tb.m(ta, str1, b);
          if (!q.f(list)) {
             hashMap.put(str1, list);
          }
       }
       Iterator iterator2 = hashMap.values().iterator();
       while (iterator2.hasNext()) {
          Collections.shuffle(iterator2.next());
       }
       return hashMap;
    }
}
