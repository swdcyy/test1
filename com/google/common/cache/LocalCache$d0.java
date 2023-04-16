package com.google.common.cache.LocalCache$d0;
import java.util.Map$Entry;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class LocalCache$d0 implements Map$Entry	// class@00175a
{
    public final Object b;
    public Object c;
    public final LocalCache d;

    public void LocalCache$d0(LocalCache p0,Object p1,Object p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (this.b.equals(p0.getKey()) && this.c.equals(p0.getValue()))) {
          b = true;
       }
    label_0020 :
       return b;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       return this.c;
    }
    public int hashCode(){
       return (this.b.hashCode() ^ this.c.hashCode());
    }
    public Object setValue(Object p0){
       this.c = p0;
       return this.d.put(this.b, p0);
    }
    public String toString(){
       return this.getKey()+"="+this.getValue();
    }
}
