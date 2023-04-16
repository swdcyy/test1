package com.kwai.soc.arch.rubas.base.struct.LruMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map$Entry;
import java.lang.Boolean;

public final class LruMap extends LinkedHashMap	// class@001899
{
    public final int maxSize;
    public int removeCount;

    public void LruMap(int p0,float p1,int p2){
       super(p0, p1, true);
       this.maxSize = p2;
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final int getRemoveCount(){
       return this.removeCount;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LruMap.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.size() <= this.maxSize) {
          return false;
       }
       this.removeCount = this.removeCount + 1;
       return 1;
    }
    public final void setRemoveCount(int p0){
       this.removeCount = p0;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, LruMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
