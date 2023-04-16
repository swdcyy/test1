package b71.b;
import b71.a;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarConfig;
import java.util.Map;
import c71.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import c71.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Integer;
import z61.g;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarItem;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z61.b;

public class b implements a	// class@00031d
{
    public final Map a;

    public void b(LiveBottomServerConfig$BottomBarConfig p0,Map p1){
       boolean b;
       g og;
       Iterator iterator1;
       Integer integer;
       Integer integer1;
       Iterator iterator4;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       b uob = b.class;
       String str = "1";
       HashMap hashMap = PatchProxy.applyTwoRefs(p0, p1, null, uob, str);
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          Integer obj = PatchProxy.applyOneRefs(p0, null, uob, "2");
          if (obj != patchProxyRe) {
          }else if(p0 == null){
             obj = null;
          }else {
             obj = new HashMap();
             if (!q.f(p0.mLeftBottomBarListItems)) {
                Iterator iterator5 = p0.mLeftBottomBarListItems.iterator();
                while (iterator5.hasNext()) {
                   List list = iterator5.next();
                   if (!q.f(list)) {
                      Map map = b.a(list);
                      if (!q.h(map)) {
                         obj.putAll(map);
                      }
                   }
                }
             }
             if (!q.f(p0.mRightBottomBarListItems)) {
                iterator4 = p0.mRightBottomBarListItems.iterator();
                while (iterator4.hasNext()) {
                   List list1 = iterator4.next();
                   if (!q.f(list1)) {
                      obj.putAll(b.a(list1));
                   }
                }
             }
          }
          if (!q.h(obj)) {
             hashMap.putAll(obj);
          }
          if (!q.h(p1)) {
             iterator4 = p1.entrySet().iterator();
             while (iterator4.hasNext()) {
                Map$Entry uEntry1 = iterator4.next();
                obj = uEntry1.getKey();
                Set value = uEntry1.getValue();
                if (obj == null || q.f(value)) {
                   continue ;
                }else {
                   Set set = hashMap.get(obj);
                   if (set == null) {
                      hashMap.put(obj, value);
                   }else {
                      set.addAll(value);
                   }
                }
             }
          }
       }
       HashMap hashMap1 = PatchProxy.applyOneRefs(hashMap, null, uoa, "4");
       if (hashMap1 != patchProxyRe) {
       }else {
          hashMap1 = new HashMap();
          Iterator iterator3 = hashMap.entrySet().iterator();
          while (iterator3.hasNext()) {
             Map$Entry uEntry = iterator3.next();
             integer = uEntry.getKey();
             g og1 = hashMap1.get(integer);
             if (og1 == null) {
                og1 = new g(integer);
                hashMap1.put(integer, og1);
             }
             iterator1 = uEntry.getValue().iterator();
             while (iterator1.hasNext()) {
                integer1 = iterator1.next();
                g og2 = hashMap1.get(integer1);
                if (og2 == null) {
                   og2 = new g(integer1);
                   hashMap1.put(integer1, og2);
                }
                og2.b.add(integer);
                og1.c.add(integer1);
             }
          }
       }
       p1 = PatchProxy.applyOneRefs(hashMap1, null, uoa, str);
       b = true;
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else if(q.h(hashMap1)){
          HashMap hashMap2 = new HashMap();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = hashMap1.values().iterator();
          while (iterator.hasNext()) {
             og = iterator.next();
             if (og == null) {
                continue ;
             }else if(q.f(og.b)){
                uArrayList.add(og);
             }
             hashMap2.put(og.a, Integer.valueOf(og.b.size()));
          }
          HashSet hashSet = new HashSet();
          iterator1 = uArrayList.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                og = iterator1.next();
                hashSet.add(og.a);
                LinkedList linkedList = new LinkedList(og.c);
                while (true) {
                   if (!linkedList.isEmpty()) {
                      integer = linkedList.poll();
                      if (!hashSet.contains(integer)) {
                         integer1 = hashMap2.get(integer);
                         if (integer1 == null) {
                            continue ;
                         }else {
                            int i = integer1.intValue() - b;
                            integer1 = Integer.valueOf(i);
                            hashMap2.put(integer, integer1);
                            if (integer1.intValue() <= 0) {
                               hashSet.add(integer);
                               og = hashMap1.get(integer);
                               if (og != null && !q.f(og.c)) {
                                  Iterator iterator2 = og.c.iterator();
                                  while (iterator2.hasNext()) {
                                     linkedList.offer(iterator2.next());
                                  }
                               }
                            }
                         }
                      }
                   }else {
                      continue ;
                   }
                }
             }else if(hashSet.size() != hashMap1.size()){
             }
          }
       }
    label_0211 :
       this.a = (!b)? Collections.unmodifiableMap(hashMap1): null;
       return;
    }
    public List a(LiveBottomBarConfigResponse p0,Map p1){
       b uob = b.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mBottomBarEntry;
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = PatchProxy.applyTwoRefs(p0, p1, this, uob, "2");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (!q.f(p0.mLeftBottomBarListItems)) {
             uArrayList.addAll(this.b(p0.mLeftBottomBarListItems, p1, false));
          }
          if (!q.f(p0.mRightBottomBarListItems)) {
             uArrayList.addAll(this.b(p0.mRightBottomBarListItems, p1, true));
          }
       }
       if (q.h(this.a)) {
          return uArrayList;
       }else {
          b ta = this.a;
          ArrayList uArrayList1 = PatchProxy.applyTwoRefs(uArrayList, ta, null, a.class, "2");
          if (uArrayList1 != PatchProxyResult.class) {
          }else {
             uArrayList1 = new ArrayList(uArrayList);
             a.a(ta, new HashSet(), uArrayList1);
          }
          return uArrayList1;
       }
    }
    public final List b(List p0,Map p1,boolean p2){
       ArrayList obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          List list = iterator.next();
          if (q.f(list)) {
          }else {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                LiveBottomServerConfig$BottomBarItem uBottomBarIt = iterator1.next();
                if (uBottomBarIt == null) {
                   continue ;
                }else {
                   MutableLiveData mutableLiveD = p1.get(Integer.valueOf(uBottomBarIt.mBottomBarItemId));
                   if (mutableLiveD == null || mutableLiveD.getValue() == null) {
                      continue ;
                   }else {
                      b value = mutableLiveD.getValue();
                      if (value.mIsVisible.booleanValue()) {
                         value.mIsRightAlign = p2;
                         obj.add(Integer.valueOf(uBottomBarIt.mBottomBarItemId));
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       return obj;
    }
}
