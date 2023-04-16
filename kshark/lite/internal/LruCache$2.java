package kshark.lite.internal.LruCache$2;
import java.util.LinkedHashMap;
import kshark.lite.internal.LruCache;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map$Entry;

public final class LruCache$2 extends LinkedHashMap	// class@001bcd
{
    public final LruCache this$0;

    public void LruCache$2(LruCache p0,int p1,float p2,boolean p3){
       this.this$0 = p0;
       super(p1, p2, p3);
    }
    public final Set entrySet(){
       return this.getEntries();
    }
    public Set getEntries(){
       return super.entrySet();
    }
    public Set getKeys(){
       return super.keySet();
    }
    public int getSize(){
       return super.size();
    }
    public Collection getValues(){
       return super.values();
    }
    public final Set keySet(){
       return this.getKeys();
    }
    public boolean removeEldestEntry(Map$Entry p0){
       LruCache$2 tthis$0 = this.this$0;
       int i = 1;
       if (this.size() > tthis$0.f) {
          tthis$0.c = tthis$0.c + i;
       }else {
          i = false;
       }
       return i;
    }
    public final int size(){
       return this.getSize();
    }
    public final Collection values(){
       return this.getValues();
    }
}
