package com.eclipsesource.v8.utils.V8Map;
import java.util.Map;
import com.eclipsesource.v8.Releasable;
import java.lang.Object;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.eclipsesource.v8.V8Value;
import java.util.Map$Entry;
import java.util.Collection;

public class V8Map implements Map, Releasable	// class@00101c
{
    public Map map;
    public Map twinMap;

    public void V8Map(){
       super();
       this.map = new HashMap();
       this.twinMap = new HashMap();
    }
    public void clear(){
       this.map.clear();
       Iterator iterator = this.twinMap.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().close();
       }
       this.twinMap.clear();
       return;
    }
    public void close(){
       this.clear();
    }
    public boolean containsKey(Object p0){
       return this.map.containsKey(p0);
    }
    public boolean containsValue(Object p0){
       return this.map.containsValue(p0);
    }
    public Set entrySet(){
       return this.map.entrySet();
    }
    public Object get(Object p0){
       return this.map.get(p0);
    }
    public boolean isEmpty(){
       return this.map.isEmpty();
    }
    public Set keySet(){
       return this.map.keySet();
    }
    public Object put(V8Value p0,Object p1){
       this.remove(p0);
       p0 = p0.twin();
       this.twinMap.put(p0, p0);
       return this.map.put(p0, p1);
    }
    public Object put(Object p0,Object p1){
       return this.put(p0, p1);
    }
    public void putAll(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          V8Value key = uEntry.getKey();
          this.put(key, uEntry.getValue());
       }
       return;
    }
    public void release(){
       this.close();
    }
    public Object remove(Object p0){
       Object obj = this.map.remove(p0);
       p0 = this.twinMap.remove(p0);
       if (p0 != null) {
          p0.close();
       }
       return obj;
    }
    public int size(){
       return this.map.size();
    }
    public Collection values(){
       return this.map.values();
    }
}
