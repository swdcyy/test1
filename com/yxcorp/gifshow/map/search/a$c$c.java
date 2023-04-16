package com.yxcorp.gifshow.map.search.a$c$c;
import s2b.a;
import java.lang.Object;
import g3d.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import com.kuaishou.android.model.mix.Location;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.google.gson.Gson;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Boolean;

public final class a$c$c implements a	// class@001cd5
{
    public final a a;

    public void a$c$c(){
       super();
       this.a = new a();
    }
    public void a(List p0){
       String str;
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c$c.class, "1")) {
          return;
       }
       a.p(p0, "list");
       a$c$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "7") && p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Location location = iterator.next();
             if (!PatchProxy.applyVoidOneRefs(location, ta, a.class, "8") && location != null) {
                str = "POI_SEARCH_LIST";
                str1 = PatchProxy.applyOneRefs(location, ta, a.class, "3");
                if (str1 != PatchProxyResult.class) {
                }else {
                   HashMap hashMap = new HashMap();
                   hashMap.put("city", location.getCity());
                   hashMap.put("latitude", String.valueOf(location.getLatitude()));
                   hashMap.put("longitude", String.valueOf(location.getLongitude()));
                   hashMap.put("title", location.getTitle());
                   hashMap.put("address", location.getAddress());
                   hashMap.put("id", String.valueOf(location.getId()));
                   str1 = ta.a.q(hashMap);
                }
                if (PatchProxy.applyVoidTwoRefs(str, str1, ta, a.class, "9")) {
                   continue ;
                }
             }
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = ta.a(str, str1);
             showEvent.showType = 0;
             b.a(0x4b316083).h(showEvent);
          }
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c$c.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "location");
          int i = p0.showed ^ 1;
          if (i) {
             p0.showed = true;
          }
          b = i;
       }
       return b;
    }
}
