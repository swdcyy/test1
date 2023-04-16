package com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl$setHostGroups$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.String;
import com.yxcorp.retrofit.cdn.CdnHostGroup;
import bjd.c;

public final class CdnHostGroupManagerImpl$setHostGroups$1 extends Lambda implements a	// class@00095e
{
    public final Map $newHostGroupsMap;
    public final CdnHostGroupManagerImpl this$0;

    public void CdnHostGroupManagerImpl$setHostGroups$1(CdnHostGroupManagerImpl p0,Map p1){
       this.this$0 = p0;
       this.$newHostGroupsMap = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Map$Entry key;
       CdnHostGroupManagerImpl$setHostGroups$1 tthis$0 = this.this$0;
       CdnHostGroupManagerImpl$setHostGroups$1 t$newHostGro = this.$newHostGroupsMap;
       CdnHostGroupManagerImpl a = tthis$0.a;
       _monitor_enter(a);
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = false;
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(t$newHostGro.size()));
       Iterator iterator = t$newHostGro.entrySet().iterator();
       while (iterator.hasNext()) {
          CdnHostGroup obj = iterator.next();
          key = obj.getKey();
          String key1 = obj.getKey();
          obj = obj.getValue();
          CdnHostGroup uCdnHostGrou = tthis$0.b(key1, obj.getVersion(), obj.isPredefined());
          if (uCdnHostGrou != null) {
             obj = uCdnHostGrou;
          }else {
             uBooleanRef.element = true;
          }
          linkedHashMa.put(key, obj);
       }
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       iterator = tthis$0.c.entrySet().iterator();
       while (iterator.hasNext()) {
          key = iterator.next();
          int i = linkedHashMa.containsKey(key.getValue().getTypeName()) ^ true;
          if (i) {
             linkedHashMa1.put(key.getKey(), key.getValue());
          }
       }
       LinkedHashMap linkedHashMa2 = new LinkedHashMap(s0.j(linkedHashMa1.size()));
       Iterator iterator1 = linkedHashMa1.entrySet().iterator();
       while (iterator1.hasNext()) {
          CdnHostGroup obj1 = iterator1.next();
          Map$Entry key2 = obj1.getKey();
          String key3 = obj1.getKey();
          obj1 = obj1.getValue();
          CdnHostGroup uCdnHostGrou1 = tthis$0.b(key3, obj1.getVersion(), true);
          if (uCdnHostGrou1 != null) {
             obj1 = uCdnHostGrou1;
          }else {
             uBooleanRef.element = true;
          }
          linkedHashMa2.put(key2, obj1);
       }
       if (uBooleanRef.element == null) {
          _monitor_exit(a);
       }else {
          tthis$0.b.clear();
          tthis$0.b.putAll(linkedHashMa);
          tthis$0.b.putAll(linkedHashMa2);
          CdnHostGroupManagerImpl d = tthis$0.d;
          if (d != null) {
             d.b(tthis$0.b);
             l1 a1 = l1.a;
          }
          _monitor_exit(a);
       }
       return;
    }
}
